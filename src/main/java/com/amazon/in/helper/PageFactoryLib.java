package com.amazon.in.helper;

import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public abstract class PageFactoryLib{
    protected WebDriver driver;
    private HomePage homePageObj;
    private SignInPage signInPageObj;
    private ChromeOptions chromeOptions;

    public PageFactoryLib(){
        this.chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sanddribox");
    }

    // Initialize and configure driver
    // Initialize PageObject
    public void init(){
        this.driver = new ChromeDriver(this.chromeOptions);
        this.homePageObj = PageFactory.initElements(driver, HomePage.class);
        this.signInPageObj=PageFactory.initElements(driver,SignInPage.class);
    }

    // Clean driver
    public void closeDriver(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
    //since driver and pageObjects are private or protected GETTERS are needed
    public HomePage getHomePageObj() {
        return homePageObj;
    }

    public SignInPage getSignInPageObj() {
        return signInPageObj;
    }



}


