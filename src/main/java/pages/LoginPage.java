package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By userName = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@type='password']");
    private By login = By.xpath("//input[@class='button']");

    //action
    public HomePage Login(String username , String Password){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(login).click();
        return new HomePage(driver);
    }

}
