package com.FomichevLTD.Stepick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Created by safomichev on 12.07.2017.
 */
@Block(@FindBy(xpath = ".//div[@class='calculator__btns clearfix']"))
public class CalcButtons extends HtmlElement {

    @FindBy(xpath = "//button/span[text()='9']/..")
    public WebElement nineButton;

    @FindBy(xpath = "//button/span[text()='8']/..")
    public WebElement eightButton;
    @FindBy(xpath = "//button/span[text()='7']/..")
    public WebElement sevenButton;

    @FindBy(xpath = "//button/span[text()='6']/..")
    public WebElement SixButton;

    @FindBy(xpath = "//button/span[text()='5']/..")
    public WebElement FiveButton;

    @FindBy(xpath = "//button/span[text()='4']/..")
    public WebElement FourButton;

    @FindBy(xpath = "//button/span[text()='3']/..")
    public WebElement ThreeButton;

    @FindBy(xpath = "//button/span[text()='2']/..")
    public WebElement TwoButton;

    @FindBy(xpath = "//button/span[text()='1']/..")
    public WebElement OneButton;

    @FindBy(xpath = "//button/span[text()='0']/..")
    public WebElement zeroButton;

    @FindBy(xpath = "//button/span[text()='+']/..")
    public WebElement plus;

    @FindBy(xpath = "//button/span[text()='=']/..")
    public WebElement equall;
}
