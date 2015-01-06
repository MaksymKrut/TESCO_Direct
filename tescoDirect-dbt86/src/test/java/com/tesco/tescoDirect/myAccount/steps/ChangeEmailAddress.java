package com.tesco.tescoDirect.myAccount.steps;

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

import com.tesco.tescoDirect.login.steps.Login;
import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.AquaMarinePDPPagePO;
import com.tesco.tescoDirect.pageObjects.BasketDetailsPagePO;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.ChangeEmailAddressPagePO;
import com.tesco.tescoDirect.pageObjects.ChangePasswordPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.DvdCategoryPagePO;
import com.tesco.tescoDirect.pageObjects.HarryPotterDVDPDPPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2PinkPLPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftProtectiveShellPinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftTouchCasePinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.IpadPDPPagePO;
import com.tesco.tescoDirect.pageObjects.ManageMyAddressBookPagePO;
import com.tesco.tescoDirect.pageObjects.MyAccountPO;
import com.tesco.tescoDirect.pageObjects.TescoMobileSimPDPPagePO;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeEmailAddress {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger
			.getLogger(ChangeEmailAddress.class);
	private HomePagePO homePagePO;
	private TescoMobileSimPDPPagePO tescoMobileSimPDPPagePO;
	private BasketDetailsPagePO basketDetailsPagePO;
	private HarryPotterDVDPDPPagePO harryPotterDVDPDPPagePO;
	private CheckOutPagePO checkOutPagePO;
	private AboutYouPagePO aboutYouPagePO;
	private BasketPagePO basketPagePO;
	private MyAccountPO myAccountPO;
	private ChangeEmailAddressPagePO changeEmailAddressPagePO;
	private Login login;

	@Then("^the Change my email address link is present$")
	public void the_Change_my_email_address_link_is_present() throws Throwable {
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		Assert.assertTrue(myAccountPO.checkChangeMyEmailAddressLinkIsPresent());
	}

	@When("^I click on the Change my email address link$")
	public void I_click_on_the_Change_my_email_address_link() throws Throwable {
		myAccountPO.clickOnChangeMyEmailAddressLink();
	}

	@Then("^I am taken to the Change my email address page$")
	public void I_am_taken_to_the_Change_my_email_address_page()
			throws Throwable {
		changeEmailAddressPagePO = WC
				.getPageObject(ChangeEmailAddressPagePO.class);
		Assert.assertTrue(changeEmailAddressPagePO
				.checkUserIsOnChangeMyEmailAddressPage());
	}

	@Given("^I am on the Change my email address Page$")
	public void I_am_on_the_Change_my_email_address_Page() throws Throwable {
		changeEmailAddressPagePO = WC
				.getPageObject(ChangeEmailAddressPagePO.class);
		changeEmailAddressPagePO.checkUserIsOnChangeMyEmailAddressPage();
	}

	@Then("^the following elements are present on the my email address Page$")
	public void the_following_elements_are_present_on_the_my_email_address_Page(
			DataTable table) throws Throwable {

		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String, String> myValue : mappedTable) {
			for (Map.Entry<String, String> entry : myValue.entrySet()) {
				String value = entry.getValue();
				switch (value) {

				case "Breadcrumbs of the page":
					result = changeEmailAddressPagePO
							.checkBreadcrumbsIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Breadcrumbs of the page is displayed");
					break;
				case "Change my email address header text":
					result = changeEmailAddressPagePO
							.checkChangeMyEmailAddressHeaderTextIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Change my email address header text is displayed");
					break;
				case "New Email address header text":
					result = changeEmailAddressPagePO
							.checkNewEmailAddressHeaderTextIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("New Email address header text is displayed");
					break;
				case "Old Email address label":
					result = changeEmailAddressPagePO
							.checkOldEmailAddressLabelIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Old Email address label");
					break;
				case "Old Email address textbox":
					result = changeEmailAddressPagePO
							.checkOldEmailAddressTextboxIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Old Email address textbox is displayed");
					break;
				case "Current Email address in Old Email address textbox":
					result = changeEmailAddressPagePO
							.checkCurrentEmailAddressInOldEmailAddressTextboxIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Current Email address in Old Email address textbox is displayed");
					break;
				case "Password label":
					result = changeEmailAddressPagePO
							.checkPasswordLabelIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Password label is displayed");
					break;
				case "Password textbox":
					result = changeEmailAddressPagePO
							.checkPasswordTextboxIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Password textbox is displayed");
					break;
				case "New email address label":
					result = changeEmailAddressPagePO
							.checkNewEmailAddressLabelIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("New email address label is displayed");
					break;
				case "New email address textbox":
					result = changeEmailAddressPagePO
							.checkNewEmailAddressTextboxIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("New email address textbox is displayed");
					break;
				case "Confirm new email address label":
					result = changeEmailAddressPagePO
							.checkConfirmNewEmailAddressLabelIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Confirm new email address label is displayed");
					break;
				case "Confirm new email address textbox":
					result = changeEmailAddressPagePO
							.checkConfirmNewEmailAddressTextboxIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Confirm new email address textbox is displayed");
					break;
				case "Cancel Button":
					result = changeEmailAddressPagePO
							.checkCancelButtonIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Cancel Button is displayed");
					break;
				case "Save Button":
					result = changeEmailAddressPagePO
							.checkSaveButtonIsDisplayed();
					Assert.assertTrue(result);
					LOG.debug("Save Button is displayed");
					break;

				}
			}

		}

		LOG.debug("the following elements are displayed");

	}

	@Given("^I enter the current password in the password textbox$")
	public void I_enter_the_current_password_in_the_password_textbox(
			DataTable table) throws Throwable {
		changeEmailAddressPagePO = WC
				.getPageObject(ChangeEmailAddressPagePO.class);
		// changeEmailAddressPagePO.clearPasswordTextbox();
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String currentPassword = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);

				currentPassword = usrdetails.get("CurrentPassword");
			}

			if (currentPassword != null) {

				changeEmailAddressPagePO
						.enterCurrentPasswordInThePasswordTextbox(currentPassword);

			}

		}

		catch (Exception ex)

		{
			LOG.error("Error in enterLoginDetails: ", ex);
		}
	}

	@Given("^I enter the following for New email address$")
	public void I_enter_the_following_for_New_email_address(DataTable table)
			throws Throwable {
		// changeEmailAddressPagePO.clearNewEmailAddressTextbox();
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String newEmailAddress = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);

				newEmailAddress = usrdetails.get("NewEmailAddress");
			}

			if (newEmailAddress != null) {

				changeEmailAddressPagePO.enterNewEmailAddress(newEmailAddress);

			}

		}

		catch (Exception ex)

		{
			LOG.error("Error in enterLoginDetails: ", ex);
		}
	}

	@Given("^I enter the following for Confirm new email address$")
	public void I_enter_the_following_for_Confirm_new_email_address(
			DataTable table) throws Throwable {
		{
			// changeEmailAddressPagePO.clearConfirmNewEmailAddressTextbox();
			try {
				LOG.info("Entering user details");
				List<Map<String, String>> aux = table.asMaps();
				String confirmNewEmailAddress = null;
				for (int i = 0; i < aux.size(); i++) {
					Map<String, String> usrdetails = aux.get(i);

					confirmNewEmailAddress = usrdetails
							.get("ConfirmNewEmailAddress");
				}

				if (confirmNewEmailAddress != null) {

					changeEmailAddressPagePO
							.enterConfirmNewEmailAddress(confirmNewEmailAddress);

				}

			}

			catch (Exception ex)

			{
				LOG.error("Error in enterLoginDetails: ", ex);
			}
		}
		changeEmailAddressPagePO.pressTabKey();

	}

	@When("^I click on the Save Button$")
	public void I_click_on_the_Save_Button() throws Throwable {
		changeEmailAddressPagePO.clickOnSaveButton();
	}

	@Then("^the emails do not match error is displayed$")
	public void the_emails_do_not_match_error_is_displayed() throws Throwable {
		Assert.assertTrue(changeEmailAddressPagePO
				.checkEmailMismatchErrorIsDisplayed());
		WC.getDriver().navigate().refresh();
	}

	@Then("^the email address is updated$")
	public void the_email_address_is_updated() throws Throwable {
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		Assert.assertTrue(aboutYouPagePO.checkEmailAddressIsUpdated());

	}

	@After("@ChangeEmail_Cleanup")
	public void cleanUp() {
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		aboutYouPagePO.enterPassword("Password1");
		aboutYouPagePO.clickOnSignInButton();
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.checkUserisLoggedin();
		homePagePO.clickOnMyAccountLink();
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		myAccountPO.clickOnChangeMyEmailAddressLink();
		changeEmailAddressPagePO = WC
				.getPageObject(ChangeEmailAddressPagePO.class);
		Assert.assertTrue(changeEmailAddressPagePO
				.checkUserIsOnChangeMyEmailAddressPage());
		changeEmailAddressPagePO
				.enterCurrentPasswordInThePasswordTextbox("Password1");
		changeEmailAddressPagePO
				.enterNewEmailAddress("ashish.modi@uk.tesco.com");
		changeEmailAddressPagePO
				.enterConfirmNewEmailAddress("ashish.modi@uk.tesco.com");
		changeEmailAddressPagePO.clickOnSaveButton();
		// aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		// Assert.assertTrue(aboutYouPagePO.checkEmailAddressIsUpdated());
		// aboutYouPagePO.signOut();

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
