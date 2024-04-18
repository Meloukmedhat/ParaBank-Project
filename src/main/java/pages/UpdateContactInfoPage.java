package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateContactInfoPage {
    private WebDriver driver;

    public UpdateContactInfoPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By FirstName = By.xpath("//input[@id='customer.firstName']");
    private By LastName = By.xpath("//input[@id='customer.lastName']");
    private By Address = By.xpath("//input[@id='customer.address.street']");
    private By City = By.xpath("//input[@id='customer.address.city']");
    private By State = By.xpath("//input[@id='customer.address.state']");
    private By ZipCode =By.xpath("//input[@id='customer.address.zipCode']");
    private By Phone = By.xpath("//input[@id='customer.phoneNumber']");
    private By UpdateProfile = By.xpath("//input[@value='Update Profile']");

    //method
    public void UpdateContact(String firstName , String lastName , String address , String city , String state , String zipCode , String phone){
        driver.findElement(FirstName).sendKeys(firstName);
        driver.findElement(LastName).sendKeys(lastName);
        driver.findElement(Address).sendKeys(address);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(state);
        driver.findElement(ZipCode).sendKeys(zipCode);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(UpdateProfile).click();
    }
}
