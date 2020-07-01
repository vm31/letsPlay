package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignInPage;

public class signinStep extends BaseTest{
    WebDriver driver=getDriver();
    //public WebDriver driver;
    //public HomePage homePage;
    //public SignInPage signInPage;

    @Then("user clicks on signIn page")
    public void user_clicks_on_signIn_page() {
        signInPage=new SignInPage(driver);
        signInPage.clickOnSignIn();

    }

    @Then("user verify Login page title {string}")
    public void user_verify_Login_page_title(String string) {
        if(driver.getTitle().contains(string))
            //Pass
            System.out.println("Page title contains \"Amazon login page\" ");
        else
            //Fail
            System.out.println("Page title doesn't contains \"Amazon login page\" ");
    }

    @Given("user enters email address as {string}")
    public void user_enters_email_address_as(String em) {
        signInPage.EnterEmail(em);

    }

    @Then("user clicks on continue")
    public void user_clicks_on_continue() {
        signInPage.clickContonue();
    }

    @Given("user enters password as {string}")
    public void user_enters_password_as(String pw) {
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
}
