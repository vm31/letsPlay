package com.amazon.in.pages;

import com.amazon.in.helper.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
    WebDriver driver;
    WebDriverManager webDriverManager;


    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

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
    public void browserQuit(){
        webDriverManager.quitDriver();

    }
}
