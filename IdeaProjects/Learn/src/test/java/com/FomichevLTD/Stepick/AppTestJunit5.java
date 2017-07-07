package com.FomichevLTD.Stepick;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.net.URL;

/**
 * Created by safomichev on 30.06.2017.
 */

public class AppTestJunit5 {

    private static CustomLogger logger;
    private static WebDriver driver;
    @FindBy(xpath = ".//input[@value=\"Мне повезёт\"]")
    private WebElement luckky;


    @Test
    public void firstTestMethod() {
        // Navigate to a web page
        driver.navigate().to("https://www.google.ru");
        try{
            Thread.sleep(5000);
        }
        catch (Exception e) {
            logger.debug("Словиили обишку");
        }
        luckky.click();
        //driver.findElement(By.xpath(".//input[@value=\"Мне повезёт!\"])"));
        try{
            Thread.sleep(5000);
        }
        catch (Exception e) {
            logger.debug("Словиили обишку");
        }






}

    @BeforeClass()
    public static void setUp() {
        logger = new CustomLogger();
        logger.debug("Test ClassLogger Created");
        driver = new FirefoxDriver();

    }

    @AfterClass()
    public static void tearDown() {
        logger.debug("TearDown Test");
        driver.quit();
    }
}
