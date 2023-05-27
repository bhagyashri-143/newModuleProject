package login1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkoutPg{

WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='first-name'])")
	private WebElement firstName ;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName ;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement  continues;
	
	
	public checkoutPg (WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	 public void enterFirstName() {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		firstName.sendKeys("Bhagyashri");
		}
      public void enterLastName() {
    		lastName.sendKeys("kamble");
    		 	
    	} 
      public void enterPostalCode() {
    	     postalCode.sendKeys("411033");
      }
      public void clickOnContinoueButton() {
    	  continues.click();
      }
      
    

}
