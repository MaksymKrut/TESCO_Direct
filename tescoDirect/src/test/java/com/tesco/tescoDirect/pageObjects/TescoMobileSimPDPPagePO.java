package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class TescoMobileSimPDPPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(TescoMobileSimPDPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.TescoMobileSimPDPPage.AddToBasketButton)
	@CacheLookup
	private WebElement AddToBasketButton;
	@FindBy(css = Constants.TescoMobileSimPDPPage.SearchByProductNameCatalogueNoOrKeywordTextField)
	private WebElement SearchByProductNameCatalogueNoOrKeywordTextField;
	@FindBy(css = Constants.TescoMobileSimPDPPage.SearchButton)
	@CacheLookup
	private WebElement SearchButton;

	public void clickOnAddToBasketButton() {

		WC.clickOn(AddToBasketButton);

	}

	public void clickOnSearchByProductNameCatalogueNoOrKeywordTextField() {
		WC.waitForElementClickable(
				SearchByProductNameCatalogueNoOrKeywordTextField, 5);
		WC.click(SearchByProductNameCatalogueNoOrKeywordTextField);

	}

	public void typeInSearchByProductNameCatalogueNoOrKeywordTextField(
			String characters) throws InterruptedException {

		WC.type(SearchByProductNameCatalogueNoOrKeywordTextField, characters);

	}

	public void clickOnSearchButton() {
		WC.click(SearchButton);
		;

	}

}
