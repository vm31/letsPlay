package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import helper.Utility;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignInPage;

import java.io.IOException;

public class signinStep extends BaseTest{
    WebDriver driver=getDriver();

    public signinStep() throws IOException {
    }
    //public WebDriver driver;
    //public HomePage homePage;
    //public SignInPage signInPage;

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

    }

    @Then("user clicks on continue")
    public void user_clicks_on_continue() {

        signInPage.clickContonue();
    }

    @Given("user enters password as {string}")
    public void user_enters_password_as(String pw) {
        utility.waitForElement(2000);
        signInPage.enterPassword(pw);

    }

    @Then("user clicks on login")
    public void user_clicks_on_login() {

        signInPage.clickOnLogin();
    }

    @And("user closes browser")
    public void userClosesBrowser() {

        driver.quit();
    }

    @Then("user verify the error message displayed")
    public void userVerifyTheErrorMessageDisplayed() {
        signInPage.errorMessageInvalidUsername();
    }


    @And("user returns back on login page")
    public void userReturnsBackOnLoginPage() {
        signInPage.UserOnLoginPage();
        System.out.println("***user returns to login page***");
    }
}
