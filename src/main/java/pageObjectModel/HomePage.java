package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	//Constructor webDriver
		WebDriver tDriver;
		public HomePage(WebDriver x) {
			tDriver = x;
		}
	
	
		public WebElement AllIteams() {
			WebElement x = tDriver.findElement(By.id("react-burger-menu-btn"));
					return x;
		
		}
		public WebElement About() {
			WebElement x = tDriver.findElement(By.id("about_sidebar_link"));
					return x;
		
		}
		public WebElement Logout() {
			WebElement x = tDriver.findElement(By.id("logout_sidebar_link"));
					return x;
		
		}
		public WebElement reset() {
			WebElement x = tDriver.findElement(By.id("reset_sidebar_link"));
					return x;
		
		}
	
		

public WebElement Item4() {
	WebElement x = tDriver.findElement(By.id("item_4_title_link"));
			return x;

}
public WebElement Item0() {
	WebElement x = tDriver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]"));
			return x;

}
		
public WebElement AddToCartITEM4() {
	WebElement x = tDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			return x;

}

public WebElement BackTOshopping() {
	WebElement x = tDriver.findElement(By.id("back-to-products"));
			return x;

}

public WebElement AddToCartITEM0() {
	WebElement x = tDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
			return x;
}
		
			public WebElement CartLists() {
				WebElement x = tDriver.findElement(By.id("shopping_cart_container"));
						return x;
							}
						
			public WebElement checkout() {
				WebElement x = tDriver.findElement(By.xpath("//*[@id=\"checkout\"]"));
						return x;
							}
			
			
		
			public WebElement Firstname() {
				WebElement x = tDriver.findElement(By.id("first-name"));
						return x;
							}	
			public WebElement Lastname() {
								WebElement x = tDriver.findElement(By.id("last-name"));
								return x;
									}	
			public WebElement Zipcode() {
										WebElement x = tDriver.findElement(By.id("postal-code"));
										return x;
											}	
			public WebElement continueButton() {
												WebElement x = tDriver.findElement(By.xpath("//*[@id=\"continue\"]"));
												return x;
													}
			public WebElement FinishButton() {
				WebElement x = tDriver.findElement(By.xpath("//*[@id=\"finish\"]"));
				return x;
					}
			

}
