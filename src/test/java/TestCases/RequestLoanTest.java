package TestCases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RequestLoanPage;

public class RequestLoanTest extends BaseTest {

    @Test
    public void RequestLoan(){
       new LoginPage(driver).Login("Meloukk" , "456321").ApplyForLoan().ApplyForLoan("5000" , "3000" , "14010");
    }
}
