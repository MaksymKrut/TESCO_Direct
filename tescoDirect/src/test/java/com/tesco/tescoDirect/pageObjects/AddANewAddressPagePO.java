package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class AddANewAddressPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(AddANewAddressPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.AddANewAddressPage.Breadcrumbs)
	@CacheLookup
	private WebElement Breadcrumbs;
	@FindBy(xpath = Constants.AddANewAddressPage.AddANewAddressHeaderText)
	@CacheLookup
	private WebElement AddANewAddressHeaderText;
	@FindBy(xpath = Constants.AddANewAddressPage.AddressInformationalText)
	@CacheLookup
	private WebElement AddressInformationalText;
	@FindBy(xpath = Constants.AddANewAddressPage.AddressNicknameLabel)
	@CacheLookup
	private WebElement AddressNicknameLabel;
	@FindBy(xpath = Constants.AddANewAddressPage.AddressNicknameExampleText)
	@CacheLookup
	private WebElement AddressNicknameExampleText;
	@FindBy(css = Constants.AddANewAddressPage.AddressNicknameTextbox)
	@CacheLookup
	private WebElement AddressNicknameTextbox;
	@FindBy(xpath = Constants.AddANewAddressPage.PostcodeLabel)
	@CacheLookup
	private WebElement PostcodeLabel;
	@FindBy(css = Constants.AddANewAddressPage.PostcodeTextbox)
	@CacheLookup
	private WebElement PostcodeTextbox;
	@FindBy(css = Constants.AddANewAddressPage.DisabledEditButton)
	@CacheLookup
	private WebElement DisabledEditButton;
	@FindBy(xpath = Constants.AddANewAddressPage.DaytimePhoneLabel)
	@CacheLookup
	private WebElement DaytimePhoneLabel;
	@FindBy(css = Constants.AddANewAddressPage.DaytimePhoneTextbox)
	@CacheLookup
	private WebElement DaytimePhoneTextbox;
	@FindBy(xpath = Constants.AddANewAddressPage.EveningPhoneLabel)
	@CacheLookup
	private WebElement EveningPhoneLabel;
	@FindBy(css = Constants.AddANewAddressPage.EveningPhoneTextbox)
	@CacheLookup
	private WebElement EveningPhoneTextbox;
	@FindBy(xpath = Constants.AddANewAddressPage.MobilePhoneLabel)
	@CacheLookup
	private WebElement MobilePhoneLabel;
	@FindBy(css = Constants.AddANewAddressPage.MobilePhoneTextbox)
	@CacheLookup
	private WebElement MobilePhoneTextbox;
	@FindBy(css = Constants.AddANewAddressPage.EnabledCancelButton)
	@CacheLookup
	private WebElement EnabledCancelButton;
	@FindBy(css = Constants.AddANewAddressPage.DisabledSaveAddressButton)
	@CacheLookup
	private WebElement DisabledSaveAddressButton;
	@FindBy(css = Constants.AddANewAddressPage.EnabledEditButton)
	@CacheLookup
	private WebElement EnabledEditButton;
	@FindBy(css = Constants.AddANewAddressPage.DropdownMatchingAllofthePostcode)
	@CacheLookup
	private WebElement DropdownMatchingAllofthePostcode;
	@FindBy(xpath = Constants.AddANewAddressPage.FirstAddress)
	@CacheLookup
	private WebElement FirstAddress;
	@FindBy(css = Constants.AddANewAddressPage.EnabledSaveAddressButton)
	@CacheLookup
	private WebElement EnabledSaveAddressButton;

	public Boolean checkBreadcrumbsIsDisplayed() {

		return (WC.elementIsDisplayedOrNot(Breadcrumbs));
	}

	public boolean checkUserIsOnAddANewAddressPage() {
		return (WC.getPageTitle().contains("Add A New Address - Tesco.com"));
	}

	public Boolean checkAddANewAddressHeaderTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(AddANewAddressHeaderText));
	}

	public Boolean checkAddressInformationalTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(AddressInformationalText));
	}

	public Boolean checkAddressNicknameLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(AddressNicknameLabel));
	}

	public Boolean checkAddressNicknameExampleTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(AddressNicknameExampleText));
	}

	public Boolean checkAddressNicknameTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(AddressNicknameTextbox));
	}

	public Boolean checkPostcodeLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(PostcodeLabel));
	}

	public Boolean checkPostcodeTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(PostcodeTextbox));
	}

	public Boolean checkDisabledEditButtonIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(DisabledEditButton));
	}

	public Boolean checkDaytimePhoneLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(DaytimePhoneLabel));
	}

	public Boolean checkDaytimePhoneTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(DaytimePhoneTextbox));
	}

	public Boolean checkEveningPhoneLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(EveningPhoneLabel));
	}

	public Boolean checkEveningPhoneTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(EveningPhoneTextbox));
	}

	public Boolean checkMobilePhoneLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(MobilePhoneLabel));
	}

	public Boolean checkMobilePhoneTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(MobilePhoneTextbox));
	}

	public Boolean checkEnabledCancelButtonIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(EnabledCancelButton));
	}

	public Boolean checkDisabledSaveAddressButtonIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(DisabledSaveAddressButton));
	}

	public void enterAddressNickname(String value) {
		WC.type(AddressNicknameTextbox, value);

	}

	public void enterPostcode(String value) {
		WC.type(PostcodeTextbox, value);

	}

	public void enterDaytimePhoneNumber(String value) {
		WC.type(DaytimePhoneTextbox, value);

	}

	public void enterEveningPhoneNumber(String value) {
		WC.type(EveningPhoneTextbox, value);

	}

	public void enterMobilePhoneNumber(String value) {
		WC.type(MobilePhoneTextbox, value);

	}

	public boolean checkEditButtonIsEnabled() {
		WC.waitForElementToBePresent(EnabledEditButton, 30);
		return (WC.elementIsDisplayedOrNot(EnabledEditButton));
	}

	public void selectFirstAddressFromTheAddressDropdown() {
		String Currentinstance = WC.getDriver().getClass().getName();
		System.out.println(Currentinstance);
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.wait(5);
			WC.assertingWebElement(DropdownMatchingAllofthePostcode);
			PostcodeTextbox.sendKeys(Keys.ENTER);
			// FirstAddress.click();
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {

			PostcodeTextbox.sendKeys(Keys.ENTER);
		}

	}

	public boolean checkSaveAddressButtonIsEnabled() {
		WC.click(MobilePhoneTextbox);
		WC.pressTabKey(MobilePhoneTextbox);
		WC.waitForElementToBePresent(EnabledSaveAddressButton, 30);
		return (WC.elementIsDisplayedOrNot(EnabledSaveAddressButton));
	}

	public void clickOnSaveAddressButton() {
		WC.click(EnabledSaveAddressButton);

	}

}
