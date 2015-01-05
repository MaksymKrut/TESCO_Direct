package com.tesco.tescoDirect.pageObjects;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class HarryPotterDVDPDPPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(HarryPotterDVDPDPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	
	@FindBy(css = Constants.HarryPotterDVDPDPPage.AddToBasketButton)
	@CacheLookup
	private WebElement AddToBasketButton;

	public void clickOnAddToBasketButton() {
		 
		
		WC.clickOn(AddToBasketButton);
		
	}
	
	
}
