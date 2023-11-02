package SiteName.TestCases;

import SiteName.Pages.*;
import SiteName.Util.Base;
import org.testng.annotations.Test;

public class PaymentTest extends Base {

    public PaymentTest() {
        super();
    }

    @Test
    public void paymentShouldSuccess() throws InterruptedException {
       FormPage formPage = new FormPage();
        formPage.account();
        formPage.confirm();
        formPage.accountNo("0002634313655");
        formPage.accountName("Sadi");
        formPage.accountMobile("01710563521");
        formPage.accountNext();
        formPage.otp("123456");
        formPage.otpConfirm();
    }
}
