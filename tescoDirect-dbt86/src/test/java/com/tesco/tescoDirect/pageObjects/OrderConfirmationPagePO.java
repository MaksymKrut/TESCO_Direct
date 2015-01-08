package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class OrderConfirmationPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(OrderConfirmationPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	// public WebDriver driver;

	@FindBy(css = Constants.OrderConfirmationPage.YourOrderHasBeenConfirmed)
	@CacheLookup
	private WebElement YourOrderHasBeenConfirmed;
	@FindBy(css = Constants.OrderConfirmationPage.MyAccount)
	@CacheLookup
	private WebElement MyAccount;
	@FindBy(css = Constants.HomePage.SignInButton)
	@CacheLookup
	private WebElement SignInButton;

	public OrderConfirmationPagePO verifyYourOrderHasBeenConfirmedMessage() {
		WC.wait(10);
		WC.verifyText("Your order has been confirmed",
				YourOrderHasBeenConfirmed);
		return (OrderConfirmationPagePO) WC
				.getPageObject(OrderConfirmationPagePO.class);
	}

	public OrderConfirmationPagePO ClickingOnMyAccount() {
		if (WC.LVP()) {
			WC.assertingWebElement(MyAccount);
			WC.click(MyAccount);
		} else if (WC.SVP()) {
			SignInButton.click();
			WC.implicitwait(60);
			WC.assertingWebElement(MyAccount);
			WC.click(MyAccount);
		} else if (WC.MVP()) {
			WC.assertingWebElement(MyAccount);
			WC.click(MyAccount);
		}

		return (OrderConfirmationPagePO) WC
				.getPageObject(OrderConfirmationPagePO.class);
	}
}
