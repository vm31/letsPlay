package helper;

import com.amazon.in.pages.HomePage;
import com.amazon.in.pages.SignInPage;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

public abstract class BaseTest {
    protected  WebDriver driver;
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;

@BeforeClass
    public void init(){
        ChromeOptions chromeOptions;
        chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver=new ChromeDriver(chromeOptions);
//        driver.get("https://www.amazon.nl");
//        homePageObj = PageFactory.initElements(driver, HomePage.class);
//        signInPageObj = PageFactory.initElements(driver, SignInPage.class);
    }



    public HomePage getHomePageObj() {
        return homePageObj;
    }
    public SignInPage getSignInPageObj() {
        return signInPageObj;
    }
//
//    public WebDriver getDriver() {
//        return driver;
//    }

}


