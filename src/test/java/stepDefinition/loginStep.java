package stepDefinition;

import common.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import helper.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.SignInPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loginStep extends BaseTest {
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
    @Given("i open home page {string}")
    public void i_open_home_page(String url) {
        driver.get(url);
        logger.info("*****opening url****");
        homePage=new HomePage(driver);
        signInPage=new SignInPage(driver);
        utility=new Utility(driver);
    }

    @Then("verify amazon home display")
    public void verify_amazon_home_display() {
        logger.info("***verifying homepage ****");

        homePage.verifyAmazonDispay();
    }

    @Then("i click on signIn page")
    public void i_click_on_signIn_page() {
        logger.info("*** user clicks on signin page***");

        signInPage.clickOnSignIn();
        utility.waitForElement(2000);
    }

    @Then("verify Login page title {string}")
    public void verify_Login_page_title(String string) {
        logger.info("***user verify login page title***");
        Assert.assertEquals(string, driver.getTitle());
    }

    @Given("i enter email address as {string}")
    public void i_enter_email_address_as(String em) {
        utility.waitForElement(2000);
        signInPage.EnterEmail(em);
        logger.info("*** user enters username***");
    }

    @Then("i click on continue")
    public void i_click_on_continue() {
        signInPage.clickContonue();
    }

    @Then("verify the error message displayed")
    public void verify_the_error_message_displayed() {
        logger.info("*** user checks error invalid username message***");
        Assert.assertTrue(signInPage.errorMessageInvalidUsername());
    }


    @Given("i enter password as {string}")
    public void i_enter_password_as(String pw) {
        utility.waitForElement(2000);
        signInPage.enterPassword(pw);
        logger.info("*** user enters password***");
    }

    @Then("i click on login")
    public void i_click_on_login() {
        signInPage.clickOnLogin();
        logger.info("*** user clicks on login button***");
    }

    @Then("verify error message displayed on password page")
    public void verify_error_message_displayed_on_password_page() {
        Assert.assertTrue(signInPage.errorMessageInvalidPassword());
    }
    @And("user returns back on login page")
    public void userReturnsBackOnLoginPage() {
        signInPage.UserOnLoginPage();
        System.out.println("***user returns to login page***");
    }
    @After
    public void userClosesBrowser() {
        logger.info("*** user close browser***");
        driver.quit();
    }


}
