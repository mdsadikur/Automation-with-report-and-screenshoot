package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends Base {
    public BasePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"HomePageFlexOrderDiv_2\"]/div[1]/a[1]")
    WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }

}
