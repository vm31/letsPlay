package stepDefinition;

import common.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import helper.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.HomePage;
import pages.SignInPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class signinStep extends BaseTest {

    @Before
    public void setup() throws IOException {
        configprop = new Properties();
        FileInputStream configPropfile = new FileInputStream("data.properties");
        configprop.load(configPropfile);
        logger= Logger.getLogger("letsCucumber");//added logger
        PropertyConfigurator.configure("log4j.properties");

        String br = configprop.getProperty("BROWSER");
        if (br.equals("chrome"))
        {
        System.setProperty("webdriver.chrome.driver", configprop.getProperty("chrome_path"));
        driver = new ChromeDriver();
        }
        else if (br.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefox_path"));
            driver = new FirefoxDriver();

        }
        else if(br.equals("ie")){
            System.setProperty("webdriver.ie.driver", configprop.getProperty("ie_path"));
            driver = new InternetExplorerDriver();
        }

    }

    @Given("user Navigate to home page")
    public void user_Navigate_to_home_page() {
        driver.get("https://www.amazon.in");
        logger.info("*****opening url****");
        homePage=new HomePage(driver);

    }

    @Then("user verify amazon home display")
    public void user_verify_amazon_home_display() {
        logger.info("***verifying homepage ****");

        homePage.verifyAmazonDispay();
    }

    @Then("user clicks on signIn page")
    public void user_clicks_on_signIn_page() {
        logger.info("*** user clicks on signin page***");
        signInPage=new SignInPage(driver);
        utility=new Utility(driver);
        signInPage.clickOnSignIn();
        utility.waitForElement(2000);

    }

    @Then("user verify Login page title {string}")
    public void user_verify_Login_page_title(String string) {
        logger.info("***user verify login page title***");
        if(driver.getTitle().contains(string))
            //Pass
            System.out.println("Page title contains \"Amazon login page\" ");
        else
            //Fail
            System.out.println("Page title doesn't contains \"Amazon login page\" ");
    }

    @Given("user enters email address as {string}")
    public void user_enters_email_address_as(String em) {
        utility.waitForElement(2000);
        signInPage.EnterEmail(em);
        logger.info("*** user enters username***");


    }

    @Then("user clicks on continue")
    public void user_clicks_on_continue() {

        signInPage.clickContonue();
    }

    @Given("user enters password as {string}")
    public void user_enters_password_as(String pw) {
        utility.waitForElement(2000);
        signInPage.enterPassword(pw);
        logger.info("*** user enters password***");

    }

    @Then("user clicks on login")
    public void user_clicks_on_login() {

        signInPage.clickOnLogin();
        logger.info("*** user clicks on login button***");
    }

    //@And("user closes browser")
    @After
    public void userClosesBrowser() {
        logger.info("*** user close browser***");
        driver.quit();
    }

    @Then("user verify the error message displayed")
    public void userVerifyTheErrorMessageDisplayed() {

        signInPage.errorMessageInvalidUsername();
        logger.info("*** user checks error invalid username message***");
    }


    @And("user returns back on login page")
    public void userReturnsBackOnLoginPage() {
        signInPage.UserOnLoginPage();
        System.out.println("***user returns to login page***");
    }

    @Then("verify error message displayed")
    public void verifyErrorMessageDisplayed() {
        signInPage.errorMessageInvalidPassword();
        logger.info("*** user checks invalid password message***");
    }
}
