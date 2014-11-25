package com.tesco.tescoDirect.placingOrder.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.checkOutPage.steps.CheckOutPage;
import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.MyAccountPO;
import com.tesco.tescoDirect.pageObjects.MyOrdersPO;
import com.tesco.tescoDirect.pageObjects.OrderConfirmationPagePO;
import com.tesco.tescoDirect.pageObjects.SearchResultsPO;
import com.tesco.tescoDirect.pageObjects.StreamlineBasketPO;
import com.tesco.tescoDirect.plp.steps.PLP;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlacingOrder {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(PlacingOrder.class);
	private SearchResultsPO searchResultsPO;
	private StreamlineBasketPO streamlineBasketPO;
	private HomePagePO homePagePO;
	private BasketPagePO basketPagePO;
	private CheckOutPage checkOutPage = new CheckOutPage();
	private AboutYouPagePO aboutYouPagePO;
	private CheckOutPagePO checkOutPagePO;
	private OrderConfirmationPagePO orderConfirmationPagePO;
	private  MyAccountPO myAccountPO;
	private  MyOrdersPO myOrdersPO;

	@Then("^the PDP page should be displayed showing the product matching the keyword$")
	public void the_PDP_page_should_be_displayed_showing_the_product_matching_the_keyword() throws Throwable {
		LOG.debug("the PDP page should be displayed showing the product matching the keyword");
	}

	@When("^I click on PDP page Add to Basket button$")
	public void I_click_on_PDP_page_Add_to_Basket_button() throws Throwable {
		LOG.debug("I click on PDP page Add to Basket button");
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.clickOnPDPAddToBasketButton();
	}

	@When("^I update the Quantity in basket page$")
	public void I_update_the_Quantity_in_basket_page() throws Throwable {
		LOG.debug("I update the Quantity in basket page");
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.updatingAndContinueTocheckout();
	}

	@And("^I click on Continue to checkout button$")
	public void I_click_on_Continue_to_checkout_button() throws Throwable {
		LOG.debug("I click on Continue to checkout button");
	}

	@And("^I click on View Basket button to empty the basket items$")
	public void I_click_on_View_Basket_button_to_empty_the_basket_items() throws Throwable {
		LOG.debug("I click on View Basket button to empty the basket items");
		WC.wait(2);
		checkOutPage.I_navigate_to_TESCO_direct("home_page");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnViewBasketButton();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.clickingOnEmptyBasketButton();
	}

	@When("^I enter my gift card details to pay for the product$")
	public void I_enter_my_gift_card_details_to_pay_for_the_product() throws Throwable {
		LOG.debug("I enter my gift card details to pay for the product");
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.payWithGiftCard();
	}

	@Then("^user should be displayed the following message$")
	public void user_should_be_displayed_the_following_message(DataTable table) throws Throwable {
		LOG.debug("user should be displayed the following message");
		orderConfirmationPagePO = WC.getPageObject(OrderConfirmationPagePO.class);
		orderConfirmationPagePO.verifyYourOrderHasBeenConfirmedMessage();
		orderConfirmationPagePO.ClickingOnMyAccount();
		myAccountPO= WC.getPageObject(MyAccountPO.class);
		myAccountPO.clickingOnViewDirectOrdersbutton();
		myOrdersPO= WC.getPageObject(MyOrdersPO.class);
		myOrdersPO.CancelOrder();
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSignOutLink();
	}

	@When("^I enter my user details$")
	public void I_enter_my_user_details() throws Throwable {
		LOG.debug("I enter my user details");
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		aboutYouPagePO.enterUserName("testaccount@tescodirect.com");
		aboutYouPagePO.enterPassword("Password2");
		aboutYouPagePO.clickOnSignInButton();
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
