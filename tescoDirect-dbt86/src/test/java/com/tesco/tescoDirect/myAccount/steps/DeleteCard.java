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

public class DeleteCard {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(DeleteCard.class);
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

	@Then("^the Manage my payment details link is present$")
	public void the_Manage_my_payment_details_link_is_present()
			throws Throwable {
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		Assert.assertTrue(myAccountPO
				.checkManageMyPaymentDetailsLinkIsPresent());
	}

	@When("^I click on the Manage my payment details link$")
	public void I_click_on_the_Manage_my_payment_details_link()
			throws Throwable {
		myAccountPO.clickOnManageMyPaymentDetailsLink();
	}

	@Then("^I am taken to the Manage my payment details page$")
	public void I_am_taken_to_the_Manage_my_payment_details_page()
			throws Throwable {
		manageMyPaymentCardPagePO = WC
				.getPageObject(ManageMyPaymentCardPagePO.class);
		Assert.assertTrue(manageMyPaymentCardPagePO
				.checkUserIsOnmanageMyPaymentCardPage());
	}

	@Given("^I am on the manage my payment details page$")
	public void I_am_on_the_manage_my_payment_details_page() throws Throwable {
		manageMyPaymentCardPagePO = WC
				.getPageObject(ManageMyPaymentCardPagePO.class);
		Assert.assertTrue(manageMyPaymentCardPagePO
				.checkUserIsOnmanageMyPaymentCardPage());
	}

	@Then("^the following elements are present$")
	public void the_following_elements_are_present(DataTable table)
			throws Throwable {
		manageMyPaymentCardPagePO = WC
				.getPageObject(ManageMyPaymentCardPagePO.class);

		{

			Boolean result;
			List<Map<String, String>> mappedTable = table.asMaps();
			for (Map<String, String> myValue : mappedTable) {
				for (Map.Entry<String, String> entry : myValue.entrySet()) {
					String value = entry.getValue();
					switch (value) {

					case "Breadcrumbs of the page":
						result = manageMyPaymentCardPagePO
								.checkBreadcrumbsIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Breadcrumbs of the page is displayed");
						break;

					case "Manage my payment card header text":
						result = manageMyPaymentCardPagePO
								.checkManageMyPaymentCardHeaderTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Manage my payment card header text is displayed");
						break;

					case "Card Informational text":
						result = manageMyPaymentCardPagePO
								.checkCardInformationalTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card Informational text is displayed");
						break;

					case "Card type label":
						result = manageMyPaymentCardPagePO
								.checkCardTypeLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card type label is displayed");
						break;

					case "Card type text":
						result = manageMyPaymentCardPagePO
								.checkCardTypeTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card type text is displayed");
						break;

					case "Card number label":
						result = manageMyPaymentCardPagePO
								.checkCardNumberLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card number label is displayed");
						break;

					case "Card number text displaying only last 4 digits of the card":
						result = manageMyPaymentCardPagePO
								.checkCardNumberTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Card number text displaying only last 4 digits of the card is displayed");
						break;

					case "Issue number label":
						result = manageMyPaymentCardPagePO
								.checkIssueNumberLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Issue number label is displayed");
						break;

					case "Expiry date label":
						result = manageMyPaymentCardPagePO
								.checkExpiryDateLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Expiry date label is displayed");
						break;

					case "Expiry date text":
						result = manageMyPaymentCardPagePO
								.checkExpiryDateTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Expiry date text is displayed");
						break;

					case "Billing address label":
						result = manageMyPaymentCardPagePO
								.checkBillingAddressLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Billing address label is displayed");
						break;

					case "Address Name":
						result = manageMyPaymentCardPagePO
								.checkAddressNameIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address Name is displayed");
						break;

					case "Address":
						result = manageMyPaymentCardPagePO
								.checkAddressIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address is displayed");
						break;

					case "Delete Button":
						result = manageMyPaymentCardPagePO
								.checkDeleteButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Delete Button is displayed");
						break;

					}
				}

			}

			LOG.debug("the following elements are displayed");

		}

	}

	@Given("^I click on the delete card button$")
	public void I_click_on_the_delete_card_button() throws Throwable {
		manageMyPaymentCardPagePO = WC
				.getPageObject(ManageMyPaymentCardPagePO.class);
		manageMyPaymentCardPagePO.clickOnDeleteCardButton();
	}

	@Given("^click confirm on the following dialogue box$")
	public void click_confirm_on_the_following_dialogue_box() throws Throwable {
		manageMyPaymentCardPagePO.clickConfirmOnDialogueBox();
	}

	@Then("^the respective card is deleted$")
	public void the_respective_card_is_deleted() throws Throwable {
		Assert.assertTrue(manageMyPaymentCardPagePO.checkCardIsDeleted());
	}

	@After("@DeleteCard_CleanUP")
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
