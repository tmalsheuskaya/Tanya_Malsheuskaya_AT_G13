package hometaskday16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingFirstTest {

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
    public void paris7days() {
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
        destination.sendKeys("Париж");

        LocalDate today = LocalDate.now();
        LocalDate checkin = today.plusDays(3);
        LocalDate checkot = checkin.plusDays(7);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        driver.findElement(By.cssSelector("button[data-testid='searchbox-dates-container']")).click();

        String checkinDate = dtf.format(checkin);
        String checkoutDate = dtf.format(checkot);

        driver.findElement(By.xpath(String.format("//*[@data-date='%s']", checkinDate))).click();
        driver.findElement(By.xpath(String.format("//*[@data-date='%s']", checkoutDate))).click();

        driver.findElement(By.cssSelector("button[data-testid='occupancy-config']")).click();
        WebElement addAdults = driver.findElement(By.xpath("//input[@id='group_adults']//preceding-sibling::div/button[2]"));
        addAdults.click();
        addAdults.click();
        driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']//label[@for='no_rooms']/../following-sibling::div/button[2]")).click();
        driver.findElement(By.xpath("//div[@data-testid='searchbox-layout-wide']//button[@type='submit']")).click();

        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']")).click();
        driver.findElement(By.xpath("//div//button[@data-testid='sorters-dropdown-trigger']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button[@data-id='class_asc']")));
        driver.findElement(By.xpath("//div//button[@data-id='class_asc']")).click();

        WebElement firstHotelInList = driver.findElement(By.xpath("//div[@role='list']//div[@data-testid='property-card']//div[@aria-label='5 out of 5'][1]"));
        String starsCount = firstHotelInList.getAttribute("aria-label");
        System.out.println("Rating of first hotel in list is: " + starsCount);

    }
}
