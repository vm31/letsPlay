package base;

import amzon.in.pages.HomePage;
import amzon.in.pages.SignInPage;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static final WebDriver driver;
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;

    static {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.nl");

        Runnable r = new Runnable() {

            @Override
            public void run() {
                if (driver != null) {
                    driver.quit();
                }
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread(r));

    }
    public BaseTest() {

        homePageObj= PageFactory.initElements(driver,HomePage.class);
        signInPageObj= PageFactory.initElements(driver,SignInPage.class);
    }

}
