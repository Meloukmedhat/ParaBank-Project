package TestCases;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;
import pages.StartPage;

public class LoginTest extends BaseTest {
    @Test
    public void ValidateLoginButton(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login( "Meloukk" , "456321");
    }
}
