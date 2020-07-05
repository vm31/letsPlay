package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.io.IOException;

public class homePageStep extends  BaseTest{
    //to call  Web browser method in BaseTest
    WebDriver driver=getDriver();

    public homePageStep() throws IOException {
    }
    //public WebDriver driver;
    //public HomePage homePage;

    //@Given("user launch chrome browser")
    //public void user_launch_chrome_browser() {
        //System.setProperty("webdriver.chrome.driver", "E:\\letsCucumber\\libraries\\chromedriver.exe");
       // driver=new ChromeDriver();
       // homePage=new HomePage(driver);
    //}

    @Given("user Navigate to home page")
    public void user_Navigate_to_home_page() {
        logger= Logger.getLogger("letsCucumber");//added logger
        PropertyConfigurator.configure("log4j.properties");


        homePage=new HomePage(driver);


        homePage.navigateToUrl();
        logger.info("*****opening url****");
    }

    @Then("user verify amazon home display")
    public void user_verify_amazon_home_display() {
        logger.info("***verifying homepage ****");

        homePage.verifyAmazonDispay();
    }

}
