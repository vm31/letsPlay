package stepdefs;

import amzon.in.pages.HomePage;
import amzon.in.pages.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class Steps {
    WebDriver driver;

    @Given("user is on homepage")
        public void isHomepageDisplayed(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.nl");
    }
    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        HomePage homePageObj = new HomePage(driver);
        homePageObj.search(product);
    }

    @When("I click signIn btn")
    public void iClickSignInBtn(){
        HomePage homePageObj = new HomePage(driver);
        homePageObj.clickSignInBtn();

    }

    @And("I login {string}")
    public void iLogin(String email){
        SignInPage signInPageObj = new SignInPage(driver);
        signInPageObj.enterEmail(email);
        signInPageObj.clickGetOnBTn();
    }

    @After
    public void iQuit(){
        driver.quit();
    }
}
