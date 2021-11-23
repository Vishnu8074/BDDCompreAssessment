package StepDefinitions;

import java.util.ArrayList;


import org.openqa.selenium.WebDriver;

import PageObjects.AccountCreationpg;
import ReusableComponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation extends BaseClass {
	 AccountCreationpg createAcc = new AccountCreationpg(driver);

	

	@Given("^user is on sign in page$")
	public void user_is_on_sign_in_page() throws Throwable {
		driver = GiftCard.getdriver();
		homepage.logo().click();
		homepage.sigin().click();

	}

	@And("^clicks on create account button$")
	public void clicks_on_create_account_button() throws Throwable {
		createAcc.getCreateAcc().click();

	}

	@When("^user enters firstname, lastname, emailid and password1$")
	public void user_enters_firstname_lastname_emailid_and_password1() throws Throwable {
		ArrayList<String> data1 = ex.getData("firstname");
		ArrayList<String> data2 = ex.getData("lastname");
		ArrayList<String> data3 = ex.getData("emailid");
		ArrayList<String> data4 = ex.getData("password1");
		
		for (int i = 1; i < data1.size(); i++) {
			createAcc.getfname().sendKeys(data1.get(i));
			createAcc.getlname().sendKeys(data2.get(i));
			createAcc.getEmail().sendKeys(data3.get(i));
			
			createAcc.getPassword().sendKeys(data4.get(i));
			Thread.sleep(2000);
			er.startTest("Successfully entered all the details required for account creation");
			log.info("Successfully entered all the details required for account creation");
			createAcc.getfname().clear();
			createAcc.getlname().clear();
			createAcc.getEmail().clear();
			createAcc.getPassword().clear();
			log.info("cleared");
		}
	}

	@Then("^system should accept data$")
	public void system_should_accept_data() throws Throwable {
		System.out.println(createAcc.getValidate().getText());
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
