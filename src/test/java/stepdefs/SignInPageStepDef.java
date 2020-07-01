package stepdefs;

import com.amazon.Runner;
import helper.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SignInPageStepDef extends Runner {

    @Given(" I enter credentials")
    public void iEnterCredentials(String email, String password) {

    }

    @Then("I verify email box is displayed")
    public void verifyIfEmailInputBoxIsDsiplayed(){

        Assert.assertTrue(signInPageObj.isEmailBoxDisplayed());
    }
    //every step def class should have @After
}
