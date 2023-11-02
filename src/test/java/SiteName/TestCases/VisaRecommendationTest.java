package SiteName.TestCases;

import SiteName.Pages.DashboardPage;
import SiteName.Pages.FormPage;
import SiteName.Pages.VisaListPage;
import SiteName.Util.Base;
import org.testng.annotations.Test;

public class VisaRecommendationTest extends Base {
    public VisaRecommendationTest(){
        super();
    }

    @Test
    public void visaRecommendationShouldSuccess() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.VisaRecommendationbtn();
        dashboardPage.NewVisaRecommendationbtn();
        VisaListPage visaListPage = new VisaListPage();
        visaListPage.clickNewApplicationbtn();
        FormPage formPage = new FormPage();
        formPage.clickvisaTypebtn();
        formPage.clickeTypeChecked_1();
        formPage.clicknextbtn1();
        formPage.country();
        formPage.highCommision();
        formPage.clickempName("Test Company");
        formPage.clickempDesignation("Test Company Applica");
        formPage.clickbriefJobDescription("Test Company Applicant 1");
        formPage.clickempPhoto();
        formPage.clicksavePhoto();
        formPage.clickempPassportNo("123456789");
        formPage.clickempPersonalNo("123456789");
        formPage.clickempSurname("Test");
        formPage.clickplaceOfIssue("Test Company Applica");
        formPage.clickempGivenName("Test Company Appli");
        formPage.clickempPlaceOfBirth("Dhaka");
        formPage.nationality();
        formPage.dateOfBirthday("31-Oct-2023");
        formPage.dateOfissue("31-Oct-2023");
        formPage.dateOfexpiry("31-Oct-2023");
        formPage.basicPaymentType();
        formPage.clickbasicLocalAmount("1000");
        formPage.basicCurrency();
        formPage.officeDivision();
        formPage.officeDistrict();
        formPage.officeThana();
        formPage.clickexOfficePostCode("1212");
        formPage.clickexOfficePostOffice("Dhaka");
        formPage.clickexOfficeAddress("Test Company Applicant 1");
        formPage.clickexOfficeTelephone("123456789");
        formPage.clickexOfficeMobileNo("1741022832");
        formPage.clickexOfficeEmail("sadi@gmail.com");
        formPage.clicknextbtn2();
        formPage.visitBangladesh();
        formPage.localExecutive("5");
        formPage.localStaff("2");
        formPage.foreignExecutive("3");
        formPage.foreignStaff("4");
        formPage.clicknextbtn3();
        formPage.passportUpload();
        formPage.nextbtn4();
        formPage.agree();
        formPage.nextbtn5();
     /*   formPage.preview();
        formPage.goBack();*/

    }


}
