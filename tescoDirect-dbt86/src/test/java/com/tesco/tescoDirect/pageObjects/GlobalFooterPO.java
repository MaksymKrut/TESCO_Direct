package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class GlobalFooterPO extends PageObject {
	private final static Logger LOG = Logger.getLogger(GlobalFooterPO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	@FindBy(css = Constants.GlobalFooter.VISA)
	@CacheLookup
	private WebElement visa;
	@FindBy(css = Constants.GlobalFooter.MasterCard)
	@CacheLookup
	private WebElement mastercard;
	@FindBy(css = Constants.GlobalFooter.AmericanExpress)
	@CacheLookup
	private WebElement americanexpress;
	@FindBy(css = Constants.GlobalFooter.Maestro)
	@CacheLookup
	private WebElement maestro;
	@FindBy(css = Constants.GlobalFooter.TESCOBank)
	@CacheLookup
	private WebElement tescobank;
	@FindBy(css = Constants.GlobalFooter.VeriSignSecured)
	@CacheLookup
	private WebElement verisignsecured;
	@FindBy(css = Constants.GlobalFooter.VerifiedbyVISA)
	@CacheLookup
	private WebElement verifiedbyvisa;
	@FindBy(css = Constants.GlobalFooter.MasterCardSecureCode)
	@CacheLookup
	private WebElement mastercardsecurecode;
	@FindBy(css = Constants.GlobalFooter.AmericanExpressSafekey)
	@CacheLookup
	private WebElement americanexpresssafekey;

	@FindBy(xpath = Constants.GlobalFooter.FooterStoreLocator)
	@CacheLookup
	private WebElement FooterStoreLocator;
	@FindBy(xpath = Constants.GlobalFooter.FooterNeedHelp)
	@CacheLookup
	private WebElement FooterNeedHelp;
	@FindBy(xpath = Constants.GlobalFooter.FooterTescoDirectLogo)
	@CacheLookup
	private WebElement FooterTescoDirectLogo;
	@FindBy(xpath = Constants.GlobalFooter.CustomerService)
	@CacheLookup
	private WebElement CustomerService;
	@FindBy(xpath = Constants.GlobalFooter.Help)
	@CacheLookup
	private WebElement Help;
	@FindBy(xpath = Constants.GlobalFooter.MyAccount)
	@CacheLookup
	private WebElement MyAccount;
	@FindBy(xpath = Constants.GlobalFooter.WhereIsMyOrder)
	@CacheLookup
	private WebElement WhereIsMyOrder;
	@FindBy(xpath = Constants.GlobalFooter.DeliveryInformation)
	@CacheLookup
	private WebElement DeliveryInformation;
	@FindBy(xpath = Constants.GlobalFooter.ReturnsPolicy)
	@CacheLookup
	private WebElement ReturnsPolicy;
	@FindBy(xpath = Constants.GlobalFooter.ContactUs)
	@CacheLookup
	private WebElement ContactUs;
	@FindBy(xpath = Constants.GlobalFooter.BuyingGuides)
	@CacheLookup
	private WebElement BuyingGuides;
	@FindBy(xpath = Constants.GlobalFooter.OurWebsite)
	@CacheLookup
	private WebElement OurWebsite;
	@FindBy(xpath = Constants.GlobalFooter.Sitemap)
	@CacheLookup
	private WebElement Sitemap;
	@FindBy(xpath = Constants.GlobalFooter.Accessibility)
	@CacheLookup
	private WebElement Accessibility;
	@FindBy(xpath = Constants.GlobalFooter.PrivacyPolicy)
	@CacheLookup
	private WebElement PrivacyPolicy;
	@FindBy(xpath = Constants.GlobalFooter.TermsAndCondition)
	@CacheLookup
	private WebElement TermsAndCondition;
	@FindBy(xpath = Constants.GlobalFooter.SignUpforEmail)
	@CacheLookup
	private WebElement SignUpforEmail;
	@FindBy(xpath = Constants.GlobalFooter.SellersAtTesco)
	@CacheLookup
	private WebElement SellersAtTesco;
	@FindBy(xpath = Constants.GlobalFooter.ExploreTesco)
	@CacheLookup
	private WebElement ExploreTesco;
	@FindBy(xpath = Constants.GlobalFooter.TescoPLC)
	@CacheLookup
	private WebElement TescoPLC;
	@FindBy(xpath = Constants.GlobalFooter.WineByTheCase)
	@CacheLookup
	private WebElement WineByTheCase;
	@FindBy(xpath = Constants.GlobalFooter.TescoBank)
	@CacheLookup
	private WebElement TescoBank;
	@FindBy(xpath = Constants.GlobalFooter.ClubCard)
	@CacheLookup
	private WebElement ClubCard;
	@FindBy(xpath = Constants.GlobalFooter.GreenerLiving)
	@CacheLookup
	private WebElement GreenerLiving;
	@FindBy(xpath = Constants.GlobalFooter.Carrers)
	@CacheLookup
	private WebElement Carrers;
	@FindBy(xpath = Constants.GlobalFooter.Groceries)
	@CacheLookup
	private WebElement Groceries;
	@FindBy(xpath = Constants.GlobalFooter.Entertainment)
	@CacheLookup
	private WebElement Entertainment;
	@FindBy(xpath = Constants.GlobalFooter.PhoneShop)
	@CacheLookup
	private WebElement PhoneShop;
	@FindBy(xpath = Constants.GlobalFooter.TescoDiets)
	@CacheLookup
	private WebElement TescoDiets;
	@FindBy(xpath = Constants.GlobalFooter.Opticians)
	@CacheLookup
	private WebElement Opticians;
	@FindBy(xpath = Constants.GlobalFooter.EveryLittleHelps)
	@CacheLookup
	private WebElement EveryLittleHelps;
	@FindBy(xpath = Constants.GlobalFooter.AllRightsReserved)
	@CacheLookup
	private WebElement AllRightsReserved;

	public GlobalFooterPO checkingDiffPaymentMethodinFooter() {
		LOG.debug("Checking different payment logos in checkout page footer");
		Assert.assertTrue("Is " + visa + " displayed ========>",
				visa.isDisplayed());
		Assert.assertTrue("Is " + mastercard + " displayed ========>",
				mastercard.isDisplayed());
		Assert.assertTrue("Is " + americanexpress + " displayed ========>",
				americanexpress.isDisplayed());
		Assert.assertTrue("Is " + maestro + " displayed ========>",
				maestro.isDisplayed());
		Assert.assertTrue("Is " + tescobank + " displayed ========>",
				tescobank.isDisplayed());
		Assert.assertTrue("Is " + verisignsecured + " displayed ========>",
				verisignsecured.isDisplayed());
		Assert.assertTrue("Is " + verifiedbyvisa + " displayed ========>",
				verifiedbyvisa.isDisplayed());
		Assert.assertTrue(
				"Is " + mastercardsecurecode + " displayed ========>",
				mastercardsecurecode.isDisplayed());
		Assert.assertTrue("Is " + americanexpresssafekey
				+ " displayed ========>", americanexpresssafekey.isDisplayed());
		return (GlobalFooterPO) WC.getPageObject(GlobalFooterPO.class);

	}

	public GlobalFooterPO checkingGlobalFooter() {
		LOG.debug("Checking global footer links");
		/*
		 * ((JavascriptExecutor) WC.getDriver()).executeScript(
		 * "window.scrollBy(0,1200);", CustomerService);
		 * WC.assertingWebElement(FooterStoreLocator);
		 * WC.checkingBackGroundColour(FooterStoreLocator, "#ffffff");
		 * WC.HoverAndcheckingBackGroundColour(FooterStoreLocator, "#00a1e0");
		 * WC.assertingWebElement(FooterNeedHelp);
		 * //WC.checkingBackGroundColour(FooterNeedHelp, "#ffffff");
		 * WC.HoverAndcheckingBackGroundColour(FooterNeedHelp, "#00a1e0");
		 * 
		 * WC.assertingWebElement(FooterTescoDirectLogo);
		 */

		WC.assertingWebElement(CustomerService);
		WC.assertingWebElement(Help);
		WC.checkingColour(Help, "#645945");
		WC.HoverAndcheckingBackGroundColour(Help, "#00a1e0");
		WC.assertingWebElement(MyAccount);
		WC.checkingColour(MyAccount, "#645945");
		WC.HoverAndcheckingBackGroundColour(MyAccount, "#00a1e0");
		WC.assertingWebElement(WhereIsMyOrder);
		WC.checkingColour(WhereIsMyOrder, "#645945");
		WC.HoverAndcheckingBackGroundColour(WhereIsMyOrder, "#00a1e0");
		WC.assertingWebElement(DeliveryInformation);
		WC.checkingColour(DeliveryInformation, "#645945");
		WC.HoverAndcheckingBackGroundColour(DeliveryInformation, "#00a1e0");
		WC.assertingWebElement(ReturnsPolicy);
		WC.checkingColour(ReturnsPolicy, "#645945");
		WC.HoverAndcheckingBackGroundColour(ReturnsPolicy, "#00a1e0");
		WC.assertingWebElement(ContactUs);
		WC.checkingColour(ContactUs, "#645945");
		WC.HoverAndcheckingBackGroundColour(ContactUs, "#00a1e0");
		WC.assertingWebElement(BuyingGuides);
		WC.checkingColour(BuyingGuides, "#645945");
		WC.HoverAndcheckingBackGroundColour(BuyingGuides, "#00a1e0");

		WC.assertingWebElement(OurWebsite);
		WC.assertingWebElement(Sitemap);
		WC.checkingColour(Sitemap, "#645945");
		WC.HoverAndcheckingBackGroundColour(Sitemap, "#00a1e0");
		WC.assertingWebElement(Accessibility);
		WC.checkingColour(Accessibility, "#645945");
		WC.HoverAndcheckingBackGroundColour(Accessibility, "#00a1e0");
		WC.assertingWebElement(PrivacyPolicy);
		WC.checkingColour(PrivacyPolicy, "#645945");
		WC.HoverAndcheckingBackGroundColour(PrivacyPolicy, "#00a1e0");
		WC.assertingWebElement(TermsAndCondition);
		WC.checkingColour(TermsAndCondition, "#645945");
		WC.HoverAndcheckingBackGroundColour(TermsAndCondition, "#00a1e0");
		WC.assertingWebElement(SignUpforEmail);
		WC.checkingColour(SignUpforEmail, "#645945");
		WC.HoverAndcheckingBackGroundColour(SignUpforEmail, "#00a1e0");
		WC.assertingWebElement(SellersAtTesco);
		WC.checkingColour(SellersAtTesco, "#645945");
		WC.HoverAndcheckingBackGroundColour(SellersAtTesco, "#00a1e0");

		WC.assertingWebElement(ExploreTesco);
		WC.assertingWebElement(TescoPLC);
		WC.checkingColour(TescoPLC, "#645945");
		WC.HoverAndcheckingBackGroundColour(TescoPLC, "#00a1e0");
		WC.assertingWebElement(WineByTheCase);
		WC.checkingColour(WineByTheCase, "#645945");
		WC.HoverAndcheckingBackGroundColour(WineByTheCase, "#00a1e0");
		WC.assertingWebElement(TescoBank);
		WC.checkingColour(TescoBank, "#645945");
		WC.HoverAndcheckingBackGroundColour(TescoBank, "#00a1e0");
		WC.assertingWebElement(ClubCard);
		WC.checkingColour(ClubCard, "#645945");
		WC.HoverAndcheckingBackGroundColour(ClubCard, "#00a1e0");
		WC.assertingWebElement(GreenerLiving);
		WC.checkingColour(GreenerLiving, "#645945");
		WC.HoverAndcheckingBackGroundColour(GreenerLiving, "#00a1e0");
		WC.assertingWebElement(Carrers);
		WC.checkingColour(Carrers, "#645945");
		WC.HoverAndcheckingBackGroundColour(Carrers, "#00a1e0");
		WC.assertingWebElement(Groceries);
		WC.checkingColour(Groceries, "#645945");
		WC.HoverAndcheckingBackGroundColour(Groceries, "#00a1e0");
		WC.assertingWebElement(Entertainment);
		WC.checkingColour(Entertainment, "#645945");
		WC.HoverAndcheckingBackGroundColour(Entertainment, "#00a1e0");
		WC.assertingWebElement(PhoneShop);
		WC.checkingColour(PhoneShop, "#645945");
		WC.HoverAndcheckingBackGroundColour(PhoneShop, "#00a1e0");
		WC.assertingWebElement(TescoDiets);
		WC.checkingColour(TescoDiets, "#645945");
		WC.HoverAndcheckingBackGroundColour(TescoDiets, "#00a1e0");
		WC.assertingWebElement(Opticians);
		WC.checkingColour(Opticians, "#645945");
		WC.HoverAndcheckingBackGroundColour(Opticians, "#00a1e0");

		WC.assertingWebElement(EveryLittleHelps);
		WC.assertingWebElement(AllRightsReserved);
		return (GlobalFooterPO) WC.getPageObject(GlobalFooterPO.class);

	}
}
