package com.amazon.in.stepdefs;

import com.amazon.in.helper.PageFactoryLib;
import com.amazon.in.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageStepDef extends PageFactoryLib {
    private HomePage home;

    @Given("I launch url")
    public void iLaunchUrl(){
        getDriver().get("https://www.amazon.nl");
    }

    @Then("I verify title")
    public void iVerifyTitle(){
        getHomePageObj().getTitle();
    }

    @After
    public void iCleanup(){
        getDriver().quit();
    }
}
