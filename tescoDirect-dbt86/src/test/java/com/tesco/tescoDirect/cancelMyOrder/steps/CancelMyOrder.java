package com.tesco.tescoDirect.cancelMyOrder.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.CancelMyOrderPO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CancelMyOrder {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(CancelMyOrder.class);
	private CancelMyOrderPO cancelMyOrderPO;
	private GlobalHeaderPO globalHeaderPO;
	private GlobalFooterPO globalFooterPO;

	@Then("^I check for the following header elements in cancel my order page$")
	public void I_check_for_the_following_header_elements_in_cancel_my_order_page(
			DataTable table) throws Throwable {
		globalHeaderPO = WC.getPageObject(GlobalHeaderPO.class);
		LOG.debug("I check for the following header elements in cancel my order page");
		globalHeaderPO.checkingforCancelMyorderHeaderLinks();
	}

	@And("^I check for the following elements in cancel my order page$")
	public void I_check_for_the_following_elements_in_cancel_my_order_page(
			DataTable table) throws Throwable {
		cancelMyOrderPO = WC.getPageObject(CancelMyOrderPO.class);
		LOG.debug("I check for the following elements in cancel my order page");
		cancelMyOrderPO.checkingcancelmyorderpage();
	}

	@And("^I check for the following elements in Refund details panel$")
	public void I_check_for_the_following_elements_in_Refund_details_panel(
			DataTable table) throws Throwable {
		cancelMyOrderPO = WC.getPageObject(CancelMyOrderPO.class);
		LOG.debug("I check for the following elements in Refund details panel");
		cancelMyOrderPO.checkingRefundDetails();
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
