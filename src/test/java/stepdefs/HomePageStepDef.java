package stepdefs;

import com.amazon.Runner;
import com.amazon.in.pages.HomePage;
import helper.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDef {
//    HomePage homePageObj= new HomePage();

//    @Given("I launch url")
//    public void iLaunchUrl(){
//        driver.get("https://www.amazon.nl");
//    }

    @Then("I verify title")
    public void iVerifyTitle(){
        homePageObj.getTitle();
    }

    @When("I click signin btn")
    public void clickSignInBtn(){
        getHomePageObj().clickSignInPageBtn();
    }

}
