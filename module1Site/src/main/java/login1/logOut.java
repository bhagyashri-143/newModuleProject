package login1;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut {
	WebDriver driver;
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement openMenu;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	
	public logOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	public void ClickOnOpenMenu() {
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Actions W=new Actions (driver);
		W.moveToElement(openMenu).click().perform();
	}
	public void ClickOnLogOut() {
		logOut.click();
	}
}
