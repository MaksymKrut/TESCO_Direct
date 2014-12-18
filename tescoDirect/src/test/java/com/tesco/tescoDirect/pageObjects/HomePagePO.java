package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class HomePagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(HomePagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(partialLinkText = Constants.HomePage.SignInOrRegisterLink)
	@CacheLookup
	private WebElement SignInOrRegisterLink;
	@FindBy(xpath = Constants.HomePage.WelcomeMsg)
	@CacheLookup
	private WebElement WelcomeMsg;
	@FindBy(xpath = Constants.HomePage.WelcomeMsgMVP)
	@CacheLookup
	private WebElement WelcomeMsgMVP;
	@FindBy(css = Constants.HomePage.WelcomeMsgMobile)
	@CacheLookup
	private WebElement WelcomeMsgMobile;
	@FindBy(css = Constants.HomePage.SignInButton)
	@CacheLookup
	private WebElement SignInButton;
	@FindBy(partialLinkText = Constants.HomePage.SignOutLink)
	@CacheLookup
	private WebElement SignOutLink;
	@FindBy(css = Constants.HomePage.ViewBasketButton)
	@CacheLookup
	private WebElement ViewBasketButton;
	@FindBy(css = Constants.HomePage.BasketContainerViewBasketButtonMobile)
	@CacheLookup
	private WebElement BasketContainerViewBasketButtonMobile;

	@FindBy(css = Constants.HomePage.SearchOverlayFirstSuggestion)
	@CacheLookup
	private WebElement SearchOverlayFirstSuggestion;
	@FindBy(css = Constants.HomePage.SearchSuggestionAsYouTypeOverLayType1)
	@CacheLookup
	private WebElement SearchSuggestionAsYouTypeOverLayType1;
	@FindBy(css = Constants.HomePage.SearchSuggestionAsYouTypeOverLayType2)
	@CacheLookup
	private WebElement SearchSuggestionAsYouTypeOverLayType2;
	@FindBy(css = Constants.HomePage.SearchByProductNameCatalogueNoOrKeywordTextField)
	private WebElement SearchByProductNameCatalogueNoOrKeywordTextField;
	@FindBy(css = Constants.HomePage.SearchButton)
	@CacheLookup
	private WebElement SearchButton;
	@FindBy(linkText = Constants.HomePage.MyAccountLink)
	@CacheLookup
	private WebElement MyAccountLink;
	@FindBy(css = Constants.HomePage.CookiesMsg)
	@CacheLookup
	private WebElement CookiesMsg;
	@FindBy(css = Constants.HomePage.CookiesMsgCloseButton)
	@CacheLookup
	private WebElement CookiesMsgCloseButton;

	public AboutYouPagePO clickingOnSigninorRegisterLink() {
		if (SignInButton.isDisplayed()) {
			SignInButton.click();
			WC.implicitwait(50);
			WC.assertingWebElement(SignInOrRegisterLink);
			SignInOrRegisterLink.click();
		} else {
			WC.implicitwait(50);
			WC.assertingWebElement(SignInOrRegisterLink);
			SignInOrRegisterLink.click();
		}
		return (AboutYouPagePO) WC.getPageObject(AboutYouPagePO.class);
	}

	public void selectSearchOverlayFirstSuggestion() throws Exception {

		WC.waitForElementDisplayed(SearchOverlayFirstSuggestion);
		WC.click(SearchOverlayFirstSuggestion);

	}

	public Boolean checkSearchSuggestionAsYouTypeOverLayIsDisplayed()
			throws Exception {
		WC.waitForElementToBePresent(SearchSuggestionAsYouTypeOverLayType1, 10);
		WC.waitForElementToBePresent(SearchSuggestionAsYouTypeOverLayType2, 10);
		//WC.waitForpresenceofElement(By.cssSelector(Constants.HomePage.SearchSuggestionAsYouTypeOverLay),60);
		if(WC.elementIsDisplayedOrNot(SearchSuggestionAsYouTypeOverLayType1)==true || WC.elementIsDisplayedOrNot(SearchSuggestionAsYouTypeOverLayType2)==true)
			return true;
		else
			return false;
		//return (WC.elementIsDisplayedOrNot(SearchSuggestionAsYouTypeOverLay));

	}

	public AboutYouPagePO clickingOnViewBasketButton() {
		if (WC.LVP()) {
			WC.assertingWebElement(ViewBasketButton);
			WC.click(ViewBasketButton);
		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.HomePage.ViewBasketButton), 20);
			WC.assertingWebElement(ViewBasketButton);
			WC.click(ViewBasketButton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.HomePage.BasketContainerViewBasketButtonMobile),
					20);
			WC.assertingWebElement(BasketContainerViewBasketButtonMobile);
			WC.click(BasketContainerViewBasketButtonMobile);
		} else if (WC.MVP()) {
			WC.assertingWebElement(ViewBasketButton);
			WC.click(ViewBasketButton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.HomePage.BasketContainerViewBasketButtonMobile),
					20);
			WC.assertingWebElement(BasketContainerViewBasketButtonMobile);
			WC.click(BasketContainerViewBasketButtonMobile);
		}
		return (AboutYouPagePO) WC.getPageObject(AboutYouPagePO.class);
	}

	public void checkUserisLoggedin() {
		if (WC.LVP()) {
			WC.implicitwait(50);
			WC.assertingWebElement(WelcomeMsg);
		} else if (WC.SVP()) {
			WC.wait(5);
			WC.waitForElementClickable(
					By.cssSelector(Constants.HomePage.SignInButton), 60);
			WC.click(SignInButton);
			WC.wait(3);
			WC.assertingWebElement(WelcomeMsgMobile);
		} else if (WC.MVP()) {
			WC.implicitwait(60);
			WC.assertingWebElement(WelcomeMsgMVP);
		}

	}

	public void clickOnSearchByProductNameCatalogueNoOrKeywordTextField() {

		// WC.webdriverWait(SearchByProductNameCatalogueNoOrKeywordTextField,
		// 30);
		WC.click(SearchByProductNameCatalogueNoOrKeywordTextField);

	}

	public void typeInSearchByProductNameCatalogueNoOrKeywordTextField(
			String characters) throws InterruptedException {

		WC.type(SearchByProductNameCatalogueNoOrKeywordTextField, characters);

	}

	public void clickOnSearchButton() {
		WC.click(SearchButton);
		;

	}

	public void clickOnSignOutLink() {
		if (WC.LVP()) {
			WC.implicitwait(60);
			SignOutLink.click();
		} else if (WC.SVP()) {
			SignInButton.click();
			WC.implicitwait(60);
			SignOutLink.click();
		} else if (WC.MVP()) {
			WC.implicitwait(60);
			SignOutLink.click();
		}

	}

	public void checkUserisOnHomePage() {
		Assert.assertTrue(WC.getPageTitle().contains(
				"Tesco direct: Electricals, Home Furnishing, Toys"));
	}
	
	public void clickOnMyAccountLink() {
		WC.click(MyAccountLink);
		
	}
	
	public void closeCookiesMsg() {
		if((WC.elementIsDisplayedOrNot(CookiesMsg))==true)
			WC.click(CookiesMsgCloseButton);
		
	}

}
