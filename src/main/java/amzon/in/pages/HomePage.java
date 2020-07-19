package amzon.in.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

    WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='ref=nav_logo']")
    private WebElement titleHomepage;

    @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
    private WebElement signinBtn;

    @FindBy(xpath="//*[@id='twotabsearchtextbox']")
    private WebElement searchBox;


    public void getTitle(){
        titleHomepage.isDisplayed();
    }

    public void clickSignInBtn(){
        signinBtn.click();
    }
    public void search(String text){
        searchBox.click();
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.ENTER);
    }




}
