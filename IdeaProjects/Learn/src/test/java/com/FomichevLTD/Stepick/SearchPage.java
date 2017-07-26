package com.FomichevLTD.Stepick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by safomichev on 08.07.2017.
 */
public class SearchPage {
    //private WebDriver driver;

    @FindBy(xpath = ".//input[@id='text']")
    private WebElement searchInput;

    @FindBy(xpath = ".//button/span[contains(text(),'Найти')]/..")
    private WebElement searchButton;

    @FindBy(xpath = ".//div[@class=\"calculator__btns clearfix\"]")
    private WebElement calc;

    public void search(final String query) {

        searchInput.sendKeys(query);
        searchButton.click();
    }


    public void init(final WebDriver driver) {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
