package PageObjects;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.MerchandiseUI;

public class MerchandisePO extends MerchandiseUI {

	WebDriver driver;

	public MerchandisePO(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getProdname() {
		return driver.findElements(prodName);
	}

	public WebElement getPinCode() {
		return driver.findElement(pinCode);
	}

	public WebElement getCheckBtn() {
		return driver.findElement(check);
	}

	public WebElement getValidateText() {
		return driver.findElement(text);
	}
}