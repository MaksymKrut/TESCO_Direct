package com.tesco.tescoDirect.pageObjects;



import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class Hudl2SoftTouchCasePinkPDPPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(Hudl2SoftTouchCasePinkPDPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	
	@FindBy(xpath = Constants.Hudl2SoftTouchCasePinkPDPPage.VariantItemsDropdown)
	private WebElement VariantItemsDropdown;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.RecentlyViewedItemsBlock)
	@CacheLookup
	private WebElement RecentlyViewedItemsBlock;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.WriteAReviewlink)
	@CacheLookup
	private WebElement WriteAReviewlink;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.MyReviewOverlay)
	@CacheLookup
	private WebElement MyReviewOverlay;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.QuantityBox)
	@CacheLookup
	private WebElement QuantityBox;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.AddToBasketButton)
	@CacheLookup
	private WebElement AddToBasketButton;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.FeasibleDeliveryOptions)
	@CacheLookup
	private WebElement FeasibleDeliveryOptions;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.CloseMyReviewOverlayButton)
	@CacheLookup
	private WebElement CloseMyReviewOverlayButton;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.VariantItemsDropdownFirstOption)
	private WebElement VariantItemsDropdownFirstOption;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.VariantItemsDropdownMobile)
	private WebElement VariantItemsDropdownMobile;
	@FindBy(css = Constants.Hudl2SoftTouchCasePinkPDPPage.ProductTitle)
	private WebElement ProductTitle;

	
	


	public boolean checkUserIsOnHudl2SoftTouchCasePinkPDPPage() {
		String actualPageTitle = WC.getPageTitle();
		String expectedPageTitle = "Buy hudl2 Soft Touch Case from our Cases & Covers range - Tesco.com";
		Boolean result = actualPageTitle.equals(expectedPageTitle);
		System.out.println("The Page Title is "+actualPageTitle);
		return result;
	}
	
	public Boolean checkVariantItemsDropwdownIsDisplayed() {

		return WC.elementIsDisplayedOrNot(VariantItemsDropdown);

	}

	public Boolean checkRecentlyViewedItemsBlockIsDisplayed() {

		return WC.elementIsDisplayedOrNot(RecentlyViewedItemsBlock);

	}

	public void clickOnWriteAReviewLink() {

		WC.click(WriteAReviewlink);

	}

	public Boolean checkMyReviewOverlayIsDisplayed() {

		return WC.elementIsDisplayedOrNot(MyReviewOverlay);

	}

	public Boolean checkBuyBoxDefaultQuantityIs1() {
		String quantity = WC.getAttributeValue(QuantityBox, "value");
		if(quantity.equalsIgnoreCase("1"))
			return true;
		else
			return false;

	}

	public Boolean checkAddToBasketButtonIsDisplayed() {
		return WC.elementIsDisplayedOrNot(AddToBasketButton);
	}

	public Boolean checkFeasibleDeliveryOptionsIsDisplayed() {
		return WC.elementIsDisplayedOrNot(FeasibleDeliveryOptions);
	}

	public void closeMyReviewOverlay() {

		WC.click(CloseMyReviewOverlayButton);

	}

	public void selectAVariantItem() {

		String Currentinstance = WC.getDriver().getClass().getName();
		if(Currentinstance.equalsIgnoreCase("org.openqa.selenium.chrome.ChromeDriver")){
			WC.click(VariantItemsDropdown);
			WC.click(VariantItemsDropdownFirstOption);
		}else if(Currentinstance.equalsIgnoreCase("io.appium.java_client.android.AndroidDriver")){
			WC.selectfromdropdown(VariantItemsDropdownMobile, "Turquoise");


		}



	}

	public Boolean checkVariantItemIsSelected() {
		WC.retryingFindClick(VariantItemsDropdown);
		String Currentinstance = WC.getDriver().getClass().getName();
		Boolean result=null;

		if(Currentinstance.equalsIgnoreCase("org.openqa.selenium.chrome.ChromeDriver")){

			String value = WC.getAttributeValue(VariantItemsDropdownFirstOption, "class");
			System.out.println("The value of the class is "+value+"**********");

			if(value.contains("selected"))
				result = true;
			else 
				result = false;

		}else if(Currentinstance.equalsIgnoreCase("io.appium.java_client.android.AndroidDriver")){

			String selectedOption = WC.getSelectedOptionFromDropdown(VariantItemsDropdownMobile);

			if(selectedOption.equalsIgnoreCase("Turquoise"))
				result = true;
			else
				result = false;
		}

		return result;
	}

	public Boolean checkVariantItemPageIsDisplayed() {
		String value=null;
		Boolean result = false;
		while(result.equals(false)){
			try{
				value = WC.getText(ProductTitle);
			}catch(Throwable t){

			}
			if(value.equalsIgnoreCase("hudl2 Soft Touch Case Turquoise"))
				result=true;
		}



		value = WC.getText(ProductTitle);
		System.out.println("The product title is "+value);
		if(value.equalsIgnoreCase("hudl2 Soft Touch Case Turquoise"))
			return true;
		else
			return false;
	}


	
}
