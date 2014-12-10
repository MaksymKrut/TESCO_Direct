package com.tesco.tescoDirect.searchAndBrowse.steps;



import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tesco.tescoDirect.pageObjects.DvdCategoryPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2PinkPLPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftProtectiveShellPinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftTouchCasePinkPDPPagePO;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAndBrowse {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(SearchAndBrowse.class);
	private HomePagePO homePagePO;
	private DvdCategoryPagePO dvdCategoryPagePO;
	private Hudl2PinkPLPPagePO hudl2PinkPLPPagePO;
	private Hudl2SoftProtectiveShellPinkPDPPagePO hudl2SoftProtectiveShellPinkPDPPagePO;
	private Hudl2SoftTouchCasePinkPDPPagePO hudl2SoftTouchCasePinkPDPPagePO;
	
	@Given("^I click on the Search by product name, catalogue no. or Keyword text box$")
	public void I_click_on_the_Search_by_product_name_catalogue_no_or_Keyword_text_box() throws Throwable {
	    
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSearchByProductNameCatalogueNoOrKeywordTextField();
	}
	
	@Given("^I click on the Search Button$")
	public void I_click_on_the_Search_Button() throws Throwable {
	    
		
		homePagePO.clickOnSearchButton();
	}

	@When("^I type \"([^\"]*)\" in the Search by product name, catalogue no. or Keyword text box$")
	public void I_type(String characters) throws Throwable {
	    
		homePagePO.typeInSearchByProductNameCatalogueNoOrKeywordTextField(characters);
	}

	@Then("^the search suggestion as you type overlay is \"([^\"]*)\" based on the user input$")
	public void the_search_suggestion_as_you_type_overlay_is_based_on_the_user_input(String displayedOrNot) throws Throwable {
		
		Boolean expectedResult = Boolean.valueOf(displayedOrNot);
		Boolean actualResult = homePagePO.checkSearchSuggestionAsYouTypeOverLayIsDisplayed();
		
		Assert.assertEquals(expectedResult, actualResult);
	    
		
			
			
		}
	
	@When("^select the first item in the search suggestion as you type overlay$")
	public void select_the_respective_item_in_the_search_suggestion_as_you_type_overlay() throws Throwable {
	    homePagePO.selectSearchOverlayFirstSuggestion();
	   
	}

	@Then("^I am taken to the corresponding \"([^\"]*)\"$")
	public void I_am_taken_to_the_corresponding(String page) throws Throwable {
		
		switch (page) {
		case "dvd category page":
			dvdCategoryPagePO = WC.getPageObject(DvdCategoryPagePO.class);
			Assert.assertTrue(dvdCategoryPagePO.checkUserIsOnDVDCategoryPage());
			break;
		case "Hudl 2 PLP page with pink keyword on item name":
			hudl2PinkPLPPagePO = WC.getPageObject(Hudl2PinkPLPPagePO.class);
			Assert.assertTrue(hudl2PinkPLPPagePO.checkUserIsOnHudl2PinkPLPPage());
			break;
		case "Hudl 2 soft protective Shell Pink PDP page":
			hudl2SoftProtectiveShellPinkPDPPagePO = WC.getPageObject(Hudl2SoftProtectiveShellPinkPDPPagePO.class);
			Assert.assertTrue(hudl2SoftProtectiveShellPinkPDPPagePO.checkUserIsOnhudl2SoftProtectiveShellPinkPDPPage());
			break;
		case "Hudl2 Soft Touch Case Pink PDP page":
			hudl2SoftTouchCasePinkPDPPagePO = WC.getPageObject(Hudl2SoftTouchCasePinkPDPPagePO.class);
			Assert.assertTrue(hudl2SoftTouchCasePinkPDPPagePO.checkUserIsOnHudl2SoftTouchCasePinkPDPPage());
			break;
		}
	  
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
