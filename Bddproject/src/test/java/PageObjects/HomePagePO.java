package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.HomePageUI;




public class HomePagePO extends HomePageUI {
	
	WebDriver driver;
	
	public HomePagePO(WebDriver driver) { 
		this.driver = driver;
	}
	
	ArrayList<String> productlist = new ArrayList<String>();
	
	//Used to search an item in search field
	public void searchItem(String itemName) {  
		searchbox().sendKeys(itemName);
		searchbox().sendKeys(Keys.ENTER);;
		
	}
	
	
		public WebElement Whatsnew() {
			return driver.findElement(whatsnew);
		}
		public WebElement searchbox() {
			return driver.findElement(searchbox);
		}
		public WebElement sigin() {
			return driver.findElement(sigin);
		}
		public WebElement wishlist() {
			return driver.findElement(wishlist);
		}
		public WebElement giftcard() {
			return driver.findElement(giftcard);
		}
		public WebElement cart() {
			return driver.findElement(cart);
		}
		public WebElement product() {
			return driver.findElement(product);
		}
		public WebElement logo() {
			return driver.findElement(logo);
		}
		public WebElement producttextafterclicking() {
			return driver.findElement(producttextafterclicking);
		}
		public WebElement officialM() {
			return driver.findElement(officialMerchandise);
		}

		public WebElement harryPotter() {
			return driver.findElement(HarryPottergift);
		}
		
		
		
		
}
