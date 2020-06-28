package com.amazon.in.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//title")
    private WebElement titleHomepage;

    public String getTitle(){
        String x=titleHomepage.getText();
        System.out.println("title is:"+x);
        return x;
    }

}
