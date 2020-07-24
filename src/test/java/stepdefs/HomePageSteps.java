package stepdefs;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class HomePageSteps extends BaseTest {

    @Given("user is on homepage")
        public void isHomepageDisplayed(){
        Assert.assertTrue(homePageObj.isHomePageDisplayed());
    }
    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        homePageObj.search(product);
    }

    @When("I click signIn btn")
    public void iClickSignInBtn(){
        homePageObj.clickSignInBtn();

    }

}
