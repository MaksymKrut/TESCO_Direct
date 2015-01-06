package com.tesco.tescoDirect.basketPage.steps;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.checkOutPage.steps.CheckOutPage;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketAttachmentPage {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger
			.getLogger(BasketAttachmentPage.class);
	private BasketPagePO basketPagePO;
	private GlobalHeaderPO globalHeaderPO;
	private GlobalFooterPO globalFooterPO;

	@And("^I check for the following message in the Basket Attachment Page$")
	public void I_check_for_the_following_message_in_the_Basket_Attachment_Page(
			DataTable table) {
		LOG.debug("I check for the following message in the Basket Attachment Page");
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.checkingTitleinBasketAttachementPage();
	}

	@Then("^I check for the following details in the product module for BA page$")
	public void I_check_for_the_following_details_in_the_product_module_for_BA_page(
			DataTable table) {
		LOG.debug("I check for the following details in the product module for BA page");
		basketPagePO.checkingtheProductModuleitemsInBAPage();
	}

	@And("^I check for the following details in the right hand side of product description$")
	public void I_check_for_the_following_details_in_the_right_hand_side_of_product_description(
			DataTable table) {
		LOG.debug("I check for the following details in the right hand side of product description");
		basketPagePO.checkingtheBasketSummaryitemsInBAPage();
	}

	@Then("^I verify the following is dispalyed above View basket and checkout button$")
	public void I_verify_the_following_is_dispalyed_above_View_basket_and_checkout_button(
			DataTable table) {
		LOG.debug("I verify the following is dispalyed above View basket and checkout button");
		basketPagePO.checkingBasketSummaryNoticeMessage();
	}

	@And("^I verify carsoul naviagation arrows works correctly$")
	public void I_verify_carsoul_naviagation_arrows_works_correctly() {
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		LOG.debug("I verify carsoul naviagation arrows works correctly");
		basketPagePO.checkingcarsoulnaviagationarrowsworks();
	}

	@Then("^I check for the carsoul items are displayed in the recommendation block$")
	public void I_check_for_the_carsoul_items_are_displayed_in_the_recommendation_block() {
		LOG.debug("I check for the carsoul items are displayed in the recommendation block");
		basketPagePO.checkingcarsoulitemsaredisplayedintherecommendationblock();
	}

	@And("^I verify carsoul naviagation arrows works correctly for similar customers have view block$")
	public void I_verify_carsoul_naviagation_arrows_works_correctly_for_similar_customers_have_view_block() {
		LOG.debug("I verify carsoul naviagation arrows works correctly for similar customers have view block");
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.checkingTrendingcarsoulnaviagationarrowsworks();

	}

	@Then("^I check for the carsoul items are displayed for similar customers have view block$")
	public void I_check_for_the_carsoul_items_are_displayed_for_similar_customers_have_view_block() {
		LOG.debug("I check for the carsoul items are displayed for similar customers have view block");
		basketPagePO
				.checkingTrendingcarsoulitemsaredisplayedintheSimilarCustomerViewblock();
	}

	@When("^I verify carsoul naviagation arrows works correctly for Items you have recently viewed block$")
	public void I_verify_carsoul_naviagation_arrows_works_correctly_for_Items_you_have_recently_viewed() {
		LOG.debug("I verify carsoul naviagation arrows works correctly for Items you have recently viewed block");
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.checkingRecentlyViewedcarsoulnaviagationarrowsworks();
	}

	@And("^I check for the following items working for Items you have recently viewed block$")
	public void I_check_for_the_following_items_working_for_Items_you_have_recently_viewed(
			DataTable table) {
		LOG.debug("I check for the following items working for Items you have recently viewed block");
		basketPagePO.checkingRecentlyViewedbuttonsworks();
	}

	@Then("^I check for the carsoul items are displayed for Items you have recently viewed block$")
	public void I_check_for_the_carsoul_items_are_displayed_for_Items_you_have_recently_viewed() {
		LOG.debug("I check for the carsoul items are displayed for Items you have recently viewed block");
		basketPagePO
				.checkingRecentlyViewedcarsoulitemsaredisplayedintheSimilarCustomerViewblock();
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
