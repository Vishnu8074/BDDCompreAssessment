package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.WhatsNewUI;

public class WhatsNewPage extends WhatsNewUI {
	WebDriver driver;

	public WhatsNewPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidate() {
		return driver.findElement(validate);

	}

	public WebElement getBtn() {
		return driver.findElement(WhatsnewBtn);

	}
}
