package com.tesco.tescoDirect.plp.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.checkOutPage.steps.CheckOutPage;
import com.tesco.tescoDirect.login.steps.Login;
import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.MyAccountPO;
import com.tesco.tescoDirect.pageObjects.MyOrdersPO;
import com.tesco.tescoDirect.pageObjects.OrderConfirmationPagePO;
import com.tesco.tescoDirect.pageObjects.SearchResultsPO;
import com.tesco.tescoDirect.pageObjects.StreamlineBasketPO;
import com.tesco.tescoDirect.registration.steps.Registration;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PLP {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(PLP.class);
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
	
	@When("^user types in \"([^\"]*)\" in the search and browse text$")
	public void user_types_in_in_the_search_and_browse_text(String product)
			throws Throwable {
		LOG.debug("user types in" + product + "in the search and browse text");
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch(product);
	}

	@Then("^the PLP page should be displayed showing the no of products matching the keyword Hudl$")
	public void the_PLP_page_should_be_displayed_showing_the_no_of_products_matching_the_keyword_Hudl()
			throws Throwable {
		LOG.debug("the PLP page should be displayed showing the no of products matching the keyword Hudl");
		searchResultsPO.checkingforMatchingProductsinSearchResultPage();
	}

	@And("^View by category filter should be displayed with different categories and number of products available per category$")
	public void View_by_category_filter_should_be_displayed_with_different_categories_and_number_of_products_available_per_category()
			throws Throwable {
		LOG.debug("View by category filter should be displayed with different categories and number of products available per category");
		searchResultsPO.checkingforViewByCategory();
	}

	@And("^Refine By - Clear all button should be disabled$")
	public void Refine_By_Clear_all_button_should_be_disabled()
			throws Throwable {
		LOG.debug("Refine By - Clear all button should be disabled");
		searchResultsPO.RefineByClearAllButton();
	}

	@And("^Price filter should be displayed with different price ranges and number of products available within each range$")
	public void Price_filter_should_be_displayed_with_different_price_ranges_and_number_of_products_available_within_each_range()
			throws Throwable {
		LOG.debug("Price filter should be displayed with different price ranges and number of products available within each range");
	}

	@And("^Add to basket button should be displayed under every product$")
	public void Add_to_basket_button_should_be_displayed_under_every_product()
			throws Throwable {
		LOG.debug("Add to basket button should be displayed under every product$");
		searchResultsPO.checkingForAddtoBasketButton();
	}

	@When("^user scrolls down to the very bottom of the loaded page$")
	public void user_scrolls_down_to_the_very_bottom_of_the_loaded_page()
			throws Throwable {
		LOG.debug("user scrolls down to the very bottom of the loaded page");
		searchResultsPO.scrollDownTobottomOfpage();
	}

	@Then("^there should be an option to view more products under the same category/search criteria$")
	public void there_should_be_an_option_to_view_more_products_under_the_same_category_search_criteria()
			throws Throwable {
		LOG.debug("there should be an option to view more products under the same category/search criteria");
		searchResultsPO.checkingForViewMoreProductsButton();
	}

	@When("^user clicks on View more products button$")
	public void user_clicks_on_View_more_products_button() throws Throwable {
		LOG.debug("user clicks on View more products button");
		searchResultsPO.clickViewMoreProductsButton();
	}

	@Then("^more products should be loaded on the same page$")
	public void more_products_should_be_loaded_on_the_same_page()
			throws Throwable {
		LOG.debug("more products should be loaded on the same page");
		searchResultsPO.checkingForMoreProducts();
	}

	@Then("^every product should display the product image$")
	public void every_product_should_display_the_product_image()
			throws Throwable {
		LOG.debug("every product should display the product image");
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.verifyingProductImage();
	}

	@Then("^display the product title$")
	public void display_the_product_title() throws Throwable {
		LOG.debug("display the product title");
		searchResultsPO.verifyingProductTitle();
	}

	@Then("^display the rating star with number of ratings$")
	public void display_the_rating_star_with_number_of_ratings()
			throws Throwable {
		LOG.debug("display the rating star with number of ratings");
		searchResultsPO.verifyingRatingStar();
	}

	@Then("^display seller information$")
	public void display_seller_information() throws Throwable {
		LOG.debug("display seller information");
		searchResultsPO.verifyingSellerInformation();
	}

	@Then("^should either display Add to Basket or Request Stock Alert or Pre-order or Select options$")
	public void should_either_display_or_or_or() throws Throwable {
		LOG.debug("should either display Add to Basket or Request Stock Alert or Pre-order or Select options");
		searchResultsPO.checkingForAddtoBasketButton();
		searchResultsPO.verifyingSelectOptions();
	}

	@Then("^on LLVP and LVP should display Add to Compare check box$")
	public void on_LLVP_and_LVP_should_display_check_box() throws Throwable {
		LOG.debug("on LLVP and LVP should display Add to Compare check box");
		searchResultsPO.verifyingAddToCompareCheckBoxInLVP();
	}

	@When("^user applies the Price filter$")
	public void user_applies_the_Price_filter() throws Throwable {
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		LOG.debug("user applies the Price filter");
		searchResultsPO.userappliesthePricefilter();

	}

	@Then("^products should be displayed within the price as applied$")
	public void products_should_be_displayed_within_the_price_as_applied()
			throws Throwable {
		LOG.debug("products should be displayed within the price as applied");
		searchResultsPO.checkingForProductsWithIntheRange();
	}

	@When("^user clicks on sort by Best Sellers$")
	public void user_clicks_on_sort_by_Best_Sellers() throws Throwable {
		LOG.debug("user clicks on sort by Best Sellers");
		searchResultsPO.clickingONsortByFilter();
	}

	@Then("^products should be displayed based on the selection$")
	public void products_should_be_displayed_based_on_the_selection()
			throws Throwable {
		LOG.debug("products should be displayed based on the selection");
		searchResultsPO.checkingForProductsWithIntheRangeForBest();
		//searchResultsPO.clickingOnClearAllButton();
	}

	@When("^user selects view by category and clicks on a particular category$")
	public void user_selects_view_by_category_and_clicks_on_a_particular_category()
			throws Throwable {
		LOG.debug("user selects view by category and clicks on a particular category");
		searchResultsPO.clickingviewbycategory();
	}

	@Then("^the number of items displayed should match the number displayed under that category when the page was first loaded$")
	public void the_number_of_items_displayed_should_match_the_number_displayed_under_that_category_when_the_page_was_first_loaded()
			throws Throwable {
		LOG.debug("the number of items displayed should match the number displayed under that category when the page was first loaded");
	}

	@When("^user clicks on any preceeding bread crumb$")
	public void user_clicks_on_any_preceeding_bread_crumb() throws Throwable {
		LOG.debug("user clicks on any preceeding bread crumb");
		searchResultsPO.clickingONBreadCrumb();
	}

	@Then("^the user should be navigated to the respective page$")
	public void the_user_should_be_navigated_to_the_respective_page()
			throws Throwable {
		LOG.debug("the user should be navigated to the respective page");
		searchResultsPO.checkingForBreadCrumbNavigatedPage();
	}

	@When("^new products have been added to the same category$")
	public void new_products_have_been_added_to_the_same_category()
			throws Throwable {
		LOG.debug("new products have been added to the same category");
		searchResultsPO.clickingONNewProducts();
	}

	@Then("^I'm new ping image should be displayed along with the product image$")
	public void I_m_new_ping_image_should_be_displayed_along_with_the_product_image()
			throws Throwable {
		LOG.debug("I'm new ping image should be displayed along with the product image");
		searchResultsPO.checkingForImNewPingImage();
	}

	@When("^boost items are selected in the search criteria \\(e.g. HUDL\\)$")
	public void boost_items_are_selected_in_the_search_criteria_e_g_HUDL()
			throws Throwable {
		LOG.debug("boost items are selected in the search criteria (e.g. HUDL)");
		searchResultsPO.SearchingForBoostItems();
	}

	@Then("Clubcard Boost image should be displayed along with the product image$")
	public void image_should_be_displayed_along_with_the_product_image()
			throws Throwable {
		LOG.debug("Clubcard Boost image should be displayed along with the product image");
		searchResultsPO.CheckingForClubCardBoostImage();
	}

	@When("^user clicks on Add to Basket on any item$")
	public void user_clicks_on_Add_to_Basket_on_any_item() throws Throwable {
		LOG.debug("user clicks on Add to Basket on any item");
		searchResultsPO.clickOnAddtoBasketButton();
	}

	@Then("^user should be displayed the Streamline Basket overlay$")
	public void user_should_be_displayed_the_Streamline_Basket_overlay()
			throws Throwable {
		LOG.debug("user should be displayed the Streamline Basket overlay");
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.checkingForStreamLineBasketOverlay();
	}
//And I click on Continue to checkout button on the Stream line overlay
	
	
	@And("^the item added should be displayed with message 1 item added to Basket$")
	public void the_item_added_shoudl_be_displayed_with_message()
			throws Throwable {
		LOG.debug("the item added should be displayed with message 1 item added to Basket");
		streamlineBasketPO.checkingForOneItemAddedToBasket();
	}

	@And("^should display number of items in the basket$")
	public void should_display_number_of_items_in_the_basket() throws Throwable {
		LOG.debug("should display number of items in the basket");
		streamlineBasketPO.checkingForNumberofItemsinBasket();
	}

	@And("^should display subtotal, clubcard points earned and Basket total$")
	public void should_display_subtotal_clubcard_points_earned_and_Basket_total()
			throws Throwable {
		LOG.debug("should display subtotal, clubcard points earned and Basket total");
		streamlineBasketPO.checkingForSubtotal();
	}

	@And("^should display items related to your basket block$")
	public void should_display_items_related_to_your_basket_block()
			throws Throwable {
		LOG.debug("should display items related to your basket block");
		streamlineBasketPO.checkingForItemsrelatedtoyourbasketblock();
	}

	@And("^should display Customers with similar interests also viewed block$")
	public void should_display_Customers_with_similar_interests_also_viewed_block()
			throws Throwable {
		LOG.debug("should display Customers with similar interests also viewed block");
		streamlineBasketPO
				.checkingForCustomerswithsimilarinterestsalsoviewedblock();
	}

	@When("^user clicks on View Basket on the Stream line Overlay$")
	public void user_clicks_on_View_Basket_on_the_Stream_line_Overlay()
			throws Throwable {
		LOG.debug("user clicks on View Basket on the Stream line Overlay");
		streamlineBasketPO.clickingOnViewBasketButton();
	}

	@Then("^user should be redircted to the basket details page$")
	public void user_should_be_redircted_to_the_basket_details_page()
			throws Throwable {
		LOG.debug("user should be redircted to the basket details page");
		streamlineBasketPO.CheckingForBasketDetailPage();
	}

	@When("^user clicks Checkout on the Stream line overlay$")
	public void user_clicks_Checkout_on_the_Stream_line_overlay()
			throws Throwable {
		LOG.debug("user clicks Checkout on the Stream line overlay");
		streamlineBasketPO.clickingOnCheckoutButton();
	}


	@When("^I click on Continue to checkout button on the Stream line overlay$")
	public void IclickonContinuetocheckoutbuttonontheStreamlineoverlay()
			throws Throwable {
		LOG.debug("I click on Continue to checkout button on the Stream line overlay");
		streamlineBasketPO.clickingOnCheckoutButtonEE();
	}
	
	@Then("^user should be taken to checkout page$")
	public void user_should_be_taken_to_checkout_page() throws Throwable {
		LOG.debug("user should be taken to checkout page");
		streamlineBasketPO.CheckingForSecurecheckoutPage();
	}

	@When("^user clicks on continue shopping link in the stream line overlay$")
	public void user_clicks_on_continue_shopping_link_in_the_stream_line_overlay()
			throws Throwable {
		LOG.debug("user clicks on continue shopping link in the stream line overlay");
		streamlineBasketPO.clickingOnContinueShoppingLink();
	}

	@Then("^user should be redirected to the PLP page from where the overlay was launched$")
	public void user_should_be_redirected_to_the_PLP_page_from_where_the_overlay_was_launched()
			throws Throwable {
		LOG.debug("user should be redirected to the PLP page from where the overlay was launched");
		streamlineBasketPO.CheckingForResultsPage();
		/*homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnViewBasketButton();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.clickingOnEmptyBasketButton();*/

	}

	@Given("^I place an order as a Registered User$")
	public void registeredUser() throws Throwable {
		LOG.debug("I have an item In basket");
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("ipad");
		searchResultsPO.userappliesthePricefilter();
		searchResultsPO.checkingForProductsWithIntheRange();
		searchResultsPO.clickOnAddtoBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.checkingForStreamLineBasketOverlay();
		streamlineBasketPO.clickingOnContinueShoppingLinkEE();
		streamlineBasketPO.CheckingForResultsPage();
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		
		searchResultsPO.typetoSearch("207-3764");
		searchResultsPO.clickOnPDPAddToBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.clickingOnViewBasketButtonEE();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.updatingAndContinueTocheckout();
		streamlineBasketPO.CheckingForSecurecheckoutPage();
		WC.wait(5);
		checkOutPage.I_navigate_to_TESCO_direct("home_page");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnViewBasketButton();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.clickingOnEmptyBasketButton();
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("574-7120");
		searchResultsPO.clickOnPDPAddToBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.clickingOnCheckoutButtonEE();
		streamlineBasketPO.CheckingForSecurecheckoutPage();
		PayWithGiftCardAndCancelOrder();
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSignOutLink();
	}
	@Given("^I place an order as a anonymous User$")
	public void anonymousUser() throws Throwable {
		LOG.debug("I have an item In basket");
		checkOutPage.I_navigate_to_TESCO_direct("home_page");
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("ipad");
		searchResultsPO.userappliesthePricefilter();
		searchResultsPO.checkingForProductsWithIntheRange();
		searchResultsPO.clickOnAddtoBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.checkingForStreamLineBasketOverlay();
		streamlineBasketPO.clickingOnContinueShoppingLinkEE();
		streamlineBasketPO.CheckingForResultsPage();
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("207-3764");
		searchResultsPO.clickOnPDPAddToBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.clickingOnViewBasketButtonEE();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.updatingAndContinueTocheckout();
		streamlineBasketPO.CheckingForSecurecheckoutPage();
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		aboutYouPagePO.enterUserName("testaccount@tescodirect.com");
		aboutYouPagePO.enterPassword("Password1");
		aboutYouPagePO.clickOnSignInButton();
		WC.wait(10);
		checkOutPage.I_navigate_to_TESCO_direct("home_page");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnViewBasketButton();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.clickingOnEmptyBasketButton();
		
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("574-7120");
		searchResultsPO.clickOnPDPAddToBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.clickingOnCheckoutButtonEE();
		streamlineBasketPO.CheckingForSecurecheckoutPage();
		
	/*	aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		aboutYouPagePO.enterUserName("testaccount@tescodirect.com");
		aboutYouPagePO.enterPassword("Password1");
		aboutYouPagePO.clickOnSignInButton();
		WC.wait(5);*/
		
		PayWithGiftCardAndCancelOrder();
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSignOutLink();
	}
	@Given("^I place an order as a New User$")
	public void NewUser() throws Throwable {
		LOG.debug("I have an item In basket");
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("ipad");
		searchResultsPO.userappliesthePricefilter();
		searchResultsPO.checkingForProductsWithIntheRange();
		searchResultsPO.clickOnAddtoBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.checkingForStreamLineBasketOverlay();
		streamlineBasketPO.clickingOnContinueShoppingLinkEE();
		streamlineBasketPO.CheckingForResultsPage();
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("207-3764");
		searchResultsPO.clickOnPDPAddToBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.clickingOnViewBasketButtonEE();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.updatingAndContinueTocheckout();
		streamlineBasketPO.CheckingForSecurecheckoutPage();
		checkOutPage.I_navigate_to_TESCO_direct("home_page");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnViewBasketButton();
		basketPagePO = WC.getPageObject(BasketPagePO.class);
		basketPagePO.clickingOnEmptyBasketButton();
		searchResultsPO = WC.getPageObject(SearchResultsPO.class);
		searchResultsPO.typetoSearch("574-7120");
		searchResultsPO.clickOnPDPAddToBasketButton();
		streamlineBasketPO = WC.getPageObject(StreamlineBasketPO.class);
		streamlineBasketPO.clickingOnCheckoutButtonEE();
		streamlineBasketPO.CheckingForSecurecheckoutPage();
		PayWithGiftCardAndCancelOrder();
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSignOutLink();
	}
	
	public void PayWithGiftCardAndCancelOrder()
	{
		checkOutPagePO = WC.getPageObject(CheckOutPagePO.class);
		checkOutPagePO.payWithGiftCard();
		orderConfirmationPagePO = WC.getPageObject(OrderConfirmationPagePO.class);
		orderConfirmationPagePO.verifyYourOrderHasBeenConfirmedMessage();
		orderConfirmationPagePO.ClickingOnMyAccount();
		myAccountPO= WC.getPageObject(MyAccountPO.class);
		myAccountPO.clickingOnViewDirectOrdersbutton();
		myOrdersPO= WC.getPageObject(MyOrdersPO.class);
		myOrdersPO.CancelOrder();
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
