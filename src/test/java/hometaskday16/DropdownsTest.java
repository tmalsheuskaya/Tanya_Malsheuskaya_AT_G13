package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropdownsTest {
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
    public void dropdpwns() {
        driver.get("https://demoqa.com/select-menu");

        driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
        driver.findElement(By.xpath("//div[text()='A root option']")).click();

        driver.findElement(By.xpath("//div[@id='selectOne']")).click();
        driver.findElement(By.xpath("//div[text()='Prof.']")).click();

        WebElement oldStyleDropdown = driver.findElement(By.id("oldSelectMenu"));
        Select oldStyle = new Select(oldStyleDropdown);
        oldStyle.selectByVisibleText("Blue");

        WebElement multiselect1 = driver.findElement(By.id("react-select-4-input"));
        multiselect1.sendKeys("Green");
        multiselect1.sendKeys(Keys.ENTER);
        multiselect1.sendKeys("Black");
        multiselect1.sendKeys(Keys.ENTER);
        driver.findElement(By.tagName("body")).click();

        WebElement standartMultiSelect = driver.findElement(By.id("cars"));
        Select standartMulti = new Select(standartMultiSelect);
        standartMulti.selectByValue("volvo");
        standartMulti.selectByValue("audi");


    }
}
