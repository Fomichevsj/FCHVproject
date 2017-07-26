package com.FomichevLTD.Stepick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by safomichev on 12.07.2017.
 */
@Block(@FindBy(xpath = ".//div[@class='calculator__screen']"))
public class CalculScreen extends HtmlElement {

    //Поле вводе/ответа
    @FindBy(xpath = "//span[@class='input__box']/input")
    public TextInput answer;
}
