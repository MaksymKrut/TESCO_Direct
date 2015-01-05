package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class AddCardPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(AddCardPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.AddCardPage.Breadcrumbs)
	@CacheLookup
	private WebElement Breadcrumbs;
	@FindBy(xpath = Constants.AddCardPage.AddAPaymentCardHeaderText)
	@CacheLookup
	private WebElement AddAPaymentCardHeaderText;
	@FindBy(xpath = Constants.AddCardPage.PaymentCardInformationaltext)
	@CacheLookup
	private WebElement PaymentCardInformationaltext;
	@FindBy(xpath = Constants.AddCardPage.CardDetailsHeader)
	@CacheLookup
	private WebElement CardDetailsHeader;
	@FindBy(xpath = Constants.AddCardPage.CardNumberLabel)
	@CacheLookup
	private WebElement CardNumberLabel;
	@FindBy(css = Constants.AddCardPage.CardNumberTextbox)
	@CacheLookup
	private WebElement CardNumberTextbox;
	@FindBy(xpath = Constants.AddCardPage.CardHoldersNameLabel)
	@CacheLookup
	private WebElement CardHoldersNameLabel;
	@FindBy(css = Constants.AddCardPage.CardHoldersNameTextbox)
	@CacheLookup
	private WebElement CardHoldersNameTextbox;
	@FindBy(xpath = Constants.AddCardPage.IssueNumberLabel)
	@CacheLookup
	private WebElement IssueNumberLabel;
	@FindBy(css = Constants.AddCardPage.IssueNumberTextbox)
	@CacheLookup
	private WebElement IssueNumberTextbox;
	@FindBy(xpath = Constants.AddCardPage.ExpiryDateLabel)
	@CacheLookup
	private WebElement ExpiryDateLabel;
	@FindBy(css = Constants.AddCardPage.ExpiryDateMonthDropdown)
	@CacheLookup
	private WebElement ExpiryDateMonthDropdown;
	@FindBy(css = Constants.AddCardPage.ExpiryDateYearDropdown)
	@CacheLookup
	private WebElement ExpiryDateYearDropdown;
	@FindBy(xpath = Constants.AddCardPage.BillingAddressHeader)
	@CacheLookup
	private WebElement BillingAddressHeader;
	@FindBy(xpath = Constants.AddCardPage.BillingAddressInformationalText)
	@CacheLookup
	private WebElement BillingAddressInformationalText;
	@FindBy(xpath = Constants.AddCardPage.MyBillingAddressRadioButtonLabel)
	@CacheLookup
	private WebElement MyBillingAddressRadioButtonLabel;
	@FindBy(css = Constants.AddCardPage.MyBillingAddressRadioButton)
	@CacheLookup
	private WebElement MyBillingAddressRadioButton;
	@FindBy(xpath = Constants.AddCardPage.AddressName)
	@CacheLookup
	private WebElement AddressName;
	@FindBy(xpath = Constants.AddCardPage.StreetAddress)
	@CacheLookup
	private WebElement StreetAddress;
	@FindBy(xpath = Constants.AddCardPage.Region)
	@CacheLookup
	private WebElement Region;
	@FindBy(xpath = Constants.AddCardPage.PostCode)
	@CacheLookup
	private WebElement PostCode;
	@FindBy(css = Constants.AddCardPage.AddButton)
	@CacheLookup
	private WebElement AddButton;
	
	
	
	
	
	


	
	
	
		
		
       public Boolean checkBreadcrumbsIsDisplayed() {
		
		return(WC.elementIsDisplayedOrNot(Breadcrumbs));
	}




	public Boolean checkUserIsOnAddPaymentCardPage() {
		return(WC.getPageTitle().contains("Add your payment card - Tesco.com"));
		
	}




	public Boolean checkAddAPaymentCardHeaderTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddAPaymentCardHeaderText));
	}




	public Boolean checkPaymentCardInformationalTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(PaymentCardInformationaltext));
	}




	public Boolean checkCardDetailsHeaderIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardDetailsHeader));
	}




	public Boolean checkCardNumberLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardNumberLabel));
	}




	public Boolean checkCardNumberTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardNumberTextbox));
	}




	public Boolean checkCardHoldersNameLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardHoldersNameLabel));
	}




	public Boolean checkCardHoldersNameTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardHoldersNameTextbox));
	}




	public Boolean checkIssueNumberLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(IssueNumberLabel));
	}




	public Boolean checkIssueNumberTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(IssueNumberTextbox));
	}




	public Boolean checkExpiryDateLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ExpiryDateLabel));
	}




	public Boolean checkExpiryDateMonthDropdownWithMMasDefaultValueIsDisplayed() {
		String defaultValue= WC.getSelectedOptionFromDropdown(ExpiryDateMonthDropdown);
		if(  (WC.elementIsDisplayedOrNot(ExpiryDateMonthDropdown))   &&    (defaultValue.equalsIgnoreCase("MM"))                             )
		return true;
		else
		return false;
	}




	public Boolean checkExpiryDateYearDropdownWithYYYYasDefaultValueIsDisplayed() {
		String defaultValue= WC.getSelectedOptionFromDropdown(ExpiryDateYearDropdown);
		if(  (WC.elementIsDisplayedOrNot(ExpiryDateYearDropdown))   &&    (defaultValue.equalsIgnoreCase("YYYY"))                             )
		return true;
		else
		return false;
	}




	public Boolean checkBillingAddressHeaderIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(BillingAddressHeader));
	}




	public Boolean checkBillingAddressInformationalTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(BillingAddressInformationalText));
	}




	public Boolean checkMyBillingAddressRadioButtonLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(MyBillingAddressRadioButtonLabel));
	}




	public Boolean checkMyBillingAddressRadioButtonNotSelectedByDefaultIsDisplayed() {
		Boolean statusOfRadioButton = WC.statusofRadiobutton(MyBillingAddressRadioButton);
		if( (WC.elementIsDisplayedOrNot(MyBillingAddressRadioButton))    &&   (statusOfRadioButton==false)     )
		return true;
		else
		return false;
	}




	public Boolean checkAddressNameIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddressName));
	}




	public Boolean checkAddressIsDisplayed() {
		return( (WC.elementIsDisplayedOrNot(StreetAddress)) && (WC.elementIsDisplayedOrNot(Region)) && (WC.elementIsDisplayedOrNot(PostCode))   );
	}




	public Boolean checkAddButtonIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddButton));

	}




	public void enterCardNumber(String value) {
		WC.type(CardNumberTextbox, value);
		
	}




	public void enterCardHoldersName(String value) {
		WC.type(CardHoldersNameTextbox, value);
		
	}




	public void selectCardExpiryMonth(String value) {
		WC.selectfromdropdown(ExpiryDateMonthDropdown, value);
		
	}




	public void selectCardExpiryYear(String value) {
		WC.selectfromdropdown(ExpiryDateYearDropdown, value);		
	}




	public void selectBillingAddressRadioButton() {
		WC.click(MyBillingAddressRadioButton);
		
	}




	public void clickOnAddButton() {
		WC.click(AddButton);
		
	}


	

}
