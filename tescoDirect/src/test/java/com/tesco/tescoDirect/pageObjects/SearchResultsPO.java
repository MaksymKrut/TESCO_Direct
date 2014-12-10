package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class SearchResultsPO extends PageObject {
	private final static Logger LOG = Logger.getLogger(AboutYouPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	@FindBy(css = Constants.SearchResultsPage.SearchBar)
	// @CacheLookup
	private WebElement SearchBar;

	@FindBy(css = Constants.SearchResultsPage.GoButton)
	// @CacheLookup
	private WebElement GoButton;
	@FindBy(css = Constants.SearchResultsPage.ResultspageTitle)
	@CacheLookup
	private WebElement ResultspageTitle;
	@FindBy(xpath = Constants.SearchResultsPage.NoOfProducts)
	@CacheLookup
	private WebElement NoOfProducts;
	@FindBy(css = Constants.SearchResultsPage.NoOfProductsMobile)
	@CacheLookup
	private WebElement NoOfProductsMobile;
	@FindBy(css = Constants.SearchResultsPage.HudlImage)
	@CacheLookup
	private WebElement HudlImage;
	@FindBy(css = Constants.SearchResultsPage.HudlText)
	@CacheLookup
	private WebElement HudlText;
	@FindBy(css = Constants.SearchResultsPage.ViewByCategory)
	@CacheLookup
	private WebElement ViewByCategory;

	@FindBy(css = Constants.SearchResultsPage.DifferentCategory)
	@CacheLookup
	private WebElement DifferentCategory;
	@FindBy(css = Constants.SearchResultsPage.NumberofProductsAvailableWithinEachRange)
	@CacheLookup
	private WebElement NumberofProductsAvailableWithinEachRange;
	@FindBy(css = Constants.SearchResultsPage.RefineByClearAllButtonLVP)
	@CacheLookup
	private WebElement RefineByClearAllButtonLVP;
	@FindBy(css = Constants.SearchResultsPage.RefineByClearAllButtonMobile)
	@CacheLookup
	private WebElement RefineByClearAllButtonMobile;
	@FindBy(css = Constants.SearchResultsPage.RefineByCloseButtonMobile)
	@CacheLookup
	private WebElement RefineByCloseButtonMobile;
	@FindBy(xpath = Constants.SearchResultsPage.PriceFilter)
	@CacheLookup
	private WebElement PriceFilter;
	@FindBy(xpath = Constants.SearchResultsPage.PriceRanges)
	@CacheLookup
	private WebElement PriceRanges;
	@FindBy(xpath = Constants.SearchResultsPage.PriceRangesWithinEachRange)
	@CacheLookup
	private WebElement PriceRangesWithinEachRange;
	@FindBy(css = Constants.SearchResultsPage.AddToBasketButton)
	@CacheLookup
	private WebElement AddToBasketButton;
	@FindBy(css = Constants.SearchResultsPage.TurnOffButton)
	@CacheLookup
	private WebElement TurnOffButton;
	@FindBy(css = Constants.SearchResultsPage.ViewMoreButton)
	@CacheLookup
	private WebElement ViewMoreButton;

	@FindBy(css = Constants.SearchResultsPage.ProductImage)
	@CacheLookup
	private WebElement ProductImage;
	@FindBy(css = Constants.SearchResultsPage.ProductTitle)
	@CacheLookup
	private WebElement ProductTitle;
	@FindBy(css = Constants.SearchResultsPage.RatingStar)
	@CacheLookup
	private WebElement RatingStar;
	@FindBy(css = Constants.SearchResultsPage.SellerInformation)
	@CacheLookup
	private WebElement SellerInformation;
	@FindBy(css = Constants.SearchResultsPage.SelectOptions)
	@CacheLookup
	private WebElement SelectOptions;
	@FindBy(css = Constants.SearchResultsPage.AddToCompareCheckBox)
	@CacheLookup
	private WebElement AddToCompareCheckBox;

	@FindBy(css = Constants.SearchResultsPage.PriceButtonMobile)
	@CacheLookup
	private WebElement PriceButtonMobile;
	@FindBy(css = Constants.SearchResultsPage.PriceFilterCheckBox)
	@CacheLookup
	private WebElement PriceFilterCheckBox;
	@FindBy(css = Constants.SearchResultsPage.PriceFilterCheckBoxMVP)
	@CacheLookup
	private WebElement PriceFilterCheckBoxMVP;
	@FindBy(css = Constants.SearchResultsPage.ShowProductsbuttonMobile)
	@CacheLookup
	private WebElement ShowProductsbuttonMobile;
	@FindBy(css = Constants.SearchResultsPage.filterOptionTablet)
	@CacheLookup
	private WebElement filterOptionTablet;
	@FindBy(css = Constants.SearchResultsPage.ShowProductsbuttonMVP)
	@CacheLookup
	private WebElement ShowProductsbuttonMVP;
	@FindBy(css = Constants.SearchResultsPage.PriceOfTheproduct)
	// @CacheLookup
	private WebElement PriceOfTheproduct;
	@FindBy(css = Constants.SearchResultsPage.SortByRelavance)
	// @CacheLookup
	private WebElement SortByRelavance;
	@FindBy(css = Constants.SearchResultsPage.SortByLowToHigh)
	@CacheLookup
	private WebElement SortByLowToHigh;
	@FindBy(css = Constants.SearchResultsPage.SortByLowToHighMobile)
	@CacheLookup
	private WebElement SortByLowToHighMobile;
	@FindBy(css = Constants.SearchResultsPage.ClearAllButton)
	@CacheLookup
	private WebElement ClearAllButton;
	@FindBy(css = Constants.SearchResultsPage.BreadCrumbMobile)
	@CacheLookup
	private WebElement BreadCrumbMobile;
	@FindBy(css = Constants.SearchResultsPage.BreadCrumbHomeLink)
	@CacheLookup
	private WebElement BreadCrumbHomeLink;
	@FindBy(css = Constants.SearchResultsPage.SortByNew)
	@CacheLookup
	private WebElement SortByNew;
	@FindBy(css = Constants.SearchResultsPage.SortByNEWMobile)
	@CacheLookup
	private WebElement SortByNEWMobile;
	@FindBy(css = Constants.SearchResultsPage.ImNewPingImage)
	@CacheLookup
	private WebElement ImNewPingImage;
	@FindBy(css = Constants.SearchResultsPage.ClubCardBoostImage)
	@CacheLookup
	private WebElement ClubCardBoostImage;
	@FindBy(css = Constants.SearchResultsPage.Category)
	@CacheLookup
	private WebElement Category;
	@FindBy(css = Constants.SearchResultsPage.CategoryNumber)
	@CacheLookup
	private WebElement CategoryNumber;
	@FindBy(css = Constants.SearchResultsPage.ShowingProducts)
	@CacheLookup
	private WebElement ShowingProducts;
	@FindBy(css = Constants.SearchResultsPage.ShowingProductsMobile)
	@CacheLookup
	private WebElement ShowingProductsMobile;
	@FindBy(partialLinkText = Constants.HomePage.SignOutLink)
	@CacheLookup
	private WebElement SignOutLink;
	@FindBy(css = Constants.PdpPage.AddTobasketButton)
	@CacheLookup
	private WebElement AddTobasketButton;
	@FindBy(css = Constants.SearchResultsPage.ProductImage1)
	@CacheLookup
	private WebElement ProductImage1;

	public SearchResultsPO typetoSearch(String product) {
		WC.assertingWebElement(SearchBar);
		SearchBar.sendKeys(product);
		WC.waitForElementClickable(By.cssSelector(Constants.SearchResultsPage.GoButton), 30);
		GoButton.click();
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingforMatchingProductsinSearchResultPage() {
		WC.assertingWebElement(ResultspageTitle);
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")
				&& RefineByClearAllButtonLVP.isDisplayed()) {
			WC.assertingWebElement(NoOfProducts);
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")
				&& RefineByClearAllButtonMobile.isDisplayed()) {
			WC.assertingWebElement(NoOfProductsMobile);
		}
		WC.assertingWebElement(HudlImage);
		WC.assertingWebElement(HudlText);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingforViewByCategory() {
		WC.assertingWebElement(ViewByCategory);
		WC.assertingWebElement(DifferentCategory);
		WC.assertingWebElement(NumberofProductsAvailableWithinEachRange);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO RefineByClearAllButton() {
		WC.wait(2);
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")
				&& RefineByClearAllButtonLVP.isDisplayed()) {
			WC.assertingWebElement(RefineByClearAllButtonLVP);
			WC.assertingWebElement(PriceFilter);
			WC.assertingWebElement(PriceRanges);
			WC.assertingWebElement(PriceRangesWithinEachRange);

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")
				&& RefineByClearAllButtonMobile.isDisplayed()) {
			WC.assertingWebElement(RefineByClearAllButtonMobile);
			RefineByClearAllButtonMobile.click();
			WC.assertingWebElement(PriceFilter);
			WC.assertingWebElement(PriceRanges);
			WC.assertingWebElement(PriceRangesWithinEachRange);
			RefineByCloseButtonMobile.click();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForAddtoBasketButton() {
		WC.assertingWebElement(AddToBasketButton);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickOnAddtoBasketButton() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.AddToBasketButton),
				50);
		WC.assertingWebElement(AddToBasketButton);
		WC.click(AddToBasketButton);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO scrollDownTobottomOfpage() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,3500);", TurnOffButton);
		WC.wait(5);
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.TurnOffButton), 50)
				.click();
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForViewMoreProductsButton() throws Exception {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(2500,0);", SearchBar);
		WC.waitForElement(SearchBar, 50);
		SearchBar.sendKeys("curtains");
		GoButton.click();
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickViewMoreProductsButton() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ViewMoreButton), 50);
		WC.click(ViewMoreButton);
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ViewMoreButton), 50);
		WC.click(ViewMoreButton);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForMoreProducts() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ViewMoreButton), 50);
		WC.click(ViewMoreButton);
		WC.wait(5);
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.TurnOffButton), 50)
				.click();
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO verifyingProductImage() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ProductImage), 50);
		WC.assertingWebElement(ProductImage);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO verifyingProductTitle() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ProductTitle), 50);
		WC.assertingWebElement(ProductTitle);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO verifyingRatingStar() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.RatingStar), 50);
		WC.assertingWebElement(RatingStar);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO verifyingSellerInformation() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.SellerInformation),
				50);
		WC.assertingWebElement(SellerInformation);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO verifyingSelectOptions() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.SelectOptions), 50);
		WC.assertingWebElement(SelectOptions);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO verifyingAddToCompareCheckBoxInLVP() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.assertingWebElement(AddToCompareCheckBox);
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.assertFalseWebElement(AddToCompareCheckBox);

		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO userappliesthePricefilter() {
		if (WC.LVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.PriceFilterCheckBox),
					50);
			WC.assertingWebElement(PriceFilterCheckBox);
			PriceFilterCheckBox.click();
		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.RefineByClearAllButtonMobile),
					50);
			RefineByClearAllButtonMobile.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.PriceButtonMobile),
					50);
			WC.assertingWebElement(PriceButtonMobile);
			PriceButtonMobile.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.PriceFilterCheckBox),
					50);
			WC.assertingWebElement(PriceFilterCheckBox);
			PriceFilterCheckBox.click();
		} else if (WC.MVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.RefineByClearAllButtonMobile),
					50);
			RefineByClearAllButtonMobile.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.PriceFilterCheckBoxMVP),
					50);
			WC.assertingWebElement(PriceFilterCheckBoxMVP);
			PriceFilterCheckBoxMVP.click();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForProductsWithIntheRange() {
		if (WC.LVP()) {
			WC.wait(5);
			checkingprice();

		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.ShowProductsbuttonMobile),
					50);
			ShowProductsbuttonMobile.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.NoOfProductsMobile),
					50);
			WC.assertingWebElement(NoOfProductsMobile);
			checkingprice();
		} else if (WC.MVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.ShowProductsbuttonMVP),
					50);
			ShowProductsbuttonMVP.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.NoOfProductsMobile),
					50);
			WC.assertingWebElement(NoOfProductsMobile);
			checkingprice();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForProductsWithIntheRangeForBest() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.wait(5);
			checkingprice();

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.NoOfProductsMobile),
					50);
			WC.assertingWebElement(NoOfProductsMobile);
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public boolean checkingprice() {
		double price = 5.00;
		String ActualPricetext = PriceOfTheproduct.getText();
		double ActualPrice = Double.parseDouble(ActualPricetext.replaceAll("£",
				""));
		if (ActualPrice <= price)

			return true;
		else
			return false;
	}

	public SearchResultsPO clickingONsortByFilter() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByRelavance),
					50);
			WC.assertingWebElement(SortByRelavance);
			WC.wait(5);
			SortByRelavance.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByLowToHigh),
					50);
			WC.wait(5);
			WC.assertingWebElement(SortByLowToHigh);
			SortByLowToHigh.click();

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByRelavance),
					50);
			WC.assertingWebElement(SortByRelavance);
			WC.wait(5);
			SortByRelavance.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByLowToHighMobile),
					50);
			WC.assertingWebElement(SortByLowToHighMobile);
			WC.wait(5);
			SortByLowToHighMobile.click();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickingOnClearAllButton() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ClearAllButton), 50);
		WC.assertingWebElement(ClearAllButton);
		ClearAllButton.click();
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickingviewbycategory() {
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.CategoryNumber),
					50);
			CategoryNumber.getText();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.Category), 50);
			WC.assertingWebElement(Category);
			WC.click(Category);
			WC.wait(10);
			WC.assertingWebElement(ShowingProducts);
			ShowingProducts.getText();
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.CategoryNumber),
					50);
			CategoryNumber.getText();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.Category), 50);
			WC.assertingWebElement(Category);
			WC.click(Category);
			WC.wait(1);
			WC.assertingWebElement(ShowingProductsMobile);
			ShowingProductsMobile.getText();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickingONBreadCrumb() {
		String Currentinstance = WC.getDriver().getClass().getName();
		System.out.println(Currentinstance);
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.BreadCrumbHomeLink),
					50);
			WC.assertingWebElement(BreadCrumbHomeLink);
			BreadCrumbHomeLink.click();
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.click(BreadCrumbMobile);
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.BreadCrumbHomeLink),
					50);
			WC.assertingWebElement(BreadCrumbHomeLink);
			BreadCrumbHomeLink.click();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForBreadCrumbNavigatedPage() {
		String BreadCrumbExpectedPage = "http://www.tesco.com/direct/";
		String BreadCrumbActualPage = WC.getCurrentURL().trim();
		Assert.assertEquals(BreadCrumbExpectedPage, BreadCrumbActualPage);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickingONNewProducts() {
		String Currentinstance = WC.getDriver().getClass().getName();
		System.out.println(Currentinstance);
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.waitForElement(SearchBar, 50);
			SearchBar.sendKeys("ipad");
			GoButton.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByRelavance),
					50);
			WC.assertingWebElement(SortByRelavance);
			SortByRelavance.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByNew), 50);
			WC.assertingWebElement(SortByNew);
			SortByNew.click();

		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.waitForElement(SearchBar, 50);
			SearchBar.sendKeys("ipad");
			GoButton.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByRelavance),
					50);
			WC.assertingWebElement(SortByRelavance);
			SortByRelavance.click();
			WC.waitForElementClickable(
					By.cssSelector(Constants.SearchResultsPage.SortByNEWMobile),
					50);
			WC.assertingWebElement(SortByNEWMobile);
			SortByNEWMobile.click();
		}
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO checkingForImNewPingImage() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ImNewPingImage), 50);
		WC.assertingWebElement(ImNewPingImage);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO clickOnPDPAddToBasketButton() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.PdpPage.AddTobasketButton), 150);
		WC.assertingWebElement(AddTobasketButton);
		WC.click(AddTobasketButton);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO SearchingForBoostItems() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.SearchBar), 50);
		WC.assertingWebElement(SearchBar);
		SearchBar.sendKeys("hudl");
		GoButton.click();
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

	public SearchResultsPO CheckingForClubCardBoostImage() {
		WC.waitForElementClickable(
				By.cssSelector(Constants.SearchResultsPage.ClubCardBoostImage),
				50);
		WC.assertingWebElement(ClubCardBoostImage);
		return (SearchResultsPO) WC.getPageObject(SearchResultsPO.class);
	}

}
