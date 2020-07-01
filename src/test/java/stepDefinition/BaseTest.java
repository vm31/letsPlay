package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignInPage;

public class BaseTest {
    public HomePage homePage;
    public SignInPage signInPage;
    protected static WebDriver driver;
     protected WebDriver getDriver() {
         if (driver == null) {
             System.setProperty("webdriver.chrome.driver", "E:\\letsCucumber\\libraries\\chromedriver.exe");
             driver = new ChromeDriver();
         }
         return driver;
     }

}
