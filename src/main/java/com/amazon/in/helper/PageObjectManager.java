package com.amazon.in.helper;

import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PageObjectManager {
    protected WebDriver driver;
    protected HomePage home;
    protected SignInPage signInPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;

    }



    // Initialize PageObject
//    public void init(){
//        this.homePageObj = PageFactory.initElements(driver, HomePage.class);
//        this.signInPageObj = PageFactory.initElements(driver, SignInPage.class);
//    }


    public HomePage getHome() {
        return home;
    }

    public SignInPage getSignInPage() {
        return signInPage;
    }
}


