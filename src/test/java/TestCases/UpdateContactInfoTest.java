package TestCases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateContactInfoPage;

public class UpdateContactInfoTest extends BaseTest {
    @Test
    public void UpdateContact(){
     new LoginPage(driver).Login("Meloukk" , "456321").UpdateContactInfo().UpdateContact("Mohamed" , "Mahmoud" , "Cairo" , "October" , "Egypt" , "1234" , "0100147");
    }
}
