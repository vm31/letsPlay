package com.amazon.in.stepdefs;

import com.amazon.in.helper.PageFactoryLib;
import com.amazon.in.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class HomePageStepDef extends PageFactoryLib {
    private HomePage home;

    @Before(order = 0)
    public void init(){

        super.init();
    }

    @Before(order = 1)
    public void iLaunchUrl(){
        getDriver().get("https://www.amazon.in");
    }

    @Given("I verify title")
    public void iVerifyTitle()
    {
        getHomePageObj().getTitle();
    }
    @Given("I click signin btn")
    public void clickSignInBtn(){

        getHomePageObj().clickSignInPage();
    }
    @After
    public void iCleanup(){
        getDriver().quit();
    }
}
