package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisaListPage extends Base {
    public VisaListPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/section/div/div/div[3]/div/div[1]/div[2]/a")
    WebElement NewApplicationbtn;

   public FormPage clickNewApplicationbtn() throws InterruptedException {
        NewApplicationbtn.isDisplayed();
        NewApplicationbtn.click();
        Thread.sleep(5000); //Wait 5 Seconds
        return new FormPage();
    }
}
