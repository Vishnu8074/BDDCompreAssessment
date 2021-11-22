package StepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import ReusableComponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchProduct extends BaseClass {

	@Given("^user retrieves data from excel and enters in searchbox$")
	public void user_retrieves_data_from_excel_and_enters_in_searchbox() throws Throwable {
		driver = AddtToCart.getdriver();
		ArrayList<String> data = ex.getData("product");
		for (int i = 1; i < data.size(); i++) {
			homepage.searchbox().clear();
			homepage.searchbox().sendKeys(data.get(i));
			homepage.searchbox().sendKeys(Keys.ENTER);
			er.startTest("Searched for the product by taking data from excel");
			log.debug("Searched for the product by taking data from excel");
			
		}
		
		er.endTest();
		

	}

	public static WebDriver getdriver() {
		return driver;
	}

}
