
	package Scripts;

	import static org.testng.Assert.assertTrue;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import Pages_Hero_App.Home_Hero_App;
	import Utilities.ScreenShots;


	public class AddRemove {

		//public static void main(String[] args) throws Exception {
		 WebDriver driver=new EdgeDriver();  
			@BeforeTest
			public void setUp() throws Exception {
			
		   
			//WebDriver driver=new ChromeDriver(); 
			driver.get("http://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.manage().deleteAllCookies();
		   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			@Test
			public void Test1() throws Exception {
			Home_Hero_App hha = new Home_Hero_App(driver);
			hha.AddRemove().click();
			Thread.sleep(3000);	
			//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//TestRemove01.png");
			ScreenShots.takeSnapShot(driver, ".//Screenshots/TestRemove01.png");
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
			
			if(driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).isDisplayed()) {
				assertTrue(true, "delete");
				System.out.print("Remove is success");
				
		    }else {
			assertTrue(false, "Image not Uploaded");
			System.out.print("Remove is not success");
		
			}
			ScreenShots.takeSnapShot(driver, ".//Screenshots//TestRemove02.png");
			}
			
			@AfterClass
			public void tearDown() throws Exception {
				driver.quit();
			}

		}





