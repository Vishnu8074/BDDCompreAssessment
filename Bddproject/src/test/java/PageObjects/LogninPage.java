package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.HomePageUI;
import UIStore.LoginPageUI;

public class LogninPage extends LoginPageUI {
	WebDriver driver;

	public LogninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement customeremailid() {
		return driver.findElement(customeremailid);
	}
	public WebElement customerpass() {
		return driver.findElement(customerpass);
	}
	public WebElement signinbutton() {
		return driver.findElement(signinbutton);
	}
	public WebElement createaccount() {
		return driver.findElement(createaccount);
	}
	
	
	
	

}
