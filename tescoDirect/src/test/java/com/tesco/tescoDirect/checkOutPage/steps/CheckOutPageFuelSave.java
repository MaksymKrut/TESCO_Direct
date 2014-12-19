package com.tesco.tescoDirect.checkOutPage.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutPageFuelSave {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger
			.getLogger(CheckOutPageFuelSave.class);
	private GlobalHeaderPO globalHeaderPO;
	private CheckOutPagePO checkOutPagePO;
	private GlobalFooterPO globalFooterPO;

	@When("^I click on Choose a different day button$")
	public void IclickonChooseadifferentdaybutton() {
		globalHeaderPO = WC.getPageObject(GlobalHeaderPO.class);
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		globalFooterPO = WC.getPageObject(GlobalFooterPO.class);
		LOG.debug("I click on Choose a different day button");
		checkOutPagePO.clickonChoosedifferentdayButton();

	}

	@Then("^I Should see the choose your preferred collection date dialog box with the following elements$")
	public void IShouldseethechooseyourpreferredcollectiondatedialogboxwiththefollowingelements(
			DataTable table) {
		LOG.debug("I Should see the choose your preferred collection date dialog box with the following elements");
		checkOutPagePO.verifychoosedifferentdaybuttonPopupElements();
	}

	@And("^I check for the following in Total to pay Block for fuel save page$")
	public void IcheckforthefollowinginTotaltopayBlockforfuelsavepage(
			DataTable table) {
		LOG.debug("I check for the following in Total to pay Block for fuel save page");
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.verifyTotalToPayBlockforFuelSave();
	}

	@Then("^I click on Clubcard Fuel Savings links to verify the following$")
	public void IclickonClubcardFuelSavingslinkstoverifythefollowing(
			DataTable table) {
		LOG.debug("I click on Clubcard Fuel Savings links to verify the following");
		checkOutPagePO.clickonClubCardFuelSavingsLink();
	}

	@And("^I check for the following in Total to pay Block for fuel save message page$")
	public void IcheckforthefollowinginTotaltopayBlockforfuelsavemessagepage(
			DataTable table) {
		LOG.debug("I check for the following in Total to pay Block for fuel save message pagee");
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.verifyTotalToPayBlockforFuelSaveMessage();
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
