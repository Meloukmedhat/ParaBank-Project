package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage {
    private WebDriver driver;

    public TransferFundsPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By amount = By.xpath("//input[@id='amount']");

    private By fromAccount = By.xpath("//select[@id='fromAccountId']");

    private By toAccount = By.xpath("//select[@id='toAccountId']");
    private By transfer = By.xpath("//input[@value='Transfer']");

    //method
    public void transferFunds (String Amount , String FromAccount , String ToAccount){
        driver.findElement(amount).sendKeys(Amount);
        driver.findElement(fromAccount).sendKeys(FromAccount);
        driver.findElement(toAccount).sendKeys(ToAccount);
        driver.findElement(transfer).click();
    }
}
