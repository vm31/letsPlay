package stepdefs;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.And;

public class SignInPageSteps extends BaseTest {

    @And("I login {string}")
    public void iLogin(String email){
        homePageObj.clickSignInBtn();
        signInPageObj.enterEmail(email);
        signInPageObj.clickGetOnBTn();
    }
}
