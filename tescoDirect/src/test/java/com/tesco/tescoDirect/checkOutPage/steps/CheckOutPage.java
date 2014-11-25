package com.tesco.tescoDirect.checkOutPage.steps;

import static org.junit.Assert.assertTrue;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutPage {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(CheckOutPage.class);
	private GlobalHeaderPO globalHeaderPO;
	private GlobalFooterPO globalFooterPO;
	private CheckOutPagePO checkOutPagePO;
	private HomePagePO homePagePO;
	private AboutYouPagePO aboutYouPagePO;
	@Given("^I navigate to TESCO direct \"([^\"]*)\" as a registered user$")
	public void I_navigate_to_TESCO_directasaregistereduser(String appURL) throws Exception {
			WC.getDriver().get(WC.getFullUrl(appURL));
			WC.getDriver().navigate().refresh();
            WC.suspendCookie();
            homePagePO = WC.getPageObject(HomePagePO.class);
    		homePagePO.clickingOnSigninorRegisterLink();
    		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
    		aboutYouPagePO.enterUserName("testaccount@tescodirect.com");
    		aboutYouPagePO.enterPassword("Password2");
    		aboutYouPagePO.clickOnSignInButton();
	}
	@Given("^I navigate to TESCO direct \"([^\"]*)\"$")
	public void I_navigate_to_TESCO_direct(String appURL) throws Exception {
			WC.getDriver().get(WC.getFullUrl(appURL));
			WC.getDriver().navigate().refresh();
            WC.suspendCookie();
	}
	
	@Given("^I navigate to TESCO direct \"([^\"]*)\" as a new User$")
	public void I_navigate_to_TESCO_directasanewUser(String appURL) throws Exception {
			WC.getDriver().get(WC.getFullUrl(appURL));
			WC.getDriver().navigate().refresh();
            WC.suspendCookie();
            homePagePO = WC.getPageObject(HomePagePO.class);
    		homePagePO.clickingOnSigninorRegisterLink();
    		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
    		aboutYouPagePO.clickOnIamAnewCustomerRadioButton();
    		aboutYouPagePO.selectingTitle();
    		aboutYouPagePO.typingFirstName();
    		aboutYouPagePO.typingLastNameTextBox();
    		aboutYouPagePO.typingEmail();
    		aboutYouPagePO.typingPostCode();
    		aboutYouPagePO.checkingDropdownMatchingAllOfthePostCodeAddress();
    		aboutYouPagePO.selectingAddressFromDropDown();
    		aboutYouPagePO.clickOnIDontHaveAclubcardCheckBox();
    		aboutYouPagePO.clickOnRegFirstPageNextButton();
    		aboutYouPagePO.checkingadditionalregistrationdetails();
    		aboutYouPagePO.typingPhoneNumber();
    		aboutYouPagePO.typingPassword();
    		aboutYouPagePO.typingConfirmPassword();
    		aboutYouPagePO.ClickingOnAgreeAndTC();
    		aboutYouPagePO.ClickingRegSecondPageNextButton();
    		homePagePO = WC.getPageObject(HomePagePO.class);
    		homePagePO.checkUserisLoggedin();
    		LOG.debug("Registered");
	}

	@And("^I check for the following elements in the checkout page Global Header$")
	public void IcheckforthefollowingelementsintheGlobalHeader(DataTable links)
			throws Exception {
		LOG.debug("I check for the following elements in the Global Header");
		globalHeaderPO = WC.getPageObject(GlobalHeaderPO.class);
		globalHeaderPO.checkingforGlobalHeaderLinks();

	}

	@Then("^I check for the progress bar items as follows$")
	public void Icheckfortheprogressbaritemsasfollows(DataTable table) {
		LOG.debug("I check for the  progress bar items as follows");
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.checkingtheStatusOfProgressBar();
	}

	@When("^I check for the following under Secure checkout$")
	public void I_check_for_the_following_under_Secure_checkout(
			DataTable message) {
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		LOG.debug("I check for the following under Secure checkout");
		List<Map<String, String>> aux = message.asMaps();
		String secureCheckoutmessage = null;
		for (int i = 0; i < aux.size(); i++) {
			Map<String, String> dates = aux.get(i);
			secureCheckoutmessage = dates.get("Secure checkout message");

		}
		if (secureCheckoutmessage != null)

		{
			checkOutPagePO.verifysecureCheckoutmessage(secureCheckoutmessage);
		}
	}

	@And("^I check for the following in Delivery Type module radio buttons$")
	public void I_check_for_the_following_in_Delivery_Type_module_radio_buttons(
			DataTable status) {
		LOG.debug("I check for the following in Delivery Type module radio buttons");
		checkOutPagePO.statusOfDeliveryTypeCollectionRadiobutton();
		checkOutPagePO.statusOfDeliveryTypeDeliveryRadiobutton();
	}

	@And("^I check for the following in Delivery Type module radio buttons for Editable Address$")
	public void I_check_for_the_following_in_Delivery_Type_module_radio_buttonsforEditableAddress(
			DataTable status) {
		LOG.debug("I check for the following in Delivery Type module radio buttons");
		checkOutPagePO.statusOfEADeliveryTypeCollectionRadiobutton();
		checkOutPagePO.statusOfEADeliveryTypeDeliveryRadiobutton();
	}

	@And("^I check for the following in Stores collection module$")
	public void I_check_for_the_following_in_Stores_collection_module(
			DataTable table) {
		LOG.debug("I check for the following in Stores collection module");
		checkOutPagePO.checkingthestoreCollectionModule();
	}

	@When("^I click on Store Details$")
	public void I_click_on_Store_Details() {
		LOG.debug("I click on Store Details");
		checkOutPagePO.clickonneareststoredetails();
	}

	@Then("^I should see the dialog box with the following nearest stores details$")
	public void I_should_see_the_dialog_box_with_the_followingneareststores_details(
			DataTable table) {
		LOG.debug("I should see the dialog box with the following nearest stores details");
		checkOutPagePO.checkingforNearestStoreDialogBox();

	}

	@When("^I click on View more collection points$")
	public void I_click_on_View_more_collection_points() {
		LOG.debug("I click on View more collection points");
		checkOutPagePO.clickonviewMoreStores();
	}

	@Then("^I should see the following items in View more collection points$")
	public void I_should_see_the_following_items_in_View_more_collection_points(
			DataTable table) throws Throwable {
		LOG.debug("I should see the following items in View more collection points");
		checkOutPagePO.checkingforviewMoreframeItems();
	}

	@When("^I click on Delivery radio button$")
	public void I_click_on_Delivery_radio_button() {
		LOG.debug("I click on Delivery radio button");
		checkOutPagePO.clickonDeliveryRadioButton();
	}

	@Then("^I should see the following in the Delivery options$")
	public void I_should_see_the_following_in_the_Delivery_options(
			DataTable table) {
		LOG.debug("I should see the following in the Delivery options");
		checkOutPagePO.statusOfStoreOptionModuleRadiobutton();
	}

	@And("^I check for the following message in the Delivery options$")
	public void I_check_for_the_following_message_in_the_Delivery_options(
			DataTable message) throws Throwable {
		LOG.debug("I check for the following message in the Delivery options");
		List<Map<String, String>> aux = message.asMaps();
		String deliverysavermessage = null;
		for (int i = 0; i < aux.size(); i++) {
			Map<String, String> dates = aux.get(i);
			deliverysavermessage = dates.get("Delivery saver message");

		}
		if (deliverysavermessage != null)

		{
			checkOutPagePO
					.verifyDeliveryOptionSavermessage(deliverysavermessage);
		}
	}

	@When("^I click on Delivery options help$")
	public void I_click_on_Delivery_options_Question_mark() {
		LOG.debug("I click on Delivery options help");
		checkOutPagePO.clickonDeliverySaverHelpButton();
	}

	@Then("^I should see the following message in the Delivery options help$")
	public void I_should_see_the_following_message_in_the_Delivery_options_Question_mark(
			DataTable message) throws Throwable {
		LOG.debug("I should see the following message in the Delivery options help");
		List<Map<String, String>> aux = message.asMaps();
		String deliverysaverhelpmessage = null;
		for (int i = 0; i < aux.size(); i++) {
			Map<String, String> dates = aux.get(i);
			deliverysaverhelpmessage = dates
					.get(" Delivery saver help message");

		}
		if (deliverysaverhelpmessage != null)

		{
			checkOutPagePO
					.verifyDeliveryOptionHelpmessage(deliverysaverhelpmessage);
		}
	}

	@When("^I click on Express Delivery$")
	public void I_click_on_Express_Delivery() {
		LOG.debug("I click on Express Delivery");
		checkOutPagePO.clickonStoreOptionModuleExpDeliveryRadioButton();
	}

	@Then("^I Should see the Select a delivery date dialog box with the following elements$")
	public void I_Should_see_the_Select_a_delivery_date_dialog_box_with_the_following_elements(
			DataTable table) {
		LOG.debug("I Should see the Select a delivery date dialog box with the following elements");
		checkOutPagePO.verifySelectDeliveryDatePopupElements();
	}

	@And("^I check for the edit link in front of the contact person$")
	public void I_check_for_the_edit_link_in_front_of_the_contact_person() {
		LOG.debug("I check for the edit link in front of the contact person");
		checkOutPagePO.verifyDeliveryDetailsContactPersonEditLink();
	}

	@And("^I check for the New Address link in front of billing address$")
	public void I_check_for_the_New_Address_link_in_front_of_billing_address() {
		LOG.debug("I check for the New Address link in front of billing address");
		checkOutPagePO.verifyDeliveryDetailsNewAddressLink();
	}

	@And("^I check for the edit link in front of the No courier instructions$")
	public void I_check_for_the_edit_link_in_front_of_the_No_courier_instructions() {
		LOG.debug("I check for the edit link in front of the No courier instructions");
		checkOutPagePO.verifyDeliveryDetailsCourierInstructionsEditLink();

	}

	@Then("^I check for the following fields in the payment card module$")
	public void I_check_for_the_following_fields_in_the_payment_card_module(
			DataTable table) {
		LOG.debug("I check for the following fields in the payment card module");
		checkOutPagePO.verifyPaymentCardDetails();
	}

	@And("^I check for the New Address link in front of payment card billing address$")
	public void I_check_for_the_New_Address_link_in_front_of_payment_card_billing_address() {
		LOG.debug("I check for the  New Address link in front of  payment card billing address");
		checkOutPagePO.verifyPaymentCardNewAddressLink();
	}

	@And("^I check for the Save this card under payment card billing address$")
	public void I_check_for_the_Save_this_card_under_payment_card_billing_address() {
		LOG.debug("I check for the  Save this card  under  payment card billing address");
		checkOutPagePO.verifySaveThisCardCheckBox();
	}

	@Then("^I check for the following in Total to pay Block$")
	public void I_check_for_the_following_in_Total_to_pay_Block(DataTable table) {
		LOG.debug("I check for the following in Total to pay Block");
		checkOutPagePO.verifyTotalToPayBlock();
	}

	@Then("^I check for the following in Differernt Payment method images at bottom of the page$")
	public void IcheckforthefollowinginDiffererntPaymentmethodimagesatbottomofhepage(
			DataTable table) {
		LOG.debug("I check for the following  in Differernt  Payment method images  at bottom of the page");
		globalFooterPO.checkingDiffPaymentMethodinFooter();
	}

	@And("^I check for the following Voucher sections$")
	public void I_check_for_the_following_Voucher_sections(DataTable table)
			throws Throwable {
		LOG.debug("I check for the following Voucher sections");
		checkOutPagePO.verifyVouchersection();
	}

	@When("^I click on Add Clubcard Vouchers$")
	public void I_click_on_Add_Clubcard_Vouchers() {
		LOG.debug("I click on Add Clubcard Vouchers");
		checkOutPagePO.clickonaddclubcardvoucherModule();
	}

	@Then("^I should see the following elements in Add Clubcard Vouchers module$")
	public void I_should_see_the_following_elements_in_Add_Clubcard_Vouchers_module(
			DataTable table) {
		LOG.debug("I should see the following elements in Add Clubcard Vouchers module");
		checkOutPagePO.verifyaddclubcardvoucherModuleElements();
	}

	@When("^I click on Add eCoupons$")
	public void I_click_on_Add_eCoupons() {
		LOG.debug("I click on Add eCoupons");
		checkOutPagePO.clickonaddecouponsModule();
	}

	@Then("^I should see the following elements in Add eCoupons module$")
	public void I_should_see_the_following_elements_in_Add_eCoupons_module(
			DataTable table) {
		LOG.debug("I should see the following elements in Add eCoupons module");
		checkOutPagePO.verifyaddecouponsModuleElements();
	}

	@When("^I click on Pay with a Gift Card$")
	public void I_click_on_Pay_with_a_Gift_Card() throws Throwable {
		LOG.debug("I click on Pay with a Gift Card");
		checkOutPagePO.clickonpaywithagiftcardModule();
	}

	@Then("^I should see the following elements in Pay with a Gift Card module$")
	public void I_should_see_the_following_elements_in_Pay_with_a_Gift_Card_module(
			DataTable table) {
		LOG.debug("I should see the following elements in Pay with a Gift Card module");
		checkOutPagePO.verifypaywithagiftcardElements();
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
