package com.FomichevLTD.Stepick;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.net.URL;


/**
 * Created by safomichev on 30.06.2017.
 */

public class AppTestJunit5 {

    private static CustomLogger logger;
    private static WebDriver driver;
    private SearchPage searchPage;
    private CalculPage calculPage;


    @Test
    public void init() {
        logger.debug("init pages etc");
        searchPage = new SearchPage();

    }

    @Test(dependsOnMethods = "init")
    public void firstTestMethod() {


        driver.navigate().to("https://www.yandex.ru");



        searchPage.init(driver);

        searchPage.search("Калькулятор");



        calculPage = new CalculPage(driver);
        calculPage.calcButtons.eightButton.click();
        calculPage.calcButtons.sevenButton.click();
        calculPage.calcButtons.plus.click();

        calculPage = new CalculPage(driver);
        calculPage.calcButtons.eightButton.click();
        calculPage.calcButtons.sevenButton.click();



        calculPage.calcButtons.equall.click();


        try{
            Thread.sleep(15000);
        }
        catch (Exception e) {
            logger.debug("Словиили обишку в ожидании. В процессе.");
        }

}

    @BeforeClass()
    public static void setUp() {
        logger = new CustomLogger();
        logger.debug("Test ClassLogger Created");
        driver = new FirefoxDriver();
        logger.debug("Create driver");



    }

    @AfterClass()
    public static void tearDown() {
        logger.debug("TearDown Test");
        driver.quit();
    }
}
