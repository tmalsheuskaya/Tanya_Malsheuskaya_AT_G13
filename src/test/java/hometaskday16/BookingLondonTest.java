package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BookingLondonTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void london10() throws IOException {
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
        destination.sendKeys("London");

        driver.findElement(By.xpath("//div[@data-testid='searchbox-layout-wide']//button[@type='submit']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement hotelN10 = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        js.executeScript("arguments[0].scrollIntoView(true);", hotelN10);

        js.executeScript("arguments[0].style.backgroundColor='green';", hotelN10);

        WebElement hotelName = hotelN10.findElement(By.cssSelector("div[data-testid='title']"));
        js.executeScript("arguments[0].style.color='red';", hotelName);

        String bgColor = hotelN10.getCssValue("background-color");
        String textColor = hotelName.getCssValue("color");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        java.nio.file.Files.copy(
                screenshot.toPath(),
                new java.io.File("/Users/TatyD/AQA tools/Autotests screenshots/booking_london.png").toPath(),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING
        );

        System.out.println("Screenshot saved: " + screenshot.toPath());
    }

}
