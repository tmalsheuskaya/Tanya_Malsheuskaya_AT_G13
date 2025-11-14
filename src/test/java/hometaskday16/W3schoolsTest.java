package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class W3schoolsTest {
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
    public void w3school() {
        driver.get("https://www.w3schools.com/java/");

        try {
            WebElement cookies = wait.until(ExpectedConditions.elementToBeClickable(By.id("accept-choices")));
            cookies.click();
        } catch (Exception e) {
            System.out.println("no cookies or not clickable");
        }

        WebElement title = driver.findElement(By.xpath("//*[@id='main']/h1/span"));
        actions.doubleClick(title).perform();

        String os = System.getProperty("os.name").toLowerCase();
        Keys controlKey = os.contains("mac") ? Keys.COMMAND : Keys.CONTROL;
        actions.keyDown(controlKey).sendKeys("c").keyUp(controlKey).perform();

        driver.get("https://www.google.com");

        try {
            WebElement consentButton = driver.findElement(By.id("L2AGLb"));
            consentButton.click();
        } catch (Exception e) {
            System.out.println("no cookies or not clickable");
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.name("q"))).click();
        actions.keyDown(controlKey).sendKeys("v").keyUp(controlKey).perform();
        actions.sendKeys(Keys.ENTER).perform();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("h3")));

        List<WebElement> results = driver.findElements(By.cssSelector("h3"));
        assertTrue("No results", results.size() > 0);

        int checkedCount = 0;

        for (WebElement result : results) {
            String text = result.getText().trim().toLowerCase();

            if (text.isEmpty()) {
                continue;
            }
            checkedCount++;
        }

        System.out.println("Number of results: " + checkedCount);
    }
}
