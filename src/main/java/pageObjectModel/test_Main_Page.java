package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_Main_Page {
	WebDriver tDriver;
	public test_Main_Page(WebDriver x) {
		tDriver = x;
	}
	
	public WebElement UserName() {
		WebElement x = tDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
				return x;
	}
				
	public WebElement password() {
		WebElement x = tDriver.findElement(By.xpath("//*[@id=\"password\"]"));
				return x;
	}
	
	public WebElement LoginButton() {
		WebElement x = tDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		return x;
}		
				
				
				
				
				
				
}
