package Scripts;







import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages_Hero_App.Home_Hero_App;
import Utilities.ScreenShots;



public class DragNdrop {
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
	public void dragdrop() throws Exception {
	Home_Hero_App hha = new Home_Hero_App(driver);
	
	hha.DragDrop().click();
	Thread.sleep(3000);
	//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//DragNDrop01.png");
	ScreenShots.takeSnapShot(driver, ".//Screenshots//DragNDrop01.png");
	  WebElement Source=driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
	  WebElement Destination=driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
	  
	  Actions act=new Actions(driver);
      act.dragAndDrop(Source, Destination).perform();
         // Action dragAndDrop = act.clickAndHold(Source).moveToElement(Destination).release(Destination).build();
       //act.clickAndHold(Source).moveToElement(Destination).release(Destination).build().perform();
          
          
	  Thread.sleep(3000);
     	System.out.println("Element Tittle is : " + Destination.getText());
    	//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//DragNDrop02.png");
    	ScreenShots.takeSnapShot(driver, ".//Screenshots//DragNDrop02.png");
             Assert.assertEquals(Destination, "A");
	}
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
