package com.amazon.in.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    SignInPage signInPageObj;
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver= driver;
        this.signInPageObj = new SignInPage(driver);
    }

//    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a")
//    private WebElement titleHomepage;
//
//    @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
//    private WebElement signinBtn;

    public void getTitle(){
        driver.get(("https://amazon.nl"));
        driver.findElement(By.xpath("//a[@href=\"/ref=nav_logo\"]")).isDisplayed();
    }

    public SignInPage clickSignInPageBtn() {
        driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
        return signInPageObj;
    }


}
