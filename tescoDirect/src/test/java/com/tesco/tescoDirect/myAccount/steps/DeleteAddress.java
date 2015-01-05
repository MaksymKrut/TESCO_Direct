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
import com.tesco.tescoDirect.pageObjects.AddANewAddressPagePO;
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

public class DeleteAddress {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(DeleteAddress.class);
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
	private AddANewAddressPagePO addANewAddressPagePO;
	private ManageMyAddressBookPagePO manageMyAddressBookPagePO;

	@Then("^the Manage my address book link is present$")
	public void the_Manage_my_address_book_link_is_present() throws Throwable {
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		Assert.assertTrue(myAccountPO.checkManageMyAddressBookLinkIsPresent());

	}

	@When("^I click on the Manage my address book link$")
	public void I_click_on_the_Manage_my_address_book_link() throws Throwable {
		myAccountPO.clickOnkManageMyAddressBookLink();

	}

	@Then("^I am taken to the Manage my address book page$")
	public void I_am_taken_to_the_Manage_my_address_book_page()
			throws Throwable {
		manageMyAddressBookPagePO = WC
				.getPageObject(ManageMyAddressBookPagePO.class);
		Assert.assertTrue(manageMyAddressBookPagePO
				.checkUserIsOnmanageMyAddressBookPage());

	}

	@Given("^I am on the Manage my address book page$")
	public void I_am_on_the_Manage_my_address_book_page() throws Throwable {
		manageMyAddressBookPagePO = WC
				.getPageObject(ManageMyAddressBookPagePO.class);
		Assert.assertTrue(manageMyAddressBookPagePO
				.checkUserIsOnmanageMyAddressBookPage());

	}

	@Given("^I try to delete an address linked to my payment card$")
	public void I_try_to_delete_an_address_linked_to_my_payment_card()
			throws Throwable {
		manageMyAddressBookPagePO.clickOnRadioButtonForTheSecondAddress();
		manageMyAddressBookPagePO.clickOnSaveChangesButton();
		manageMyAddressBookPagePO.tryToDeleteAddressLinkedToCard();

	}

	@Then("^the payment card linked to address error is displayed$")
	public void the_payment_card_linked_to_address_error_is_displayed()
			throws Throwable {
		Assert.assertTrue(manageMyAddressBookPagePO
				.paymentCardLinkedToAddressErrorisDisplayed());

	}

	@When("^I try to delete an address not linked to my payment card$")
	public void I_click_on_the_delete_address_button_for_the_Home_address()
			throws Throwable {
		manageMyAddressBookPagePO.clickOnRadioButtonForTheSecondAddress();
		manageMyAddressBookPagePO.clickOnSaveChangesButton();
		manageMyAddressBookPagePO.tryToDeleteAddressNotLinkedToCard();
	}

	@Then("^the respective address is deleted$")
	public void the_respective_address_is_deleted() throws Throwable {
		Assert.assertTrue(manageMyAddressBookPagePO
				.checkRespectiveAddressHasBeenDeleted());

	}

	@When("^I click on the delete address button for the Extra address$")
	public void I_click_on_the_delete_address_button_for_the_Extra_address()
			throws Throwable {

	}

	@Then("^the following elements are present on the Manage my address book page$")
	public void the_following_elements_are_present_on_the_Manage_my_address_book_page(
			DataTable table) throws Throwable {

		manageMyAddressBookPagePO = WC
				.getPageObject(ManageMyAddressBookPagePO.class);

		{

			Boolean result;
			List<Map<String, String>> mappedTable = table.asMaps();
			for (Map<String, String> myValue : mappedTable) {
				for (Map.Entry<String, String> entry : myValue.entrySet()) {
					String value = entry.getValue();
					switch (value) {

					case "Breadcrumbs of the page":
						result = manageMyAddressBookPagePO
								.checkBreadcrumbsIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Breadcrumbs of the page is displayed");
						break;

					case "Manage my address book header text":
						result = manageMyAddressBookPagePO
								.checkManageMyAddressBookHeaderTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Manage my address book header text is displayed");
						break;

					case "Address Informational text":
						result = manageMyAddressBookPagePO
								.checkAddressInformationalTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address Informational text is displayed");
						break;

					case "Radio Button for the first address selected":
						result = manageMyAddressBookPagePO
								.checkRadioButtonForTheFirstAddressIsSelected();
						Assert.assertTrue(result);
						LOG.debug("Radio Button for the first address selected is displayed");
						break;

					case "Radio Button for the second address not selected":
						result = manageMyAddressBookPagePO
								.checkRadioButtonForTheSecondAddressIsNotSelected();
						Assert.assertFalse(result);
						LOG.debug("Radio Button for the second address not selected");
						break;

					case "Address Name":
						result = manageMyAddressBookPagePO
								.checkAddressNameIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address Name is displayed");
						break;

					case "Address":
						result = manageMyAddressBookPagePO
								.checkAddressIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address is displayed");
						break;

					case "Day phone Label":
						result = manageMyAddressBookPagePO
								.checkDayPhoneLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Day phone Label is displayed");
						break;

					case "Day Phone Number":
						result = manageMyAddressBookPagePO
								.checkDayPhoneNumberIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Day Phone Number is displayed");
						break;

					case "Evening phone Label":
						result = manageMyAddressBookPagePO
								.checkEveningPhoneLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Evening phone Label is displayed");
						break;

					case "Evening phone Number":
						result = manageMyAddressBookPagePO
								.checkEveningPhoneNumberIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Evening phone Number is displayed");
						break;

					case "Mobile phone Label":
						result = manageMyAddressBookPagePO
								.checkMobilePhoneLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Mobile phone Label is displayed");
						break;

					case "Mobile phone Number":
						result = manageMyAddressBookPagePO
								.checkMobilePhoneNumberIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Mobile phone Number is displayed");
						break;

					case "Edit Button in First Address":
						result = manageMyAddressBookPagePO
								.checkEditButtonInFirstAddressIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Edit Button in First Address is displayed");
						break;

					case "Edit Button in Second Address":
						result = manageMyAddressBookPagePO
								.checkEditButtonInSecondAddressIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Edit Button in Second Address is displayed");
						break;

					case "Delete Button in Second Address":
						result = manageMyAddressBookPagePO
								.checkDeleteButtonInSecondAddressIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Delete Button in Second Address is displayed");
						break;

					case "Add a new address button":
						result = manageMyAddressBookPagePO
								.checkAddANewAddressButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Add a new address button is displayed");
						break;

					case "Save Changes button":
						result = manageMyAddressBookPagePO
								.checkSaveChangesButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Save Changes button is displayed");
						break;

					}
				}

			}

			LOG.debug("the following elements are displayed");

		}

	}

	@After("@DeleteAddress_CleanUp")
	public void cleanUp() {
		manageMyAddressBookPagePO = WC
				.getPageObject(ManageMyAddressBookPagePO.class);
		// Assert.assertTrue(manageMyAddressBookPagePO.checkAddressHasBeenDeleted());
		manageMyAddressBookPagePO.signOut();

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
