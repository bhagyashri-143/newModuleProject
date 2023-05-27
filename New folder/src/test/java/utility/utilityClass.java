package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import base.baseClass;


public class utilityClass extends  base.baseClass { 
	
	static public void getScreenshort() throws IOException {
		   Date dt=new Date();
 		String S1=dt.toString().replace(' ', '_').replace(':', '-');
 	       File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	       File Dest=new File ("/sauceSiteNewProject/ss"+S1+".jpg");
 	       FileHandler.copy(Source, Dest);
	}

	
	}
	
