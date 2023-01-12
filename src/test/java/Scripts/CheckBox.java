package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages_Hero_App.Home_Hero_App;
import Utilities.ScreenShots;

public class CheckBox {
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
		public void Test1() throws Exception {
		Home_Hero_App hha = new Home_Hero_App(driver);
		
		hha.CheckBox().click();
		
		ScreenShots.takeSnapShot(driver, ".//Screenshots//CheckBox01.png");
		Thread.sleep(3000);	
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		checkbox1.click();
		Thread.sleep(3000);	
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		checkbox2.click();
		
		Assert.assertTrue(checkbox1.isSelected());
		//Assert.assertNull(checkbox2.getAttribute("checked"));
		Assert.assertFalse(checkbox2.isSelected());
		//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//CheckBox02.png");
		ScreenShots.takeSnapShot(driver, ".//Screenshots//CheckBox02.png");

}
		@AfterClass
		public void tearDown() throws Exception {
			driver.quit();
		}
}
