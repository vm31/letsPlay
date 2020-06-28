package com.amazon.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    @FindBy(xpath="//*[@id='ap_email']")
    private WebElement emailInputBox;

    public boolean isSignInPageDisplayed(){
        return emailInputBox.isDisplayed();
    }
}
