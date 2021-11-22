package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.GiftsUI;

public class GiftsPO extends GiftsUI {

	WebDriver driver;

	public GiftsPO(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidate() {
		return driver.findElement(validate);

	}

	public WebElement getSortBy() {
		return driver.findElement(sortBy);

	}

	public WebElement getGifts() {
		return driver.findElement(gifts);

	}

	public WebElement getDIY() {
		return driver.findElement(diy);

	}

	public List<WebElement> getProductsPrice() {
		return driver.findElements(prodPrice);

	}

	public List<WebElement> getProducts() {
		return driver.findElements(Products);

	}
}
