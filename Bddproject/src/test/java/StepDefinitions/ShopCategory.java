package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.ProductPage;
import PageObjects.ShopCategoryPage;
import ReusableComponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopCategory extends BaseClass{
	ShopCategoryPage shopbycat= new ShopCategoryPage(driver);
	ProductPage productcmon= new ProductPage(driver);

	@Given("^user hover on shp by category in homepage$")
	public void user_hover_on_shp_by_category_in_homepage() throws Throwable {
		driver = SearchProduct.getdriver();
		homepage.logo().click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement move = shopbycat.shopbycat();
		a.moveToElement(move).build().perform();
	}

	@When("^selects jewellery from shop by category and clciks on next$")
	public void selects_jewellery_from_shop_by_category_and_clciks_on_next() throws Throwable {
		shopbycat.jewe().click();
		shopbycat.next().click();

	}

	@Then("^user searches for Morning Glory Semi-Precious Ring from jewe page and clicks on it$")
	    public void user_searches_for_morning_glory_semiprecious_ring_from_jewe_page_and_clicks_on_it() throws Throwable {
		for (int i = 0; i < shopbycat.jewpro().size(); i++) {
			if (shopbycat.jewpro().get(i).getText().contains("Morning Glory Semi-Precious Ring")) {
				Thread.sleep(2000);
				er.startTest("Morning Glory Semi-Precious Ring product has been found successfully");
				log.info("Morning Glory Semi-Precious Ring product has been found successfully");
				System.out.println("Product has been found");
				log.info("product has been found");
				shopbycat.jewpro().get(i).click();
				break;
				
			}
		}
		
	    }
	@And("^user adds it to wishlist$")
		public void user_adds_it_to_wishlist() throws Throwable {
		productcmon.productwishlist().click();
		log.info("jewelery product will be added to wishlist");
		er.endTest();
		
	}

	public static WebDriver getdriver() {
		return driver;
	}

}
