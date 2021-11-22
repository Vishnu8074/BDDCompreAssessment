package ReusableComponents;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import PageObjects.AccountCreationpg;
import PageObjects.GiftCardPO;
import PageObjects.GiftsPO;
import PageObjects.HomePagePO;
import PageObjects.MerchandisePO;
import PageObjects.PersonalisedGiftsPO;
import PageObjects.ProductPage;
import PageObjects.ShopCategoryPage;
import PageObjects.LogninPage;
import PageObjects.WhatsNewPage;
import Utilities.ConfigsProvider;
import Utilities.Excel;
import Utilities.Extentreports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseClass {

	public static WebDriver driver;
	public static Logger log;
	public static ConfigsProvider config;
	
	public static ExtentTest test;
	public static Extentreports er;

	public static HomePagePO homepage;
	
	public Excel ex = new Excel();

	public void startup() throws IOException {

		log = Logger.getLogger(getClass());
		config = new ConfigsProvider();
	}

	public void beforeClass() {
		driver = WebDriverHelper.driverInitializer(driver, config.getBrowser(), config.implicitWait());
		log.info("Driver Initialised");
		er = new Extentreports(driver);

		homepage = new HomePagePO(driver);
		

	}

	public void classTeardown() {
		WebDriverHelper.quitDriver(driver);
		log.info("closed driver");
	}

}
