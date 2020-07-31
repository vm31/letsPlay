package stepdefs;

import base.BaseTest;
import io.cucumber.java.en.And;

public class SignInPageSteps extends BaseTest {

    @And("I login {string}")
    public void iLogin(String email){
        signInPageObj.enterEmail(email);
        signInPageObj.clickGetOnBTn();
    }
}
