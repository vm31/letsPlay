package amzon.in.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
    WebDriver driver;


    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id='ap_email']")
    private WebElement emailInputBox;

}
