package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class Hudl2PinkPLPPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(Hudl2PinkPLPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.Hudl2PinkPLPPage.PinkItem)
	@CacheLookup
	private WebElement PinkItem;

	public boolean checkUserIsOnHudl2PinkPLPPage() {

		/*
		 * ((JavascriptExecutor) WC.getDriver()).executeScript(
		 * "window.scrollBy(0,500);", PinkItem);
		 */
		String linkText = WC.getText(PinkItem);
		if (linkText.contains("Pink"))
			return true;
		else
			return false;

	}

}
