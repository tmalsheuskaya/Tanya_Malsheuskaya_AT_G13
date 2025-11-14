package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class BookingTooltipsTest {

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

        WebElement currencyTooltip = driver.findElement(By.cssSelector("button[data-testid='header-currency-picker-trigger']"));
        actions.moveToElement(currencyTooltip).perform();

        String currencyTooltipValue = currencyTooltip.getAttribute("aria-label");
        System.out.println("currency tooltip: " + currencyTooltipValue);

        WebElement languageTooltip = driver.findElement(By.cssSelector("button[data-testid='header-language-picker-trigger']"));
        actions.moveToElement(languageTooltip).perform();

        String languageTooltipValue = languageTooltip.getAttribute("aria-label");
        System.out.println("language tooltip: " + languageTooltipValue);
    }


}
