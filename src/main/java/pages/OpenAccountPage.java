package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenAccountPage {
    private WebDriver driver;

    public OpenAccountPage (WebDriver driver){
        this.driver = driver;
    }
    //elements
    private By openaccount = By.xpath("//input[@value='Open New Account']");

    //method
    public void OpenAccount(){
        driver.findElement(openaccount).click();
    }
}
