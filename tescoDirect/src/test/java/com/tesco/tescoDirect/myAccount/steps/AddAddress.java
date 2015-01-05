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

public class AddAddress {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(AddAddress.class);
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

	@Then("^the Add a new address link is present$")
	public void the_Add_a_new_address_link_is_present() throws Throwable {
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		Assert.assertTrue(myAccountPO.checkAddANewAddressLinkIsPresent());
	}

	@When("^I click on the Add a new address link$")
	public void I_click_on_the_Add_a_new_address_link() throws Throwable {
		myAccountPO.clickOnAddANewAddressLink();
	}

	@Then("^I am taken to the Add a new address page$")
	public void I_am_taken_to_the_Add_a_new_address_page() throws Throwable {

		addANewAddressPagePO = WC.getPageObject(AddANewAddressPagePO.class);
		Assert.assertTrue(addANewAddressPagePO
				.checkUserIsOnAddANewAddressPage());
	}

	@Given("^I am on the Add a new address page$")
	public void I_am_on_the_Add_a_new_address_page() throws Throwable {
		addANewAddressPagePO = WC.getPageObject(AddANewAddressPagePO.class);
		Assert.assertTrue(addANewAddressPagePO
				.checkUserIsOnAddANewAddressPage());
	}

	@Then("^the following elements are present on the add a new address page$")
	public void the_following_elements_are_present_on_the_Add_a_new_address_page(
			DataTable table) throws Throwable {
		addANewAddressPagePO = WC.getPageObject(AddANewAddressPagePO.class);

		{

			Boolean result;
			List<Map<String, String>> mappedTable = table.asMaps();
			for (Map<String, String> myValue : mappedTable) {
				for (Map.Entry<String, String> entry : myValue.entrySet()) {
					String value = entry.getValue();
					switch (value) {

					case "Breadcrumbs of the page":
						result = addANewAddressPagePO
								.checkBreadcrumbsIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Breadcrumbs of the page is displayed");
						break;

					case "Add a new address header text":
						result = addANewAddressPagePO
								.checkAddANewAddressHeaderTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Add a new address header text is displayed");
						break;

					case "Address Informational text":
						result = addANewAddressPagePO
								.checkAddressInformationalTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address Informational text is displayed");
						break;

					case "Address nickname label":
						result = addANewAddressPagePO
								.checkAddressNicknameLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address nickname label is displayed");
						break;

					case "Address nickname example text":
						result = addANewAddressPagePO
								.checkAddressNicknameExampleTextIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address nickname example text is displayed");
						break;

					case "Address nickname textbox":
						result = addANewAddressPagePO
								.checkAddressNicknameTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Address nickname textbox is displayed");
						break;

					case "Postcode label":
						result = addANewAddressPagePO
								.checkPostcodeLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Postcode label is displayed");
						break;

					case "Postcode textbox":
						result = addANewAddressPagePO
								.checkPostcodeTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Postcode textbox is displayed");
						break;

					case "Disabled Edit Button":
						result = addANewAddressPagePO
								.checkDisabledEditButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Disabled Edit Button is displayed");
						break;

					case "Daytime phone label":
						result = addANewAddressPagePO
								.checkDaytimePhoneLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Daytime phone label is displayed");
						break;

					case "Daytime phone textbox":
						result = addANewAddressPagePO
								.checkDaytimePhoneTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Daytime phone textbox is displayed");
						break;

					case "Evening phone label":
						result = addANewAddressPagePO
								.checkEveningPhoneLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Evening phone label is displayed");
						break;

					case "Evening phone textbox":
						result = addANewAddressPagePO
								.checkEveningPhoneTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Evening phone textbox is displayed");
						break;

					case "Mobile phone label":
						result = addANewAddressPagePO
								.checkMobilePhoneLabelIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Mobile phone label is displayed");
						break;

					case "Mobile phone textbox":
						result = addANewAddressPagePO
								.checkMobilePhoneTextboxIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Mobile phone textbox| is displayed");
						break;

					case "Enabled Cancel Button":
						result = addANewAddressPagePO
								.checkEnabledCancelButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Enabled Cancel Button is displayed");
						break;

					case "Disabled Save address Button":
						result = addANewAddressPagePO
								.checkDisabledSaveAddressButtonIsDisplayed();
						Assert.assertTrue(result);
						LOG.debug("Disabled Save address Button is displayed");
						break;

					}
				}

			}

			LOG.debug("the following elements are displayed");

		}

	}

	@Given("^I enter the following details for the Add a new address form$")
	public void I_enter_the_following_details_for_the_Add_a_new_address_form(
			DataTable table) throws Throwable {

		List<Map<String, String>> listdt = table.asMaps();

		for (int i = 0; i < listdt.size(); i++) {
			addANewAddressPagePO = WC.getPageObject(AddANewAddressPagePO.class);
			String element = (listdt.get(i).get("Element"));
			String value = (listdt.get(i).get("Value"));

			switch (element) {

			case "Address nickname textbox":

				addANewAddressPagePO.enterAddressNickname(value);

				break;

			case "Postcode textbox":

				addANewAddressPagePO.enterPostcode(value);

				break;

			case "Daytime phone textbox":

				addANewAddressPagePO.enterDaytimePhoneNumber(value);

				break;

			case "Evening phone textbox":

				addANewAddressPagePO.enterEveningPhoneNumber(value);

				break;

			case "Mobile phone textbox":

				addANewAddressPagePO.enterMobilePhoneNumber(value);

				break;

			}

		}

		System.out.println(listdt.get(1).get("Element"));
		System.out.println(listdt.get(1).get("Value"));
	}

	@Then("^the Edit Button is enabled$")
	public void the_Edit_Button_is_enabled() throws Throwable {
		Assert.assertTrue(addANewAddressPagePO.checkEditButtonIsEnabled());
	}

	@When("^I select the first address from the address dropdown$")
	public void I_select_the_first_address_from_the_address_dropdown()
			throws Throwable {
		addANewAddressPagePO.selectFirstAddressFromTheAddressDropdown();
	}

	@Then("^the Save address Button is enabled$")
	public void the_Save_address_Button_is_enabled() throws Throwable {

		Assert.assertTrue(addANewAddressPagePO
				.checkSaveAddressButtonIsEnabled());
	}

	@When("^I click on the Save address Button$")
	public void I_click_on_the_Save_address_Button() throws Throwable {
		addANewAddressPagePO.clickOnSaveAddressButton();
	}

	@Then("^the new address is added$")
	public void the_new_address_is_added() throws Throwable {
		manageMyAddressBookPagePO = WC
				.getPageObject(ManageMyAddressBookPagePO.class);

		Assert.assertTrue(manageMyAddressBookPagePO
				.checkNewAddressIsDisplayed());
	}

	@After("@AddAddress_CleanUp")
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
