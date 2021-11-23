package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.GiftCardPO;
import ReusableComponents.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class GiftCard extends BaseClass {
	GiftCardPO giftcard= new GiftCardPO(driver);

	@Given("^user clicks on giftcard$")
    public void user_clicks_on_giftcard() throws Throwable {
		
		driver = AddtToCart.getdriver();
		
		Thread.sleep(2000);
		homepage.logo().click();
		Thread.sleep(2000);
		homepage.giftcard().click();
		er.startTest("Navigated to the gift card successfully ");
		log.info("Navigated to the gift card successfully");
		
		
        
    }
	
	@And("^user validates for giftcard$")
    public void user_validates_for_giftcard() throws Throwable {
		
		String gtext = giftcard.validate().getText();
		Assert.assertEquals(gtext, "Gift Card");
		
        
    }
	
	@Then("^user adds quantity$")
	    public void user_adds_quantity() throws Throwable {
		for (int i = 0; i < 4; i++) {
			giftcard.add().click();
		}
		Thread.sleep(2000);
	        
	 }

    @When("^user adds gift to cart and clicks on goto checkout$")
    public void user_adds_gift_to_cart_and_clicks_on_goto_checkout() throws Throwable {
    	
    	giftcard.addgifttocart().click();
		giftcard.gotocheckout().click();
		Thread.sleep(5000);
		giftcard.closingwhatsappframe().click();
		Thread.sleep(7000);
        
    }

    @And("^user goes back to cart and validates whether it entered into cart or not$")
    public void user_goes_back_to_cart_and_validates_whether_it_entered_into_cart_or_not() throws Throwable {
    	
    	giftcard.goingbacktocart().click();
		if (driver.getPageSource().contains("Shopping Cart")) {
			System.out.println("product is added to the cart");
			log.info("product is added to cart");
		}
		er.endTest();
        
    }

	public static WebDriver getdriver() {
		return driver;
	}

}