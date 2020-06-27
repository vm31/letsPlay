package com.amazon.in.stepdefs;

import com.amazon.in.helper.PageFactoryLib;
import com.amazon.in.pages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;


public class HomePageStepDef extends PageFactoryLib {
    private HomePage home;

    public HomePageStepDef(){super();}

    public HomePageStepDef(WebDriver driver) {
        super(driver);
        this.home=home;
    }

//    @Before("I launch url")
//    public void iLaunchUrl(){
//        getDriver().get("amazon.in");
//    }
    @Then("I verify title")
    public void iVerifyTitle(){
        //Assert(getHomePageObj().getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        //Assert.assertTrue(home.getTitle().contains("Online"));
    }

}
