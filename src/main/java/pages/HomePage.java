package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By openNewAccount = By.xpath("//a[text()='Open New Account']");
    private By transferFunds = By.xpath("//a[text()='Transfer Funds']");
    private By billPay = By.xpath("//a[text()='Bill Pay']");
    private By findTransaction = By.xpath("//a[text()='Find Transactions']");
    private By updateContactInfo = By.xpath("//a[text()='Update Contact Info']");
    private By requestLoan = By.xpath("//a[text()='Request Loan']");

    //action
        public OpenAccountPage OpenNewAccount(){
        driver.findElement(openNewAccount).click();
        return new OpenAccountPage(driver);
        }
        public BillPayPage BillPay (){
        driver.findElement(billPay).click();
        return new BillPayPage(driver);
        }
        public TransferFundsPage TransferFunds(){
        driver.findElement(transferFunds).click();
        return new TransferFundsPage(driver);
        }
        public UpdateContactInfoPage UpdateContactInfo() {
        driver.findElement(updateContactInfo).click();
        return new UpdateContactInfoPage(driver);
        }
        public RequestLoanPage ApplyForLoan(){
        driver.findElement(requestLoan).click();
        return new RequestLoanPage(driver);

        }
    }

