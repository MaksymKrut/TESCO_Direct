package com.tesco.tescoDirect.checkOut.steps;



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

import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.AquaMarinePDPPagePO;
import com.tesco.tescoDirect.pageObjects.BasketDetailsPagePO;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.DvdCategoryPagePO;
import com.tesco.tescoDirect.pageObjects.HarryPotterDVDPDPPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2PinkPLPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftProtectiveShellPinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftTouchCasePinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.IpadPDPPagePO;
import com.tesco.tescoDirect.pageObjects.TescoMobileSimPDPPagePO;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(Checkout.class);
	private HomePagePO homePagePO;
	private TescoMobileSimPDPPagePO tescoMobileSimPDPPagePO;
	private BasketDetailsPagePO basketDetailsPagePO;
	private HarryPotterDVDPDPPagePO harryPotterDVDPDPPagePO;
	private CheckOutPagePO checkOutPagePO;
	private AboutYouPagePO aboutYouPagePO;
	private BasketPagePO basketPagePO;
	
	@Given("^I navigate to the checkout page after adding items to the basket$")
	public void I_navigate_to_the_checkout_page_after_adding_items_to_the_basket() throws Throwable {
		
		WC.getDriver().get(WC.getFullUrl("home_page"));
		WC.getDriver().navigate().refresh();
		WC.removeCookies();
		JavascriptExecutor js = (JavascriptExecutor) WC.getDriver();
		System.out.println(js.executeScript("return window.innerWidth"));
		System.out.println(js.executeScript("return window.innerHeight"));
	    
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		homePagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("574-7120");
		homePagePO.clickOnSearchButton();
		tescoMobileSimPDPPagePO = WC.getPageObject(TescoMobileSimPDPPagePO.class);
		tescoMobileSimPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO = WC.getPageObject(BasketDetailsPagePO.class);
		basketDetailsPagePO.clickOnContinueShoppingLink();
		tescoMobileSimPDPPagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		tescoMobileSimPDPPagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("M3E-C8KG");
		tescoMobileSimPDPPagePO.clickOnSearchButton();
		harryPotterDVDPDPPagePO = WC.getPageObject(HarryPotterDVDPDPPagePO.class);
		harryPotterDVDPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO.clickOnCheckOutButton();
		
	}
	
	@Given("^the top navigation Order tab is highlighted$")
	public void the_top_navigation_Order_tab_is_highlighted() throws Throwable {
		
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		Assert.assertTrue(checkOutPagePO.checkOrderTabIsHighlighted());
		
	}
	
	
	
	@Given("^the Basket tab is enabled and greyed out$")
	public void the_Basket_tab_is_enabled_and_greyed_out() throws Throwable {
		
		
		Assert.assertTrue(checkOutPagePO.checkBasketTabIsEnabledAndGreyedOut());
		
	}
	
	@Given("^the Thank you tab is disabled and greyed out$")
	public void the_Thank_you_tab_is_disabled_and_greyed_out() throws Throwable {
		
		
		Assert.assertTrue(checkOutPagePO.checkThankYouTabIsDisabledAndGreyedOut());
		
	}
	
	@Given("^the delivery method - Collection is selected by default$")
	public void the_delivery_method_Collection_is_selected_by_default() throws Throwable {
		
		
		Assert.assertTrue(checkOutPagePO.checkCollectionIsSelected());
		
	}
	
	@Given("^the delivery cost is displayed as Free$")
	public void the_delivery_cost_is_displayed_as_Free() throws Throwable {
		
		
		Assert.assertTrue(checkOutPagePO.checkDeliveryCostIsDisplayedAsFree());
		
	}
	
	@Then("^the following items are displayed$")
	public void the_following_elements_are_displayed(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "Item Image":
		    	result =checkOutPagePO.checkItemImageIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Item Image is displayed");
		    break;
		    case "Item quantity X Item Name":
		    	result = checkOutPagePO.checkItemQuantityXItemNameIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Item quantity X Item Name is displayed");
		    break;
		    case "Catalogue Number":
		    	result = checkOutPagePO.checkCatalogueNumberIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Catalogue Number is displayed");
		    break;
		    case "Sold by":
		    	result = checkOutPagePO.checkSoldbyIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Sold by is displayed");
		    break;
		    case "Item price":
		    	result = checkOutPagePO.checkItemPriceIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Item price is displayed");
		    break;
		    
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}
	
	@Then("^the following is displayed under delivery method - Collection$")
	public void the_following_is_displayed_under_delivery_method_Collection(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "Stores":
		    	result =checkOutPagePO.checkStoresIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Stores is displayed");
		    break;
		    case "three stores closest to the post code":
		    	result = checkOutPagePO.checkThreeClosestStoresAreDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("three stores closest to the post code is displayed");
		    break;
		    case "view more collection points with + sign":
		    	result = checkOutPagePO.checkViewMoreCollectionPointsIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("view more collection points with + sign is displayed");
		    break;
		    		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}
	
	@When("^I navigate to the checkout page after adding items to the basket as a logged in user$")
	public void I_navigate_to_the_checkout_page_after_adding_items_to_the_basket_as_a_logged_in_user(DataTable table) throws Throwable{
		
		
		WC.getDriver().get(WC.getFullUrl("home_page"));
		WC.getDriver().navigate().refresh();
		WC.removeCookies();
		JavascriptExecutor js = (JavascriptExecutor) WC.getDriver();
		System.out.println(js.executeScript("return window.innerWidth"));
		System.out.println(js.executeScript("return window.innerHeight"));
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnSigninorRegisterLink();
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		
		LOG.debug("I login with the following valid credentials");
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String userName = null;
			String password = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);
				userName = usrdetails.get("UserName");
				password = usrdetails.get("Password");
			}

			if (userName != null && password != null) {
				LOG.debug("User Name======>" + userName);
				LOG.debug("Password======>" + password);
				aboutYouPagePO.enterUserName(userName);
				aboutYouPagePO.enterPassword(password);
			}
			aboutYouPagePO.clickOnSignInButton();
		}

		catch (Exception ex)

		{
			LOG.error("Error in enterLoginDetails: ", ex);
		}
		
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		homePagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("574-7120");
		homePagePO.clickOnSearchButton();
		tescoMobileSimPDPPagePO = WC.getPageObject(TescoMobileSimPDPPagePO.class);
		tescoMobileSimPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO = WC.getPageObject(BasketDetailsPagePO.class);
		basketDetailsPagePO.clickOnContinueShoppingLink();
		tescoMobileSimPDPPagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		tescoMobileSimPDPPagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("M3E-C8KG");
		tescoMobileSimPDPPagePO.clickOnSearchButton();
		harryPotterDVDPDPPagePO = WC.getPageObject(HarryPotterDVDPDPPagePO.class);
		harryPotterDVDPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO.clickOnCheckOutButton();
		
	}
	
	@When("^I navigate to the checkout page after adding items to the basket as a newly registered user$")
	public void I_navigate_to_the_checkout_page_after_adding_items_to_the_basket_as_a_newly_registered_user() throws Throwable{
		
		
		WC.getDriver().get(WC.getFullUrl("home_page"));
		WC.getDriver().navigate().refresh();
		WC.removeCookies();
		JavascriptExecutor js = (JavascriptExecutor) WC.getDriver();
		System.out.println(js.executeScript("return window.innerWidth"));
		System.out.println(js.executeScript("return window.innerHeight"));
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnSigninorRegisterLink();
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		aboutYouPagePO.clickOnIamAnewCustomerRadioButton();
		aboutYouPagePO.selectingTitle();
		aboutYouPagePO.typingFirstName();
		aboutYouPagePO.typingLastNameTextBox();
		aboutYouPagePO.typingEmail();
		aboutYouPagePO.typingPostCode();
		aboutYouPagePO.selectingAddressFromDropDown();
		aboutYouPagePO.clickOnIDontHaveAclubcardCheckBox();
		aboutYouPagePO.clickOnRegFirstPageNextButton();
		aboutYouPagePO.typingPhoneNumber();
		aboutYouPagePO.typingPassword();
		aboutYouPagePO.typingConfirmPassword();
		aboutYouPagePO.ClickingOnAgreeAndTC();
		aboutYouPagePO.ClickingRegSecondPageNextButton();
		
		
		
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.checkUserisLoggedin();
		homePagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		homePagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("574-7120");
		homePagePO.clickOnSearchButton();
		tescoMobileSimPDPPagePO = WC.getPageObject(TescoMobileSimPDPPagePO.class);
		tescoMobileSimPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO = WC.getPageObject(BasketDetailsPagePO.class);
		basketDetailsPagePO.clickOnContinueShoppingLink();
		tescoMobileSimPDPPagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		tescoMobileSimPDPPagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("M3E-C8KG");
		tescoMobileSimPDPPagePO.clickOnSearchButton();
		harryPotterDVDPDPPagePO = WC.getPageObject(HarryPotterDVDPDPPagePO.class);
		harryPotterDVDPDPPagePO.clickOnAddToBasketButton();
		basketDetailsPagePO.clickOnCheckOutButton();
		
	}
	
	
	
	
	@Then("^the Pay now box should display the following$")
	public void the_Pay_now_box_should_display_the_following(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "subtotal":
		    	result =checkOutPagePO.checkSubTotalIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("subtotal is displayed");
		    break;
		    case "total to pay":
		    	result = checkOutPagePO.checkTotalToPayIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("total to pay is displayed");
		    break;
		    case "Clubcard points":
		    	result = checkOutPagePO.checkClubcardPointsIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Clubcard points is displayed");
		    break;
		   
		    
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}
	
	@Then("^Collection details with following information is displayed$")
	public void Collection_details_with_following_information_is_displayed(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "Name":
		    	result =checkOutPagePO.checkNameIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Name is displayed");
		    break;
		    case "phone number":
		    	result = checkOutPagePO.checkPhoneNumberIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("phone number is displayed");
		    break;
		    case "Selected store name":
		    	result = checkOutPagePO.checkSelectedStoreNameIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Selected store name is displayed");
		    break;
		    case "message to show when the item can be collected":
		    	result = checkOutPagePO.checkItemCollectionDateAndTimeIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("message to show when the item can be collected is displayed");
		    break;
		    case "message to inform the customer that email would be sent and proof ID is required to be shown while collection":
		    	result = checkOutPagePO.checkItemCollectionInformationIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("message to inform the customer that email would be sent and proof ID is required to be shown while collection is displayed");
		    break;
		    case "price for collection as Free":
		    	result = checkOutPagePO.checkDeliveryCostIsDisplayedAsFree();
		    	Assert.assertTrue(result);
		    	LOG.debug("price for collection as Free");
		    break;
		   
		    
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}
	
	@Then("^the payment card details with the following is displayed$")
	public void the_payment_card_details_with_the_following_is_displayed(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "name on card":
		    	result =checkOutPagePO.checkNameOnCardTextBoxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("name on card is displayed");
		    break;
		    case "card number":
		    	result = checkOutPagePO.checkCardNumberTextBoxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("card number is displayed");
		    break;
		    case "expiry date":
		    	result = checkOutPagePO.checkExpiryDateDropDownIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("expiry date is displayed");
		    break;
		    case "security code":
		    	result = checkOutPagePO.checkSecurityCodeTextBoxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("security code is displayed");
		    break;
		    case "Billing address":
		    	result = checkOutPagePO.checkBillingAddressIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Billing address is displayed");
		    break;
		    
		   
		    
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}
	
	@Then("^e-wallet section displays the following$")
	public void ewallet_section_displays_the_following(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "add clubcard vouchers":
		    	result =checkOutPagePO.checkAddClubcardVouchersIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("add clubcard vouchers is displayed");
		    break;
		    case "add e-coupons":
		    	result = checkOutPagePO.checkAddEcouponsIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("add e-coupons is displayed");
		    break;
		    case "pay with a gift card":
		    	result = checkOutPagePO.checkPayWithAGiftCardIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("pay with a gift card is displayed");
		    break;
		    
		    
		   
		    
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}
	
	
	
	
	
	
	@Given("^I clear all the items in the basket$")
	public void I_clear_all_the_items_in_the_basket() throws Throwable {
		
		checkOutPagePO.clickOnBasketTab();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.clickingOnEmptyBasketButton();
		
		
	}
	
	@Given("^I register at the checkout page$")
	public void I_register_at_the_checkout_page() throws Throwable {
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.clickOnIamAnewCustomerRadioButton();
		checkOutPagePO.selectingTitle();
		checkOutPagePO.typingFirstName();
		checkOutPagePO.typingLastNameTextBox();
		checkOutPagePO.typingEmail();
		checkOutPagePO.typingPostCode();
		checkOutPagePO.selectingAddressFromDropDown();
		checkOutPagePO.clickOnIDontHaveAclubcardCheckBox();
		checkOutPagePO.clickOnRegFirstPageNextButton();
		checkOutPagePO.typingPhoneNumber();
		checkOutPagePO.typingPassword();
		checkOutPagePO.typingConfirmPassword();
		checkOutPagePO.ClickingOnAgreeAndTC();
		checkOutPagePO.ClickingRegSecondPageNextButton();
		checkOutPagePO.waitForRegistrationToComplete();
		
		
	}
	
	@Given("^I login at the checkout page$")
	public void I_login_at_the_checkout_page(DataTable table) throws Throwable {
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String userName = null;
			String password = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);
				userName = usrdetails.get("UserName");
				password = usrdetails.get("Password");
			}

			if (userName != null && password != null) {
				LOG.debug("User Name======>" + userName);
				LOG.debug("Password======>" + password);
				checkOutPagePO.enterUserName(userName);
				checkOutPagePO.enterPassword(password);
			}
			checkOutPagePO.clickOnSignInButton();
		}

		catch (Exception ex)

		{
			LOG.error("Error in enterLoginDetails: ", ex);
		}
		checkOutPagePO.waitForLoginToComplete();
		
		
	}
	
	@Given("^I SignOut$")
	public void I_logout() {
		
		basketPagePO.clickOnSignOutLink();
		
	}
	
	@Given("^the radio button of only the first store is selected$")
	public void the_radio_button_of_only_the_first_store_is_selected() {
		
		Assert.assertTrue(checkOutPagePO.checkOnlyFirstStoreRadioButtonIsSelected());
		
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
