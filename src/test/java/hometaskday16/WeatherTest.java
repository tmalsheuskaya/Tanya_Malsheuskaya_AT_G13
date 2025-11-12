package hometaskday16;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

public class WeatherTest {

    private static WebDriver driver;
    private static String nextDay;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        LocalDate localDate = LocalDate.now().plusDays(1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        nextDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    @Test
    public void testWeatherForTomorrowAtNoon() {
        driver.get("https://google.com");

        try {
            WebElement consentButton = driver.findElement(By.id("L2AGLb"));
            consentButton.click();
        } catch (Exception ignored) {
        }

        driver.findElement(By.name("q")).sendKeys("погода минск");
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();

        driver.findElement(By.xpath("//div[@data-wob-di='1']")).click();

        List<WebElement> hours = driver.findElements(
                By.xpath("//*[contains(@aria-label, 'Celsius') and contains(@aria-label, '" + nextDay + " 12:00')]")
        );

        assertFalse("No forecast for " + nextDay + " at 12:00", hours.isEmpty());

        WebElement hourElement = hours.get(0);
        String ariaLabel = hourElement.getAttribute("aria-label");

        System.out.println(nextDay + " 12:00: " + ariaLabel);

        assertTrue("no data", ariaLabel.contains("Celsius"));
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
