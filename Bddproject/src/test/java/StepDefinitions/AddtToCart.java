package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;

import PageObjects.ProductPage;
import ReusableComponents.BaseClass;

public class AddtToCart extends BaseClass {
	ProductPage productcmon= new ProductPage(driver);

	@Given("^user searches for product on homepage$")
	public void user_searches_for_product_on_homepage() throws Throwable {
		driver = LogIn.getdriver();
		homepage.logo().click();
		Thread.sleep(2000);
	}

	@Then("^user clicks on product so that enters into productpage$")
	public void user_clicks_on_product_so_that_enters_into_productpage() throws Throwable {
		homepage.product().click();
		log.info("user clicks on product so that enters into productpage");

	}

	@And("^user adds product to wishlist, increases its quantity and adds to cart$")
	public void user_adds_product_to_wishlist_increases_its_quantity_and_adds_to_cart() throws Throwable {
		productcmon.productwishlist().click();
		Thread.sleep(10000);
		for (int i = 0; i < 1; i++) {
			productcmon.add().click();
		}
		Thread.sleep(2000);
		productcmon.addtocart().click();
		er.startTest("product is added to the cart successfully");
		productcmon.closingsohppinglist().click();
		log.info("details of the shopping list are closed");
		Thread.sleep(2000);
		homepage.logo().click();
		
		er.endTest();
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
