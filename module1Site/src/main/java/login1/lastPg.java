package login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lastPg{
	WebDriver driver;
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement finish;
	
	public  lastPg (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	        }
		 public void clickOnFinishButton() {
			finish.click();
	        }
	    
		
	
}

	
