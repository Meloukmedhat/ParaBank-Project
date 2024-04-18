package TestCases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TransferFundsPage;

public class TransferFundsTest extends BaseTest {

    @Test
    public void TransferFunds (){
        new LoginPage(driver).Login("Meloukk" , "456321").TransferFunds().transferFunds("500" , "21336" , "21336");
    }
}
