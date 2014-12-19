package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class DvdCategoryPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(DvdCategoryPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	public Boolean checkUserIsOnDVDCategoryPage() {

		String actualPageTitle = WC.getPageTitle();
		String expectedPageTitle = "Buy DVD from our Entertainment & Books range - Tesco.com";
		Boolean result = actualPageTitle.equals(expectedPageTitle);
		return result;

	}

}
