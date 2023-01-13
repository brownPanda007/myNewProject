package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages_Hero_App.HomeHeroAppPageTest;
import Utilities.ScreenShots;

public class DropDownTest {
	WebDriver driver=new EdgeDriver();  
	@BeforeTest
	public void setUp() throws Exception {
	
   
	//WebDriver driver=new ChromeDriver(); 
	driver.get("http://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(3000);
   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void Drpdwn() throws Exception {
		HomeHeroAppPageTest hha = new HomeHeroAppPageTest(driver);
	
	hha.DropDown().click();
	Thread.sleep(3000);
	ScreenShots.takeSnapShot(driver, ".//Screenshots//DropDownp01.png");
	Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
			dropDown.selectByIndex(1);
		
	  Thread.sleep(3000);
     	
     	ScreenShots.takeSnapShot(driver, ".//Screenshots//DropDownp02.png");
      
     	
         //Assert.assertEquals(dropDown, "Option 1");
	}
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
