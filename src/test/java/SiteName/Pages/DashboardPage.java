package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Base {
    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"side-menu\"]/li[5]/a")
    WebElement VisaRecommendationbtn;

    @FindBy(xpath = "//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")
    WebElement NewVisaRecommendationbtn;

    public DashboardPage VisaRecommendationbtn() throws InterruptedException {
        VisaRecommendationbtn.isDisplayed();
        VisaRecommendationbtn.click();
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public VisaListPage NewVisaRecommendationbtn() throws InterruptedException {
        NewVisaRecommendationbtn.isDisplayed();
        NewVisaRecommendationbtn.click();
        Thread.sleep(5000); //Wait 5 Seconds
        return new VisaListPage();
    }




}
