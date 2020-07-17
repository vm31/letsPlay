package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage {
    public WebDriver ldriver;

    public SignInPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(xpath = "//span[contains(text(),'Account & Lists')]")
    @CacheLookup
    WebElement SignInBtn;
    @FindBy(xpath = "//input[@id='ap_email']")
    @CacheLookup
    WebElement EmailBox;
    @FindBy(xpath = "//input[@id='continue']")
    @CacheLookup
    WebElement ContinueBtn;
    @FindBy(xpath = "//input[@id='ap_password']")
    @CacheLookup
    WebElement PwdBox;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    @CacheLookup
    WebElement LoginBtn;
    @FindBy(xpath = "//div[@id='auth-error-message-box']//div[@class='a-alert-content']")
    @CacheLookup
    WebElement ErrorMsgUsername;
    @FindBy(xpath = "//div[@id='auth-error-message-box']//div[@class='a-alert-content']")
    @CacheLookup
    WebElement ErrorMsgPassword;



    //action methos for login flow
    public void clickOnSignIn() {
        SignInBtn.click();
    }

    public void EnterEmail(String email) {
        EmailBox.sendKeys(email);


    }

    public void clickContonue() {

        ContinueBtn.click();

    }

    public void enterPassword(String pwd) {
        PwdBox.sendKeys(pwd);
    }

    public void clickOnLogin() {
        LoginBtn.click();
    }


    //action methods for invalid username
    public boolean errorMessageInvalidUsername() {
        return ErrorMsgUsername.isDisplayed();

    }
    public void UserOnLoginPage(){
        ldriver.getPageSource();


    }
    //action methods for invalid password
    public  boolean errorMessageInvalidPassword(){

       return ErrorMsgPassword.isDisplayed();



    }

}
