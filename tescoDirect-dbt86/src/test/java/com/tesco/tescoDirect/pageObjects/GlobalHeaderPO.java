package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class GlobalHeaderPO extends PageObject {
	private final static Logger LOG = Logger.getLogger(GlobalHeaderPO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	public WebDriver driver;
	@FindBy(id = Constants.GlobalHeader.TescoDirectLogo)
	@CacheLookup
	private WebElement tescodirectlogo;
	@FindBy(partialLinkText = Constants.GlobalHeader.WebsiteFeedback)
	@CacheLookup
	private WebElement websitefeedback;
	@FindBy(partialLinkText = Constants.GlobalHeader.MyWishlists)
	@CacheLookup
	private WebElement mywishlists;
	@FindBy(partialLinkText = Constants.GlobalHeader.RecentlyViewed)
	@CacheLookup
	private WebElement recentlyviewed;
	@FindBy(partialLinkText = Constants.GlobalHeader.MyAccount)
	@CacheLookup
	private WebElement myaccount;
	@FindBy(partialLinkText = Constants.GlobalHeader.Help)
	@CacheLookup
	private WebElement help;

	@FindBy(id = Constants.GlobalHeader.ShopbyDepartmentmenubutton)
	@CacheLookup
	private WebElement shopbydepartmentmenubutton;
	@FindBy(id = Constants.GlobalHeader.Imlookingforsearchbar)
	@CacheLookup
	private WebElement imlookingforsearchbar;
	@FindBy(xpath = Constants.GlobalHeader.ImlookingforsearchIcon)
	@CacheLookup
	private WebElement imlookingforsearchicon;
	@FindBy(xpath = Constants.GlobalHeader.RegisterorSignInbutton)
	@CacheLookup
	private WebElement registerorsigninbutton;
	@FindBy(xpath = Constants.GlobalHeader.Yourbasketbutton)
	@CacheLookup
	private WebElement yourbasketbutton;
	@FindBy(xpath = Constants.GlobalHeader.Offerslink)
	@CacheLookup
	private WebElement offerslink;
	@FindBy(xpath = Constants.GlobalHeader.Clearancelink)
	@CacheLookup
	private WebElement clearancelink;
	@FindBy(xpath = Constants.GlobalHeader.StoreLocatorlink)
	@CacheLookup
	private WebElement storelocatorlink;

	public GlobalHeaderPO checkingforGlobalHeaderLinks() throws Exception {
		try {
			LOG.debug("Checking Global Header Links");
			Assert.assertTrue("Is " + tescodirectlogo + " displayed ========>",
					tescodirectlogo.isDisplayed());
			Assert.assertTrue("Is " + websitefeedback + " displayed ========>",
					websitefeedback.isDisplayed());
			Assert.assertTrue("Is " + mywishlists + " displayed ========>",
					mywishlists.isDisplayed());
			Assert.assertTrue("Is " + recentlyviewed + " displayed ========>",
					recentlyviewed.isDisplayed());
			Assert.assertTrue("Is " + myaccount + " displayed ========>",
					myaccount.isDisplayed());
			Assert.assertTrue("Is " + help + " displayed ========>",
					help.isDisplayed());

		} catch (Exception e) {
			LOG.error("Error checkingforGlobalHeaderLinks", e);
			// WC.takeScreenshot(websitefeedback,"websitefeedback");
		}
		return (GlobalHeaderPO) WC.getPageObject(GlobalHeaderPO.class);
	}

	public GlobalHeaderPO checkingforBasketPageHeaderLinks() {

		LOG.debug("checking for Basket Page Header Links");
		Assert.assertTrue("Is " + shopbydepartmentmenubutton
				+ " displayed ========>",
				shopbydepartmentmenubutton.isDisplayed());
		Assert.assertTrue("Is " + imlookingforsearchbar
				+ " displayed ========>", imlookingforsearchbar.isDisplayed());
		Assert.assertTrue("Is " + imlookingforsearchicon
				+ " displayed ========>", imlookingforsearchicon.isDisplayed());
		Assert.assertTrue("Is " + registerorsigninbutton
				+ " displayed ========>", registerorsigninbutton.isDisplayed());
		Assert.assertTrue("Is " + yourbasketbutton + " displayed ========>",
				yourbasketbutton.isDisplayed());
		Assert.assertTrue("Is " + offerslink + " displayed ========>",
				offerslink.isDisplayed());
		Assert.assertTrue("Is " + clearancelink + " displayed ========>",
				clearancelink.isDisplayed());
		Assert.assertTrue("Is " + storelocatorlink + " displayed ========>",
				storelocatorlink.isDisplayed());
		return (GlobalHeaderPO) WC.getPageObject(GlobalHeaderPO.class);
	}

	public GlobalHeaderPO checkingforCancelMyorderHeaderLinks() {

		LOG.debug("checking for Cancel My order Header Links");
		WC.assertingWebElement(tescodirectlogo);
		WC.assertingWebElement(offerslink);
		WC.assertingWebElement(clearancelink);
		WC.assertingWebElement(storelocatorlink);
		return (GlobalHeaderPO) WC.getPageObject(GlobalHeaderPO.class);
	}
}
