package com.rsi.pages;

import com.rsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//*[@id=\"site-navigation\"]/div[2]/ul/li[4]/a")

    public WebElement careerTab;
}
