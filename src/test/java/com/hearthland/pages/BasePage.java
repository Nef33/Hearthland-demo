package com.hearthland.pages;


import com.hearthland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

  //  @FindBy (xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")
    //public WebElement pricingTab;

    @FindBy(xpath="//*[@id=\"footer-container\"]//a[.='Careers']")
    public WebElement careerTab;
}
