package common;

import helper.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignInPage;
import java.util.Properties;

public class BaseTest {
    public HomePage homePage;
    public SignInPage signInPage;
    public Utility utility;
    public static Logger logger;
    public Properties configprop;
    public WebDriver driver;



}

