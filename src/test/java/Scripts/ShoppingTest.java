package Scripts;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.ScreenShots;
import dev.failsafe.internal.util.Assert;
import pageObjectModel.HomePageTest;
import pageObjectModel.MainPageTest;

public class ShoppingTest {

	//private static final String FileUtils = null;

	//public static void main(String[] args) throws Exception {
		// TC 02 : Allows user add to cart more than one items and payment success
		// This test verifies that user after landing on home page select items, which should visible in the cart from there user able to continue the payment
	
	//Login
		
		WebDriver driver=new EdgeDriver();  
		HomePageTest hp = new HomePageTest(driver);
		@BeforeTest
		public void setUp()  throws Exception  {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		}
		@Test
		public void Login() throws Exception {
		
			MainPageTest ts = new MainPageTest(driver);
		ts.UserName().sendKeys("standard_user");
		ts.password().sendKeys("secret_sauce");
		ts.LoginButton().click();
		Thread.sleep(3000);
		Assert.isTrue(true, driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		}
		
	//Selecting the items from the home page
		@Test
		public void ShoppingPage() throws Exception {
		hp.Item4().click();
		Thread.sleep(2000);
		hp.AddToCartITEM4().click();
		Thread.sleep(2000);
		ScreenShots.takeSnapShot(driver, ".//Screenshots//test01.png");
		hp.BackTOshopping().click();	
		Thread.sleep(2000);
		hp.Item0().click();
		Thread.sleep(2000);
		hp.AddToCartITEM0().click();
		//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//test02.png");
		ScreenShots.takeSnapShot(driver, ".//Screenshots//test02.png");
		//hp.AddToCartITEM4().click();
		Thread.sleep(2000);
		hp.BackTOshopping().click();
		Thread.sleep(2000);
		hp.CartLists().click();
		Thread.sleep(2000);
		Assert.isTrue(true, driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
		//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//test03.png");
		ScreenShots.takeSnapShot(driver, ".//Screenshots//test03.png");
		System.out.println("Cart page Tittle is : " + driver.getTitle());
		Thread.sleep(3000);
		hp.checkout().click();
		}
		@SuppressWarnings("deprecation")
		@Test
		public void process() throws Exception {
		
	
		//Thread.sleep(2000);
		
		//hp.CartLists().click();
	
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.Firstname().sendKeys("Raihan");
	    hp.Lastname().sendKeys("Muskaan");
		hp.Zipcode().sendKeys("21402");
		//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//test04.png");
		ScreenShots.takeSnapShot(driver, ".//Screenshots//test04.png");
		Assert.isTrue(true, driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
		System.out.println("Checkout page Tittle is : " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    hp.continueButton().click();
		
		}
		
		
		@SuppressWarnings("deprecation")
		@Test
    	public void Checkout() throws Exception {
 			System.out.println("revisit items page Tittle is : " + driver.getTitle());
       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//test05.png");
        ScreenShots.takeSnapShot(driver, ".//Screenshots//test05.png");
		Assert.isTrue(true, driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
     	Thread.sleep(3000);
     	
          	}
	
	@SuppressWarnings("deprecation")
	@Test
		public void TransactionCom() throws Exception {
		hp.FinishButton().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	 	
		
		System.out.println("Transaction complete items page Tittle is : " + driver.getTitle());
		Assert.isTrue(true, driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
		
		//ScreenShots.takeSnapShot(driver, "C://Users//raiha//Favorites//Screenshots//test06.png");
		ScreenShots.takeSnapShot(driver, ".//Screenshots//test06.png");
		Thread.sleep(3000);
		}
		
		@AfterTest
		public void tearDown() throws Exception {
			
			driver.quit();
		}
		
		


	
	
	
	
	
	
	
	
	
	
	
	}


