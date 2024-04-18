package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By firstName = By.xpath("//input[@id='customer.firstName']");
    private By lastName = By.xpath("//input[@id='customer.lastName']");
    private By address = By.xpath("//input[@id='customer.address.street']");
    private By city = By.xpath("//input[@id='customer.address.city']");
    private By state = By.xpath("//input[@id='customer.address.state']");
    private By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    private By phone = By.xpath("//input[@id='customer.phoneNumber']");
    private By sSN = By.xpath("//input[@id='customer.ssn']");
    private By username = By.xpath("//input[@id='customer.username']");
    private By password = By.xpath("//input[@id='customer.password']");
    private By confirm = By.xpath("//input[@id='repeatedPassword']");
    private By register = By.xpath("//input[@value='Register']");

    //method
    public void createAccount(String FirstName, String LastName, String Address, String City, String State, String ZipCode, String Phone, String Ssn, String Username, String Password, String Confirm){
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
        driver.findElement(address).sendKeys(Address);
        driver.findElement(city).sendKeys(City);
        driver.findElement(state).sendKeys(State);
        driver.findElement(zipCode).sendKeys(ZipCode);
        driver.findElement(phone).sendKeys(Phone);
        driver.findElement(sSN).sendKeys(Ssn);
        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(confirm).sendKeys(Confirm);
        driver.findElement(register).click();
    }
}
