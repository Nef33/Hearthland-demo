package com.rsi.step_definitions;

import com.rsi.pages.BasePage;
import com.rsi.pages.CareerPage;
import com.rsi.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class US001_StepDefinitions extends BasePage {


    @Given("user clicks on the career tab from homepage")
    public void user_clicks_on_the_career_tab_from_homepage() throws InterruptedException {
    Thread.sleep(5);

      careerTab.click();

    }

    CareerPage careerPage=new CareerPage();
    @When("user select  {string} option")
    public void user_select_option(String string) {
      careerPage.applyRSILogisticButton.click();
    }

    @Then("user should see {string} header on the page")
    public void user_should_see_header_on_the_page(String expectedHeader) {
      String actualHeader=  careerPage.careerPageHeader.getText();

        Assert.assertEquals(expectedHeader,actualHeader);


    }



    @When("user applies the filter for {string}")
    public void user_applies_the_filter_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see a list  {string} of career opportunities in Okemos,MI")
    public void user_should_see_a_list_of_career_opportunities_in_okemos_mi(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
