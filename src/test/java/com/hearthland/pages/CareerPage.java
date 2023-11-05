package com.hearthland.pages;

import com.hearthland.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

    public CareerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]//a[.='Search Heartland jobs']")
    public WebElement searchJobs;

    @FindBy(xpath="//input[@data-automation-id=\"keywordSearchInput\"]")
    public  WebElement searchJobsAndKeywordsBox;


    @FindBy(xpath="//a[@data-automation-id='jobTitle']")
    public  WebElement jobTitle;

    @FindBy(css=".wpb_wrapper")
    public WebElement scrollUp ;
}
