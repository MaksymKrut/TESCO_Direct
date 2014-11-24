package com.tesco.tescoDirect.pageObjects;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class IpadPDPPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(IpadPDPPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.IpadPDPPage.BreadcrumbsOfTheProduct)
	@CacheLookup
	private WebElement BreadcrumbsOfTheProduct;
	@FindBy(css = Constants.IpadPDPPage.ProductTitle)
	@CacheLookup
	private WebElement ProductTitle;
	@FindBy(css = Constants.IpadPDPPage.ProductCatalogueNumber)
	@CacheLookup
	private WebElement ProductCatalogueNumber;
	@FindBy(css = Constants.IpadPDPPage.ProductImage)
	@CacheLookup
	private WebElement ProductImage;
	@FindBy(css = Constants.IpadPDPPage.ProductStarRating)
	@CacheLookup
	private WebElement ProductStarRating;
	@FindBy(css = Constants.IpadPDPPage.WriteAReviewlink)
	@CacheLookup
	private WebElement WriteAReviewlink;
	@FindBy(xpath = Constants.IpadPDPPage.SocialMediaIcons)
	@CacheLookup
	private WebElement SocialMediaIcons;
	@FindBy(css = Constants.IpadPDPPage.ProductBuyBox)
	@CacheLookup
	private WebElement ProductBuyBox;
	@FindBy(css = Constants.IpadPDPPage.ProductDetailsBlock)
	@CacheLookup
	private WebElement ProductDetailsBlock;
	@FindBy(css = Constants.IpadPDPPage.ProductSpecificationsBlock)
	@CacheLookup
	private WebElement ProductSpecificationsBlock;
	@FindBy(xpath = Constants.IpadPDPPage.CustomersWhoViewedBlock)
	@CacheLookup
	private WebElement CustomersWhoViewedBlock;
	@FindBy(css = Constants.IpadPDPPage.CustomerReviewsBlock)
	@CacheLookup
	private WebElement CustomerReviewsBlock;
	@FindBy(css = Constants.IpadPDPPage.AddToWishlistButton)
	@CacheLookup
	private WebElement AddToWishlistButton;
	@FindBy(css = Constants.IpadPDPPage.SpecialOffersBlock)
	@CacheLookup
	private WebElement SpecialOffersBlock;
	@FindBy(css = Constants.IpadPDPPage.SearchByProductNameCatalogueNoOrKeywordTextField)
	@CacheLookup
	private WebElement SearchByProductNameCatalogueNoOrKeywordTextField;
	@FindBy(css = Constants.IpadPDPPage.SearchButton)
	@CacheLookup
	private WebElement SearchButton;


	public boolean checkUserIsOnhudl2SoftProtectiveShellPinkPDPPage() {
		String actualPageTitle = WC.getPageTitle();
		String expectedPageTitle = "Buy hudl2 Soft Protective Shell from our Cases & Covers range - Tesco.com";
		Boolean result = actualPageTitle.equals(expectedPageTitle);
		System.out.println("The Page Title is "+actualPageTitle);
		return result;
	}




	public Boolean checkBreadcrumbsOfTheProductIsDisplayed() {
		
		return WC.elementIsDisplayedOrNot(BreadcrumbsOfTheProduct);
		
	}




	public Boolean checkProductTitleIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductTitle);
	}




	public Boolean checkProductCatalogueNumberIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductCatalogueNumber);
	}




	public Boolean checkProductImageIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductImage);
	}




	public Boolean checkProductStarRatingIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductStarRating);
	}




	public Boolean checkWriteAReviewlinkIsDisplayed() {
		return WC.elementIsDisplayedOrNot(WriteAReviewlink);
	}




	public Boolean checkSocialMediaIconsIsDisplayed() {
		return WC.elementIsDisplayedOrNot(SocialMediaIcons);
	}




	public Boolean checkProductBuyBoxIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductBuyBox);
	}




	public Boolean checkProductDetailsBlockIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductDetailsBlock);
	}




	public Boolean checkProductSpecificationsBlockIsDisplayed() {
		return WC.elementIsDisplayedOrNot(ProductSpecificationsBlock);
	}




	public Boolean checkCustomersWhoViewedBlockIsDisplayed() {
		return WC.elementIsDisplayedOrNot(CustomersWhoViewedBlock);
	}




	public Boolean checkCustomerReviewsBlockIsDisplayed() {
		return WC.elementIsDisplayedOrNot(CustomerReviewsBlock);
	}




	public Boolean checkAddToWishlistButtonIsDisplayed() {
		return WC.elementIsDisplayedOrNot(AddToWishlistButton);
	}




	
	
	public Boolean checkSpecialOffersBlockIsDisplayed() {
		return WC.elementIsDisplayedOrNot(SpecialOffersBlock);
	}
	
	public void clickOnSearchByProductNameCatalogueNoOrKeywordTextField() {
		WC.click(SearchByProductNameCatalogueNoOrKeywordTextField);
		
	}


	public void typeInSearchByProductNameCatalogueNoOrKeywordTextField(String characters) throws InterruptedException {
		WC.type(SearchByProductNameCatalogueNoOrKeywordTextField, characters);
		
	}


	
	public void clickOnSearchButton() {
		WC.click(SearchButton);;
		
	}

	
}
