package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class ManageMyPaymentCardPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(ManageMyPaymentCardPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(xpath = Constants.ManageMyPaymentCardPage.NewCardAddedConfirmationText)
	@CacheLookup
	private WebElement NewCardAddedConfirmationText;
	@FindBy(css = Constants.ManageMyPaymentCardPage.Breadcrumbs)
	@CacheLookup
	private WebElement Breadcrumbs;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.ManageMyPaymentCardHeaderText)
	@CacheLookup
	private WebElement ManageMyPaymentCardHeaderText;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.CardInformationalText)
	@CacheLookup
	private WebElement CardInformationalText;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.CardTypeLabel)
	@CacheLookup
	private WebElement CardTypeLabel;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.CardTypeText)
	@CacheLookup
	private WebElement CardTypeText;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.CardNumberLabel)
	@CacheLookup
	private WebElement CardNumberLabel;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.CardNumberText)
	@CacheLookup
	private WebElement CardNumberText;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.IssueNumberLabel)
	@CacheLookup
	private WebElement IssueNumberLabel;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.ExpiryDateLabel)
	@CacheLookup
	private WebElement ExpiryDateLabel;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.ExpiryDateText)
	@CacheLookup
	private WebElement ExpiryDateText;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.BillingAddressLabel)
	@CacheLookup
	private WebElement BillingAddressLabel;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.AddressName)
	@CacheLookup
	private WebElement AddressName;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.StreetAddress)
	@CacheLookup
	private WebElement StreetAddress;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.Locality)
	@CacheLookup
	private WebElement Locality;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.PostCode)
	@CacheLookup
	private WebElement PostCode;
	@FindBy(css = Constants.ManageMyPaymentCardPage.DeleteButton)
	@CacheLookup
	private WebElement DeleteButton;
	@FindBy(css = Constants.ManageMyPaymentCardPage.ConfirmButton)
	@CacheLookup
	private WebElement ConfirmButton;
	@FindBy(xpath = Constants.ManageMyPaymentCardPage.CardDeletedConfirmationText)
	@CacheLookup
	private WebElement CardDeletedConfirmationText;
	@FindBy(partialLinkText = Constants.ManageMyPaymentCardPage.SignOutLink)
	@CacheLookup
	private WebElement SignOutLink;
	
	
	

	public Boolean checkNewCardAddedConfirmationTextIsDisplayed() {
	
		return(WC.elementIsDisplayedOrNot(NewCardAddedConfirmationText));
	}

	public boolean checkUserIsOnmanageMyPaymentCardPage() {
		return(WC.getPageTitle().contains("Manage my payment card - Tesco.com"));
	}

	public Boolean checkBreadcrumbsIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(Breadcrumbs));
	}

	public Boolean checkManageMyPaymentCardHeaderTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ManageMyPaymentCardHeaderText));
	}

	public Boolean checkCardInformationalTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardInformationalText));
	}

	public Boolean checkCardTypeLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardTypeLabel));

	}

	public Boolean checkCardTypeTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardTypeText));

	}

	public Boolean checkCardNumberLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardNumberLabel));
	}

	public Boolean checkCardNumberTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CardNumberText));
	}

	public Boolean checkIssueNumberLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(IssueNumberLabel));
	}

	public Boolean checkExpiryDateLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ExpiryDateLabel));
	}

	public Boolean checkExpiryDateTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ExpiryDateText));
	}

	public Boolean checkBillingAddressLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(BillingAddressLabel));
	}

	public Boolean checkAddressNameIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(AddressName));
	}

	public Boolean checkAddressIsDisplayed() {
		return( (WC.elementIsDisplayedOrNot(StreetAddress)) && (WC.elementIsDisplayedOrNot(Locality)) && (WC.elementIsDisplayedOrNot(PostCode))   );
	}

	public Boolean checkDeleteButtonIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(DeleteButton));
	}

	public void clickOnDeleteCardButton() {
		WC.click(DeleteButton);
		
	}

	public void clickConfirmOnDialogueBox() {
		//WC.click(ConfirmButton);
		
		
		if (WC.LVP()) {
		
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyPaymentCardPage.ConfirmButton), 50);
			WC.assertingWebElement(ConfirmButton);
			WC.clickOn(ConfirmButton);
		} else if (WC.SVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyPaymentCardPage.ConfirmButton), 50);
			WC.assertingWebElement(ConfirmButton);
			WC.clickOn(ConfirmButton);
		}
		else if (WC.MVP()) {
			
			WC.handlePopup();
			WC.waitForElementClickable(By.cssSelector(Constants.ManageMyPaymentCardPage.ConfirmButton), 50);
			WC.assertingWebElement(ConfirmButton);
			WC.clickOn(ConfirmButton);
		}
		
	}

	public boolean checkCardIsDeleted() {
		return(WC.elementIsDisplayedOrNot(CardDeletedConfirmationText));
	}

	public void signOut() {
		WC.click(SignOutLink);
		
	}
	

	

}
