package TestCases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.OpenAccountPage;

public class OpenAccountTest extends BaseTest {
    @Test
    public void OpenAccount (){
    new LoginPage(driver).Login("Meloukk" , "456321").OpenNewAccount().OpenAccount();
    }
}
