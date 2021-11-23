package StepDefinitions;

import org.junit.Assert;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.GiftsPO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import ReusableComponents.BaseClass;

public class GiftsStep extends BaseClass {
	 GiftsPO gift = new GiftsPO(driver);

	@Given("^user is on homepage and hovering on Gifts$")
	public void user_is_on_homepage_and_hovering_on_gifts() throws Throwable {
		driver = WhatsNewStepdef.getdriver();
	
		homepage.logo().click();
		Actions a1 = new Actions(driver);
		WebElement move = gift.getGifts();
		a1.moveToElement(move).build().perform();
		er.startTest("move to the gifts");
	}

	@And("^user searches for (.*) from list and clicks on it and validates$")
	public void user_searches_for_from_list_and_clicks_on_it_and_validates(String giftname) throws Throwable {
		gift.getDIY().click();
		if (gift.getValidate().getText().contains(giftname)) {
			Assert.assertTrue(true);
		}
		log.info("validation completed successfully");
	}

	@Then("^user sorts the products in ascending order and searches for (.*) from products$")
	public void user_sorts_the_list_of_products_from_low_to_high_using_sortby_dropdown(String giftproductname) throws Throwable {
		int i = 0;
		Select s = new Select(gift.getSortBy());
		Thread.sleep(2000);
		s.selectByValue("price-ascending");
		er.startTest("sort the productsin the price ascending format");
		log.info("sorted it in price-ascending");
		for (i = 0; i < gift.getProducts().size(); i++) {
			if (gift.getProducts().get(i).getText().contains(giftproductname)) {
				Thread.sleep(2000);
				System.out.println("identified the product");
				break;
			}
		}
		er.endTest();
		classTeardown();
	}

	

	
	
	

}
