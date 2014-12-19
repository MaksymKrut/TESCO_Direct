package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class Hudl2SoftProtectiveShellPinkPDPPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(Hudl2SoftProtectiveShellPinkPDPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	public boolean checkUserIsOnhudl2SoftProtectiveShellPinkPDPPage() {
		String actualPageTitle = WC.getPageTitle();
		String expectedPageTitle = "Buy hudl2 Soft Protective Shell from our Cases & Covers range - Tesco.com";
		Boolean result = actualPageTitle.equals(expectedPageTitle);
		System.out.println("The Page Title is " + actualPageTitle);
		return result;
	}

}
