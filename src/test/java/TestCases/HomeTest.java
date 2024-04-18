package TestCases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest{
    @Test
    public void openAccount(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("Meloukk" , "456321");
        HomePage homePage = new HomePage(driver);
        homePage.OpenNewAccount();
    }
}
