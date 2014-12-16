package com.tesco.tescoDirect.pageObjects;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class BasketDetailsPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(BasketDetailsPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	
	@FindBy(css = Constants.BasketDetailsPage.ContinueShoppingLink)
	@CacheLookup
	private WebElement ContinueShoppingLink;
	@FindBy(css = Constants.BasketDetailsPage.CheckOutButton)
	@CacheLookup
	private WebElement CheckOutButton;
	@FindBy(css = Constants.BasketDetailsPage.Page)
	@CacheLookup
	private WebElement Page;
	@FindBy(css = Constants.BasketDetailsPage.ClosePageButton)
	@CacheLookup
	private WebElement ClosePageButton;
	
	
	public void clickOnContinueShoppingLink() {
		
		String Currentinstance = WC.getDriver().getClass().getName();
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")){
			//WC.waitForElementClickable(ContinueShoppingLink, 10);
			WC.click(ClosePageButton);
			//WC.waitForElementToBePresent(Page);
			//WC.clickOn(ContinueShoppingLink);
			WC.waitForElementToDisappear(Constants.BasketDetailsPage.Page, 10);
		} else if  (Currentinstance.equals("io.appium.java_client.android.AndroidDriver")){

			
			WC.clickOn(ContinueShoppingLink);
		}
		
		
	}


	public void clickOnCheckOutButton() {
		
		
		WC.click(CheckOutButton);
		
	}


	
	
}
