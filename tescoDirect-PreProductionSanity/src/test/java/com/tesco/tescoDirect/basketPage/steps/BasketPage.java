package com.tesco.tescoDirect.basketPage.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketPage {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(BasketPage.class);
	private BasketPagePO basketPagePO;
	private GlobalHeaderPO globalHeaderPO;
	private GlobalFooterPO globalFooterPO;

	@Then("^I check for the following header elements in basket page$")
	public void Icheckforthefollowingheaderelementsinbasketpage(DataTable table) {
		globalHeaderPO = WC.getPageObject(GlobalHeaderPO.class);
		LOG.debug("I check for the following header elements in basket page");
		globalHeaderPO.checkingforBasketPageHeaderLinks();

	}

	@And("^I verify that standard TESCO footer is displayed at the bottom of the page$")
	public void I_verify_that_standard_TESCO_footer_is_displayed_at_the_bottom_of_the_page() {
		globalFooterPO = WC.getPageObject(GlobalFooterPO.class);
		LOG.debug("I verify that standard TESCO footer is displayed at the bottom of the page");
		globalFooterPO.checkingGlobalFooter();
	}

	@And("^I check for the following in Basket Summary$")
	public void I_check_for_the_following_in_Basket_Summary(DataTable arg1) {
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		LOG.debug("I check for the following in Basket Summary");
		basketPagePO.checkingBasketSummaryItemsInBP();
	}

	@And("^I check for the following message under the Continue to checkout button$")
	public void I_check_for_the_following_message_under_the_Continue_to_checkout_button(
			DataTable table) {
		LOG.debug("I check for the following  message under the Continue to checkout button");
		basketPagePO.checkingmessageundertheContinuetocheckoutbutton();
	}

	@Then("^I check for the Continue to shopping button exists under the title Not ready to checkout$")
	public void I_check_for_the_Continue_to_shopping_button_exists_under_the_title_Not_ready_to_checkout() {
		LOG.debug("I check for the Continue to shopping button exists under the title  Not ready to checkout");
		basketPagePO.checkingContinuetoshoppingbuttonexists();
	}

	@And("^I check for the following message in the Basket Page$")
	public void I_check_for_the_following_message_in_the_Basket_Page(
			DataTable table) {
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		LOG.debug("I check for the following message in the Basket Page");
		basketPagePO.checkingForMessageinBasketPage();
	}

	@And("^I check for the following details in the Basket Page$")
	public void I_check_for_the_following_details_in_the_Basket_Page(
			DataTable table) {
		LOG.debug("I check for the following details in the Basket Page");
		basketPagePO.checkingForbuttonsInyourBasket();
	}

	@And("^I check for the following header items in Your basket$")
	public void I_check_for_the_following_header_items_in_Your_basket(
			DataTable table) {
		LOG.debug("I check for the following header items in Your basket");
		basketPagePO.checkingForheaderItemsInyourBasket();
	}

	@And("^I check for the following items under the each product in Your basket$")
	public void I_check_for_the_following_items_under_the_each_product_in_Your_basket(
			DataTable table) {
		LOG.debug("I check for the following  items under the each product in Your basket");
		basketPagePO.checkingitemsundertheeachproductinYourbasket();
	}

	@And("^I check for the following links exists under quanity box for a product$")
	public void I_check_for_the_following_link_s_exists_under_quanity_box_for_a_product(
			DataTable table) {
		LOG.debug("I check for the following  link s exists under quanity box for a product");
		basketPagePO.checkinglinksexistsunderquanityboxforaproduct();
	}

	@When("^I verify details of the service product to basket are displayed correctly$")
	public void I_verify_details_of_the_service_product_to_basket_are_displayed_correctly() {
		LOG.debug("I verify details of the service product to basket are displayed correctly");
		basketPagePO.checkingdetailsoftheserviceproduct();
	}

	@And("^I verify save for later link doesn't exists for service product$")
	public void I_verify_save_for_later_link_doesn_t_exists_for_service_product() {
		LOG.debug("I verify  save for later link doesn't exists for service product");
		basketPagePO.verifyTheSaveforLinkdoesnotWExistsInServiceProductModule();
	}

	@Then("^I check for the Empty basket button exists at the bottom of Your basket box$")
	public void I_check_for_the_Empty_basket_button_exists_at_the_bottom_of_Your_basket_box() {
		LOG.debug("I check for the Empty basket button exists at the bottom of Your basket box");
		basketPagePO.verifyEmptyBasketButtonExistsUnderYourBasketBox();
	}

	@When("^I verify that products are displayed correctly under Items saved for later section$")
	public void I_verify_that_products_are_displayed_correctly_under_Items_saved_for_later_section() {
		LOG.debug("I verify that products are displayed correctly under Items saved for later section");
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.CheckingItemsSavedForLaterProducts();
	}

	@And("^I check for the following under each product for Items saved for later section$")
	public void I_check_for_the_following_under_each_product_for_Items_saved_for_later_section(
			DataTable table) {
		LOG.debug("I check for the following  under each product for Items saved for later section");
		basketPagePO.CheckingItemsSavedForLaterProductsItems();
	}

	@And("^I verify that move to basket button exists for the each item in the list$")
	public void I_verify_that_move_to_basket_button_exists_for_the_each_item_in_the_list() {
		LOG.debug("I verify that move to basket button exists for the each item in the list");
		basketPagePO.CheckingItemsSavedForLaterMoveToBasketButton();
	}

	@And("^I verify that X icon exists for each product in the list to remove from the list$")
	public void I_verify_that_X_icon_exists_for_each_product_in_the_list_to_remove_from_the_list() {
		LOG.debug("I verify that  X icon exists for each product in the list to remove from the list");
		basketPagePO.CheckingItemsSavedForLaterXButton();
	}

	@Then("^I check for the show all button exists at the bottom of the Items saved for later section$")
	public void I_check_for_the_show_all_button_exists_at_the_bottom_of_the_Items_saved_for_later_section() {
		LOG.debug("I check for the show all button exists at the bottom of the Items saved for later section");
		basketPagePO.CheckingItemsSavedForLaterShowallButton();
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
