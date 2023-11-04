package com.hearthland.step_definitions;


import com.hearthland.pages.BasePage;
import com.hearthland.pages.CareerPage;
import com.hearthland.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US001_StepDefinitions extends BasePage {
    CareerPage careerPage= new CareerPage();
    @Given("user in on Hearthland home page and scrolls down to click Career tab")
    public void user_in_on_hearthland_home_page_and_scrolls_down_to_click_career_tab() {
        //Create JavascriptExecutor to be used later
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Scroll down to “Career” link

        js.executeScript("arguments[0].scrollIntoView(true)", careerTab);

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(careerTab));

        careerTab.click();
    }
    @When("Career page opens, user clicks on {string} tab")
    public void career_page_opens_user_clicks_on_tab(String searchTab) {
        careerPage.searchJobs.click();

    }
    @When("user search {string} opportunity in search box")
    public void user_search_opportunity_in_search_box(String opportunityName) {
        careerPage.searchJobsAndKeywordsBox.sendKeys(opportunityName, Keys.ENTER);


    }
    @Then("{string} opportunity\\/opportunities display")
    public void opportunity_opportunities_display(String opportunityName) {
       boolean actualResult= careerPage.jobTitle.getText().contains(opportunityName);

        Assert.assertTrue(actualResult);

    }
}
