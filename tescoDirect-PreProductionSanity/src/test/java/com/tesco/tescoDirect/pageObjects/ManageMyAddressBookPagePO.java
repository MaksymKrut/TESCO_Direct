package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class ManageMyAddressBookPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(ManageMyAddressBookPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.ManageMyAddressBookPage.NewAddressCard)
	@CacheLookup
	private WebElement NewAddressCard;
	@FindBy(css = Constants.ManageMyAddressBookPage.DeleteAddressButton)
	@CacheLookup
	private WebElement DeleteAddressButton;
	@FindBy(css = Constants.ManageMyAddressBookPage.YesButton)
	@CacheLookup
	private WebElement YesButton;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.DeletedAddressConfirmationText)
	@CacheLookup
	private WebElement DeletedAddressConfirmationText;
	@FindBy(partialLinkText = Constants.ManageMyAddressBookPage.SignOutLink)
	@CacheLookup
	private WebElement SignOutLink;
	
	@FindBy(css = Constants.ManageMyAddressBookPage.Breadcrumbs)
	@CacheLookup
	private WebElement Breadcrumbs;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.ManageMyAddressBookHeaderText)
	@CacheLookup
	private WebElement ManageMyAddressBookHeaderText;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.AddressInformationalText)
	@CacheLookup
	private WebElement AddressInformationalText;
	@FindBy(css = Constants.ManageMyAddressBookPage.RadioButtonForTheFirstAddress)
	@CacheLookup
	private WebElement RadioButtonForTheFirstAddress;
	@FindBy(css = Constants.ManageMyAddressBookPage.RadioButtonForTheSecondAddress)
	@CacheLookup
	private WebElement RadioButtonForTheSecondAddress;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.AddressName)
	@CacheLookup
	private WebElement AddressName;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.StreetAddress)
	@CacheLookup
	private WebElement StreetAddress;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.Locality)
	@CacheLookup
	private WebElement Locality;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.PostCode)
	@CacheLookup
	private WebElement PostCode;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.Country)
	@CacheLookup
	private WebElement Country;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.DayPhoneLabel)
	@CacheLookup
	private WebElement DayPhoneLabel;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.DayPhoneNumber)
	@CacheLookup
	private WebElement DayPhoneNumber;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.EveningPhoneLabel)
	@CacheLookup
	private WebElement EveningPhoneLabel;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.EveningPhoneNumber)
	@CacheLookup
	private WebElement EveningPhoneNumber;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.MobilePhoneLabel)
	@CacheLookup
	private WebElement MobilePhoneLabel;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.MobilePhoneNumber)
	@CacheLookup
	private WebElement MobilePhoneNumber;
	@FindBy(css = Constants.ManageMyAddressBookPage.EditButtonInFirstAddress)
	@CacheLookup
	private WebElement EditButtonInFirstAddress;
	@FindBy(css = Constants.ManageMyAddressBookPage.EditButtonInSecondAddress)
	@CacheLookup
	private WebElement EditButtonInSecondAddress;
	@FindBy(css = Constants.ManageMyAddressBookPage.DeleteButtonInSecondAddress)
	@CacheLookup
	private WebElement DeleteButtonInSecondAddress;
	@FindBy(css = Constants.ManageMyAddressBookPage.AddANewAddressButton)
	@CacheLookup
	private WebElement AddANewAddressButton;
	@FindBy(css = Constants.ManageMyAddressBookPage.SaveChangesButton)
	@CacheLookup
	private WebElement SaveChangesButton;
	@FindBy(xpath = Constants.ManageMyAddressBookPage.PaymentCardLinkedToAddressError)
	@CacheLookup
	private WebElement PaymentCardLinkedToAddressError;

	public Boolean checkNewAddressIsDisplayed() {
		
		return(WC.elementIsDisplayedOrNot(NewAddressCard));
	}

	

	public Boolean checkAddressHasBeenDeleted() {
		
		WC.click(DeleteAddressButton);
		if (WC.LVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		} else if (WC.SVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		}
		else if (WC.MVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		}
		WC.waitForElementToBePresent(DeletedAddressConfirmationText);
		return(WC.elementIsDisplayedOrNot(DeletedAddressConfirmationText));
	}



	public void signOut() {
		WC.click(SignOutLink);
		
		
	}
	
	public boolean checkUserIsOnmanageMyAddressBookPage() {
		return(WC.getPageTitle().contains("Manage my address book - Tesco.com"));
	}



	public Boolean checkBreadcrumbsIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(Breadcrumbs));
	}



	public Boolean checkManageMyAddressBookHeaderTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ManageMyAddressBookHeaderText));
	}



	public Boolean checkAddressInformationalTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddressInformationalText));
	}



	public Boolean checkRadioButtonForTheFirstAddressIsSelected() {
		
		return(WC.statusofRadiobutton(RadioButtonForTheFirstAddress));
	}



	public Boolean checkRadioButtonForTheSecondAddressIsNotSelected() {
		return(WC.statusofRadiobutton(RadioButtonForTheSecondAddress));
	}



	public Boolean checkAddressNameIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddressName));
	}



	public Boolean checkAddressIsDisplayed() {
		return( (WC.elementIsDisplayedOrNot(StreetAddress)) && (WC.elementIsDisplayedOrNot(Locality)) && (WC.elementIsDisplayedOrNot(PostCode))   );
	}



	public Boolean checkDayPhoneLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(DayPhoneLabel));
	}



	public Boolean checkDayPhoneNumberIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(DayPhoneNumber));
	}



	public Boolean checkEveningPhoneLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(EveningPhoneLabel));
	}



	public Boolean checkEveningPhoneNumberIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(EveningPhoneNumber));
	}



	public Boolean checkMobilePhoneLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(MobilePhoneLabel));
	}



	public Boolean checkMobilePhoneNumberIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(MobilePhoneNumber));
	}



	public Boolean checkEditButtonInFirstAddressIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(EditButtonInFirstAddress));
	}



	public Boolean checkEditButtonInSecondAddressIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(EditButtonInSecondAddress));
	}



	public Boolean checkDeleteButtonInSecondAddressIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(DeleteButtonInSecondAddress));
	}



	public Boolean checkAddANewAddressButtonIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddANewAddressButton));
	}



	public Boolean checkSaveChangesButtonIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(SaveChangesButton));
	}



	public void clickOnRadioButtonForTheSecondAddress() {
		WC.click(RadioButtonForTheSecondAddress);
		
	}



	public void clickOnSaveChangesButton() {
		WC.click(SaveChangesButton);
		
	}



	public void tryToDeleteAddressLinkedToCard() {
		WC.click(DeleteAddressButton);
if (WC.LVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		} else if (WC.SVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		}
		else if (WC.MVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		}
		
	}
	
	public void tryToDeleteAddressNotLinkedToCard() {
		WC.click(DeleteAddressButton);
if (WC.LVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		} else if (WC.SVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		}
		else if (WC.MVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyAddressBookPage.YesButton), 50);
			WC.assertingWebElement(YesButton);
			WC.clickOn(YesButton);
		}
		
	}



	public boolean paymentCardLinkedToAddressErrorisDisplayed() {
		
		WC.waitForElementToBePresent(PaymentCardLinkedToAddressError);
		return(WC.elementIsDisplayedOrNot(PaymentCardLinkedToAddressError));
		
	}



	public boolean checkRespectiveAddressHasBeenDeleted() {
		WC.waitForElementToBePresent(DeletedAddressConfirmationText);
		return(WC.elementIsDisplayedOrNot(DeletedAddressConfirmationText));
	}




	


	
	
	
	
	
	

	

}
