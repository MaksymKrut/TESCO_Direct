package com.tesco.tescoDirect.basketPage.steps;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.AquaMarinePDPPagePO;
import com.tesco.tescoDirect.pageObjects.BasketDetailsPagePO;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.DvdCategoryPagePO;
import com.tesco.tescoDirect.pageObjects.HarryPotterDVDPDPPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2PinkPLPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftProtectiveShellPinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftTouchCasePinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.IpadPDPPagePO;
import com.tesco.tescoDirect.pageObjects.TescoMobileSimPDPPagePO;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketPageBVCELogo {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger
			.getLogger(BasketPageBVCELogo.class);
	private HomePagePO homePagePO;
	private TescoMobileSimPDPPagePO tescoMobileSimPDPPagePO;
	private BasketDetailsPagePO basketDetailsPagePO;
	private HarryPotterDVDPDPPagePO harryPotterDVDPDPPagePO;
	private CheckOutPagePO checkOutPagePO;
	private AboutYouPagePO aboutYouPagePO;
	private BasketPagePO basketPagePO;

	@Given("^I navigate to the basket page after adding a tesco sim$")
	public void I_navigate_to_the_checkout_page_after_adding_a_tesco_sim()
			throws Throwable {
		WC.getDriver().get(WC.getFullUrl("home_page"));
		WC.getDriver().navigate().refresh();
		WC.removeCookies();
		JavascriptExecutor js = (JavascriptExecutor) WC.getDriver();
		System.out.println(js.executeScript("return window.innerWidth"));
		System.out.println(js.executeScript("return window.innerHeight"));

		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.closeCookiesMsg();
		homePagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		homePagePO
				.typeInSearchByProductNameCatalogueNoOrKeywordTextField("574-7120");
		homePagePO.clickOnSearchButton();
		tescoMobileSimPDPPagePO = WC
				.getPageObject(TescoMobileSimPDPPagePO.class);
		tescoMobileSimPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO = WC.getPageObject(BasketDetailsPagePO.class);
		basketDetailsPagePO.clickOnCheckOutButton();
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.clickOnBasketTab();
	}

	@Then("^the following in regards to the BVCE logo is displayed on the basket page$")
	public void the_following_in_regards_to_the_BVCE_logo_is_displayed(
			DataTable table) throws Throwable {
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String, String> myValue : mappedTable) {
			for (Map.Entry<String, String> entry : myValue.entrySet()) {
				String value = entry.getValue();
				switch (value) {

				case "Clubcard Boost Image":
					result = checkOutPagePO
							.checkClubcardBoostImageIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Clubcard Boost Image is displayed");
					break;
				case "In Clubcard Boost - More Info Link":
					result = checkOutPagePO
							.checkInClubcardBoostMoreInfoLinkIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("In Clubcard Boost - More Info Link is displayed");
					break;

				}
			}

		}

		LOG.debug("the following elements are displayed");
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) WC.getDriver())
						.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
		} catch (Exception e) {
			LOG.error("error in taking screen shot ", e);
		}

	}
}
