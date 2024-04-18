package TestCases;

import org.testng.annotations.Test;
import pages.StartPage;

public class StartTest extends BaseTest{

    @Test
    public void validateRegisterButton(){

        StartPage startPage = new StartPage(driver);
        startPage.Register();

    }
}
