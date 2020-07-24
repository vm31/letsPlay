package amzon.in.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {

    @FindBy(xpath="//*[@id='ap_email']")
    private WebElement emailInputBox;
    @FindBy(xpath="//*[@id='continue']")
    private WebElement getOnBtn;

    public void enterEmail(String email){
        emailInputBox.sendKeys(email);

    }
    public void clickGetOnBTn(){
        getOnBtn.click();
    }

}
