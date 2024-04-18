package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoanPage {
    private WebDriver driver;
    public RequestLoanPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By loanAmount = By.xpath("//input[@id='amount']");
    private By downPayment = By.xpath("//input[@id='downPayment']");
    private By fromAccount = By.xpath("//select[@id='fromAccountId']");
    private By applyNow = By.xpath("//input[@value='Apply Now']");

    //action
    public void ApplyForLoan(String LoanAmount , String DownPayment , String FromAccount){
        driver.findElement(loanAmount).sendKeys(LoanAmount);
        driver.findElement(downPayment).sendKeys(DownPayment);
        driver.findElement(fromAccount).sendKeys(FromAccount);
        driver.findElement(applyNow).click();
    }
}
