package com.amazon.in.pages;

import com.amazon.in.helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage {
    WebDriver driver;
    Utility util;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.util = new Utility(driver);
    }

    @FindBy(xpath="//*[@id='ap_email']")
    private WebElement emailInputBox;

    public boolean isEmailBoxDisplayed(){
        boolean x= emailInputBox.isDisplayed();
        System.out.println(x);
        if(x==true){
            System.out.println("email box is displayed");
        }
        return x;
    }
}
