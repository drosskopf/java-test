package app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DaveTest {
    private WebDriver driver;

    @Before
    public void testState() {
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws Exception {
        // Go to the Google Suggest home page
        driver.get("http://www.google.com/webhp?complete=1&hl=en");

        // Enter the query string "Cheese"
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Cheese" + Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "Cheese - Google Search");

    }

    @After
    public void testCleanUp() throws Exception {
        driver.quit();
    }
}