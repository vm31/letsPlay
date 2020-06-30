package com.amazon.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    @FindBy(xpath="//input[@id='ap_email']")
    private WebElement emailInputBox;
    @FindBy(id="ap_email")
    private WebElement emailBox;
    @FindBy(xpath="//input[@id='continue']")
    private WebElement continueBtn;
    @FindBy(id="ap_password")
    private WebElement PasswordBox;
    @FindBy(id="signInSubmit")
    private WebElement LoginBtn;





    public boolean isSignInPageDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        return emailInputBox.isDisplayed();
    }
    //scenario 3 actions methods
    public void enetrEmail(String em){
        emailBox.sendKeys(em);
    }
    public void clickContinue(){
        continueBtn.click();
    }
    public void enterPassword(String pwd){
        PasswordBox.sendKeys(pwd);

    }
    public void clickOnLogin(){
        LoginBtn.click();

    }
}
