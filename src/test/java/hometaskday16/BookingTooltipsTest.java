package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
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

        WebElement currencyButton = driver.findElement(By.cssSelector("button[data-testid='header-currency-picker-trigger']"));
        actions.moveToElement(currencyButton).perform();

        WebElement currencyTooltip = driver.findElement(By.xpath("//body/div[last()]/div"));

        currencyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='header-currency-picker-trigger']")));
        actions.moveToElement(currencyButton).perform();

        By currencyTooltipLocator = By.xpath("//body/div[last()]/div");
        currencyTooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(currencyTooltipLocator));

        String currencyTooltipValue = currencyTooltip.getText();
        System.out.println("Currency tooltip: " + currencyTooltipValue);

        WebElement languageButton = driver.findElement(By.cssSelector("button[data-testid='header-language-picker-trigger']"));
        actions.moveToElement(languageButton).perform();

        WebElement languageTooltip = driver.findElement(By.xpath("//body/div[last()]"));

        languageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='header-language-picker-trigger']")));
        actions.moveToElement(languageButton).perform();

        By languageTooltipLocator = By.xpath("//body/div[last()]");
        languageTooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(languageTooltipLocator));

        String languageTooltipValue = languageTooltip.getText();
        System.out.println("language tooltip: " + languageTooltipValue);
    }


}
