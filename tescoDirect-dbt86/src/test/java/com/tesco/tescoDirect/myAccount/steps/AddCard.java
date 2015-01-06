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
import com.tesco.tescoDirect.pageObjects.AddCardPagePO;
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
import com.tesco.tescoDirect.pageObjects.ManageMyPaymentCardPagePO;
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

public class AddCard {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(AddCard.class);
	private HomePagePO homePagePO;
	private TescoMobileSimPDPPagePO tescoMobileSimPDPPagePO;
	private BasketDetailsPagePO basketDetailsPagePO;
	private HarryPotterDVDPDPPagePO harryPotterDVDPDPPagePO;
	private CheckOutPagePO checkOutPagePO;
	private AboutYouPagePO aboutYouPagePO;
	private BasketPagePO basketPagePO;
	private MyAccountPO myAccountPO;
	private AddCardPagePO addCardPagePO;
	private Login login;
	private ManageMyPaymentCardPagePO manageMyPaymentCardPagePO;

	@Then("^the Add a payment card link is present$")
	public void the_Add_a_payment_card_link_is_present() throws Throwable {

		myAccountPO = WC.getPageObject(MyAccountPO.class);
		Assert.assertTrue(myAccountPO.checkAddAPaymentCardLinkIsPresent());

	}

	@When("^I click on the Add a payment card link$")
	public void I_click_on_the_Add_a_payment_card_link() throws Throwable {
		myAccountPO.clickOnAddAPaymentCardLink();
	}

	@Then("^I am taken to the Add a payment card page$")
	public void I_am_taken_to_the_Add_a_payment_card_page() throws Throwable {
		addCardPagePO = WC.getPageObject(AddCardPagePO.class);
		Assert.assertTrue(addCardPagePO.checkUserIsOnAddPaymentCardPage());
	}

	@Given("^I am on the Add a payment card page$")
	public void I_am_on_the_Add_a_payment_card_page() throws Throwable {
		addCardPagePO = WC.getPageObject(AddCardPagePO.class);
		Assert.assertTrue(addCardPagePO.checkUserIsOnAddPaymentCardPage());
	}

	@Then("^the following elements are present on the Add a payment card page$")
	public void the_following_elements_are_present_on_the_Add_a_payment_card_page(
			DataTable table) throws Throwable {
		addCardPagePO = WC.getPageObject(AddCardPagePO.class);

		{

			Boolean result;
			List<Map<String, String>> mappedTable = table.asMaps();
			for (Map<String, String> myValue : mappedTable) {
				for (Map.Entry<String, String> entry : myValue.entrySet()) {
					String value = entry.getValue();
					switch (value) {

					case "Breadcrumbs of the page":
						result = addCardPagePO.checkBreadcrumbsIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Breadcrumbs of the page is displayed");
						break;

					case "Add a payment card header text":
						result = addCardPagePO
								.checkAddAPaymentCardHeaderTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Add a payment card header text is displayed");
						break;

					case "Payment Card Informational text":
						result = addCardPagePO
								.checkPaymentCardInformationalTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Payment Card Informational text is displayed");
						break;

					case "Card details Header":
						result = addCardPagePO
								.checkCardDetailsHeaderIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card details Header is displayed");
						break;

					case "Card number label":
						result = addCardPagePO
								.checkCardNumberLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card number label is displayed");
						break;

					case "Card number textbox":
						result = addCardPagePO
								.checkCardNumberTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card number textbox is displayed");
						break;

					case "Cardholders name label":
						result = addCardPagePO
								.checkCardHoldersNameLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Cardholders name label is displayed");
						break;

					case "Cardholders name textbox":
						result = addCardPagePO
								.checkCardHoldersNameTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Cardholders name textbox is displayed");
						break;

					case "Issue number label":
						result = addCardPagePO
								.checkIssueNumberLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Issue number label is displayed");
						break;

					case "Issue number textbox":
						result = addCardPagePO
								.checkIssueNumberTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Issue number textbox is displayed");
						break;

					case "Expiry date label":
						result = addCardPagePO
								.checkExpiryDateLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Expiry date label is displayed");
						break;

					case "Expiry date Month dropdown with MM as default value":
						result = addCardPagePO
								.checkExpiryDateMonthDropdownWithMMasDefaultValueIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Expiry date Month dropdown with MM as default value is displayed");
						break;

					case "Expiry date Year dropdown with YYYY as default value":
						result = addCardPagePO
								.checkExpiryDateYearDropdownWithYYYYasDefaultValueIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Expiry date Year dropdown with YYYY as default value is displayed");
						break;

					case "Billing Address header":
						result = addCardPagePO
								.checkBillingAddressHeaderIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Billing Address header is displayed");
						break;

					case "Billing Address Informational Text":
						result = addCardPagePO
								.checkBillingAddressInformationalTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Billing Address Informational Text is displayed");
						break;

					case "My billing address radio button label":
						result = addCardPagePO
								.checkMyBillingAddressRadioButtonLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("My billing address radio button label is displayed");
						break;

					case "My billing address radio button not selected by default":
						result = addCardPagePO
								.checkMyBillingAddressRadioButtonNotSelectedByDefaultIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("My billing address radio button not selected by default is displayed");
						break;

					case "Address Name":
						result = addCardPagePO.checkAddressNameIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address Name is displayed");
						break;

					case "Address":
						result = addCardPagePO.checkAddressIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address is displayed");
						break;

					case "Add Button":
						result = addCardPagePO.checkAddButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Add Button is displayed");
						break;

					}
				}

			}

			LOG.debug("the following elements are displayed");

		}

	}

	@When("^I enter the following the following information in the card details form$")
	public void I_enter_the_following_the_following_information_in_the_card_details_form(
			DataTable table) throws Throwable {
		addCardPagePO = WC.getPageObject(AddCardPagePO.class);
		List<Map<String, String>> listdt = table.asMaps();

		for (int i = 0; i < listdt.size(); i++) {

			String element = (listdt.get(i).get("Element"));
			String value = (listdt.get(i).get("Value"));

			switch (element) {

			case "Card number textbox":

				addCardPagePO.enterCardNumber(value);

				break;

			case "Cardholders name textbox":

				addCardPagePO.enterCardHoldersName(value);

				break;

			case "Expiry date Month dropdown":

				addCardPagePO.selectCardExpiryMonth(value);

				break;

			case "Expiry date Year dropdown":

				addCardPagePO.selectCardExpiryYear(value);

				break;

			}

		}

		System.out.println(listdt.get(1).get("Element"));
		System.out.println(listdt.get(1).get("Value"));
	}

	@When("^I select the My billing address radio button$")
	public void I_select_the_My_billing_address_radio_button() throws Throwable {
		addCardPagePO.selectBillingAddressRadioButton();

	}

	@When("^I click on the Add button$")
	public void I_click_on_the_Add_button() throws Throwable {
		addCardPagePO.clickOnAddButton();
	}

	@Then("^the new payment card details are added$")
	public void the_new_payment_card_details_are_added() throws Throwable {
		manageMyPaymentCardPagePO = WC
				.getPageObject(ManageMyPaymentCardPagePO.class);
		Assert.assertTrue(manageMyPaymentCardPagePO
				.checkNewCardAddedConfirmationTextIsDisplayed());
	}

	@After("@AddCard_CleanUp")
	public void cleanUp() {
		manageMyPaymentCardPagePO = WC
				.getPageObject(ManageMyPaymentCardPagePO.class);

		manageMyPaymentCardPagePO.signOut();

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
