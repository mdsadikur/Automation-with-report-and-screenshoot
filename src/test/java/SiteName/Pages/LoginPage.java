package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
    @FindBy(name = "email")
    WebElement userEmailid;

    @FindBy(name = "password")
    WebElement userPasswordid;

    @FindBy(xpath = "//*[@id=\"next_btn\"]")
    WebElement Nextbtn;

    @FindBy(xpath = "//*[@id=\"login_btn\"]")
    WebElement Loginbtn;


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickUserEmailfld(String UserEmail){
        userEmailid.isDisplayed();
        userEmailid.clear();
        userEmailid.sendKeys(UserEmail);
        return this;
    }

    public LoginPage clickUserPasswordfld(String UserPassword){
        userPasswordid.isDisplayed();
        userPasswordid.clear();
        userPasswordid.sendKeys(UserPassword);
        return this;
    }
    public LoginPage clickNextbtn() throws InterruptedException {
        Nextbtn.isDisplayed();
        Nextbtn.click();
        Thread.sleep(5000);
        return this;
    }

    public DashboardPage clickLoginbtn() throws InterruptedException {
        Loginbtn.isDisplayed();
        Loginbtn.click();
        Thread.sleep(5000);
        return new DashboardPage();
    }
}
