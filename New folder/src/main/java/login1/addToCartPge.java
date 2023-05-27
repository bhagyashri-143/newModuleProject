package login1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addToCartPge {
	WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link'])")
	private WebElement cart ;
	  
	@FindBy(xpath="//button[text()='Checkout'])")
	private WebElement checkout;
	
	
	public addToCartPge(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	
	 public void clickOnAddToCart() {
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 addToCart.click();
		 }
    	 
     public void clickOnCart() {
    	  cart.click();
    	  
     }
     public void clickOnCheckout() {
    	 checkout.click();
     }
     
    }
