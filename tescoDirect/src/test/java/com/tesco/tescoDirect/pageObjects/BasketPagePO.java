package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class BasketPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(BasketPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.BasketPage.BasketAttachmentPageTitle)
	@CacheLookup
	private WebElement basketattachmentpagetitle;
	@FindBy(xpath = Constants.BasketPage.BAPageProductImage)
	@CacheLookup
	private WebElement bapageproductimage;
	@FindBy(xpath = Constants.BasketPage.BAPageProductDescription)
	@CacheLookup
	private WebElement bapageproductdescription;
	@FindBy(xpath = Constants.BasketPage.BAPageProductCost)
	@CacheLookup
	private WebElement bapageproductcost;
	@FindBy(xpath = Constants.BasketPage.BAPageOtherDetailsOfProduct)
	@CacheLookup
	private WebElement bapageotherdetailsofproduct;
	@FindBy(xpath = Constants.BasketPage.BAPageAddtoBasketButton)
	@CacheLookup
	private WebElement bapageaddtobasketbutton;
	@FindBy(xpath = Constants.BasketPage.BasketSummaryNumOfItems)
	@CacheLookup
	private WebElement basketsummarynumofitems;
	@FindBy(xpath = Constants.BasketPage.BasketSummaryCostOfTheProduct)
	@CacheLookup
	private WebElement basketsummarycostoftheproduct;
	@FindBy(xpath = Constants.BasketPage.BasketSummaryClubcardPoints)
	@CacheLookup
	private WebElement basketsummaryclubcardpoints;
	@FindBy(xpath = Constants.BasketPage.BasketSummaryContinueShoppingLink)
	@CacheLookup
	private WebElement basketsummarycontinueshoppinglink;
	@FindBy(xpath = Constants.BasketPage.BasketSummaryViewBasketAndcheckoutButton)
	@CacheLookup
	private WebElement basketsummaryviewbasketandcheckoutbutton;
	@FindBy(xpath = Constants.BasketPage.BasketSummaryNoticeMessage)
	@CacheLookup
	private WebElement basketsummarynoticemessage;

	@FindBy(xpath = Constants.BasketPage.BAPagePopularProducts)
	@CacheLookup
	private WebElement bapagepopularproducts;
	@FindBy(xpath = Constants.BasketPage.BAPagePopularProductsPreviousArrow)
	@CacheLookup
	private WebElement bapagepopularproductspreviousarrow;
	@FindBy(xpath = Constants.BasketPage.BAPagePopularProductsNextArrow)
	@CacheLookup
	private WebElement bapagepopularproductsnextarrow;
	@FindBy(xpath = Constants.BasketPage.BAPagePopularProductsXbox1)
	@CacheLookup
	private WebElement bapagepopularproductsxbox1;
	@FindBy(css = Constants.BasketPage.XboxResultPage)
	@CacheLookup
	private WebElement xboxresultpage;
	@FindBy(xpath = Constants.BasketPage.BAPagePopularProductsXbox2)
	@CacheLookup
	private WebElement bapagepopularproductsxbox2;

	@FindBy(xpath = Constants.BasketPage.BAPageTrendingProducts)
	@CacheLookup
	private WebElement bapagetrendingproducts;
	@FindBy(xpath = Constants.BasketPage.BAPageTrendingProductsPreviousArrow)
	@CacheLookup
	private WebElement bapagetrendingproductspreviousarrow;
	@FindBy(xpath = Constants.BasketPage.BAPageTrendingProductsNextArrow)
	@CacheLookup
	private WebElement bapagetrendingproductsnextarrow;
	@FindBy(xpath = Constants.BasketPage.BAPageTrendingProductsPlayStation)
	@CacheLookup
	private WebElement bapagetrendingproductsplaystation;
	@FindBy(css = Constants.BasketPage.PlayStationResultPage)
	@CacheLookup
	private WebElement playstationresultpage;
	@FindBy(xpath = Constants.BasketPage.BAPageTrendingProductsXboxOneConsole)
	@CacheLookup
	private WebElement bapagetrendingproductsxboxoneconsole;

	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedProducts)
	@CacheLookup
	private WebElement bapagerecentlyviewedproducts;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedProductsPreviousArrow)
	@CacheLookup
	private WebElement bapagerecentlyviewedproductspreviousarrow;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedProductsNextArrow)
	@CacheLookup
	private WebElement bapagerecentlyviewedproductsnextarrow;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedProductsItem1)
	@CacheLookup
	private WebElement bapagerecentlyviewedproductsitem1;
	@FindBy(css = Constants.BasketPage.Item1ResultPage)
	@CacheLookup
	private WebElement item1resultpage;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedProductsItem2)
	@CacheLookup
	private WebElement bapagerecentlyviewedproductsitem2;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedTurnOffButton)
	@CacheLookup
	private WebElement bapagerecentlyviewedturnoffbutton;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedTurnONButton)
	@CacheLookup
	private WebElement bapagerecentlyviewedturnonbutton;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedClearAllButton)
	@CacheLookup
	private WebElement bapagerecentlyviewedclearallbutton;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedClearAllMessages)
	@CacheLookup
	private WebElement bapagerecentlyviewedclearallmessages;
	@FindBy(xpath = Constants.BasketPage.BAPageRecentlyViewedProductRemoveButton)
	@CacheLookup
	private WebElement bapagerecentlyviewedproductremovebutton;

	@FindBy(xpath = Constants.BasketPage.BPBasketSummary)
	@CacheLookup
	private WebElement BPBasketSummary;
	@FindBy(xpath = Constants.BasketPage.BPSubtotal)
	@CacheLookup
	private WebElement BPSubtotal;
	@FindBy(xpath = Constants.BasketPage.BPPromotionalsavings)
	@CacheLookup
	private WebElement BPPromotionalsavings;
	@FindBy(xpath = Constants.BasketPage.BPTotalsavings)
	@CacheLookup
	private WebElement BPTotalsavings;
	@FindBy(xpath = Constants.BasketPage.BPBaskettotal)
	@CacheLookup
	private WebElement BPBaskettotal;
	@FindBy(xpath = Constants.BasketPage.BPClubcardpoints)
	@CacheLookup
	private WebElement BPClubcardpoints;
	@FindBy(xpath = Constants.BasketPage.BPExtraclubcardpoints)
	@CacheLookup
	private WebElement BPExtraclubcardpoints;
	@FindBy(xpath = Constants.BasketPage.BPTotalClubcardpoints)
	@CacheLookup
	private WebElement BPTotalClubcardpoints;
	@FindBy(css = Constants.BasketPage.BPContinuetocheckout)
	@CacheLookup
	private WebElement BPContinuetocheckout;
	@FindBy(xpath = Constants.BasketPage.BPGotAnEcouponmessage)
	@CacheLookup
	private WebElement BPGotAnEcouponmessage;
	@FindBy(xpath = Constants.BasketPage.BPYouCanaddtheseincheckoutMessage)
	@CacheLookup
	private WebElement BPYouCanaddtheseincheckoutMessage;
	@FindBy(xpath = Constants.BasketPage.BPContinueShoppingButton)
	@CacheLookup
	private WebElement BPContinueShoppingButton;

	@FindBy(xpath = Constants.BasketPage.YouHaveTwoItemsInYourBasket)
	@CacheLookup
	private WebElement YouHaveTwoItemsInYourBasket;
	@FindBy(xpath = Constants.BasketPage.BPContinueShoppingLink)
	@CacheLookup
	private WebElement BPContinueShoppingLink;
	@FindBy(xpath = Constants.BasketPage.BPCheckOutButton)
	@CacheLookup
	private WebElement BPCheckOutButton;
	@FindBy(xpath = Constants.BasketPage.BPItems)
	@CacheLookup
	private WebElement BPItems;
	@FindBy(xpath = Constants.BasketPage.BPQuantity)
	@CacheLookup
	private WebElement BPQuantity;
	@FindBy(css = Constants.BasketPage.Quantity)
	@CacheLookup
	private WebElement Quantity;
	@FindBy(css = Constants.BasketPage.QuantityMobile)
	@CacheLookup
	private WebElement QuantityMobile;
	@FindBy(xpath = Constants.BasketPage.BPPrice)
	@CacheLookup
	private WebElement BPPrice;
	@FindBy(xpath = Constants.BasketPage.BPItemSubtotal)
	@CacheLookup
	private WebElement BPItemSubtotal;
	@FindBy(xpath = Constants.BasketPage.BPProductDescription)
	@CacheLookup
	private WebElement BPProductDescription;
	@FindBy(xpath = Constants.BasketPage.BPProductSupplier)
	@CacheLookup
	private WebElement BPProductSupplier;
	@FindBy(xpath = Constants.BasketPage.BPProductOffer)
	@CacheLookup
	private WebElement BPProductOffer;
	@FindBy(xpath = Constants.BasketPage.BPProductDeliveryOption)
	@CacheLookup
	private WebElement BPProductDeliveryOption;
	@FindBy(css = Constants.BasketPage.BPUpdateLink)
	@CacheLookup
	private WebElement BPUpdateLink;
	@FindBy(xpath = Constants.BasketPage.BPRemoveLink)
	@CacheLookup
	private WebElement BPRemoveLink;
	@FindBy(xpath = Constants.BasketPage.BPSaveForLaterLink)
	@CacheLookup
	private WebElement BPSaveForLaterLink;
	@FindBy(xpath = Constants.BasketPage.BPQuantityTextField)
	@CacheLookup
	private WebElement BPQuantityTextField;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductDesc)
	@CacheLookup
	private WebElement BPServiceProductDesc;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductQuantity)
	@CacheLookup
	private WebElement BPServiceProductQuantity;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductPrice)
	@CacheLookup
	private WebElement BPServiceProductPrice;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductSubtotal)
	@CacheLookup
	private WebElement BPServiceProductSubtotal;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductUpdateLink)
	@CacheLookup
	private WebElement BPServiceProductUpdateLink;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductRemoveLink)
	@CacheLookup
	private WebElement BPServiceProductRemoveLink;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductSaveForLaterLink)
	@CacheLookup
	private WebElement BPServiceProductSaveForLaterLink;
	@FindBy(xpath = Constants.BasketPage.BPServiceProductQuantityTextField)
	@CacheLookup
	private WebElement BPServiceProductQuantityTextField;

	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterProducts)
	@CacheLookup
	private WebElement ItemSavedForLaterProducts;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterProductTitle)
	@CacheLookup
	private WebElement ItemSavedForLaterProductTitle;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterSuppliedBy)
	@CacheLookup
	private WebElement ItemSavedForLaterSuppliedBy;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterCostOftheProduct)
	@CacheLookup
	private WebElement ItemSavedForLaterCostOftheProduct;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterSavings)
	@CacheLookup
	private WebElement ItemSavedForLaterSavings;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterMoveToBasketButton)
	@CacheLookup
	private WebElement ItemSavedForLaterMoveToBasketButton;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterXbutton)
	@CacheLookup
	private WebElement ItemSavedForLaterXbutton;
	@FindBy(xpath = Constants.BasketPage.ItemSavedForLaterShowAllbutton)
	@CacheLookup
	private WebElement ItemSavedForLaterShowAllbutton;

	@FindBy(css = Constants.BasketPage.BPEmptyBasketButton)
	@CacheLookup
	private WebElement BPEmptyBasketButton;
	@FindBy(css = Constants.BasketPage.BPEmptyBasketButtonMobile)
	@CacheLookup
	private WebElement BPEmptyBasketButtonMobile;
	@FindBy(css = Constants.BasketPage.AreYouSureYouWantToEmptyYourBasketYesButton)
	@CacheLookup
	private WebElement AreYouSureYouWantToEmptyYourBasketYesButton;
	@FindBy(css = Constants.BasketPage.AreYouSureYouWantToEmptyYourBasketYesButtonMobile)
	@CacheLookup
	private WebElement AreYouSureYouWantToEmptyYourBasketYesButtonMobile;
	@FindBy(partialLinkText = Constants.BasketPage.SignOutLink)
	@CacheLookup
	private WebElement SignOutLink;
	
	@FindBy(css = Constants.BasketPage.ClubcardBoostImage)
	@CacheLookup
	private WebElement ClubcardBoostImage;
	@FindBy(xpath = Constants.BasketPage.InClubcardBoostMoreInfoLink)
	@CacheLookup
	private WebElement InClubcardBoostMoreInfoLink;
	
	
	
	
	public BasketPagePO clickingOnEmptyBasketButton() {
		if (WC.LVP()) {
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPEmptyBasketButton), 60);
			WC.click(BPEmptyBasketButton);
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.AreYouSureYouWantToEmptyYourBasketYesButton), 50);
			WC.assertingWebElement(AreYouSureYouWantToEmptyYourBasketYesButton);
			WC.click(AreYouSureYouWantToEmptyYourBasketYesButton);
		} else if (WC.SVP()) {
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPEmptyBasketButton), 60);
			WC.click(BPEmptyBasketButton);
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.AreYouSureYouWantToEmptyYourBasketYesButtonMobile), 50);
			WC.assertingWebElement(AreYouSureYouWantToEmptyYourBasketYesButtonMobile);
			WC.click(AreYouSureYouWantToEmptyYourBasketYesButtonMobile);
		}
		else if (WC.MVP()) {
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPEmptyBasketButton), 60);
			WC.click(BPEmptyBasketButton);
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.AreYouSureYouWantToEmptyYourBasketYesButtonMobile), 50);
			WC.assertingWebElement(AreYouSureYouWantToEmptyYourBasketYesButtonMobile);
			WC.click(AreYouSureYouWantToEmptyYourBasketYesButtonMobile);
		}
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}
	public BasketPagePO updatingAndContinueTocheckout() {
		if (WC.LVP()) {
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.Quantity), 20);
			Quantity.clear();
			Quantity.sendKeys("2");
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPUpdateLink), 20);
			WC.assertingWebElement(BPUpdateLink);
			WC.click(BPUpdateLink);
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPContinuetocheckout), 20);
			WC.assertingWebElement(BPContinuetocheckout);
			WC.click(BPContinuetocheckout);
		} else if (WC.SVP()) {
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.QuantityMobile), 20);
			WC.click(QuantityMobile);
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPUpdateLink), 20);
			WC.assertingWebElement(BPUpdateLink);
			WC.click(BPUpdateLink);
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPContinuetocheckout), 20);
			WC.assertingWebElement(BPContinuetocheckout);
			WC.click(BPContinuetocheckout);
		}
		else if (WC.MVP()) {
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.Quantity), 20);
			Quantity.clear();
			Quantity.sendKeys("2");
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPUpdateLink), 20);
			WC.assertingWebElement(BPUpdateLink);
			WC.click(BPUpdateLink);
			WC.waitForElementClickable(By.cssSelector(Constants.BasketPage.BPContinuetocheckout), 20);
			WC.assertingWebElement(BPContinuetocheckout);
			WC.click(BPContinuetocheckout);
		}
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}
	public BasketPagePO checkingTitleinBasketAttachementPage() {
		WC.verifyText("This item was successfully added to your basket",
				basketattachmentpagetitle);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingtheProductModuleitemsInBAPage() {
		WC.assertingWebElement(bapageproductimage);
		WC.assertingWebElement(bapageproductdescription);
		WC.assertingWebElement(bapageproductcost);
		WC.assertingWebElement(bapageotherdetailsofproduct);
		WC.assertingWebElement(bapageaddtobasketbutton);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingtheBasketSummaryitemsInBAPage() {
		WC.assertingWebElement(basketsummarynumofitems);
		WC.assertingWebElement(basketsummarycostoftheproduct);
		WC.assertingWebElement(basketsummaryclubcardpoints);
		WC.assertingWebElement(basketsummarycontinueshoppinglink);
		WC.assertingWebElement(basketsummaryviewbasketandcheckoutbutton);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingBasketSummaryNoticeMessage() {
		WC.assertingWebElement(basketsummarynoticemessage);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingcarsoulitemsaredisplayedintherecommendationblock() {
		WC.assertingWebElement(bapagepopularproducts);
		WC.assertingWebElement(bapagepopularproductspreviousarrow);
		WC.assertingWebElement(bapagepopularproductsnextarrow);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingcarsoulnaviagationarrowsworks() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,900);", bapagepopularproductsnextarrow);
		bapagepopularproductsnextarrow.click();
		bapagepopularproductsnextarrow.click();
		bapagepopularproductsnextarrow.click();
		WC.wait(3);
		bapagepopularproductspreviousarrow.click();
		bapagepopularproductspreviousarrow.click();
		bapagepopularproductspreviousarrow.click();
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingTrendingcarsoulitemsaredisplayedintheSimilarCustomerViewblock() {
		WC.assertingWebElement(bapagetrendingproducts);
		WC.assertingWebElement(bapagetrendingproductspreviousarrow);
		WC.assertingWebElement(bapagetrendingproductsnextarrow);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}
	
	public void clickOnSignOutLink() {
		WC.click(SignOutLink);
		
	}

	public BasketPagePO checkingTrendingcarsoulnaviagationarrowsworks() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,500);", bapagetrendingproductspreviousarrow);
		bapagetrendingproductsnextarrow.click();
		bapagetrendingproductsnextarrow.click();
		bapagetrendingproductsnextarrow.click();
		WC.wait(3);
		bapagetrendingproductspreviousarrow.click();
		bapagetrendingproductspreviousarrow.click();
		bapagetrendingproductspreviousarrow.click();
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingRecentlyViewedcarsoulitemsaredisplayedintheSimilarCustomerViewblock() {
		WC.assertingWebElement(bapagerecentlyviewedproducts);
		WC.assertingWebElement(bapagerecentlyviewedproductspreviousarrow);
		WC.assertingWebElement(bapagerecentlyviewedproductsnextarrow);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingRecentlyViewedcarsoulnaviagationarrowsworks() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,1200);",
				bapagerecentlyviewedproductspreviousarrow);
		bapagerecentlyviewedproductsnextarrow.click();
		bapagerecentlyviewedproductspreviousarrow.click();
		WC.wait(3);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingRecentlyViewedbuttonsworks() {
		WC.assertingWebElement(bapagerecentlyviewedturnoffbutton);
		bapagerecentlyviewedturnoffbutton.click();
		WC.assertingWebElement(bapagerecentlyviewedturnonbutton);
		bapagerecentlyviewedturnonbutton.click();
		WC.assertingWebElement(bapagerecentlyviewedclearallbutton);
		WC.assertingWebElement(bapagerecentlyviewedproductremovebutton);
		bapagerecentlyviewedclearallbutton.click();
		WC.verifyText("You have no recently viewed items",
				bapagerecentlyviewedclearallmessages);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingBasketSummaryItemsInBP() {
		WC.assertingWebElement(BPBasketSummary);
		WC.assertingWebElement(BPSubtotal);
		WC.assertingWebElement(BPPromotionalsavings);
		WC.assertingWebElement(BPTotalsavings);
		WC.assertingWebElement(BPBaskettotal);
		WC.assertingWebElement(BPClubcardpoints);
		WC.assertingWebElement(BPExtraclubcardpoints);
		WC.assertingWebElement(BPTotalClubcardpoints);
		WC.assertingWebElement(BPContinuetocheckout);
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,1200);", BPContinuetocheckout);
		WC.checkingBackGroundColour(BPContinuetocheckout, "#fe532d");
		WC.HoverAndcheckingBackGroundColour(BPContinuetocheckout, "#ff8600");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingmessageundertheContinuetocheckoutbutton() {
		WC.verifyText("Got an eCoupon, Clubcard voucher or Giftcard?",
				BPGotAnEcouponmessage);
		WC.verifyText(
				"You can add these in checkout. You will also be able to select delivery options.",
				BPYouCanaddtheseincheckoutMessage);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingContinuetoshoppingbuttonexists() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,1200);", BPContinueShoppingButton);
		WC.assertingWebElement(BPContinueShoppingButton);
		WC.checkingBackGroundColour(BPContinueShoppingButton, "#a69f88");
		WC.HoverAndcheckingBackGroundColour(BPContinueShoppingButton, "#00a1e0");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingForMessageinBasketPage() {
		WC.assertingWebElement(YouHaveTwoItemsInYourBasket);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingForbuttonsInyourBasket() {
		WC.assertingWebElement(BPContinueShoppingLink);
		WC.assertingWebElement(BPCheckOutButton);
		WC.checkingBackGroundColour(BPCheckOutButton, "#fe532d");
		WC.HoverAndcheckingBackGroundColour(BPCheckOutButton, "#ff8600");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingForheaderItemsInyourBasket() {
		WC.assertingWebElement(BPItems);
		WC.assertingWebElement(BPQuantity);
		WC.assertingWebElement(BPPrice);
		WC.assertingWebElement(BPItemSubtotal);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingitemsundertheeachproductinYourbasket() {
		WC.assertingWebElement(BPProductDescription);
		WC.assertingWebElement(BPProductSupplier);
		WC.assertingWebElement(BPProductOffer);
		WC.assertingWebElement(BPProductDeliveryOption);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkinglinksexistsunderquanityboxforaproduct() {
		WC.assertingWebElement(BPUpdateLink);
		WC.checkingColour(BPContinueShoppingLink, "#645945");
		WC.HoverAndcheckingColour(BPUpdateLink, "#d6d2c4");
		WC.assertingWebElement(BPRemoveLink);
		WC.checkingColour(BPRemoveLink, "#645945");
		WC.HoverAndcheckingColour(BPRemoveLink, "#00a1e0");
		WC.assertingWebElement(BPSaveForLaterLink);
		WC.checkingColour(BPSaveForLaterLink, "#645945");
		WC.HoverAndcheckingColour(BPSaveForLaterLink, "#00a1e0");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO enterQuantityValue() {
		Assert.assertTrue("Is " + BPQuantityTextField + " displayed ========>",
				BPQuantityTextField.isDisplayed());
		BPQuantityTextField.clear();
		BPQuantityTextField.sendKeys("2");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO checkingdetailsoftheserviceproduct() {
		WC.assertingWebElement(BPServiceProductDesc);
		WC.assertingWebElement(BPServiceProductQuantity);
		WC.assertingWebElement(BPServiceProductPrice);
		WC.assertingWebElement(BPServiceProductSubtotal);
		WC.assertingWebElement(BPServiceProductUpdateLink);
		WC.assertingWebElement(BPServiceProductRemoveLink);
		WC.assertingWebElement(BPServiceProductQuantityTextField);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO verifyTheSaveforLinkdoesnotWExistsInServiceProductModule() {
		WC.assertingWebElement(BPSaveForLaterLink);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO verifyEmptyBasketButtonExistsUnderYourBasketBox() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,900);", BPEmptyBasketButton);
		WC.assertingWebElement(BPEmptyBasketButton);
		WC.HoverAndcheckingBackGroundColour(BPEmptyBasketButton, "#00a1e0");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO CheckingItemsSavedForLaterProducts() {
		WC.assertingWebElement(ItemSavedForLaterProducts);
		WC.verifyText("Items saved for later", ItemSavedForLaterProducts);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO CheckingItemsSavedForLaterProductsItems() {
		WC.assertingWebElement(ItemSavedForLaterProductTitle);
		WC.assertingWebElement(ItemSavedForLaterSuppliedBy);
		WC.assertingWebElement(ItemSavedForLaterCostOftheProduct);
		WC.assertingWebElement(ItemSavedForLaterSavings);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO CheckingItemsSavedForLaterMoveToBasketButton() {
		WC.assertingWebElement(ItemSavedForLaterMoveToBasketButton);
		WC.checkingBackGroundColour(ItemSavedForLaterMoveToBasketButton,
				"#a69f88");
		WC.HoverAndcheckingBackGroundColour(
				ItemSavedForLaterMoveToBasketButton, "#00a1e0");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO CheckingItemsSavedForLaterXButton() {
		WC.assertingWebElement(ItemSavedForLaterXbutton);
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}

	public BasketPagePO CheckingItemsSavedForLaterShowallButton() {
		WC.assertingWebElement(ItemSavedForLaterShowAllbutton);
		WC.checkingBackGroundColour(ItemSavedForLaterShowAllbutton, "#a69f88");
		WC.HoverAndcheckingBackGroundColour(ItemSavedForLaterShowAllbutton,
				"#00a1e0");
		return (BasketPagePO) WC.getPageObject(BasketPagePO.class);
	}
	
public Boolean checkClubcardBoostImageIsDisplayed() {
		
		
		return(WC.elementIsDisplayedOrNot(ClubcardBoostImage));
		
	}
	public Boolean checkInClubcardBoostMoreInfoLinkIsDisplayed() {
		
		return(WC.elementIsDisplayedOrNot(InClubcardBoostMoreInfoLink));
		
	}
}
