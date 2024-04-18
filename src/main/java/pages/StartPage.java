package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage{

   private WebDriver driver;

   public StartPage (WebDriver driver){
       this.driver = driver;

   }
   //elements
    private By RegisterButton = By.xpath("//*[text()=\"Register\"]");

    //method
    public void Register(){
        driver.findElement(RegisterButton).click();
    }
}

