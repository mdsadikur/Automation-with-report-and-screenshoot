package SiteName.Pages;

import SiteName.Util.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormPage extends Base {
    //Constructor
    public FormPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"tab\"]/a[2]")
    WebElement visaTypebtn;

    @FindBy(id = "eTypeChecked_1")
    WebElement eTypeChecked_1;

    @FindBy(xpath = "//*[@id=\"VisaRecommendationForm\"]/div[3]/ul/li[2]/a")
    WebElement nextbtn1;

    @FindBy(name = "emp_name")
    WebElement empName;

    @FindBy(name = "emp_designation")
    WebElement empDesignation;

    @FindBy(name = "brief_job_description")
    WebElement briefJobDescription;

    @FindBy(name = "emp_passport_no")
    WebElement empPassportNo;

    @FindBy(name = "emp_personal_no")
    WebElement empPersonalNo;

    @FindBy(name = "emp_surname")
    WebElement empSurname;
    @FindBy(name = "place_of_issue")
    WebElement placeOfIssue;
    @FindBy(name = "emp_given_name")
    WebElement empGivenName;
    @FindBy(name = "emp_place_of_birth")
    WebElement empPlaceOfBirth;
    @FindBy(name = "basic_local_amount")
    WebElement basicLocalAmount;

    @FindBy(name = "ex_office_post_code")
    WebElement exOfficePostCode;

    @FindBy(name = "ex_office_post_office")
    WebElement exOfficePostOffice;
    @FindBy(name = "ex_office_address")
    WebElement exOfficeAddress;
    @FindBy(name = "ex_office_telephone_no")
    WebElement exOfficeTelephone;
    @FindBy(xpath = "//*[@id=\"ex_office_mobile_no\"]")
    WebElement exOfficeMobileNo;
    @FindBy(name = "ex_office_email")
    WebElement exOfficeEmail;




    public FormPage clickvisaTypebtn() throws InterruptedException {
        visaTypebtn.isDisplayed();
        visaTypebtn.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage clickeTypeChecked_1() throws InterruptedException {
        eTypeChecked_1.isDisplayed();
        eTypeChecked_1.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage clicknextbtn1() throws InterruptedException {
        nextbtn1.isDisplayed();
        nextbtn1.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage country() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

        WebElement country_dropdown = driver.findElement(By.id("mission_country_id"));
        Select objSelect = new Select(country_dropdown);
        objSelect.selectByValue("2");
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    //Dropdown for High Commission
    public FormPage highCommision() throws InterruptedException {
        WebElement high_commision_dropdown = driver.findElement(By.id("high_commision_id"));
        Select objSelect = new Select(high_commision_dropdown);
        objSelect.selectByValue("34");
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }

    public FormPage clickempName(String EmpName){
        empName.isDisplayed();
        empName.clear();
        empName.sendKeys(EmpName);
        return this;
    }
    public FormPage clickempDesignation(String EmpDesignation){
        empDesignation.isDisplayed();
        empDesignation.clear();
        empDesignation.sendKeys(EmpDesignation);
        return this;
    }
    public FormPage clickbriefJobDescription(String BriefJobDescription){
        briefJobDescription.isDisplayed();
        briefJobDescription.clear();
        briefJobDescription.sendKeys(BriefJobDescription);
        return this;
    }
    //image upload
    @FindBy(xpath = "//*[@id=\"cropImageBtn\"]")
    WebElement savePhoto;
    public FormPage clickempPhoto() throws InterruptedException {
        WebElement empPhoto = driver.findElement(By.name("investorPhotoUploadBtn"));
        empPhoto.sendKeys("C:\\Users\\sadi\\Desktop\\profile.png");
        Thread.sleep(3000); //Wait 5 Seconds
        return this;
    }
    public FormPage clicksavePhoto() throws InterruptedException {
        savePhoto.isDisplayed();
        savePhoto.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }

    public FormPage clickempPassportNo(String EmpPassportNo){
        empPassportNo.isDisplayed();
        empPassportNo.clear();
        empPassportNo.sendKeys(EmpPassportNo);
        return this;
    }
    public FormPage clickempPersonalNo(String EmpPersonalNo){
        empPersonalNo.isDisplayed();
        empPersonalNo.clear();
        empPersonalNo.sendKeys(EmpPersonalNo);
        return this;
    }
    public FormPage clickempSurname(String EmpSurname){
        empSurname.isDisplayed();
        empSurname.clear();
        empSurname.sendKeys(EmpSurname);
        return this;
    }
    public FormPage clickplaceOfIssue(String PlaceOfIssue){
        placeOfIssue.isDisplayed();
        placeOfIssue.clear();
        placeOfIssue.sendKeys(PlaceOfIssue);
        return this;
    }
    public FormPage clickempGivenName(String EmpGivenName){
        empGivenName.isDisplayed();
        empGivenName.clear();
        empGivenName.sendKeys(EmpGivenName);
        return this;
    }
    public FormPage clickempPlaceOfBirth(String EmpPlaceOfBirth){
        empPlaceOfBirth.isDisplayed();
        empPlaceOfBirth.clear();
        empPlaceOfBirth.sendKeys(EmpPlaceOfBirth);
        return this;
    }
    public FormPage nationality() throws InterruptedException {
        WebElement nationality_dropdown = driver.findElement(By.id("emp_nationality_id"));
        Select objSelect = new Select(nationality_dropdown);
        objSelect.selectByValue("226");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage basicPaymentType() throws InterruptedException {
        WebElement payment_type_dropdown = driver.findElement(By.name("basic_payment_type_id"));
        Select objSelect = new Select(payment_type_dropdown);
        objSelect.selectByValue("1");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage clickbasicLocalAmount(String BasicLocalAmount){
        basicLocalAmount.isDisplayed();
        basicLocalAmount.clear();
        basicLocalAmount.sendKeys(BasicLocalAmount);
        return this;
    }
    public FormPage basicCurrency() throws InterruptedException {
        WebElement basic_currency_dropdown = driver.findElement(By.name("basic_local_currency_id"));
        Select objSelect = new Select(basic_currency_dropdown);
        objSelect.selectByValue("107");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage officeDivision() throws InterruptedException {
        WebElement office_division_dropdown = driver.findElement(By.name("ex_office_division_id"));
        Select objSelect = new Select(office_division_dropdown);
        objSelect.selectByValue("652");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage officeDistrict() throws InterruptedException {
        WebElement office_district_dropdown = driver.findElement(By.id("ex_office_district_id"));
        Select objSelect = new Select(office_district_dropdown);
        objSelect.selectByValue("61");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage officeThana() throws InterruptedException {
        WebElement office_thana_dropdown = driver.findElement(By.name("ex_office_thana_id"));
        Select objSelect = new Select(office_thana_dropdown);
        objSelect.selectByValue("442");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage clickexOfficePostCode(String ExOfficePostCode){
        exOfficePostCode.isDisplayed();
        exOfficePostCode.clear();
        exOfficePostCode.sendKeys(ExOfficePostCode);
        return this;
    }
    public FormPage clickexOfficePostOffice(String ExOfficePostOffice){
        exOfficePostOffice.isDisplayed();
        exOfficePostOffice.clear();
        exOfficePostOffice.sendKeys(ExOfficePostOffice);
        return this;
    }
    public FormPage clickexOfficeAddress(String ExOfficeAddress){
        exOfficeAddress.isDisplayed();
        exOfficeAddress.clear();
        exOfficeAddress.sendKeys(ExOfficeAddress);
        return this;
    }
    public FormPage clickexOfficeTelephone(String ExOfficeTelephone){
        exOfficeTelephone.isDisplayed();
        exOfficeTelephone.clear();
        exOfficeTelephone.sendKeys(ExOfficeTelephone);
        return this;
    }
    public FormPage clickexOfficeMobileNo(String ExOfficeMobileNo){
        exOfficeMobileNo.isDisplayed();
        exOfficeMobileNo.clear();
        exOfficeMobileNo.sendKeys(ExOfficeMobileNo);
        return this;
    }

    public FormPage clickexOfficeEmail(String ExOfficeEmail){
        exOfficeEmail.isDisplayed();
        exOfficeEmail.clear();
        exOfficeEmail.sendKeys(ExOfficeEmail);
        return this;
    }
    //Date of Birth
    public FormPage dateOfBirthday(String DateOfBirthday){
        WebElement dateOfbd = driver.findElement(By.name("emp_date_of_birth"));
        dateOfbd.isDisplayed();
        dateOfbd.clear();
        dateOfbd.sendKeys(DateOfBirthday);
        return this;
    }
    public FormPage dateOfissue(String DateOfissue){
        WebElement dateOfissue = driver.findElement(By.name("pass_issue_date"));
        dateOfissue.isDisplayed();
        dateOfissue.clear();
        dateOfissue.sendKeys(DateOfissue);
        return this;
    }
    public FormPage dateOfexpiry(String DateOfexpiry){
        WebElement dateOfexp = driver.findElement(By.name("pass_expiry_date"));
        dateOfexp.isDisplayed();
        dateOfexp.clear();
        dateOfexp.sendKeys(DateOfexpiry);
        return this;
    }

    public FormPage clicknextbtn2() throws InterruptedException {
        WebElement nextbtn2 = driver.findElement(By.xpath("//*[@id=\"VisaRecommendationForm\"]/div[3]/ul/li[2]/a"));
        nextbtn2.isDisplayed();
        nextbtn2.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage visitBangladesh() throws InterruptedException {
        WebElement visitBangladeshId = driver.findElement(By.xpath("//*[@id=\"travel_history_no\"]"));
        visitBangladeshId.isDisplayed();
        visitBangladeshId.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage localExecutive(String LocalExecutive) throws InterruptedException {
        WebElement localExecutiveId = driver.findElement(By.name("local_executive"));
        localExecutiveId.isDisplayed();
        localExecutiveId.clear();
        localExecutiveId.sendKeys(LocalExecutive);
        return this;
    }
    public FormPage localStaff(String LocalStaff) throws InterruptedException {
        WebElement localStaff = driver.findElement(By.name("local_stuff"));
        localStaff.isDisplayed();
        localStaff.clear();
        localStaff.sendKeys(LocalStaff);
        return this;
    }
    public FormPage foreignExecutive(String ForeignExecutive) throws InterruptedException {
        WebElement foreignExecutive = driver.findElement(By.name("foreign_executive"));
        foreignExecutive.isDisplayed();
        foreignExecutive.clear();
        foreignExecutive.sendKeys(ForeignExecutive);
        return this;
    }
    public FormPage foreignStaff(String ForeignStaff) throws InterruptedException {
        WebElement foreignStaff = driver.findElement(By.name("foreign_stuff"));
        foreignStaff.isDisplayed();
        foreignStaff.clear();
        foreignStaff.sendKeys(ForeignStaff);
        return this;
    }
    public FormPage clicknextbtn3() throws InterruptedException {
        WebElement nextbtn3 = driver.findElement(By.xpath("//*[@id=\"VisaRecommendationForm\"]/div[3]/ul/li[2]/a"));
        nextbtn3.isDisplayed();
        nextbtn3.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage passportUpload() throws InterruptedException {
        WebElement passportUpload = driver.findElement(By.xpath("//*[@id=\"file11\"]"));
        passportUpload.sendKeys("C:\\Users\\sadi\\Desktop\\file.pdf");
        Thread.sleep(5000); //Wait 5 Seconds
        return this;
    }
    public FormPage nextbtn4() throws InterruptedException {
        WebElement nextbtn4 = driver.findElement(By.xpath("//*[@id=\"VisaRecommendationForm\"]/div[3]/ul/li[2]/a"));
        nextbtn4.isDisplayed();
        nextbtn4.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage agree() throws InterruptedException {
        WebElement agree = driver.findElement(By.xpath("//*[@id=\"accept_terms\"]"));
        agree.isDisplayed();
        agree.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage nextbtn5() throws InterruptedException {
        WebElement nextbtn5 = driver.findElement(By.xpath("//*[@id=\"VisaRecommendationForm\"]/div[3]/ul/li[2]/a"));
        nextbtn5.isDisplayed();
        nextbtn5.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage preview() throws InterruptedException {
        WebElement preview = driver.findElement(By.xpath("//*[@id=\"VisaRecommendationForm\"]/div[3]/ul/li[3]/a"));
        preview.isDisplayed();
        preview.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage goBack() throws InterruptedException {
        WebElement goBack = driver.findElement(By.xpath("//*[@id=\"closeBtn\"]"));
        goBack.isDisplayed();
        goBack.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage submit() throws InterruptedException {
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitForm\"]"));
        submit.isDisplayed();
        submit.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage account() throws InterruptedException {
        WebElement account = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
        account.isDisplayed();
        account.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage confirm() throws InterruptedException {
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]"));
        confirm.isDisplayed();
        confirm.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage accountNo(String AccountNo) throws InterruptedException {
        WebElement accountNo = driver.findElement(By.name("PayAccountNo"));
        accountNo.isDisplayed();
        accountNo.clear();
        accountNo.sendKeys(AccountNo);
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage accountName(String AccountName) throws InterruptedException {
        WebElement accountName = driver.findElement(By.name("PayAccountName"));
        accountName.isDisplayed();
        accountName.clear();
        accountName.sendKeys(AccountName);
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage accountMobile(String AccountMbl) throws InterruptedException {
        WebElement accountMobile = driver.findElement(By.name("PayMobile"));
        accountMobile.isDisplayed();
        accountMobile.clear();
        accountMobile.sendKeys(AccountMbl);
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage accountNext() throws InterruptedException {
        WebElement accountNext = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
        accountNext.isDisplayed();
        accountNext.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage otp(String Otp) throws InterruptedException {
        WebElement otp = driver.findElement(By.name("OTPVal"));
        otp.isDisplayed();
        otp.clear();
        otp.sendKeys(Otp);
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
    public FormPage otpConfirm() throws InterruptedException {
        WebElement otpConfirm = driver.findElement(By.xpath("//*[@id=\"btnConfirm\"]"));
        otpConfirm.isDisplayed();
        otpConfirm.click();
        Thread.sleep(2000); //Wait 5 Seconds
        return this;
    }
}