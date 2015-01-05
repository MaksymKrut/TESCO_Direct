package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class MyAccountPO extends PageObject {
	private final static Logger LOG = Logger.getLogger(MyAccountPO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.MyAccountPage.SignInButton)
	@CacheLookup
	private WebElement SignInButton;
	@FindBy(partialLinkText = Constants.MyAccountPage.YourAccount)
	@CacheLookup
	private WebElement YourAccount;
	@FindBy(partialLinkText = Constants.MyAccountPage.YourDirectOrders)
	@CacheLookup
	private WebElement YourDirectOrders;
	@FindBy(partialLinkText = Constants.MyAccountPage.YourWishlists)
	@CacheLookup
	private WebElement YourWishlists;
	@FindBy(partialLinkText = Constants.MyAccountPage.Yourrecentlyvieweditems)
	@CacheLookup
	private WebElement Yourrecentlyvieweditems;
	@FindBy(partialLinkText = Constants.MyAccountPage.Managecontactdetails)
	@CacheLookup
	private WebElement Managecontactdetails;
	@FindBy(partialLinkText = Constants.MyAccountPage.Manageaddressbook)
	@CacheLookup
	private WebElement Manageaddressbook;
	@FindBy(partialLinkText = Constants.MyAccountPage.Managepaymentdetails)
	@CacheLookup
	private WebElement Managepaymentdetails;
	@FindBy(css = Constants.MyAccountPage.HelpButton)
	@CacheLookup
	private WebElement HelpButton;
	@FindBy(css = Constants.MyAccountPage.HelpButtonMobile)
	@CacheLookup
	private WebElement HelpButtonMobile;
	@FindBy(css = Constants.MyAccountPage.SignOutButton)
	@CacheLookup
	private WebElement SignOutButton;
	@FindBy(css = Constants.MyAccountPage.SignOutButtonMobile)
	@CacheLookup
	private WebElement SignOutButtonMobile;
	
	@FindBy(css = Constants.MyAccountPage.ViewDirectOrdersbutton)
	@CacheLookup
	private WebElement ViewDirectOrdersbutton;
	
	@FindBy(linkText = Constants.MyAccountPage.AddANewAddressLink)
	@CacheLookup
	private WebElement AddANewAddressLink;
	@FindBy(linkText = Constants.MyAccountPage.AddAPaymentCardLink)
	@CacheLookup
	private WebElement AddAPaymentCardLink;
	@FindBy(linkText = Constants.MyAccountPage.ChangeMyEmailAddressLink)
	@CacheLookup
	private WebElement ChangeMyEmailAddressLink;
	@FindBy(linkText = Constants.MyAccountPage.ChangePasswordLink)
	@CacheLookup
	private WebElement ChangePasswordLink;
	@FindBy(linkText = Constants.MyAccountPage.ManageMyPaymentDetailsLink)
	@CacheLookup
	private WebElement ManageMyPaymentDetailsLink;
	@FindBy(linkText = Constants.MyAccountPage.ManageMyAddressBookLink)
	@CacheLookup
	private WebElement ManageMyAddressBookLink;
	

	public MyAccountPO clickingOnSignInbutton() {
		WC.assertingWebElement(SignInButton);
		//WC.HoverAndcheckingBackGroundColour(SignInButton, "#00a1e0");
		SignInButton.click();
		return (MyAccountPO) WC.getPageObject(MyAccountPO.class);
	}

	public MyAccountPO CheckingMyaccountmenuandthefollowingoptions() {
		WC.implicitwait(60);
		//WC.waitForpresenceofElement(By.xpath(Constants.MyAccountPage.YourAccount), 10);
		WC.assertingWebElement(YourAccount);
		//WC.checkingColour(YourAccount, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(YourAccount, "#00a1e0");

		WC.assertingWebElement(YourDirectOrders);
		//WC.checkingColour(YourDirectOrders, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(YourDirectOrders, "#00a1e0");

		WC.assertingWebElement(YourWishlists);
	//	WC.checkingColour(YourWishlists, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(YourWishlists, "#00a1e0");

		WC.assertingWebElement(Yourrecentlyvieweditems);
		//WC.checkingColour(Yourrecentlyvieweditems, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(Yourrecentlyvieweditems, "#00a1e0");

		WC.assertingWebElement(Managecontactdetails);
		//WC.checkingColour(Managecontactdetails, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(Managecontactdetails, "#00a1e0");

		WC.assertingWebElement(Manageaddressbook);
		//WC.checkingColour(Manageaddressbook, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(Manageaddressbook, "#00a1e0");

		WC.assertingWebElement(Managepaymentdetails);
		//WC.checkingColour(Managepaymentdetails, "#7c765f");
		//WC.HoverAndcheckingBackGroundColour(Managepaymentdetails, "#00a1e0");
		if(HelpButton.isDisplayed()==true)
		{
			WC.assertingWebElement(HelpButton);
		}
		else if(HelpButtonMobile.isDisplayed()==true)
		{
			WC.assertingWebElement(HelpButtonMobile);
		}
		//WC.assertingWebElement(HelpButton);
		//WC.checkingBackGroundColour(HelpButton, "#ffffff");
		//WC.HoverAndcheckingBackGroundColour(HelpButton, "#00a1e0");
		if(SignOutButton.isDisplayed()==true)
		{
			WC.assertingWebElement(SignOutButton);
		}
		else if(SignOutButtonMobile.isDisplayed()==true)
		{
			WC.assertingWebElement(SignOutButtonMobile);
		}
		//WC.assertingWebElement(SignOutButton);
		//WC.checkingBackGroundColour(SignOutButton, "#00539f");
		//WC.HoverAndcheckingBackGroundColour(SignOutButton, "#00a1e0");
		
		return (MyAccountPO) WC.getPageObject(MyAccountPO.class);
	}
	public MyAccountPO clickingOnViewDirectOrdersbutton() {
		WC.waitForElementClickable(By.cssSelector(Constants.MyAccountPage.ViewDirectOrdersbutton), 50);
		WC.assertingWebElement(ViewDirectOrdersbutton);
		WC.click(ViewDirectOrdersbutton);
		return (MyAccountPO) WC.getPageObject(MyAccountPO.class);
		
	}
	
	public boolean checkAddANewAddressLinkIsPresent() {
		return(WC.elementIsDisplayedOrNot(AddANewAddressLink));
	}
	
	
	public void clickOnAddANewAddressLink() {
		WC.click(AddANewAddressLink);
		
	}
	
	public boolean checkAddAPaymentCardLinkIsPresent() {
		return(WC.elementIsDisplayedOrNot(AddAPaymentCardLink));
	}
	
	public void clickOnAddAPaymentCardLink() {
		WC.click(AddAPaymentCardLink);
		
	}
	
	public boolean checkChangeMyEmailAddressLinkIsPresent() {
		return(WC.elementIsDisplayedOrNot(ChangeMyEmailAddressLink));
	}
	
	public void clickOnChangeMyEmailAddressLink() {
		WC.click(ChangeMyEmailAddressLink);
		
	}
	
public boolean checkChangePasswordLinkIsPresent() {// TODO Auto-generated method stub
		
		return(WC.elementIsDisplayedOrNot(ChangePasswordLink));
		
	}
public void clickOnChangePasswordLink() {
	WC.click(ChangePasswordLink);
	
}
public boolean checkManageMyPaymentDetailsLinkIsPresent() {
	return(WC.elementIsDisplayedOrNot(ManageMyPaymentDetailsLink));
}

public void clickOnManageMyPaymentDetailsLink() {
	WC.click(ManageMyPaymentDetailsLink);
	
}

public boolean checkManageMyAddressBookLinkIsPresent() {
	return(WC.elementIsDisplayedOrNot(ManageMyAddressBookLink));
	
}

public void clickOnkManageMyAddressBookLink() {
	WC.click(ManageMyAddressBookLink);
	
}
}
