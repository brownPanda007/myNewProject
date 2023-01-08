package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	

	
		
		public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
			
			//convert web Driver object to Takescreenshot 
			TakesScreenshot scrShort = ((TakesScreenshot)webdriver);
		
		//call getScreenshotAs method to create image file
			File SrcFile = scrShort.getScreenshotAs(OutputType.FILE);
		
			//Move image file to new destination
			File DestFile = new File(fileWithPath);
			//copy the file at destination 
			FileUtils.copyFile(SrcFile, DestFile);
		
			
	}
	
	
	
	
	

}
