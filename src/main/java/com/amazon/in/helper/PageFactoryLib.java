package com.amazon.in.helper;

import com.amazon.in.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public abstract class PageFactoryLib{
    protected WebDriver driver;
    protected HomePage homePageObj;
    private ChromeOptions chromeOptions;

    public PageFactoryLib(){
        this.chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        this.driver = new ChromeDriver(this.chromeOptions);
    }

    // Initialize PageObject
    public void init(){
        this.homePageObj = PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage getHomePageObj() {
        return homePageObj;
    }

    public WebDriver getDriver() {
        return driver;
    }

}


