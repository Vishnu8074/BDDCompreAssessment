package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.AccountCreationUI;

public class AccountCreationpg extends AccountCreationUI {

	WebDriver driver;

	public AccountCreationpg(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateAcc() {
		return driver.findElement(createAcc);

	}

	public WebElement getfname() {
		return driver.findElement(fname);

	}

	public WebElement getlname() {
		return driver.findElement(lname);

	}

	public WebElement getEmail() {
		return driver.findElement(email);

	}

	public WebElement getPassword() {
		return driver.findElement(password);

	}

	public WebElement getCreateBtn() {
		return driver.findElement(createBtn);

	}

	public WebElement getValidate() {
		return driver.findElement(validate);

	}
}
