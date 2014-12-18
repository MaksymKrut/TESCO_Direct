package com.tesco.tescoDirect.PDP.steps;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.AquaMarinePDPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftTouchCasePinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.IpadPDPPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PDP {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(PDP.class);
	private HomePagePO homePagePO;
	private IpadPDPPagePO ipadPDPPagePO;
	private Hudl2SoftTouchCasePinkPDPPagePO hudl2SoftTouchCasePinkPDPPagePO;
	

	@And("^I goto the iPad PDP page$")
	public void I_goto_the_iPad_PDP_page() throws Throwable {
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		homePagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("482-2411");
		homePagePO.clickOnSearchButton();
		/*ipadPLPPagePO = WC.getPageObject(IpadPLPPagePO.class);
		ipadPLPPagePO.clickOnIpadLink();*/
		LOG.debug("I goto the iPad PDP page");
	}

	@Then("^the following elements are displayed$")
	public void the_following_elements_are_displayed(DataTable table) throws Throwable {
		ipadPDPPagePO = WC.getPageObject(IpadPDPPagePO.class);
		hudl2SoftTouchCasePinkPDPPagePO = WC.getPageObject(Hudl2SoftTouchCasePinkPDPPagePO.class);
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "Breadcrumbs of the product":
		    	result =ipadPDPPagePO.checkBreadcrumbsOfTheProductIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Breadcrumbs of the product is displayed");
		    break;
		    case "Product Title":
		    	result = ipadPDPPagePO.checkProductTitleIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product Title is displayed");
		    break;
		    case "Product image":
		    	result = ipadPDPPagePO.checkProductImageIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product image is displayed");
		    break;
		    case "Product Catalogue Number":
		    	result = ipadPDPPagePO.checkProductCatalogueNumberIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product Catalogue Number is displayed");
		    break;
		    case "Product Star Rating":
		    	result = ipadPDPPagePO.checkProductStarRatingIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product Star Rating is displayed");
		    break;
		    case "Write a review link":
		    	result = ipadPDPPagePO.checkWriteAReviewlinkIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Write a review link is displayed");
		    break;
		    case "Social Media icons":
		    	result = ipadPDPPagePO.checkSocialMediaIconsIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Social Media icons is displayed");
		    break;
		    case "Product Buy box":
		    	result = ipadPDPPagePO.checkProductBuyBoxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product Buy box is displayed");
		    break;
		    case "Product details block":
		    	result = ipadPDPPagePO.checkProductDetailsBlockIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product details block is displayed");
		    break;
		    case "Product specifications block":
		    	result = ipadPDPPagePO.checkProductSpecificationsBlockIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Product specifications block is displayed");
		    break;
		    case "Customers who viewed block":
		        result = ipadPDPPagePO.checkCustomersWhoViewedBlockIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Customers who viewed block is displayed");
		    break;
		    case "Customer Reviews block":
		    	result = ipadPDPPagePO.checkCustomerReviewsBlockIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Customer Reviews block is displayed");
		    break;
		    case "Add to wishlist Button":
		        result =ipadPDPPagePO.checkAddToWishlistButtonIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Add to wishlist Button is displayed");
		    break;
		    case "Variant items dropwdown":
		    	result = hudl2SoftTouchCasePinkPDPPagePO.checkVariantItemsDropwdownIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Variant items dropwdown is displayed");
		    break;
		    case "Special Offers block":
		    	    result =ipadPDPPagePO.checkSpecialOffersBlockIsDisplayed();
			    	Assert.assertTrue(result);
			    	LOG.debug("Special Offers block is displayed");
		    break;
		    case "Recently viewed items block":
		    	result = hudl2SoftTouchCasePinkPDPPagePO.checkRecentlyViewedItemsBlockIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Recently viewed items block is displayed");
		    break;
		    case "Add to Basket button":
		    	result = hudl2SoftTouchCasePinkPDPPagePO.checkAddToBasketButtonIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Add to Basket button is displayed");
		    break;
		    case "feasible delivery options":
		    	result = hudl2SoftTouchCasePinkPDPPagePO.checkFeasibleDeliveryOptionsIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("feasible delivery options is displayed");
		    break;
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	}

	@When("^I goto the hudl2 Soft Touch Case Pink PDP page$")
	public void when_I_goto_the_Hudl2SoftTouchCasePink_PDP_Page() throws Throwable {
		ipadPDPPagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
		ipadPDPPagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField("683-7798");
		ipadPDPPagePO.clickOnSearchButton();
		LOG.debug("I goto the AquaMarine Ring PDP page");
	}
	
	@When("^I click on the Write a review link$")
	public void I_click_on_the_Write_a_review_link() throws Throwable {
		hudl2SoftTouchCasePinkPDPPagePO = WC.getPageObject(Hudl2SoftTouchCasePinkPDPPagePO.class);
		hudl2SoftTouchCasePinkPDPPagePO.clickOnWriteAReviewLink();
		LOG.debug("I click on the Write a review link");
	}

	@Then("^My review overlay is displayed$")
	public void My_review_overlay_is_displayed() throws Throwable {
		Boolean result = hudl2SoftTouchCasePinkPDPPagePO.checkMyReviewOverlayIsDisplayed();
		Assert.assertTrue(result);
		hudl2SoftTouchCasePinkPDPPagePO.closeMyReviewOverlay();
		LOG.debug("My review overlay is displayed");
	}
	
	@When("^I look at the Product Buy Box$")
	public void I_look_at_the_Product_Buy_Box() throws Throwable {
	   
		LOG.debug("I look at the Product Buy Box");
	}

	@Then("^the default quantity of the Product Buy Box is 1$")
	public void the_default_quantity_of_the_Product_Buy_Box_is_1() throws Throwable {
		hudl2SoftTouchCasePinkPDPPagePO = WC.getPageObject(Hudl2SoftTouchCasePinkPDPPagePO.class);
		Boolean result = hudl2SoftTouchCasePinkPDPPagePO.checkBuyBoxDefaultQuantityIs1();
		Assert.assertTrue(result);
		LOG.debug("the default quantity of the Product Buy Box is 1");
	}

	@When("^I select a variant item$")
	public void I_select_a_variant_item() throws Throwable {
		hudl2SoftTouchCasePinkPDPPagePO = WC.getPageObject(Hudl2SoftTouchCasePinkPDPPagePO.class);
		hudl2SoftTouchCasePinkPDPPagePO.selectAVariantItem();
		LOG.debug("I select a variant item");
		
	}

	@Then("^the variant item is selected$")
	public void the_variant_item_is_selected() throws Throwable {
		hudl2SoftTouchCasePinkPDPPagePO = WC.getPageObject(Hudl2SoftTouchCasePinkPDPPagePO.class);
		Boolean result = hudl2SoftTouchCasePinkPDPPagePO.checkVariantItemIsSelected();
		Assert.assertTrue(result);
		LOG.debug("the variant item is selected");
	}

	@Then("^I am taken to the variant item page$")
	public void I_am_taken_to_the_variant_item_page() throws Throwable {
	    
		Boolean result = hudl2SoftTouchCasePinkPDPPagePO.checkVariantItemPageIsDisplayed();
		Assert.assertTrue(result);
		LOG.debug("I am taken to the variant item page");
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
