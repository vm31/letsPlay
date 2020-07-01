package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver ldriver;
    public HomePage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }

    @FindBy(xpath="//*[@id=\"nav-logo\"]/a")
    @CacheLookup
    WebElement AmazonDispaly;

    public void navigateToUrl(){

        ldriver.get("https://www.amazon.in");
    }
    public void verifyAmazonDispay(){
        AmazonDispaly.isDisplayed();

        }
}
