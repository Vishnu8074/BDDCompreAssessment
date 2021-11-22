package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import UIStore.ProductPageUI;

public class ProductPage extends ProductPageUI {
	WebDriver driver;
	
	
	public ProductPage(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement productwishlist() {
		return driver.findElement(productwishlist);
	}
	public WebElement addtocart() {
		return driver.findElement(addtocart);
	}
	public WebElement quantity() {
		return driver.findElement(quantity);
	}
	public WebElement add() {
		return driver.findElement(add);
	}
	public WebElement closingsohppinglist() {
		return driver.findElement(closingsohppinglist);
	}

}
