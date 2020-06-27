package com.amazon.in.helper;

import com.amazon.in.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageFactoryLib{
    static WebDriver driver;
    HomePage homePageObj;

    public PageFactoryLib(WebDriver driver){
        PageFactoryLib.driver = driver;
        homePageObj = PageFactory.initElements(driver, HomePage.class);
    }

    public PageFactoryLib() {

    }

    public HomePage getHomePageObj() {
        return homePageObj;
    }

    public WebDriver getDriver() {
        return driver;
    }

}


