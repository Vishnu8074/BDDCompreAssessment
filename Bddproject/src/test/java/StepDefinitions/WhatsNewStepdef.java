package StepDefinitions;

import org.junit.Assert;

import PageObjects.WhatsNewPage;
import ReusableComponents.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WhatsNewStepdef extends BaseClass{
	WhatsNewPage whatsnew = new WhatsNewPage(driver);

	@Given("^user clicks on whatsNew button$")
	    public void user_clicks_on_whatsnew_button() throws Throwable {
		driver = GiftsStep.getdriver();
		homepage.logo().click();
		whatsnew.getBtn().click();
		er.startTest("whatsnew page");
		Thread.sleep(2000);
	    }

	@Then("^user enters whatsnew page and checks whether we are in whatsnew pageor not$")
	public void user_enters_whatsnew_page_and_checks_whether_we_are_in_whatsnew_pageor_not() throws Throwable {
		if (whatsnew.getValidate().getText().contains("What'S New")) {
			Assert.assertTrue(true);
			log.info("validated of whatsnew page has been dne");
			Thread.sleep(5000);
			er.endTest();
			classTeardown();
			
		}
	}
	

}
