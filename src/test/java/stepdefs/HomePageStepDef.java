package stepdefs;

import com.amazon.Runner;
import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import helper.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class HomePageStepDef{
    ChromeOptions chromeOptions=new ChromeOptions();
    WebDriver driver=new ChromeDriver(chromeOptions);
    HomePage homePageObj= new HomePage(driver);
    SignInPage signInPageObj= new SignInPage(driver);


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
        homePageObj.clickSignInPageBtn();

    }
    @Then("this element is displayed")
    public void isDisplayed() throws Exception{
        Assert.assertTrue(signInPageObj.isEmailBoxDisplayed());
    }

}
