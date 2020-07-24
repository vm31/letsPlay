package base;

import amzon.in.pages.HomePage;
import amzon.in.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;


    public BaseTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.nl");
        homePageObj= PageFactory.initElements(driver,HomePage.class);
        signInPageObj= PageFactory.initElements(driver,SignInPage.class);
    }
}
