package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class AquaMarinePDPPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(AquaMarinePDPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(xpath = Constants.AquaMarinePDPPage.VariantItemsDropdown)
	private WebElement VariantItemsDropdown;
	@FindBy(css = Constants.AquaMarinePDPPage.RecentlyViewedItemsBlock)
	@CacheLookup
	private WebElement RecentlyViewedItemsBlock;
	@FindBy(css = Constants.AquaMarinePDPPage.WriteAReviewlink)
	@CacheLookup
	private WebElement WriteAReviewlink;
	@FindBy(css = Constants.AquaMarinePDPPage.MyReviewOverlay)
	@CacheLookup
	private WebElement MyReviewOverlay;
	@FindBy(css = Constants.AquaMarinePDPPage.QuantityBox)
	@CacheLookup
	private WebElement QuantityBox;
	@FindBy(css = Constants.AquaMarinePDPPage.AddToBasketButton)
	@CacheLookup
	private WebElement AddToBasketButton;
	@FindBy(css = Constants.AquaMarinePDPPage.FeasibleDeliveryOptions)
	@CacheLookup
	private WebElement FeasibleDeliveryOptions;
	@FindBy(css = Constants.AquaMarinePDPPage.CloseMyReviewOverlayButton)
	@CacheLookup
	private WebElement CloseMyReviewOverlayButton;
	@FindBy(css = Constants.AquaMarinePDPPage.VariantItemsDropdownFirstOption)
	private WebElement VariantItemsDropdownFirstOption;
	@FindBy(css = Constants.AquaMarinePDPPage.VariantItemsDropdownMobile)
	private WebElement VariantItemsDropdownMobile;
	@FindBy(css = Constants.AquaMarinePDPPage.ProductTitle)
	private WebElement ProductTitle;

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
		if (quantity.equalsIgnoreCase("1"))
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
		if (Currentinstance
				.equalsIgnoreCase("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.click(VariantItemsDropdown);
			WC.click(VariantItemsDropdownFirstOption);
		} else if (Currentinstance
				.equalsIgnoreCase("io.appium.java_client.android.AndroidDriver")) {
			WC.selectfromdropdown(VariantItemsDropdownMobile, "H");

		}

	}

	public Boolean checkVariantItemIsSelected() {
		WC.retryingFindClick(VariantItemsDropdown);
		String Currentinstance = WC.getDriver().getClass().getName();
		Boolean result = null;

		if (Currentinstance
				.equalsIgnoreCase("org.openqa.selenium.chrome.ChromeDriver")) {

			String value = WC.getAttributeValue(
					VariantItemsDropdownFirstOption, "class");
			System.out.println("The value of the class is " + value
					+ "**********");

			if (value.contains("selected"))
				result = true;
			else
				result = false;

		} else if (Currentinstance
				.equalsIgnoreCase("io.appium.java_client.android.AndroidDriver")) {

			String selectedOption = WC
					.getSelectedOptionFromDropdown(VariantItemsDropdownMobile);

			if (selectedOption.equalsIgnoreCase("H"))
				result = true;
			else
				result = false;
		}

		return result;
	}

	public Boolean checkVariantItemPageIsDisplayed() {
		String value = null;
		Boolean result = false;
		while (result.equals(false)) {
			try {
				value = WC.getText(ProductTitle);
			} catch (Throwable t) {

			}
			if (value
					.equalsIgnoreCase("QP Jewellers Diamond & Aquamarine Top & Tail Ring in 14K White Gold - Size H"))
				result = true;
		}

		value = WC.getText(ProductTitle);
		System.out.println("The product title is " + value);
		if (value
				.equalsIgnoreCase("QP Jewellers Diamond & Aquamarine Top & Tail Ring in 14K White Gold - Size H"))
			return true;
		else
			return false;
	}

}
