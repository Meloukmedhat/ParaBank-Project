package TestCases;

import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.StartPage;

public class RegisterTest extends BaseTest {

    @Test
    public void validateCreateAccount() {
        StartPage startPage = new StartPage(driver);
        startPage.Register();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.createAccount("Melouk", "Medhat", "October", "Giza", "Egypt", "0000", "0101477", "111", "Lukas", "1452", "1452");
    }
    }