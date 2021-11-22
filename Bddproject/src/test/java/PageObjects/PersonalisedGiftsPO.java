package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.PersonalisedGiftsUI;

public class PersonalisedGiftsPO extends PersonalisedGiftsUI {

	WebDriver driver;

	public PersonalisedGiftsPO(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidate() {
		return driver.findElement(validate);

	}

	public WebElement getPGBtn() {
		return driver.findElement(personalisedBtn);

	}

	public List<WebElement> getProducts() {
		return driver.findElements(prodName);

	}
}
