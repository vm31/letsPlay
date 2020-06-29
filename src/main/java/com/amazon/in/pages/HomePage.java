package com.amazon.in.pages;

import com.amazon.in.helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    Utility util;
    SignInPage signInPageObj;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.util = new Utility(driver);
        this.signInPageObj = new SignInPage(driver);
    }

    @FindBy(xpath = "//title")
    private WebElement titleHomepage;

    @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
    private WebElement signinBtn;


    public String getTitle(){
        String x=titleHomepage.getText();
        System.out.println("title is:"+x);
        return x;
    }

    public SignInPage clickSignInPageBtn() {
        signinBtn.click();
        util.waitForElement(500);
        return signInPageObj;
    }


}
