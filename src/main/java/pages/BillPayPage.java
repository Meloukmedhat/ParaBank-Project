package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage {
    private WebDriver driver;

    public BillPayPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By payeeName = By.xpath("//input[@name='payee.name']");
    private By address = By.xpath("//input[@name='payee.address.street']");
    private By city = By.xpath("//input[@name='payee.address.city']");
    private By state = By.xpath("//input[@name='payee.address.state']");
    private By zipCode = By.xpath("//input[@name='payee.address.zipCode']");
    private By phone = By.xpath("//input[@name='payee.phoneNumber']");
    private By account = By.xpath("//input[@name='payee.accountNumber']");
    private By verifyAccount = By.xpath("//input[@name='verifyAccount']");
    private By amount = By.xpath("//input[@name='amount']");
    private By fromAccount = By.xpath("//select[@name='fromAccountId']");
    private By sendPayment = By.xpath("//input[@value='Send Payment']");

    //method
    public void billPay (String PayeeName , String Address , String City , String State , String ZipCode , String Phone , String Account , String VerifyAccount , String Amount , String FromAccount){
        driver.findElement(payeeName).sendKeys(PayeeName);
        driver.findElement(address).sendKeys(Address);
        driver.findElement(city).sendKeys(City);
        driver.findElement(state).sendKeys(State);
        driver.findElement(zipCode).sendKeys(ZipCode);
        driver.findElement(phone).sendKeys(Phone);
        driver.findElement(account).sendKeys(Account);
        driver.findElement(verifyAccount).sendKeys(VerifyAccount);
        driver.findElement(amount).sendKeys(Amount);
        driver.findElement(fromAccount).sendKeys(FromAccount);
        driver.findElement(sendPayment).click();

    }
}
