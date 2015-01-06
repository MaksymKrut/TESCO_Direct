package com.tesco.tescoDirect.registration.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.CancelMyOrderPO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lu.a;

public class Registration {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(Registration.class);
	private HomePagePO homePagePO;
	private AboutYouPagePO aboutYouPagePO;

	@Given("^I navigate to TESCO direct About You page$")
	public void I_navigate_to_TESCO_direct_About_You_page_a() throws Throwable {
		LOG.debug("I navigate to TESCO direct About You page");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnSigninorRegisterLink();

	}

	@Given("^I click on the I am a new customer radio button$")
	public void I_click_on_the_I_am_a_new_customer_radio_button()
			throws Throwable {
		LOG.debug("I click on the I am a new customer radio button");
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		aboutYouPagePO.clickOnIamAnewCustomerRadioButton();

	}

	@Then("^the following fields and values for registration should be displayed$")
	public void the_following_fields_and_values_for_registration_should_be_displayed(
			DataTable table) throws Throwable {
		LOG.debug("the following fields and values for registration should be displayed");
		List<Map<String, String>> mappedTable = table.asMaps();

		String expectedTitleDropDownValue = mappedTable.get(0).get("Value");
		LOG.debug("Expected Title Drop Down Value :"
				+ expectedTitleDropDownValue);
		String actualTitleDropDownValue = aboutYouPagePO
				.getActualTitleDropDownValue();
		LOG.debug("Actual Title Drop Down Value :" + actualTitleDropDownValue);
		Assert.assertTrue(expectedTitleDropDownValue
				.equals(actualTitleDropDownValue));

		String expectedFirstNameTextBoxValue = mappedTable.get(1).get("Value");
		LOG.debug("Expected FirstName Text Box Value :"
				+ expectedFirstNameTextBoxValue);
		String actualFirstNameTextBoxValue = aboutYouPagePO
				.getActualFirstNameTextBoxValue();
		Assert.assertTrue(expectedFirstNameTextBoxValue
				.equals(actualFirstNameTextBoxValue));

		String expectedLastNameTextBoxValue = mappedTable.get(2).get("Value");
		LOG.debug("Expected LastName Text Box Value :"
				+ expectedLastNameTextBoxValue);
		String actualLastNameTextBoxValue = aboutYouPagePO
				.getActualLastNameTextBoxValue();
		Assert.assertTrue(expectedLastNameTextBoxValue
				.equals(actualLastNameTextBoxValue));

		String expectedEmailTextBoxValue = mappedTable.get(3).get("Value");
		LOG.debug("Expected Email TextBox Value :" + expectedEmailTextBoxValue);
		String actualEmailTextBoxValue = aboutYouPagePO
				.getActualEmailTextBoxValue();
		Assert.assertTrue(expectedEmailTextBoxValue
				.equals(actualEmailTextBoxValue));

		String expectedPostCodeTextBoxValue = mappedTable.get(3).get("Value");
		LOG.debug("Expected PostCode TextBox Value :"
				+ expectedPostCodeTextBoxValue);
		String actualPostCodeTextBoxValue = aboutYouPagePO
				.getActualPostCodeTextBoxValue();
		Assert.assertTrue(expectedPostCodeTextBoxValue
				.equals(actualPostCodeTextBoxValue));

		String expectedClubcardNumberTextBoxValue = mappedTable.get(3).get(
				"Value");
		LOG.debug("Expected Clubcard Number TextBox Value :"
				+ expectedClubcardNumberTextBoxValue);
		String actualClubcardNumberTextBoxValue = aboutYouPagePO
				.getActualClubcardNumberTextBoxValue();
		Assert.assertTrue(expectedClubcardNumberTextBoxValue
				.equals(actualClubcardNumberTextBoxValue));
	}

	@And("^I don't have a Clubcard checkbox should appear unchecked$")
	public void the_I_dont_have_a_Clubcard_checkbox_is_unchecked()
			throws Throwable {
		LOG.debug("the I dont have a Clubcard checkbox is unchecked");
		aboutYouPagePO.checkIDontHaveAClubcardCheckboxIsUnChecked();

	}

	@And("^Edit button should appear disabled$")
	public void the_Edit_button_is_disabled() throws Throwable {
		LOG.debug("the Edit button is disabled");
		aboutYouPagePO.checkEditButtonIsDisabled();
	}

	@And("^Next button should appear enabled$")
	public void the_Next_button_is_enabled() throws Throwable {
		LOG.debug("the Next button is enabled");
		aboutYouPagePO.checkNextButtonIsEnabled();
	}

