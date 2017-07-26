package com.FomichevLTD.Stepick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;


/**
 * Created by safomichev on 12.07.2017.
 */

public class CalculPage {

    CalculScreen calculScreen;

    CalcButtons calcButtons;




    public CalculPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }
}
