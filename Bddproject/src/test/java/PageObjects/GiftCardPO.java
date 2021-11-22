package PageObjects;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.GiftCardUI;

public class GiftCardPO extends GiftCardUI  {

	WebDriver driver;

	public GiftCardPO(WebDriver driver){
		

		this.driver = driver;
	}

	public WebElement pricelist() {
		return driver.findElement(pricelist);
	}

	public WebElement addgifttocart() {
		return driver.findElement(addgifttocart);
	}

	public WebElement quantity() {
		return driver.findElement(quantity);
	}

	public WebElement giftwishlist() {
		return driver.findElement(giftwishlist);
	}

	public WebElement validate() {
		return driver.findElement(validate);
	}

	public WebElement add() {
		return driver.findElement(add);
	}

	public WebElement gotocheckout() {
		return driver.findElement(gotocheckout);
	}

	public WebElement whatsapptext() {
		return driver.findElement(whatsapptext);
	}
	public WebElement closingwhatsappframe() {
		return driver.findElement(closingwhatsappframe);
	}
	public WebElement goingbacktocart() {
		return driver.findElement(goingbacktocart);
	}

}
