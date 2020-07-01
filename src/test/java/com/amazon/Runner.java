package com.amazon;

import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
//@CucumberOptions(glue="/home/middela/Azure_Repos/personal/bddCucumber/src/main/java/com/amazon/in/stepdefs",features = "src/test/homePageSanity.feature")
//@CucumberOptions(features="home\\middela\\Azure_Repos\\personal\\bddCucumber\\src\\test\\homePageSanity.feature",glue={"com.amazon.in.stepdefs"})
@CucumberOptions(features = "/home/middela/Azure_Repos/personal/letsPlay/src/test/homePageSanity.feature", glue = {"stepdefs"})
public class Runner extends AbstractTestNGCucumberTests {
    protected WebDriver driver;
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;

    @BeforeClass
    public void init() {
        ChromeOptions chromeOptions;
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.nl");
        homePageObj = PageFactory.initElements(driver, HomePage.class);
        signInPageObj = PageFactory.initElements(driver, SignInPage.class);
    }


    public HomePage getHomePageObj() {
        return homePageObj;
    }

    public SignInPage getSignInPageObj() {
        return signInPageObj;
    }

    //
    @AfterClass
    public void iCleanup() {
        driver.quit();
    }
}
