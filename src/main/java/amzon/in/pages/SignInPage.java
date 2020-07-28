package amzon.in.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Utility;


public class SignInPage {
    private WebDriver driver;
    private Utility util;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.util = new Utility(driver);
    }


    @FindBy(xpath="//*[@id='ap_email']")
    private WebElement emailInputBox;
    @FindBy(xpath="//*[@id='continue']")
    private WebElement getOnBtn;

    public void enterEmail(String email){
        emailInputBox.sendKeys(email);
        driver.findElement(By.xpath(""));

    }
    public void clickGetOnBTn(){
        getOnBtn.click();
    }

}
