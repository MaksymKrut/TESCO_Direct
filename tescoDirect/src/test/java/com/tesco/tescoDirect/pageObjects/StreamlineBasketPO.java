package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class StreamlineBasketPO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(StreamlineBasketPO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	@FindBy(css = Constants.StreamlineBasketPage.StreamlinebasketOverlay)
	@CacheLookup
	private WebElement StreamlinebasketOverlay;
	@FindBy(css = Constants.StreamlineBasketPage.OneItemAddedToBasket)
	@CacheLookup
	private WebElement OneItemAddedToBasket;
	@FindBy(css = Constants.StreamlineBasketPage.OneItemAddedToBasketMobile)
	@CacheLookup
	private WebElement OneItemAddedToBasketMobile;
	@FindBy(css = Constants.StreamlineBasketPage.NumberofItemsinBasket)
	@CacheLookup
	private WebElement NumberofItemsinBasket;
	@FindBy(css = Constants.StreamlineBasketPage.NumberofItemsinBasketMobile)
	@CacheLookup
	private WebElement NumberofItemsinBasketMobile;
	@FindBy(css = Constants.StreamlineBasketPage.Subtotal)
	@CacheLookup
	private WebElement Subtotal;
	@FindBy(css = Constants.StreamlineBasketPage.SubtotalMobile)
	@CacheLookup
	private WebElement SubtotalMobile;
	@FindBy(css = Constants.StreamlineBasketPage.ClubCardPoints)
	@CacheLookup
	private WebElement ClubCardPoints;
	@FindBy(css = Constants.StreamlineBasketPage.ClubCardPointsMobile)
	@CacheLookup
	private WebElement ClubCardPointsMobile;
	@FindBy(css = Constants.StreamlineBasketPage.BasketTotal)
	@CacheLookup
	private WebElement BasketTotal;
	@FindBy(css = Constants.StreamlineBasketPage.BasketTotalMobile)
	@CacheLookup
	private WebElement BasketTotalMobile;
	@FindBy(css = Constants.StreamlineBasketPage.ViewBasketButton)
	@CacheLookup
	private WebElement ViewBasketButton;
	@FindBy(css = Constants.StreamlineBasketPage.ViewBasketButtonMobile)
	@CacheLookup
	private WebElement ViewBasketButtonMobile;
	@FindBy(css = Constants.StreamlineBasketPage.ViewBasketButtonHudl)
	@CacheLookup
	private WebElement ViewBasketButtonHudl;
	@FindBy(css = Constants.StreamlineBasketPage.CheckoutButton)
	@CacheLookup
	private WebElement CheckoutButton;
	@FindBy(css = Constants.StreamlineBasketPage.CheckoutButtonMobile)
	@CacheLookup
	private WebElement CheckoutButtonMobile;
	@FindBy(css = Constants.StreamlineBasketPage.ContinueShoppingLink)
	@CacheLookup
	private WebElement ContinueShoppingLink;
	@FindBy(css = Constants.StreamlineBasketPage.ContinueShoppingLinkMobile)
	@CacheLookup
	private WebElement ContinueShoppingLinkMobile;
	@FindBy(css = Constants.StreamlineBasketPage.ContinueShoppingLinkHudl)
	@CacheLookup
	private WebElement ContinueShoppingLinkHudl;
	@FindBy(css = Constants.StreamlineBasketPage.Itemsrelatedtoyourbasketblock)
	@CacheLookup
	private WebElement Itemsrelatedtoyourbasketblock;
	@FindBy(css = Constants.StreamlineBasketPage.ItemsrelatedtoyourbasketblockMobile)
	@CacheLookup
	private WebElement ItemsrelatedtoyourbasketblockMobile;
	@FindBy(css = Constants.StreamlineBasketPage.Customerswithsimilarinterestsalsoviewedblock)
	@CacheLookup
	private WebElement Customerswithsimilarinterestsalsoviewedblock;
	@FindBy(css = Constants.BasketPage.BasketAttachmentPageTitle)
	// @CacheLookup
	private WebElement PageTitle;
	@FindBy(css = Constants.SearchResultsPage.AddToBasketButton1)
	@CacheLookup
	private WebElement AddToBasketButton1;
	@FindBy(css = Constants.SearchResultsPage.AddToBasketButton2)
	@CacheLookup
	private WebElement AddToBasketButton2;
	@FindBy(css = Constants.SearchResultsPage.AddToBasketButton3)
	@CacheLookup
	private WebElement AddToBasketButton3;

	public StreamlineBasketPO checkingForStreamLineBasketOverlay() {
		WC.wait(10);
		//WC.waitForpresenceofElement(By.cssSelector(Constants.StreamlineBasketPage.StreamlinebasketOverlay),60);
		//WC.assertingWebElement(StreamlinebasketOverlay);
		WC.handlePopup();
		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO checkingForStreamLineBasketOverlayEE() {
		WC.wait(2);
		WC.assertingWebElement(StreamlinebasketOverlay);
		WC.handlePopup();
		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO checkingForOneItemAddedToBasket() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(OneItemAddedToBasket);
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertingWebElement(OneItemAddedToBasketMobile);
		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO checkingForNumberofItemsinBasket() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(NumberofItemsinBasket);
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertingWebElement(NumberofItemsinBasketMobile);
		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO checkingForSubtotal() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(Subtotal);
			WC.assertingWebElement(ClubCardPoints);
			WC.assertingWebElement(BasketTotal);
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertingWebElement(SubtotalMobile);
			WC.assertingWebElement(ClubCardPointsMobile);
			WC.assertingWebElement(BasketTotalMobile);
		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO checkingForItemsrelatedtoyourbasketblock() {
		WC.switchToFrame("streamline-basket-iframe");
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(Itemsrelatedtoyourbasketblock);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertingWebElement(ItemsrelatedtoyourbasketblockMobile);

		}
		WC.switchToPreviousWindowContext();
		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO checkingForCustomerswithsimilarinterestsalsoviewedblock() {
		WC.switchToFrame("streamline-basket-iframe");
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(Customerswithsimilarinterestsalsoviewedblock);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertingWebElement(Customerswithsimilarinterestsalsoviewedblock);

		}
		WC.switchToPreviousWindowContext();
		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO clickingOnViewBasketButton() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(ViewBasketButton);
			WC.click(ViewBasketButton);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertingWebElement(ViewBasketButtonMobile);
			WC.click(ViewBasketButtonMobile);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO clickingOnViewBasketButtonEE() {
		if (WC.LVP()) {
			WC.handlePopup();
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.ViewBasketButton),
					50);
			WC.assertingWebElement(ViewBasketButton);
			WC.click(ViewBasketButton);

		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.ViewBasketButtonMobile),
					50);
			WC.assertingWebElement(ViewBasketButtonMobile);
			WC.click(ViewBasketButtonMobile);

		} else if (WC.MVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.ViewBasketButtonHudl),
					50);
			WC.assertingWebElement(ViewBasketButtonHudl);
			WC.click(ViewBasketButtonHudl);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO CheckingForBasketDetailPage() {
		WC.wait(10);
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.presenceOfElementLocated(
					By.cssSelector(Constants.BasketPage.BasketAttachmentPageTitle),
					60);
			WC.verifyText("Your basket", PageTitle);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.presenceOfElementLocated(
					By.cssSelector(Constants.BasketPage.BasketAttachmentPageTitle),
					60);
			WC.verifyText("Your basket", PageTitle);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO clickingOnCheckoutButton() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.getDriver().navigate().back();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.AddToBasketButton2),
					50);
			WC.click(AddToBasketButton2);
			WC.handlePopup();
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.CheckoutButton),
					50);
			WC.assertingWebElement(CheckoutButton);
			WC.click(CheckoutButton);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.getDriver().navigate().back();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.AddToBasketButton2),
					50);
			WC.click(AddToBasketButton2);
			WC.handlePopup();
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.CheckoutButtonMobile),
					50);
			WC.assertingWebElement(CheckoutButtonMobile);
			WC.click(CheckoutButtonMobile);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO clickingOnCheckoutButtonEE() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.CheckoutButton),
					50);
			WC.assertingWebElement(CheckoutButton);
			CheckoutButton.click();

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.CheckoutButtonMobile),
					50);
			WC.assertingWebElement(CheckoutButtonMobile);
			WC.click(CheckoutButtonMobile);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO CheckingForSecurecheckoutPage() {
		WC.wait(15);
		if (WC.LVP()) {
			WC.presenceOfElementLocated(
					By.cssSelector(Constants.BasketPage.BasketAttachmentPageTitle),
					60);
			WC.verifyText("Secure checkout", PageTitle);

		} else if (WC.MVP() && WC.SVP()) {
			WC.presenceOfElementLocated(
					By.cssSelector(Constants.BasketPage.BasketAttachmentPageTitle),
					60);
			WC.verifyText("Secure checkout", PageTitle);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO clickingOnContinueShoppingLink() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			//WC.getDriver().navigate().back();
			//WC.click(AddToBasketButton3);
			//WC.wait(2);
			//WC.handlePopup();
			//WC.wait(5);
			WC.assertingWebElement(ContinueShoppingLink);
			WC.click(ContinueShoppingLink);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			//WC.getDriver().navigate().back();
			//WC.click(AddToBasketButton3);
			//WC.wait(2);
			//WC.handlePopup();
			//WC.wait(5);
			WC.assertingWebElement(ContinueShoppingLink);
			WC.click(ContinueShoppingLinkMobile);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO clickingOnContinueShoppingLinkEE() {
		if (WC.LVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.ContinueShoppingLink),
					20);
			WC.assertingWebElement(ContinueShoppingLink);
			WC.wait(5);
			WC.click(ContinueShoppingLink);

		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.ContinueShoppingLinkMobile),
					20);
			WC.assertingWebElement(ContinueShoppingLinkMobile);
			WC.click(ContinueShoppingLinkMobile);

		} else if (WC.MVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.StreamlineBasketPage.ContinueShoppingLinkHudl),
					20);
			WC.assertingWebElement(ContinueShoppingLinkHudl);
			WC.click(ContinueShoppingLinkHudl);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}

	public StreamlineBasketPO CheckingForResultsPage() {
		WC.wait(15);
		if (WC.LVP()) {
			WC.presenceOfElementLocated(
					By.cssSelector(Constants.BasketPage.BasketAttachmentPageTitle),
					20);
			WC.verifyText("Results for “hudl”", PageTitle);

		} else if (WC.MVP() && WC.SVP()) {
			WC.presenceOfElementLocated(
					By.cssSelector(Constants.BasketPage.BasketAttachmentPageTitle),
					20);
			WC.verifyText("Results for “hudl”", PageTitle);

		}

		return (StreamlineBasketPO) WC.getPageObject(StreamlineBasketPO.class);
	}
}
