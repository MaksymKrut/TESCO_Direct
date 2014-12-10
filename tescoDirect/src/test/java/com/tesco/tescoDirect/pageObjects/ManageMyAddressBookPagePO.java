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



	


	
	
	
	
	
	

	

}
