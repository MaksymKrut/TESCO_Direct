package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class ChangeEmailAddressPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(ChangeEmailAddressPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.ChangeEmailAddressPage.Breadcrumbs)
	@CacheLookup
	private WebElement Breadcrumbs;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.ChangeMyEmailAddressHeaderText)
	@CacheLookup
	private WebElement ChangeMyEmailAddressHeaderText;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.NewEmailAddressHeaderText)
	@CacheLookup
	private WebElement NewEmailAddressHeaderText;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.OldEmailAddressLabel)
	@CacheLookup
	private WebElement OldEmailAddressLabel;
	@FindBy(css = Constants.ChangeEmailAddressPage.OldEmailAddressTextbox)
	private WebElement  OldEmailAddressTextbox;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.PasswordLabel)
	@CacheLookup
	private WebElement PasswordLabel;
	@FindBy(css = Constants.ChangeEmailAddressPage.PasswordTextbox)
	private WebElement PasswordTextbox;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.NewEmailAddressLabel)
	@CacheLookup
	private WebElement NewEmailAddressLabel;
	@FindBy(css = Constants.ChangeEmailAddressPage.NewEmailAddressTextbox)
	private WebElement NewEmailAddressTextbox;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.ConfirmNewEmailAddressLabel)
	@CacheLookup
	private WebElement ConfirmNewEmailAddressLabel;
	@FindBy(css = Constants.ChangeEmailAddressPage.ConfirmNewEmailAddressTextbox)
	@CacheLookup
	private WebElement ConfirmNewEmailAddressTextbox;
	@FindBy(css = Constants.ChangeEmailAddressPage.CancelButton)
	@CacheLookup
	private WebElement CancelButton;
	@FindBy(css = Constants.ChangeEmailAddressPage.SaveButton)
	@CacheLookup
	private WebElement SaveButton;
	@FindBy(xpath = Constants.ChangeEmailAddressPage.EmailMismatchErrorMsg)
	@CacheLookup
	private WebElement EmailMismatchErrorMsg;
	
	
		
		
       public Boolean checkBreadcrumbsIsDisplayed() {
		
		return(WC.elementIsDisplayedOrNot(Breadcrumbs));
	}




	public Boolean checkUserIsOnChangeMyEmailAddressPage() {
		return(WC.getPageTitle().contains(
				"Change my email address - Tesco.com"));
		
	}




	public Boolean checkChangeMyEmailAddressHeaderTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ChangeMyEmailAddressHeaderText));
	}




	public Boolean checkNewEmailAddressHeaderTextIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(NewEmailAddressHeaderText));
	}




	public Boolean checkOldEmailAddressLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(OldEmailAddressLabel));
	}




	public Boolean checkOldEmailAddressTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(OldEmailAddressTextbox));
	}




	public Boolean checkCurrentEmailAddressInOldEmailAddressTextboxIsDisplayed() {
		String textboxValue = WC.getAttributeValue(OldEmailAddressTextbox, "value");
		if(textboxValue.equalsIgnoreCase("ashish.modi@uk.tesco.com"))
			return true;
		else
			return false;
		//return(WC.elementIsDisplayedOrNot(ChangePasswordHeaderText));
	}




	public Boolean checkPasswordLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(PasswordLabel));
	}




	public Boolean checkPasswordTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(PasswordTextbox));
	}




	public Boolean checkNewEmailAddressLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(NewEmailAddressLabel));
	}




	public Boolean checkNewEmailAddressTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(NewEmailAddressTextbox));
	}




	public Boolean checkConfirmNewEmailAddressLabelIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ConfirmNewEmailAddressLabel));
	}




	public Boolean checkConfirmNewEmailAddressTextboxIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(ConfirmNewEmailAddressTextbox));
	}




	public Boolean checkCancelButtonIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(CancelButton));
	}




	public Boolean checkSaveButtonIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(SaveButton));
	}




	public void enterCurrentPasswordInThePasswordTextbox(String currentPassword) {
		WC.type(PasswordTextbox, currentPassword);
		
	}




	public void clearPasswordTextbox() {
		WC.clearTextBox(PasswordTextbox);
		
	}




	public void clearNewEmailAddressTextbox() {
		WC.clearTextBox(NewEmailAddressTextbox);
		
	}




	public void enterNewEmailAddress(String newEmailAddress) {
		WC.type(NewEmailAddressTextbox, newEmailAddress);
		
	}




	public void clearConfirmNewEmailAddressTextbox() {
		WC.clearTextBox(ConfirmNewEmailAddressTextbox);
		
	}




	public void enterConfirmNewEmailAddress(String confirmNewEmailAddress) {
		WC.type(ConfirmNewEmailAddressTextbox, confirmNewEmailAddress);
		
	}




	public void clickOnSaveButton() {
		WC.click(SaveButton);
		
	}




	public boolean checkEmailMismatchErrorIsDisplayed() {
		return(WC.elementIsDisplayedOrNot(EmailMismatchErrorMsg));
	}




	public void pressTabKey() {
		WC.pressTabKey(ConfirmNewEmailAddressTextbox);
		
	}








	

}
