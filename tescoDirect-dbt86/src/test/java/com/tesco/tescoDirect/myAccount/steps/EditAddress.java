package com.tesco.tescoDirect.myAccount.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.checkOutPage.steps.CheckOutPage;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.pageObjects.MyAccountPO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditAddress {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(EditAddress.class);
	private GlobalHeaderPO globalHeaderPO;
	private GlobalFooterPO globalFooterPO;
	private MyAccountPO myAccountPO;

	@And("^I check for the following header elements in Edit Address page$")
	public void I_check_for_the_following_header_elements_in_Edit_Address_page(
			DataTable table) {
		LOG.debug("I check for the following header elements in Edit Address page");
		globalHeaderPO = WC.getPageObject(GlobalHeaderPO.class);
		globalHeaderPO.checkingforBasketPageHeaderLinks();
	}

	@When("^I click on Sign In button$")
	public void I_click_on_Sign_In_button() throws Throwable {
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		LOG.debug("I click on Sign In button");
		myAccountPO.clickingOnSignInbutton();
	}

	@Then("^I should see the My account menu and the following options$")
	public void I_should_see_the_My_account_menu_and_the_following_options(
			DataTable table) {
		LOG.debug("I should see the My account menu and the following options");
		myAccountPO.CheckingMyaccountmenuandthefollowingoptions();
	}

	@Then("^I check for the following elements in the Edit your address module$")
	public void I_check_for_the_following_elements_in_the_Edit_your_address_module(
			DataTable table) {
		LOG.debug("I check for the following elements in the Edit your address module");
		myAccountPO = WC.getPageObject(MyAccountPO.class);
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
