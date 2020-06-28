package com.amazon.in.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]")
    private WebElement signInBtn;

    public void clickSignInBtn(){
        signInBtn.click();
    }
}
