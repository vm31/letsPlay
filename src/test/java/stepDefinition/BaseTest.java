package stepDefinition;

import helper.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.HomePage;
import pages.SignInPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public HomePage homePage;
    public SignInPage signInPage;
    public Utility utility;
    //public Logger log = Logger.getLogger(this.getClass().getName());
    public static Logger logger;
    public Properties configprop;

    protected static WebDriver driver;

    protected WebDriver getDriver() throws IOException, InterruptedException {
        utility = new Utility(driver);
        //reading data property
        configprop = new Properties();
        FileInputStream configPropfile = new FileInputStream("data.properties");
        configprop.load(configPropfile);
        //String br = configprop.getProperty("BROWSER");


        if (driver==null) {
            //br.equals("chrome");
            System.setProperty("webdriver.chrome.driver", configprop.getProperty("chrome_path"));
            driver = new ChromeDriver();
            Thread.sleep(2000);
            driver.manage().window().maximize();

        }//else if (driver.equals(configprop.getProperty("BROWSER=firefox"))) {

            //System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefox_path"));
           // driver = new FirefoxDriver();
       // } //else if (br.equals("ie")) {

            //System.setProperty("webdriver.ie.driver", configprop.getProperty("ie_path"));
           // driver= new InternetExplorerDriver();
        //}
        return driver;
    }

}

