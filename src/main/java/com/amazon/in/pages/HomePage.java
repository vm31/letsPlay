package com.amazon.in.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    SignInPage signInPageObj;

    public HomePage(WebDriver driver) {
        this.signInPageObj = new SignInPage(driver);
    }

    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a")
    private WebElement titleHomepage;

    @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
    private WebElement signinBtn;

    public String getTitle(){
        System.out.println("title is:"+ titleHomepage.getAttribute("aria-label"));
        return titleHomepage.getText();
    }

    public SignInPage clickSignInPageBtn() {
        signinBtn.click();
        return signInPageObj;
    }


}
