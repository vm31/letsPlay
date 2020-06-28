package com.amazon.in.stepdefs;

import com.amazon.in.helper.PageFactoryLib;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPageStepDef extends PageFactoryLib {
    //every step def class should have @Before
    @Before
    public void init() {
        super.init();
    }

    @Given(" I enter credentials")
    public void iEnterCredentials(String email, String password) {

    }

    @Then("I verify email box is displayed")
    public void verifyIfEmailInputBoxIsDsiplayed(){
        Assert.assertTrue(getSignInPageObj().isSignInPageDisplayed());
    }
    //every step def class should have @After
    @After
    public void iCleanup() {
        getDriver().quit();
    }
}
