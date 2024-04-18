package TestCases;

import org.testng.annotations.Test;
import pages.BillPayPage;
import pages.HomePage;
import pages.LoginPage;

public class BillPayTest extends BaseTest {
    @Test
    public void BillPay (){
        new LoginPage(driver).Login("Meloukk" , "456321").BillPay().billPay("Molok" , "Cairo" , "Giza" , "Egypt" , "0123" , "4444" , "21336" , "21336" , "5000" , "16341");
    }
}
