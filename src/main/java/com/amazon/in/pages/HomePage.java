package com.amazon.in.pages;

import com.amazon.in.helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    Utility util;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.util = new Utility(driver);
    }

    @FindBy(xpath = "//title")
    private WebElement titleHomepage;

    @FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a")
    private WebElement signinBtn;


    public String getTitle(){
        String x=titleHomepage.getText();
        System.out.println("title is:"+x);
        return x;
    }
    public void clickSignInPage() {
        util.waitForElement(1000);
        signinBtn.click();
    }


    }
