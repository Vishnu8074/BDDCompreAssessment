package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePagePO;
import ReusableComponents.BaseClass;
import ReusableComponents.WebDriverHelper;
import Utilities.Extentreports;

import io.cucumber.java.en.Given;

public class Browser extends BaseClass {

	@Given("Navigate to the website by opening the browser")
	public void navigate_to_the_website_by_opening_the_browser() throws IOException {
		
		startup();
		beforeClass();
		driver.get(config.getURL());
		er.startTest("website url");
		er.endTest();
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
