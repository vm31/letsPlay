package stepdefs;

import com.amazon.Runner;
import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import helper.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SignInPageStepDef {
    ChromeOptions chromeOptions=new ChromeOptions();
    WebDriver driver=new ChromeDriver(chromeOptions);
    SignInPage signInPageObj= new SignInPage(driver);


    @Given(" I enter credentials")
    public void iEnterCredentials(String email, String password) {

    }

    @Then("I verify email box is displayed")
    public void verifyIfEmailInputBoxIsDsiplayed() throws Exception{

        Assert.assertTrue(signInPageObj.isEmailBoxDisplayed());
    }
    //every step def class should have @After
}
