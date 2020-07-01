package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class homePageStep extends  BaseTest{
    WebDriver driver=getDriver();
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
        homePage=new HomePage(driver);

        homePage.navigateToUrl();
    }

    @Then("user verify amazon home display")
    public void user_verify_amazon_home_display() {
        homePage.verifyAmazonDispay();
    }

}
