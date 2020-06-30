package com.amazon.in.stepdefs;

import com.amazon.in.dataProviders.ConfigFileReader;
import com.amazon.in.helper.FileReaderManager;
import com.amazon.in.helper.PageObjectManager;
import com.amazon.in.helper.WebDriverManager;
import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class HomePageStepDef  {
    HomePage home;
    SignInPage signInPage;
    ConfigFileReader configFileReader;
    PageObjectManager pageObjectManager;
    WebDriverManager webDriverManager;
    WebDriver driver;

    @Given("user is on home page")
    public void userIsOnHomePage() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        home = pageObjectManager.getHome();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);


    }


    @Then("I verify title")
    public void iVerifyTitle(){

        home.getTitle();
    }

    @When("I click signin btn")
    public void clickSignInBtn(){
        driver.get("https//:www.amazon.in");
        pageObjectManager.getHome().clickSignInPageBtn();
    }


}
