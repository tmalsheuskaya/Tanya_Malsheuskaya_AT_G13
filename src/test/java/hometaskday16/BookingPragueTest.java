package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BookingPragueTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);

    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void safeClick(By locator) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
                element.click();
                return;
            } catch (StaleElementReferenceException e) {
                attempts++;
                System.out.println("Stale element, retry attempt " + attempts);
            }
        }
        throw new RuntimeException("Cannot click element: " + locator);
    }

    @Test
    public void bookingTooltips() {
        driver.get("https://booking.com");

        try {
            driver.findElement(By.xpath("//*[contains(@aria-label, 'Dismiss sign in')]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("no Sign In modal");
        }

        try {
            WebElement cookiesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
            cookiesBtn.click();
        } catch (Exception e) {
            System.out.println("no cookies or not clickable");
        }

        WebElement destination = driver.findElement(By.name("ss"));
        destination.click();
        destination.sendKeys("Прага");

        driver.findElement(By.xpath("//div[@data-testid='searchbox-layout-wide']//button[@type='submit']")).click();

        safeClick(By.xpath("//div[@data-filters-item='review_score:review_score=90']"));

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//div[@role='list']//div[@data-testid='property-card']")));

        String mainWindow = driver.getWindowHandle();
        safeClick(By.xpath("//div[@role='list']//div[@data-testid='property-card'][1]//a[@data-testid='title-link']"));

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        WebElement hotelRating = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-testid='review-score-right-component'] div")));
        String ratingValue = hotelRating.getText().replace(",", ".").trim();
        System.out.println(ratingValue);

        ratingValue = ratingValue.replaceAll("[^0-9,.]", "").replace(",", ".");
        double rating = Double.parseDouble(ratingValue);

        assertTrue("Rating >9", rating >= 9);
    }
}
