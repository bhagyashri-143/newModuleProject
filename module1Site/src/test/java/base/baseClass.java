package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import utility.utilityClass;

public class baseClass{
	public static WebDriver driver;
	
	public static void lunchBrowser(String browser ){
		 
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			 
	        driver =new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(" https://www.saucedemo.com/");
			
	}
	public static void closeAllBrowser() {
		
	  driver.quit();
	}
	
	}
	
	
	
	

