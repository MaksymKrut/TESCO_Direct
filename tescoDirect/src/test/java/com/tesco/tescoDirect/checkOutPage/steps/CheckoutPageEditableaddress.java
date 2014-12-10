package com.tesco.tescoDirect.checkOutPage.steps;

import org.apache.log4j.Logger;

import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CheckoutPageEditableaddress {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger
			.getLogger(CheckOutPageFuelSave.class);
	private GlobalHeaderPO globalHeaderPO;
	private CheckOutPagePO checkOutPagePO;
	private GlobalFooterPO globalFooterPO;
	
	@Then("^I should see the These items can only be delivered message$")
	public void IshouldseetheTheseitemscanonlybedeliveredmessage() {
		LOG.debug("I should see the These items can only be delivered message");
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.verifyTheseitemscanonlybedeliveredmessage();
	}
	
	@Then("^I should see the following in the Delivery options for Editable address page$")
	public void IshouldseethefollowingintheDeliveryoptionsforEditableaddresspage(DataTable table) {
		LOG.debug("I should see the following in the Delivery options for Editable address page");
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.verifytheDeliveryoptionsforEditableaddresspage();
	}
	@And("^I check for the address dropdown under Delivery details$")
	public void IcheckfortheaddressdropdownunderDeliverydetails() {
		LOG.debug("I check for the address dropdown under Delivery details");
		checkOutPagePO.verifytheaddressdropdownunderDeliverydetails();
	}
	
	@Then("^I check for the send to different addresses link exists and work as expected$")
	public void Icheckforthesendtodifferentaddresseslinkexistsandworkasexpected () {
		LOG.debug("I check for the send to different addresses link exists and work as expected ");
		checkOutPagePO.verifythesendtodifferentaddresseslinkexistsandworkasexpected();
	}
}
