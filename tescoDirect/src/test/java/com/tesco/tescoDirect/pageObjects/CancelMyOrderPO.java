package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class CancelMyOrderPO extends PageObject {
	private final static Logger LOG = Logger.getLogger(CancelMyOrderPO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	@FindBy(css = Constants.CancelMyOrderPage.CancelMyOrderTitle)
	@CacheLookup
	private WebElement CancelMyOrderTitle;
	@FindBy(xpath = Constants.CancelMyOrderPage.Notification)
	@CacheLookup
	private WebElement Notification;
	@FindBy(xpath = Constants.CancelMyOrderPage.OrderNumber)
	@CacheLookup
	private WebElement OrderNumber;
	@FindBy(id = Constants.CancelMyOrderPage.HowMuchMoney)
	@CacheLookup
	private WebElement HowMuchMoney;
	@FindBy(xpath = Constants.CancelMyOrderPage.Primaryreasondropdown)
	@CacheLookup
	private WebElement Primaryreasondropdown;
	@FindBy(xpath = Constants.CancelMyOrderPage.Secondaryreasondropdown)
	@CacheLookup
	private WebElement Secondaryreasondropdown;
	@FindBy(xpath = Constants.CancelMyOrderPage.YourCommentsTextBox)
	@CacheLookup
	private WebElement YourCommentsTextBox;
	@FindBy(xpath = Constants.CancelMyOrderPage.Backtoorderdetailsbutton)
	@CacheLookup
	private WebElement Backtoorderdetailsbutton;
	@FindBy(xpath = Constants.CancelMyOrderPage.Submitrequestbutton)
	@CacheLookup
	private WebElement Submitrequestbutton;
	@FindBy(xpath = Constants.CancelMyOrderPage.PrintThisPagelink)
	@CacheLookup
	private WebElement PrintThisPagelink;
	
	@FindBy(xpath = Constants.CancelMyOrderPage.RefundDetails)
	@CacheLookup
	private WebElement RefundDetails;
	@FindBy(xpath = Constants.CancelMyOrderPage.Cardtype)
	@CacheLookup
	private WebElement Cardtype;
	@FindBy(xpath = Constants.CancelMyOrderPage.CardNumber)
	@CacheLookup
	private WebElement CardNumber;
	@FindBy(xpath = Constants.CancelMyOrderPage.Expirydate)
	@CacheLookup
	private WebElement Expirydate;
	@FindBy(xpath = Constants.CancelMyOrderPage.Nameoncard)
	@CacheLookup
	private WebElement Nameoncard;
	@FindBy(xpath = Constants.CancelMyOrderPage.BillingAddress)
	@CacheLookup
	private WebElement BillingAddress;
	@FindBy(xpath = Constants.CancelMyOrderPage.Amountrefunded)
	@CacheLookup
	private WebElement Amountrefunded;
	@FindBy(xpath = Constants.CancelMyOrderPage.Clubcardendingin)
	@CacheLookup
	private WebElement Clubcardendingin;
	@FindBy(xpath = Constants.CancelMyOrderPage.Clubcardpointsdeducted)
	@CacheLookup
	private WebElement Clubcardpointsdeducted;
	@FindBy(xpath = Constants.CancelMyOrderPage.Thispageissecure)
	@CacheLookup
	private WebElement Thispageissecure;
	
	public CancelMyOrderPO checkingcancelmyorderpage() {
		WC.verifyText("Cancel my order", CancelMyOrderTitle);
		WC.assertingWebElement(OrderNumber);
		WC.assertingWebElement(Notification);
		WC.checkingBackGroundColour(Notification, "#fff8da");
		WC.assertingWebElement(HowMuchMoney);
		WC.checkingColour(HowMuchMoney, "#645945");
		WC.assertingWebElement(Primaryreasondropdown);
		WC.checkingBackGroundColour(Primaryreasondropdown, "#fefde8");
		//WC.assertingWebElement(Secondaryreasondropdown);
		//WC.checkingBackGroundColour(Secondaryreasondropdown, "#fefde8");
		WC.assertingWebElement(YourCommentsTextBox);
		WC.checkingBackGroundColour(YourCommentsTextBox, "#ffffff");
		WC.assertingWebElement(Backtoorderdetailsbutton);
		WC.checkingBackGroundColour(Backtoorderdetailsbutton, "#a69f88");
		WC.HoverAndcheckingBackGroundColour(Backtoorderdetailsbutton, "#00a1e0");
		WC.assertingWebElement(Submitrequestbutton);
		WC.checkingBackGroundColour(Submitrequestbutton, "#a69f88");
		WC.HoverAndcheckingBackGroundColour(Submitrequestbutton, "#00a1e0");
		WC.assertingWebElement(PrintThisPagelink);
		WC.checkingColour(PrintThisPagelink, "#645945");
		WC.HoverAndcheckingColour(PrintThisPagelink, "#00a1e0");
		return (CancelMyOrderPO) WC.getPageObject(CancelMyOrderPO.class);
	}
	
	public CancelMyOrderPO checkingRefundDetails() {
		WC.assertingWebElement(RefundDetails);
		WC.checkingColour(RefundDetails, "#645945");
		WC.assertingWebElement(Cardtype);
		WC.assertingWebElement(CardNumber);
		WC.assertingWebElement(Expirydate);
		WC.assertingWebElement(Nameoncard);
		WC.assertingWebElement(BillingAddress);
		WC.assertingWebElement(Amountrefunded);
		WC.assertingWebElement(Clubcardendingin);
		WC.assertingWebElement(Clubcardpointsdeducted);
		WC.assertingWebElement(Thispageissecure);
		return (CancelMyOrderPO) WC.getPageObject(CancelMyOrderPO.class);
	}
	
}
