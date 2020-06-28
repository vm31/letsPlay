package com.amazon.in.stepdefs;

import com.amazon.in.helper.PageFactoryLib;
import io.cucumber.java.en.Given;

public class SignInPageStepDef extends PageFactoryLib {

    @Given("I click signin btn")
    public void iClickSignIn(){
        getSignInPageObj().clickSignInBtn();
    }
}