	@When("^user fills in the following values in the registration field$")
	public void user_fills_in_the_following_values_in_the_registration_field(
			DataTable table) throws Throwable {
		LOG.debug("user fills in the following values in the registration field");
		aboutYouPagePO.selectingTitle();
		aboutYouPagePO.typingFirstName();
		aboutYouPagePO.typingLastNameTextBox();
		aboutYouPagePO.typingEmail();
		aboutYouPagePO.typingPostCode();
	}

	@Then("^a drop down matching all of the postcode address should be displayed$")
	public void a_drop_down_matching_all_of_the_postcode_address_should_be_displayed()
			throws Throwable {
		LOG.debug("a drop down matching all of the postcode address should be displayed");
		aboutYouPagePO.checkingDropdownMatchingAllOfthePostCodeAddress();
	}

	@When("^user selects an address from the drop down$")
	public void user_selects_an_address_from_the_drop_down() throws Throwable {
		LOG.debug("user selects an address from the drop down");
		aboutYouPagePO.selectingAddressFromDropDown();
	}

	@Then("^the fields should be updated with the values of the address$")
	public void the_fields_should_be_updated_with_the_values_of_the_address()
			throws Throwable {
		LOG.debug("the fields should be updated with the values of the address");
	}

	@When("^user clicks on I don't have a Clubcard checkbox$")
	public void user_clicks_on_I_don_t_have_a_Clubcard_checkbox()
			throws Throwable {
		LOG.debug("user clicks on I don't have a Clubcard checkbox");
		aboutYouPagePO.clickOnIDontHaveAclubcardCheckBox();
	}

	@And("^Clicks on the Next button$")
	public void Clicks_on_the_Next_button() throws Throwable {
		LOG.debug("Clicks on the Next button");
		aboutYouPagePO.clickOnRegFirstPageNextButton();
	}

	@Then("^the additional registration details should be displayed with the values as below$")
	public void the_additional_registration_details_should_be_displayed_with_the_values_as_below(
			DataTable table) throws Throwable {
		LOG.debug("the additional registration details should be displayed with the values as below");
		aboutYouPagePO.checkingadditionalregistrationdetails();
	}

	@And("^Agree terms and conditions checkbox should appear unchecked$")
	public void Agree_terms_and_conditions_checkbox_should_appear_unchecked()
			throws Throwable {
		LOG.debug("Agree terms and conditions checkbox should appear unchecked");
		aboutYouPagePO.checkingStatusOfAgreeAndTC();
	}

	@And("^Back button displayed and enabled$")
	public void Back_button_displayed_and_enabled() throws Throwable {
		LOG.debug("Back button displayed and enabled");
		aboutYouPagePO.checkingStatusOfBackButton();
	}

	@And("^Next button displayed and enabled$")
	public void Next_button_displayed_and_enabled() throws Throwable {
		LOG.debug("Next button displayed and enabled");
		aboutYouPagePO.checkingStatusOfRegSecondPageNextButton();
	}

	@When("^user enters the following values in the additional information page$")
	public void user_enters_the_following_values_in_the_additional_information_page(
			DataTable table) throws Throwable {
		LOG.debug("user enters the following values in the additional information page");
		aboutYouPagePO.typingPhoneNumber();
		aboutYouPagePO.typingPassword();
		aboutYouPagePO.typingConfirmPassword();
	}

	@And("^Clicks on Agree terms and conditions checkbox$")
	public void Clicks_on_Agree_terms_and_conditions_checkbox()
			throws Throwable {
		LOG.debug("Clicks on Agree terms and conditions checkbox");
		aboutYouPagePO.ClickingOnAgreeAndTC();
	}

	@And("^Clicks the Next button$")
	public void Clicks_the_Next_button() throws Throwable {
		LOG.debug("Clicks the Next button");
		aboutYouPagePO.clickOnRegFirstPageNextButton();
	}

	@And("^Clicks the Next button in additional information page$")
	public void ClickstheNextbuttoninadditionalinformationpage()
			throws Throwable {
		LOG.debug("Clicks the Next button in additional information page");
		aboutYouPagePO.ClickingRegSecondPageNextButton();
	}

	@Then("^user should be successfully registered and Home page should be shown$")
	public void user_should_be_successfully_registered_and_Home_page_should_be_shown()
			throws Throwable {
		LOG.debug("user should be successfully registered and Home page should be shown");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.checkUserisLoggedin();
		homePagePO.clickOnSignOutLink();
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
