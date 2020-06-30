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
    @Before(order = 0)
    public void init() {
        super.init();
    }

    @Before(order = 1)
    public void iLaunchUrl() {
        getDriver().get("https://www.amazon.in");
    }

    @Given(" I enter credentials")
    public void iEnterCredentials(String email, String password) {

    }

    @Then("I verify email box is displayed")
    public void verifyIfEmailInputBoxIsDsiplayed() throws InterruptedException {
        Assert.assertTrue(getSignInPageObj().isSignInPageDisplayed());
    }


    @Then("user clicks on continue button")
    public void userClicksOnContinueButton() {
        signInPageObj.clickContinue();
    }


    @Then("user clicks on signin button")
    public void userClicksOnSigninButton() {
        signInPageObj.clickOnLogin();
    }


    //every step def class should have @After
    @After
    public void iCleanup() {
        getDriver().quit();
    }


    @Given("user enters email as {string}")
    public void user_enters_email_as(String string) {
        signInPageObj.enetrEmail(string);
    }


    @Then("user enters password as {string}")
    public void user_enters_password_as(String string) {
        signInPageObj.enterPassword(string);

    }

}