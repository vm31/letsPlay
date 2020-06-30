package com.amazon.in.stepdefs;

import com.amazon.in.helper.PageObjectManager;
import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SignInPageStepDef {
    HomePage home;
    SignInPage signInPage;
    PageObjectManager pageObjectManager;

    @Given(" I enter credentials")
    public void iEnterCredentials(String email, String password) {

    }

    @Then("I verify email box is displayed")
    public void verifyIfEmailInputBoxIsDsiplayed(){

        Assert.assertTrue(pageObjectManager.getSignInPage().isEmailBoxDisplayed());
    }
    //every step def class should have @After


}
