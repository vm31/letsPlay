package com.amazon.in.helper;

import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public abstract class PageFactoryLib{
    protected WebDriver driver;
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;
    private ChromeOptions chromeOptions;

    public PageFactoryLib(){
        //this.chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--no-sandbox");
        //this.driver = new ChromeDriver(this.chromeOptions);
        System.setProperty("webdriver.chrome.driver", "E:\\sampleMavenproject\\letsPlay-master\\libraries\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    public SignInPage getSignInPageObj() {
        return signInPageObj;
    }

    // Initialize PageObject
    public void init(){
        this.homePageObj = PageFactory.initElements(driver, HomePage.class);
        this.signInPageObj = PageFactory.initElements(driver, SignInPage.class);
    }

    public HomePage getHomePageObj() {
        return homePageObj;
    }

    public WebDriver getDriver() {
        return driver;
    }

}


