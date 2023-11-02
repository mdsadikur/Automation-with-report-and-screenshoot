package SiteName.Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base  {
    private Properties properties;
    public static WebDriver driver;
    public Base(){
        try {
            String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
            properties = new Properties();

            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @BeforeMethod
    public void browserSetup(){

        String browserName = getbrowser();
        if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("headless")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setHeadless(true);
            driver = new FirefoxDriver(firefoxOptions);
        }
        driver.get(getBaseUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    public String getBaseUrl(){
        return properties.getProperty("baseurl");
    }

    // Login Page Elements From Home Page
 /*   @FindBy(xpath = "//*[@id=\"HomePageFlexOrderDiv_2\"]/div[1]/a[1]")
    WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }*/

   /* public String getUserEmail(){
        return properties.getProperty("usermail");
    }

    public String getPassword(){
        return properties.getProperty("password");
    }*/

    public String getbrowser(){
        return properties.getProperty("browsername");
    }



//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

    public static void takeScreenshot(String fileName){
        try {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + fileName + System.currentTimeMillis() + ".png"));

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
