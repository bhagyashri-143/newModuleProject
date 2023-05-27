package login1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceSiteLogin {
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	
	public sauceSiteLogin(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
     public void enterUserName() {
    	 userName.sendKeys("standard_user");
    	
	
     }
     public void enterPassward() {
    	 password.sendKeys("secret_sauce");
     }
     public void clickOnLoginButton() {
    	 loginButton.click();
    	 
     }
}
