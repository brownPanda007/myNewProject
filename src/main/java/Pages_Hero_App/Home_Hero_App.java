
package Pages_Hero_App;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;

		public class Home_Hero_App {
			
			//Constructor webDriver
				WebDriver tDriver;
				public Home_Hero_App(WebDriver x) {
					tDriver = x;
				}
			
			
				public WebElement AddRemove() {
					WebElement x = tDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a"));
							return x;
				
				}
				public WebElement DragDrop() {
					WebElement x = tDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[10]/a"));
							return x;
				
				}
				public WebElement CheckBox() {
					WebElement x = tDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a"));
							return x;
				
				}
				public WebElement DropDown() {
					WebElement x = tDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a"));
							return x;
				
				}
			
				

		public WebElement FileUpload() {
			WebElement x = tDriver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a"));
					return x;

		}
		public WebElement ChooseFile() {
			WebElement x = tDriver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
					return x;

		}
		public WebElement FileSubmit() {
			WebElement x = tDriver.findElement(By.id("file-submit"));
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
						WebElement x = tDriver.findElement(By.id("checkout"));
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
														WebElement x = tDriver.findElement(By.id("continue"));
														return x;
															}
					public WebElement FinishButton() {
						WebElement x = tDriver.findElement(By.id("finish"));
						return x;
							}
					

	


	

}
