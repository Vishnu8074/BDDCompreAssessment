package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.ShopCategoryPageUI;



public class ShopCategoryPage extends ShopCategoryPageUI {
	
	WebDriver driver;
	
	public ShopCategoryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement shopbycat() {
		return driver.findElement(shopbycat);
	}
	public WebElement jewe() {
		return driver.findElement(jewe);
	}
	public WebElement next() {
		return driver.findElement(next);
	}
	public WebElement jewetext() {
		return driver.findElement(jewetext);
	}
	public List<WebElement> jewpro() {
		return driver.findElements(jewpro);
	}

}
