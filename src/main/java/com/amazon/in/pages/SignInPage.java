package com.amazon.in.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage {
    WebDriver driver;


    public SignInPage(WebDriver driver) {
        this.driver = driver;
//        this.util = new Utility(driver);
    }

    @FindBy(xpath="//*[@id='ap_email']")
    private WebElement emailInputBox;

    public boolean isEmailBoxDisplayed() throws Exception{
        Thread.sleep(1000);
     boolean x= driver.findElement(By.xpath("//*[@id='ap_email']")).isDisplayed();
        System.out.println(x);
        if(x==true){
            System.out.println("email box is displayed");
        }
        return x;
    }
}
