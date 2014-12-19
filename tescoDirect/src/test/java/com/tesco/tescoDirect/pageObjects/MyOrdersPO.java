package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class MyOrdersPO extends PageObject {
	private final static Logger LOG = Logger.getLogger(MyOrdersPO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.MyOrdersPage.ViewOrdersbutton)
	@CacheLookup
	private WebElement ViewOrdersbutton;
	@FindBy(css = Constants.MyOrdersPage.CancelOrdersbutton)
	@CacheLookup
	private WebElement CancelOrdersbutton;
	@FindBy(css = Constants.MyOrdersPage.IWantToDropDown)
	@CacheLookup
	private WebElement IWantToDropDown;
	@FindBy(css = Constants.MyOrdersPage.ReasonDropDown)
	@CacheLookup
	private WebElement ReasonDropDown;
	@FindBy(css = Constants.MyOrdersPage.ReasonDropDownMob)
	@CacheLookup
	private WebElement ReasonDropDownMob;
	@FindBy(css = Constants.MyOrdersPage.CheapElseWhere_Option)
	@CacheLookup
	private WebElement CheapElseWhere_Option;
	@FindBy(css = Constants.MyOrdersPage.CommentsTextBox)
	@CacheLookup
	private WebElement CommentsTextBox;
	@FindBy(css = Constants.MyOrdersPage.SubmitRequestButton)
	@CacheLookup
	private WebElement SubmitRequestButton;
	@FindBy(css = Constants.MyOrdersPage.CancelInfoNotification)
	@CacheLookup
	private WebElement CancelInfoNotification;

	public MyOrdersPO CancelOrder() {
		if (WC.LVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.ViewOrdersbutton), 50);
			WC.assertingWebElement(ViewOrdersbutton);
			WC.click(ViewOrdersbutton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.CancelOrdersbutton),
					50);
			WC.click(CancelOrdersbutton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.ReasonDropDown), 50);
			WC.click(ReasonDropDown);
			WC.waitForElementClickable(By
					.cssSelector(Constants.MyOrdersPage.CheapElseWhere_Option),
					50);
			WC.click(CheapElseWhere_Option);
			CommentsTextBox.sendKeys("Automation Testing");
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.SubmitRequestButton),
					50);
			WC.wait(5);
			WC.click(SubmitRequestButton);
			WC.assertingWebElement(CancelInfoNotification);
		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.ViewOrdersbutton), 50);
			WC.assertingWebElement(ViewOrdersbutton);
			WC.click(ViewOrdersbutton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.IWantToDropDown), 50);
			WC.click(IWantToDropDown);
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.CancelOrdersbutton),
					50);
			WC.click(CancelOrdersbutton);
			WC.selectfromdropdown(ReasonDropDownMob, "Cheaper elsewhere");
			CommentsTextBox.sendKeys("Automation Testing");
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.SubmitRequestButton),
					50);
			WC.wait(5);
			WC.click(SubmitRequestButton);
			WC.assertingWebElement(CancelInfoNotification);
		} else if (WC.MVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.ViewOrdersbutton), 50);
			WC.assertingWebElement(ViewOrdersbutton);
			WC.click(ViewOrdersbutton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.IWantToDropDown), 50);
			WC.click(IWantToDropDown);
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.CancelOrdersbutton),
					50);
			WC.click(CancelOrdersbutton);
			WC.selectfromdropdown(ReasonDropDownMob, "Cheaper elsewhere");
			CommentsTextBox.sendKeys("Automation Testing");
			WC.waitForElementClickable(
					By.cssSelector(Constants.MyOrdersPage.SubmitRequestButton),
					50);
			WC.wait(5);
			WC.click(SubmitRequestButton);
			WC.assertingWebElement(CancelInfoNotification);
		}
		return (MyOrdersPO) WC.getPageObject(MyOrdersPO.class);
	}
}
