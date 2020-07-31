package amzon.in.pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage{

    @FindBy(xpath = "//*[@id=\"nav-logo\"]")
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

    public boolean isHomePageDisplayed(){
       return titleHomepage.isDisplayed();
    }




}
