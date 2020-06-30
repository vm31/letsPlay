package com.amazon.in.pages;

import com.amazon.in.dataProviders.ConfigFileReader;
import com.amazon.in.helper.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    SignInPage signInPageObj;
    private ConfigFileReader configFileReader;

    public HomePage(WebDriver driver) {
        //driver = driver;
        PageFactory.initElements(driver, this);
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
    public void navigateHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public SignInPage clickSignInPageBtn() {
        signinBtn.click();
        configFileReader.getImplicitlyWait();
        return signInPageObj;
    }


}
