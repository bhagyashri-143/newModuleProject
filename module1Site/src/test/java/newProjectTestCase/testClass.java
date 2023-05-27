package newProjectTestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseClass;

import login1.addToCartPge;
import login1.checkoutPg;
import login1.lastPg;
import login1.sauceSiteLogin;
import login1.logOut;



import utility.utilityClass;

public class testClass extends baseClass {
	
		static sauceSiteLogin login;
		static addToCartPge cartpg;
		static checkoutPg chkoutpg ;
		static lastPg submit;
	    static logOut signOut;
	    

		@BeforeClass
		public static void browserlaunch() throws IOException {
	           baseClass.lunchBrowser("Chrome");
			 login =new  sauceSiteLogin(driver);
			 cartpg = new addToCartPge  (driver);
		     chkoutpg = new checkoutPg (driver);
		     submit= new lastPg(driver);
		     signOut =new logOut(driver);
		  
		  
		}
		 @BeforeMethod
			public static void PreLogin() {
			 login.enterUserName();
			 login.enterPassward();
			 login.clickOnLoginButton();
		 }	  
			@Test
		public static  void TCAddToCart()  {
			cartpg.clickOnAddToCart();
			cartpg.clickOnCart();
		    cartpg.clickOnCheckout();
				 
			}
			 @Test(priority=1)
			public static  void TC2() {
			      chkoutpg.enterFirstName();
			      chkoutpg.enterLastName();
			      chkoutpg.enterPostalCode();
			      chkoutpg.clickOnContinoueButton();
			}
			 @Test(priority=2)
			  public static void TC3() {
				 submit.clickOnFinishButton();
			 }
		   @AfterMethod
			public void screenShot(ITestResult result) throws IOException {
				if(result.getStatus()==ITestResult.FAILURE) {
				 utilityClass.getScreenshort();
				 
				 }
				signOut.ClickOnOpenMenu();
				signOut.ClickOnLogOut();
			}
			@AfterClass
			public void quitbrowser() {
				
			    baseClass.closeAllBrowser(); 
			}
			
			
}
