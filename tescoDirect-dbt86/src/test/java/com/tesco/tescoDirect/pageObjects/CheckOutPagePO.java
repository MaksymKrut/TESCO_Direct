package com.tesco.tescoDirect.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.GenerateData;
import com.tesco.tescoDirect.util.WebConnector;

public class CheckOutPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(CheckOutPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	GenerateData generateData = new GenerateData();
	// public WebDriver driver;

	@FindBy(partialLinkText = Constants.CheckOutPage.Basket)
	@CacheLookup
	private WebElement basket;
	@FindBy(css = Constants.CheckOutPage.Order)
	@CacheLookup
	private WebElement order;
	@FindBy(css = Constants.CheckOutPage.ThankYou)
	@CacheLookup
	private WebElement thankYou;
	@FindBy(css = Constants.CheckOutPage.SecureCheckoutmessage)
	@CacheLookup
	private WebElement secureCheckoutmessage;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryTypeCollectionRadiobutton)
	@CacheLookup
	private WebElement deliverytypecollectionradiobutton;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryTypeDeliveryRadiobutton)
	@CacheLookup
	private WebElement deliverytypedeliveryradiobutton;
	@FindBy(css = Constants.CheckOutPage.ClosestToPostcode)
	@CacheLookup
	private WebElement closesttopostcode;
	@SuppressWarnings("rawtypes")
	@FindBy(xpath = Constants.CheckOutPage.NearestStore)
	@CacheLookup
	private List neareststore;
	@FindBy(xpath = Constants.CheckOutPage.NearestStoreDetails)
	@CacheLookup
	private WebElement neareststoredetails;
	@FindBy(xpath = Constants.CheckOutPage.NearestStoreDialogBoxDetails)
	@CacheLookup
	private WebElement neareststoredialogboxdetails;
	@FindBy(xpath = Constants.CheckOutPage.NearestStoreDialogBoxMapView)
	@CacheLookup
	private WebElement neareststoredialogboxmapview;
	@FindBy(xpath = Constants.CheckOutPage.NearestStoreDialogBoxStoreAddressDetails)
	@CacheLookup
	private WebElement neareststoredialogboxstoreaddressdetails;
	@FindBy(xpath = Constants.CheckOutPage.NearestStoreDialogClickAndCollectOpeningTime)
	@CacheLookup
	private WebElement neareststoredialogclickandcollectopeningtime;
	@FindBy(partialLinkText = Constants.CheckOutPage.ViewMoreStores)
	@CacheLookup
	private WebElement viewmorestores;
	@FindBy(partialLinkText = Constants.CheckOutPage.ViewLessStores)
	@CacheLookup
	private WebElement viewlessstores;
	@FindBy(xpath = Constants.CheckOutPage.ViewMoreExtraStores)
	@CacheLookup
	private WebElement viewmoreextrastores;
	@FindBy(id = Constants.CheckOutPage.ViewMoreStoresEnterTownTextfield)
	@CacheLookup
	private WebElement viewmorestoresentertowntextfield;
	@FindBy(id = Constants.CheckOutPage.ViewMoreStoresFindButton)
	@CacheLookup
	private WebElement viewmorestoresfindbutton;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryRadioButton)
	@CacheLookup
	private WebElement deliveryradiobutton;
	@FindBy(xpath = Constants.CheckOutPage.StoreOptionModuleStdDeliveryRadioButton)
	@CacheLookup
	private WebElement storeoptionmodulestddeliveryradiobutton;
	@FindBy(xpath = Constants.CheckOutPage.StoreOptionModuleExpDeliveryRadioButton)
	@CacheLookup
	private WebElement storeoptionmoduleexpdeliveryradiobutton;
	@FindBy(xpath = Constants.CheckOutPage.DeliverySavermessage)
	@CacheLookup
	private WebElement deliverysavermessage;
	@FindBy(xpath = Constants.CheckOutPage.DeliverySaverHelpButton)
	@CacheLookup
	private WebElement deliverysaverhelpbutton;
	@FindBy(xpath = Constants.CheckOutPage.DeliverySaverHelpButtonMessage)
	@CacheLookup
	private WebElement deliverysaverhelpbuttonmessage;
	@FindBy(xpath = Constants.CheckOutPage.ExpressDeliveryDialogBoxDatepicker)
	@CacheLookup
	private WebElement expressdeliverydialogboxdatepicker;
	@FindBy(xpath = Constants.CheckOutPage.ExpressDeliveryDialogBoxConfirmdateButton)
	@CacheLookup
	private WebElement expressdeliverydialogboxconfirmdatebutton;
	@FindBy(xpath = Constants.CheckOutPage.ExpressDeliveryDialogBoxCancelButton)
	@CacheLookup
	private WebElement expressdeliverydialogboxcancelbutton;
	@FindBy(xpath = Constants.CheckOutPage.ExpressDeliveryDialogBoxDeliveryCharge)
	@CacheLookup
	private WebElement expressdeliverydialogboxdeliverycharge;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryDetailsContactPersonEditLink)
	@CacheLookup
	private WebElement deliverydetailscontactpersoneditlink;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryDetailsNewAddressLink)
	@CacheLookup
	private WebElement deliverydetailsnewaddresslink;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryDetailsCourierInstructionsEditLink)
	@CacheLookup
	private WebElement deliverydetailscourierinstructionseditlink;
	@FindBy(css = Constants.CheckOutPage.NameOnCard)
	@CacheLookup
	private WebElement nameoncard;
	@FindBy(css = Constants.CheckOutPage.CardNumber)
	@CacheLookup
	private WebElement cardnumber;
	@FindBy(css = Constants.CheckOutPage.ExpiryDateMonth)
	@CacheLookup
	private WebElement expirydatemonth;
	@FindBy(css = Constants.CheckOutPage.ExpiryMonth)
	@CacheLookup
	private WebElement expirymonth;
	@FindBy(css = Constants.CheckOutPage.ExpiryMonthMobile)
	@CacheLookup
	private WebElement expirymonthmobile;
	@FindBy(css = Constants.CheckOutPage.ExpiryDateYear)
	@CacheLookup
	private WebElement expirydateyear;
	@FindBy(css = Constants.CheckOutPage.ExpiryYear)
	@CacheLookup
	private WebElement expiryyear;
	@FindBy(css = Constants.CheckOutPage.ExpiryYearMobile)
	@CacheLookup
	private WebElement expiryyearmobile;
	@FindBy(css = Constants.CheckOutPage.SecurityCode)
	@CacheLookup
	private WebElement securitycode;
	@FindBy(id = Constants.CheckOutPage.BillingAddressDropDown)
	@CacheLookup
	private WebElement billingaddressdropdown;
	@FindBy(xpath = Constants.CheckOutPage.PaymentCardNewAddressLink)
	@CacheLookup
	private WebElement paymentcardnewaddresslink;
	@FindBy(xpath = Constants.CheckOutPage.SaveThisCard)
	@CacheLookup
	private WebElement savethiscard;
	@FindBy(xpath = Constants.CheckOutPage.Promotions)
	@CacheLookup
	private WebElement promotions;
	@FindBy(xpath = Constants.CheckOutPage.TotalToPay)
	@CacheLookup
	private WebElement totaltopay;
	@FindBy(css = Constants.CheckOutPage.PayNowButton)
	@CacheLookup
	private WebElement paynowbutton;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardPoints)
	@CacheLookup
	private WebElement clubcardpoints;

	@FindBy(css = Constants.CheckOutPage.AddClubCardVoucher)
	@CacheLookup
	private WebElement addclubcardvoucher;
	@FindBy(css = Constants.CheckOutPage.AddClubCardVoucherMessage)
	@CacheLookup
	private WebElement addclubcardvouchermessage;
	@FindBy(css = Constants.CheckOutPage.AddeCoupons)
	@CacheLookup
	private WebElement addecoupons;
	@FindBy(xpath = Constants.CheckOutPage.AddeCouponsMessage)
	@CacheLookup
	private WebElement addecouponsmessage;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCard)
	@CacheLookup
	private WebElement paywithagiftcard;
	@FindBy(xpath = Constants.CheckOutPage.PaywithaGiftCardMessage)
	@CacheLookup
	private WebElement paywithagiftcardmessage;
	@FindBy(xpath = Constants.CheckOutPage.AddeCouponsTextbox)
	@CacheLookup
	private WebElement addecouponstextbox;
	@FindBy(xpath = Constants.CheckOutPage.AddeCouponscancelButton)
	@CacheLookup
	private WebElement addecouponscancelbutton;
	@FindBy(xpath = Constants.CheckOutPage.AddeCouponsAddButton)
	@CacheLookup
	private WebElement addecouponsaddbutton;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCardcodeTextfield)
	@CacheLookup
	private WebElement paywithagiftcardcodetextfield;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCardcodeTextfieldMob)
	@CacheLookup
	private WebElement paywithagiftcardcodetextfieldMob;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCardPINTextfield)
	@CacheLookup
	private WebElement paywithagiftcardpintextfield;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCardPINTextfieldMob)
	@CacheLookup
	private WebElement paywithagiftcardpintextfieldMob;
	@FindBy(xpath = Constants.CheckOutPage.PaywithaGiftCardCancelButton)
	@CacheLookup
	private WebElement paywithagiftcardcancelbutton;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCardAddButton)
	@CacheLookup
	private WebElement paywithagiftcardaddbutton;
	@FindBy(css = Constants.CheckOutPage.PaywithaGiftCardAddButtonMob)
	@CacheLookup
	private WebElement paywithagiftcardaddbuttonMob;
	/* CheckOut page fuel save */
	@FindBy(xpath = Constants.CheckOutPage.ChoosedifferentdayButton)
	@CacheLookup
	private WebElement choosedifferentdaybutton;
	@FindBy(xpath = Constants.CheckOutPage.ChoosedifferentdayDatePicker)
	@CacheLookup
	private WebElement choosedifferentdaydatepicker;
	@FindBy(xpath = Constants.CheckOutPage.ChoosedifferentdayConfirmdate)
	@CacheLookup
	private WebElement choosedifferentdayconfirmdate;
	@FindBy(css = Constants.CheckOutPage.ChoosedifferentdayCancel)
	@CacheLookup
	private WebElement choosedifferentdaycancel;
	@FindBy(xpath = Constants.CheckOutPage.ChoosedifferentdayDeliveryChargefree)
	@CacheLookup
	private WebElement choosedifferentdaydeliverychargefree;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardFuelSavings)
	@CacheLookup
	private WebElement clubcardfuelsavings;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardFuelSaveToolTip)
	@CacheLookup
	private WebElement clubcardfuelsavetooltip;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardFuelSaveToolTipClose)
	@CacheLookup
	private WebElement clubcardfuelsavetooltipclose;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardFuelSaveToolTipMessageLine1)
	@CacheLookup
	private WebElement clubcardfuelsavetooltipmessageline1;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardFuelSaveToolTipMessageLine2)
	@CacheLookup
	private WebElement clubcardfuelsavetooltipmessageline2;
	/* CheckOut page fuel save message */
	@FindBy(xpath = Constants.CheckOutPage.ClubCardFuelSavingsMessage)
	@CacheLookup
	private WebElement clubcardfuelsavingsmessage;

	/* CheckOut page Editable address */
	@FindBy(xpath = Constants.CheckOutPage.Theseitemscanonlybedelivered)
	@CacheLookup
	private WebElement theseitemscanonlybedelivered;
	@FindBy(xpath = Constants.CheckOutPage.EAStdDeliveryradioButton)
	@CacheLookup
	private WebElement eastddeliveryradiobutton;
	@FindBy(xpath = Constants.CheckOutPage.EAAddressDropDown)
	@CacheLookup
	private WebElement eaaddressdropdown;
	@FindBy(xpath = Constants.CheckOutPage.SendToDifferentAddressesLink)
	@CacheLookup
	private WebElement sendtodifferentaddresseslink;
	@FindBy(xpath = Constants.CheckOutPage.EADeliveryTypeCollectionRadiobutton)
	@CacheLookup
	private WebElement eadeliverytypecollectionradiobutton;
	@FindBy(xpath = Constants.CheckOutPage.EADeliveryTypeDeliveryRadiobutton)
	@CacheLookup
	private WebElement eadeliverytypedeliveryradiobutton;

	@FindBy(xpath = Constants.CheckOutPage.STDAText)
	@CacheLookup
	private WebElement stdatext;
	@FindBy(xpath = Constants.CheckOutPage.STDAProductDetails)
	@CacheLookup
	private WebElement stdaproductdetails;
	@FindBy(xpath = Constants.CheckOutPage.STDAAddressDropDown)
	@CacheLookup
	private WebElement stdaaddressdropdown;
	@FindBy(xpath = Constants.CheckOutPage.STDANewAddressLink)
	@CacheLookup
	private WebElement stdanewaddresslink;
	@FindBy(xpath = Constants.CheckOutPage.STDACancelButton)
	@CacheLookup
	private WebElement stdacancelbutton;
	@FindBy(xpath = Constants.CheckOutPage.STDASaveButton)
	@CacheLookup
	private WebElement stdasavebutton;

	@FindBy(xpath = Constants.CheckOutPage.NewAddressModule)
	@CacheLookup
	private WebElement newaddressmodule;
	@FindBy(xpath = Constants.CheckOutPage.NAMEnterNickNameTextField)
	@CacheLookup
	private WebElement namenternicknametextfield;
	@FindBy(xpath = Constants.CheckOutPage.NAMEnterpostcodeTextField)
	@CacheLookup
	private WebElement namenterpostcodetextfield;
	@FindBy(xpath = Constants.CheckOutPage.NAMEditButton)
	@CacheLookup
	private WebElement nameditbutton;
	@FindBy(xpath = Constants.CheckOutPage.NAMCancelButton)
	@CacheLookup
	private WebElement namcancelbutton;
	@FindBy(xpath = Constants.CheckOutPage.NAMAddressButton)
	@CacheLookup
	private WebElement namaddressbutton;
	@FindBy(css = Constants.CheckOutPage.OrderTab)
	private WebElement OrderTab;
	@FindBy(css = Constants.CheckOutPage.BasketTab)
	private WebElement BasketTab;
	@FindBy(css = Constants.CheckOutPage.ThankYouTab)
	private WebElement ThankYouTab;
	@FindBy(css = Constants.CheckOutPage.CheckOutItemImageHarryPotter)
	private WebElement CheckOutItemImageHarryPotter;
	@FindBy(css = Constants.CheckOutPage.CheckOutItemImageTescoSim)
	private WebElement CheckOutItemImageTescoSim;
	@FindBy(xpath = Constants.CheckOutPage.HarryPotterCatalogueNumber)
	private WebElement HarryPotterCatalogueNumber;
	@FindBy(xpath = Constants.CheckOutPage.TescoSimCatalogueNumber)
	private WebElement TescoSimCatalogueNumber;
	@FindBy(xpath = Constants.CheckOutPage.HarryPotterSoldBYText1)
	private WebElement HarryPotterSoldBYText1;
	@FindBy(xpath = Constants.CheckOutPage.HarryPotterSoldBYText2)
	private WebElement HarryPotterSoldBYText2;
	@FindBy(xpath = Constants.CheckOutPage.HarryPotterItemPrice)
	private WebElement HarryPotterItemPrice;
	@FindBy(xpath = Constants.CheckOutPage.HarryPotterItemQuantityXItemName1)
	private WebElement HarryPotterItemQuantityXItemName1;
	@FindBy(xpath = Constants.CheckOutPage.HarryPotterItemQuantityXItemName2)
	private WebElement HarryPotterItemQuantityXItemName2;
	@FindBy(css = Constants.CheckOutPage.DeliveryMethodCollectionRadioButton)
	private WebElement DeliveryMethodCollectionRadioButton;
	@FindBy(css = Constants.CheckOutPage.DeliveryMethodHomeDeliveryRadioButton)
	private WebElement DeliveryMethodHomeDeliveryRadioButton;
	@FindBy(xpath = Constants.CheckOutPage.DeliveryCostFreeText)
	private WebElement DeliveryCostFreeText;
	@FindBy(xpath = Constants.CheckOutPage.SubtotalText)
	private WebElement SubtotalText;
	@FindBy(xpath = Constants.CheckOutPage.SubtotalAmountText)
	private WebElement SubtotalAmountText;
	@FindBy(xpath = Constants.CheckOutPage.TotalToPayText)
	private WebElement TotalToPayText;
	@FindBy(xpath = Constants.CheckOutPage.TotalToPayAmountText)
	private WebElement TotalToPayAmountText;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardPointsText)
	private WebElement ClubCardPointsText;
	@FindBy(xpath = Constants.CheckOutPage.ClubCardPointsEarnedText)
	private WebElement ClubCardPointsEarnedText;
	@FindBy(css = Constants.CheckOutPage.SignInEmailInputBox)
	@CacheLookup
	private WebElement SignInEmailInputBox;
	@FindBy(css = Constants.CheckOutPage.SignInPasswordInputBox)
	@CacheLookup
	private WebElement SignInPasswordInputBox;
	@FindBy(css = Constants.CheckOutPage.SignInButton)
	@CacheLookup
	private WebElement SignInButton;
	@FindBy(xpath = Constants.CheckOutPage.CustomerName)
	@CacheLookup
	private WebElement CustomerName;

	@FindBy(css = Constants.AboutYouPage.IamAnewCustomerRadioButton)
	@CacheLookup
	private WebElement IamAnewCustomerRadioButton;
	@FindBy(css = Constants.CheckOutPage.TitleDropDown)
	@CacheLookup
	private WebElement TitleDropDown;
	@FindBy(css = Constants.CheckOutPage.TitleDropDownMR)
	@CacheLookup
	private WebElement TitleDropDownMR;
	@FindBy(css = Constants.CheckOutPage.TitleDropDownMobile)
	@CacheLookup
	private WebElement TitleDropDownMobile;
	@FindBy(css = Constants.CheckOutPage.TitleDropDownMRMobile)
	@CacheLookup
	private WebElement TitleDropDownMRMobile;
	@FindBy(css = Constants.CheckOutPage.FirstNameTextBox)
	@CacheLookup
	private WebElement FirstNameTextBox;
	@FindBy(css = Constants.CheckOutPage.LastNameTextBox)
	@CacheLookup
	private WebElement LastNameTextBox;
	@FindBy(css = Constants.CheckOutPage.EmailTextBox)
	@CacheLookup
	private WebElement EmailTextBox;
	@FindBy(css = Constants.CheckOutPage.PostCodeTextBox)
	@CacheLookup
	private WebElement PostCodeTextBox;
	@FindBy(css = Constants.CheckOutPage.IDontHaveAclubcardCheckBox)
	@CacheLookup
	private WebElement IDontHaveAclubcardCheckBox;
	@FindBy(css = Constants.CheckOutPage.RegFirstPageNextButton)
	@CacheLookup
	private WebElement RegFirstPageNextButton;
	@FindBy(css = Constants.CheckOutPage.ContactPhoneNumber)
	private WebElement ContactPhoneNumber;
	@FindBy(css = Constants.CheckOutPage.Password)
	@CacheLookup
	private WebElement Password;
	@FindBy(css = Constants.CheckOutPage.ConfirmPassword)
	@CacheLookup
	private WebElement ConfirmPassword;
	@FindBy(css = Constants.CheckOutPage.AgreeAndTC)
	@CacheLookup
	private WebElement AgreeAndTC;
	@FindBy(css = Constants.CheckOutPage.RegSecondPageNextButton)
	@CacheLookup
	private WebElement RegSecondPageNextButton;
	@FindBy(css = Constants.CheckOutPage.DropdownMatchingAllofthePostcode)
	@CacheLookup
	private WebElement DropdownMatchingAllofthePostcode;
	@FindBy(xpath = Constants.CheckOutPage.FirstAddress)
	@CacheLookup
	private WebElement FirstAddress;

	@FindBy(xpath = Constants.CheckOutPage.Stores)
	@CacheLookup
	private WebElement Stores;
	@FindBy(xpath = Constants.CheckOutPage.FirstStore)
	@CacheLookup
	private WebElement FirstStore;
	@FindBy(xpath = Constants.CheckOutPage.SecondStore)
	@CacheLookup
	private WebElement SecondStore;
	@FindBy(xpath = Constants.CheckOutPage.ThirdStore)
	@CacheLookup
	private WebElement ThirdStore;
	@FindBy(css = Constants.CheckOutPage.FirstStoreRadioButton)
	@CacheLookup
	private WebElement FirstStoreRadioButton;
	@FindBy(css = Constants.CheckOutPage.SecondStoreRadioButton)
	@CacheLookup
	private WebElement SecondStoreRadioButton;
	@FindBy(css = Constants.CheckOutPage.ThirdStoreRadioButton)
	@CacheLookup
	private WebElement ThirdStoreRadioButton;
	@FindBy(xpath = Constants.CheckOutPage.ViewMoreCollectionPoints1)
	@CacheLookup
	private WebElement ViewMoreCollectionPoints1;
	@FindBy(xpath = Constants.CheckOutPage.ViewMoreCollectionPoints2)
	@CacheLookup
	private WebElement ViewMoreCollectionPoints2;
	@FindBy(xpath = Constants.CheckOutPage.TelephoneNumber)
	@CacheLookup
	private WebElement TelephoneNumber;
	@FindBy(xpath = Constants.CheckOutPage.SelectedStoreNameForCollection)
	@CacheLookup
	private WebElement SelectedStoreNameForCollection;
	@FindBy(xpath = Constants.CheckOutPage.ItemCollectionDateAndTimeText)
	@CacheLookup
	private WebElement ItemCollectionDateAndTimeText;
	@FindBy(xpath = Constants.CheckOutPage.ItemCollectionInformationText)
	@CacheLookup
	private WebElement ItemCollectionInformationText;
	@FindBy(css = Constants.CheckOutPage.BillingAddress)
	@CacheLookup
	private WebElement BillingAddress;

	@FindBy(css = Constants.CheckOutPage.ClubcardBoostImage)
	@CacheLookup
	private WebElement ClubcardBoostImage;
	@FindBy(xpath = Constants.CheckOutPage.InClubcardBoostMoreInfoLink)
	@CacheLookup
	private WebElement InClubcardBoostMoreInfoLink;

	@FindBy(xpath = Constants.CheckOutPage.NewAddressLinkForBillingAddress)
	@CacheLookup
	private WebElement NewAddressLinkForBillingAddress;
	@FindBy(css = Constants.CheckOutPage.BillingAddressNickNameTextBox)
	@CacheLookup
	private WebElement BillingAddressNickNameTextBox;
	@FindBy(css = Constants.CheckOutPage.AddNewBillingAddressButton)
	@CacheLookup
	private WebElement AddNewBillingAddressButton;

	@FindBy(linkText = Constants.CheckOutPage.MyAccountLink)
	@CacheLookup
	private WebElement MyAccountLink;

	public boolean checkOrderTabIsHighlighted() {

		if (WC.getAttributeValue(OrderTab, "class").equalsIgnoreCase("active"))
			return true;
		else
			return false;

	}

	public boolean checkBasketTabIsEnabledAndGreyedOut() {

		if (WC.getAttributeValue(BasketTab, "class").equalsIgnoreCase("done"))
			return true;
		else
			return false;
	}

	public boolean checkThankYouTabIsDisabledAndGreyedOut() {
		if (WC.getAttributeValue(ThankYouTab, "class").equalsIgnoreCase(
				"disabled"))
			return true;
		else
			return false;
	}

	public boolean checkCollectionIsSelected() {

		return (WC.statusofRadiobutton(DeliveryMethodCollectionRadioButton));

	}

	public boolean checkDeliveryCostIsDisplayedAsFree() {
		WC.waitForElementToBePresent(DeliveryCostFreeText, 30);
		return (WC.elementIsDisplayedOrNot(DeliveryCostFreeText));
	}

	public Boolean checkItemImageIsDisplayed() {
		System.out.println("CheckOutItemImageTescoSim is displayed"
				+ CheckOutItemImageTescoSim);
		System.out.println("CheckOutItemImageHarryPotter is displayed"
				+ CheckOutItemImageHarryPotter);
		if (WC.elementIsDisplayedOrNot(CheckOutItemImageTescoSim)
				&& WC.elementIsDisplayedOrNot(CheckOutItemImageHarryPotter))
			return true;
		else
			return false;

	}

	public Boolean checkItemQuantityXItemNameIsDisplayed() {
		WC.waitForElementToBePresent(HarryPotterItemQuantityXItemName1, 30);
		WC.waitForElementToBePresent(HarryPotterItemQuantityXItemName2, 30);
		if (WC.elementIsDisplayedOrNot(HarryPotterItemQuantityXItemName1)
				&& WC.elementIsDisplayedOrNot(HarryPotterItemQuantityXItemName2))
			return true;
		else
			return false;

	}

	public Boolean checkCatalogueNumberIsDisplayed() {
		WC.waitForElementToBePresent(HarryPotterCatalogueNumber, 30);
		WC.waitForElementToBePresent(TescoSimCatalogueNumber, 30);
		if (WC.elementIsDisplayedOrNot(HarryPotterCatalogueNumber)
				|| WC.elementIsDisplayedOrNot(TescoSimCatalogueNumber))
			return true;
		else
			return false;

	}

	public Boolean checkSoldbyIsDisplayed() {
		if (WC.elementIsDisplayedOrNot(HarryPotterSoldBYText1)
				&& WC.elementIsDisplayedOrNot(HarryPotterSoldBYText2))
			return true;
		else
			return false;

	}

	public Boolean checkItemPriceIsDisplayed() {
		if (WC.elementIsDisplayedOrNot(HarryPotterItemPrice))
			return true;
		else
			return false;

	}

	public Boolean checkSubTotalIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(SubtotalText) && WC
				.elementIsDisplayedOrNot(SubtotalAmountText));
	}

	public Boolean checkTotalToPayIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(TotalToPayText) && WC
				.elementIsDisplayedOrNot(TotalToPayAmountText));
	}

	public Boolean checkClubcardPointsIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ClubCardPointsText) && WC
				.elementIsDisplayedOrNot(ClubCardPointsEarnedText));
	}

	public Boolean checkNameIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(CustomerName));
	}

	public Boolean checkPhoneNumberIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(TelephoneNumber));
	}

	public Boolean checkSelectedStoreNameIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(SelectedStoreNameForCollection));
	}

	public Boolean checkItemCollectionDateAndTimeIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ItemCollectionDateAndTimeText));
	}

	public Boolean checkItemCollectionInformationIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ItemCollectionInformationText));
	}

	public Boolean checkNameOnCardTextBoxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(nameoncard));
	}

	public Boolean checkCardNumberTextBoxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(cardnumber));
	}

	public Boolean checkExpiryDateDropDownIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(expirydatemonth) && WC
				.elementIsDisplayedOrNot(expirydateyear));
	}

	public Boolean checkSecurityCodeTextBoxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(securitycode));
	}

	public Boolean checkBillingAddressIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(BillingAddress));
	}

	public Boolean checkAddClubcardVouchersIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(addclubcardvoucher));
	}

	public Boolean checkAddEcouponsIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(addecoupons));
	}

	public Boolean checkPayWithAGiftCardIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(paywithagiftcard));
	}

	public void clickOnBasketTab() {
		WC.clickOn(BasketTab);

	}

	public void clickOnIamAnewCustomerRadioButton() {
		IamAnewCustomerRadioButton.click();

	}

	public void selectingTitle() {
		WC.wait(2);
		String Currentinstance = WC.getDriver().getClass().getName();
		System.out.println(Currentinstance);
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.waitForElementToBePresent(TitleDropDown, 30);
			TitleDropDown.click();
			WC.wait(3);
			TitleDropDownMR.click();
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {
			WC.waitForElementToBePresent(TitleDropDownMobile, 30);
			TitleDropDownMobile.click();
			WC.handlePopup();
			TitleDropDownMRMobile.click();
		}
	}

	public void typingFirstName() {
		WC.assertingWebElement(FirstNameTextBox);
		FirstNameTextBox.clear();
		FirstNameTextBox.sendKeys(generateData.generateRandomString(20));
	}

	public void typingLastNameTextBox() {
		WC.assertingWebElement(LastNameTextBox);
		LastNameTextBox.clear();
		LastNameTextBox.sendKeys(generateData.generateRandomString(20));
	}

	public void typingEmail() {
		WC.assertingWebElement(EmailTextBox);
		EmailTextBox.clear();
		EmailTextBox.sendKeys(generateData.generateEmail(20));
	}

	public void typingPostCode() {
		WC.assertingWebElement(PostCodeTextBox);
		PostCodeTextBox.clear();
		PostCodeTextBox.sendKeys("AL7 1TW");

	}

	public void clickOnIDontHaveAclubcardCheckBox() {

		String Currentinstance = WC.getDriver().getClass().getName();
		System.out.println(Currentinstance);
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.wait(3);
			WC.assertingWebElement(IDontHaveAclubcardCheckBox);
			IDontHaveAclubcardCheckBox.click();
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver"))

		{

			WC.wait(3);
			WC.assertingWebElement(IDontHaveAclubcardCheckBox);
			IDontHaveAclubcardCheckBox.click();
		}
	}

	public void clickOnRegFirstPageNextButton() {
		WC.assertingWebElement(RegFirstPageNextButton);
		WC.wait(3);
		RegFirstPageNextButton.click();
	}

	public void typingPhoneNumber() {
		WC.waitForElementToBePresent(ContactPhoneNumber, 30);
		ContactPhoneNumber.clear();
		ContactPhoneNumber.sendKeys("07438305914");
	}

	public void typingPassword() {
		WC.assertingWebElement(Password);
		Password.clear();
		Password.sendKeys("Tesco!2345");
	}

	public void typingConfirmPassword() {
		WC.assertingWebElement(ConfirmPassword);
		ConfirmPassword.clear();
		ConfirmPassword.sendKeys("Tesco!2345");
	}

	public void ClickingOnAgreeAndTC() {
		WC.assertingWebElement(AgreeAndTC);
		AgreeAndTC.click();
	}

	public void ClickingRegSecondPageNextButton() {
		WC.assertingWebElement(RegSecondPageNextButton);
		RegSecondPageNextButton.click();
	}

	public void selectingAddressFromDropDown() {
		String Currentinstance = WC.getDriver().getClass().getName();
		System.out.println(Currentinstance);
		if (Currentinstance.equals("org.openqa.selenium.chrome.ChromeDriver")) {
			WC.wait(2);
			WC.assertingWebElement(DropdownMatchingAllofthePostcode);
			PostCodeTextBox.sendKeys(Keys.ENTER);
			// FirstAddress.click();
		} else if (Currentinstance
				.equals("io.appium.java_client.android.AndroidDriver")) {

			PostCodeTextBox.sendKeys(Keys.ENTER);
		}

	}

	public void waitForRegistrationToComplete() throws Exception {

		WC.waitForElementToBePresent(CustomerName, 30);
	}

	public void enterUserName(String userName) {
		SignInEmailInputBox.clear();
		SignInEmailInputBox.sendKeys(userName);
	}

	public void enterPassword(String password) {
		SignInPasswordInputBox.clear();
		SignInPasswordInputBox.sendKeys(password);
	}

	public void clickOnSignInButton() {
		WC.clickOn(SignInButton);
		;
		LOG.debug("Clicked on sign in button");
	}

	public void waitForLoginToComplete() throws Exception {

		WC.waitForElementToBePresent(CustomerName, 30);
	}

	public Boolean checkStoresIsDisplayed() {

		return (WC.elementIsDisplayedOrNot(Stores));
	}

	public Boolean checkThreeClosestStoresAreDisplayed() {

		return (WC.elementIsDisplayedOrNot(FirstStore)
				&& WC.elementIsDisplayedOrNot(SecondStore) && WC
					.elementIsDisplayedOrNot(ThirdStore));

	}

	public Boolean checkViewMoreCollectionPointsIsDisplayed() {

		return (WC.elementIsDisplayedOrNot(ViewMoreCollectionPoints1) && WC
				.elementIsDisplayedOrNot(ViewMoreCollectionPoints2));
	}

	public boolean checkOnlyFirstStoreRadioButtonIsSelected() {

		return ((WC.statusofRadiobutton(FirstStoreRadioButton))
				&& !(WC.statusofRadiobutton(SecondStoreRadioButton)) && !(WC
					.statusofRadiobutton(ThirdStoreRadioButton)));

	}

	public CheckOutPagePO checkingtheStatusOfProgressBar() {
		LOG.debug("Checking theStatus Of Progress Bar");
		Assert.assertTrue("Is " + basket + " displayed ========>",
				basket.isDisplayed());
		Assert.assertTrue("Is " + order + " displayed ========>",
				order.isDisplayed());
		Assert.assertTrue("Is " + thankYou + " displayed ========>",
				thankYou.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifysecureCheckoutmessage(String actualValue) {
		WC.verifyText(actualValue, secureCheckoutmessage);
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public boolean statusOfDeliveryTypeCollectionRadiobutton() {
		return WC.statusofRadiobutton(deliverytypecollectionradiobutton);

	}

	public boolean statusOfDeliveryTypeDeliveryRadiobutton() {

		return WC.statusofRadiobutton(deliverytypedeliveryradiobutton);

	}

	public boolean statusOfEADeliveryTypeCollectionRadiobutton() {
		return WC.statusofRadiobutton(eadeliverytypecollectionradiobutton);

	}

	public boolean statusOfEADeliveryTypeDeliveryRadiobutton() {

		return WC.statusofRadiobutton(eadeliverytypedeliveryradiobutton);

	}

	public CheckOutPagePO checkingthestoreCollectionModule() {
		Assert.assertTrue("Is " + closesttopostcode + " displayed ========>",
				closesttopostcode.isDisplayed());
		List<WebElement> neareststore = WC.getDriver().findElements(
				By.xpath(Constants.CheckOutPage.NearestStore));
		for (WebElement option : neareststore) {
			System.out.println("Text :" + option.getText());
		}
		Assert.assertTrue("Is " + neareststoredetails + " displayed ========>",
				neareststoredetails.isDisplayed());
		Assert.assertTrue("Is " + viewmorestores + " displayed ========>",
				viewmorestores.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonneareststoredetails() {
		Assert.assertTrue("Is " + neareststoredetails + " displayed ========>",
				neareststoredetails.isDisplayed());
		neareststoredetails.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO checkingforNearestStoreDialogBox() {
		Assert.assertTrue("Is " + neareststoredialogboxdetails
				+ " displayed ========>",
				neareststoredialogboxdetails.isDisplayed());
		Assert.assertTrue("Is " + neareststoredialogboxmapview
				+ " displayed ========>",
				neareststoredialogboxmapview.isDisplayed());
		Assert.assertTrue("Is " + neareststoredialogboxstoreaddressdetails
				+ " displayed ========>",
				neareststoredialogboxstoreaddressdetails.isDisplayed());
		Assert.assertTrue("Is " + neareststoredialogclickandcollectopeningtime
				+ " displayed ========>",
				neareststoredialogclickandcollectopeningtime.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonviewMoreStores() {
		Assert.assertTrue("Is " + viewmorestores + " displayed ========>",
				viewmorestores.isDisplayed());
		viewmorestores.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO checkingforviewMoreframeItems() {
		Assert.assertTrue("Is " + viewlessstores + " displayed ========>",
				viewlessstores.isDisplayed());
		WC.waitForElement(viewmoreextrastores, 10);
		Assert.assertTrue("Is " + viewmoreextrastores + " displayed ========>",
				viewmoreextrastores.isDisplayed());
		Assert.assertTrue("Is " + viewmorestoresentertowntextfield
				+ " displayed ========>",
				viewmorestoresentertowntextfield.isDisplayed());
		Assert.assertTrue("Is " + viewmorestoresfindbutton
				+ " displayed ========>",
				viewmorestoresfindbutton.isDisplayed());
		viewlessstores.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonDeliveryRadioButton() {
		WC.waitForElement(deliveryradiobutton, 10);
		Assert.assertTrue("Is " + deliveryradiobutton + " displayed ========>",
				deliveryradiobutton.isDisplayed());
		deliveryradiobutton.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO statusOfStoreOptionModuleRadiobutton() {
		WC.waitForElement(storeoptionmodulestddeliveryradiobutton, 10);
		Assert.assertTrue("Is " + storeoptionmodulestddeliveryradiobutton
				+ " displayed ========>",
				storeoptionmodulestddeliveryradiobutton.isDisplayed());
		Assert.assertTrue("Is " + storeoptionmoduleexpdeliveryradiobutton
				+ " displayed ========>",
				storeoptionmoduleexpdeliveryradiobutton.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);

	}

	public CheckOutPagePO verifyDeliveryOptionSavermessage(String actualValue) {
		WC.verifyText(actualValue, deliverysavermessage);
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyDeliveryOptionHelpmessage(String actualValue) {
		WC.verifyText(actualValue, deliverysaverhelpbuttonmessage);
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonDeliverySaverHelpButton() {
		WC.wait(3);
		Assert.assertTrue("Is " + deliverysaverhelpbutton
				+ " displayed ========>", deliverysaverhelpbutton.isDisplayed());
		deliverysaverhelpbutton.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonStoreOptionModuleExpDeliveryRadioButton() {
		WC.waitForElement(storeoptionmoduleexpdeliveryradiobutton, 10);
		Assert.assertTrue("Is " + storeoptionmoduleexpdeliveryradiobutton
				+ " displayed ========>",
				storeoptionmoduleexpdeliveryradiobutton.isDisplayed());
		storeoptionmoduleexpdeliveryradiobutton.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifySelectDeliveryDatePopupElements() {
		WC.wait(3);
		Assert.assertTrue("Is " + expressdeliverydialogboxdatepicker
				+ " displayed ========>",
				expressdeliverydialogboxdatepicker.isDisplayed());
		Assert.assertTrue("Is " + expressdeliverydialogboxconfirmdatebutton
				+ " displayed ========>",
				expressdeliverydialogboxconfirmdatebutton.isDisplayed());
		Assert.assertTrue("Is " + expressdeliverydialogboxcancelbutton
				+ " displayed ========>",
				expressdeliverydialogboxcancelbutton.isDisplayed());
		Assert.assertTrue("Is " + expressdeliverydialogboxdeliverycharge
				+ " displayed ========>",
				expressdeliverydialogboxdeliverycharge.isDisplayed());
		expressdeliverydialogboxcancelbutton.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyDeliveryDetailsContactPersonEditLink() {
		Assert.assertTrue("Is " + deliverydetailscontactpersoneditlink
				+ " displayed ========>",
				deliverydetailscontactpersoneditlink.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyDeliveryDetailsNewAddressLink() {
		Assert.assertTrue("Is " + deliverydetailsnewaddresslink
				+ " displayed ========>",
				deliverydetailsnewaddresslink.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyDeliveryDetailsCourierInstructionsEditLink() {
		Assert.assertTrue("Is " + deliverydetailscourierinstructionseditlink
				+ " displayed ========>",
				deliverydetailscourierinstructionseditlink.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyPaymentCardDetails() {
		Assert.assertTrue("Is " + nameoncard + " displayed ========>",
				nameoncard.isDisplayed());
		Assert.assertTrue("Is " + cardnumber + " displayed ========>",
				cardnumber.isDisplayed());
		Assert.assertTrue("Is " + expirydatemonth + " displayed ========>",
				expirydatemonth.isDisplayed());
		checkingExpiryMonth();
		Assert.assertTrue("Is " + expirydateyear + " displayed ========>",
				expirydateyear.isDisplayed());
		Assert.assertTrue("Is " + securitycode + " displayed ========>",
				securitycode.isDisplayed());
		Assert.assertTrue("Is " + billingaddressdropdown
				+ " displayed ========>", billingaddressdropdown.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyPaymentCardNewAddressLink() {
		Assert.assertTrue("Is " + paymentcardnewaddresslink
				+ " displayed ========>",
				paymentcardnewaddresslink.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifySaveThisCardCheckBox() {
		Assert.assertTrue("Is " + savethiscard + " displayed ========>",
				savethiscard.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public void checkingExpiryMonth() {
		String[] exp = { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12" };
		Select select = new Select(expirydatemonth);
		List<WebElement> options = select.getOptions();
		for (WebElement ExpiryMonth : options) {
			boolean match = false;
			for (int i = 0; i < exp.length; i++) {
				if (ExpiryMonth.getText().equals(exp[i])) {
					match = true;
				}
			}
			Assert.assertTrue(match);
		}
	}

	/*
	 * public void checkingDiffPaymentMethodinFooter1() { String[] exp = {
	 * "visa", "mastercard", "american-express", "maestro", "tesco-bank",
	 * "verisign", "visa-verified", "mastercard-securecode", "amex-safekey" };
	 * WebElement headerlogo =
	 * WC.getDriver().findElement(By.xpath("//ul[@class='panel-logo-all secure']"
	 * )); List<WebElement> logos = headerlogo.findElements(By.tagName("li"));
	 * java.util.Iterator<WebElement> i = logos.iterator(); boolean match =
	 * false; while(i.hasNext()) { WebElement logo = i.next();
	 * System.out.println(logo.getText()); if (logo.getText().equals(exp[i])) {
	 * match = true; } Assert.assertTrue(match); } }
	 */

	public CheckOutPagePO verifyTotalToPayBlock() {
		Assert.assertTrue("Is " + promotions + " displayed ========>",
				promotions.isDisplayed());
		Assert.assertTrue("Is " + totaltopay + " displayed ========>",
				totaltopay.isDisplayed());
		Assert.assertTrue("Is " + paynowbutton + " displayed ========>",
				paynowbutton.isDisplayed());
		Assert.assertTrue("Is " + clubcardpoints + " displayed ========>",
				clubcardpoints.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyVouchersection() {
		Assert.assertTrue("Is " + addclubcardvoucher + " displayed ========>",
				addclubcardvoucher.isDisplayed());
		Assert.assertTrue("Is " + addecoupons + " displayed ========>",
				addecoupons.isDisplayed());
		Assert.assertTrue("Is " + paywithagiftcard + " displayed ========>",
				paywithagiftcard.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonaddclubcardvoucherModule() {
		WC.waitForElement(addclubcardvoucher, 10);
		Assert.assertTrue("Is " + addclubcardvoucher + " displayed ========>",
				addclubcardvoucher.isDisplayed());
		addclubcardvoucher.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyaddclubcardvoucherModuleElements() {
		WC.wait(2);
		WC.verifyText("I have a voucher code", addclubcardvouchermessage);
		addclubcardvoucher.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonaddecouponsModule() {
		WC.waitForElement(addecoupons, 10);
		Assert.assertTrue("Is " + addecoupons + " displayed ========>",
				addecoupons.isDisplayed());
		addecoupons.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyaddecouponsModuleElements() {
		WC.wait(5);
		WC.verifyText(
				"Enter the eCoupon code exactly as it appears - including hyphens.",
				addecouponsmessage);
		Assert.assertTrue("Is " + addecouponstextbox + " displayed ========>",
				addecouponstextbox.isDisplayed());
		Assert.assertTrue("Is " + addecouponscancelbutton
				+ " displayed ========>", addecouponscancelbutton.isDisplayed());
		Assert.assertTrue(
				"Is " + addecouponsaddbutton + " displayed ========>",
				addecouponsaddbutton.isDisplayed());
		addecoupons.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonpaywithagiftcardModule() {
		WC.waitForElement(paywithagiftcard, 10);
		Assert.assertTrue("Is " + paywithagiftcard + " displayed ========>",
				paywithagiftcard.isDisplayed());
		paywithagiftcard.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO payWithGiftCard() {
		if (WC.LVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCard), 50);
			WC.click(paywithagiftcard);
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardcodeTextfield),
					50);
			paywithagiftcardcodetextfield.sendKeys("5045075007278378570");
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardPINTextfield),
					50);
			paywithagiftcardpintextfield.sendKeys("0959");
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardAddButton),
					50);
			WC.click(paywithagiftcardaddbutton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PayNowButton), 50);
			WC.wait(5);
			WC.click(paynowbutton);

		} else if (WC.SVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCard), 50);
			WC.click(paywithagiftcard);
			WC.handlePopup();
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardcodeTextfieldMob),
					50);
			paywithagiftcardcodetextfieldMob.sendKeys("5045075007278378570");
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardPINTextfieldMob),
					50);
			paywithagiftcardpintextfieldMob.sendKeys("0959");
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardAddButtonMob),
					50);
			WC.click(paywithagiftcardaddbuttonMob);
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PayNowButton), 50);
			WC.wait(5);
			WC.click(paynowbutton);
		} else if (WC.MVP()) {
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCard), 50);
			WC.click(paywithagiftcard);
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardcodeTextfield),
					50);
			paywithagiftcardcodetextfield.sendKeys("5045075007278378570");
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardPINTextfield),
					50);
			paywithagiftcardpintextfield.sendKeys("0959");
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PaywithaGiftCardAddButton),
					50);
			WC.click(paywithagiftcardaddbutton);
			WC.waitForElementClickable(
					By.cssSelector(Constants.CheckOutPage.PayNowButton), 50);
			WC.wait(5);
			WC.click(paynowbutton);
		}

		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}
	public CheckOutPagePO payWithBankCard() {
		if (WC.LVP()) {
			WC.waitForElement(nameoncard, 50);
			nameoncard.sendKeys("Automation Tester");
			WC.waitForElement(cardnumber, 50);
			cardnumber.sendKeys("5434601534888458");
			WC.wait(1);
			expirydatemonth.click();
			WC.wait(1);
			expirymonth.click();
			WC.wait(1);
			expirydateyear.click();
			WC.wait(1);
			expiryyear.click();
			WC.waitForElement(securitycode, 50);
			securitycode.sendKeys("508");
			WC.waitForElement(nameoncard, 50);
			WC.wait(5);
			WC.click(paynowbutton);

		} else if (WC.SVP()) {
			WC.waitForElement(nameoncard, 50);
			nameoncard.sendKeys("Automation Tester");
			WC.waitForElement(cardnumber, 50);
			cardnumber.sendKeys("5434601534888458");
			WC.wait(1);
			WC.click(expirydatemonth);
			WC.wait(1);
			WC.handlePopup();
			expirymonthmobile.click();;
			WC.wait(1);
			WC.click(expirydateyear);
			WC.wait(1);
			WC.handlePopup();
			expiryyearmobile.click();
			WC.waitForElement(securitycode, 50);
			securitycode.sendKeys("508");
			WC.waitForElement(nameoncard, 50);
			WC.wait(5);
			WC.click(paynowbutton);


		} else if (WC.MVP()) {
			WC.waitForElement(nameoncard, 50);
			nameoncard.sendKeys("Automation Tester");
			WC.waitForElement(cardnumber, 50);
			cardnumber.sendKeys("5434601534888458");
			WC.wait(1);
			WC.click(expirydatemonth);
			WC.wait(1);
			WC.handlePopup();
			expirymonthmobile.click();;
			WC.wait(1);
			WC.click(expirydateyear);
			WC.wait(1);
			WC.handlePopup();
			expiryyearmobile.click();
			WC.waitForElement(securitycode, 50);
			securitycode.sendKeys("508");
			WC.waitForElement(nameoncard, 50);
			WC.wait(5);
			WC.click(paynowbutton);

		}

		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}
	public CheckOutPagePO verifypaywithagiftcardElements() {
		WC.wait(5);
		WC.verifyText("Enter your Gift Card code and PIN",
				paywithagiftcardmessage);
		Assert.assertTrue("Is " + paywithagiftcardcodetextfield
				+ " displayed ========>",
				paywithagiftcardcodetextfield.isDisplayed());
		Assert.assertTrue("Is " + paywithagiftcardpintextfield
				+ " displayed ========>",
				paywithagiftcardpintextfield.isDisplayed());
		Assert.assertTrue("Is " + paywithagiftcardcancelbutton
				+ " displayed ========>",
				paywithagiftcardcancelbutton.isDisplayed());
		Assert.assertTrue("Is " + paywithagiftcardaddbutton
				+ " displayed ========>",
				paywithagiftcardaddbutton.isDisplayed());
		paywithagiftcard.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonChoosedifferentdayButton() {
		WC.waitForElement(choosedifferentdaybutton, 10);
		Assert.assertTrue("Is " + choosedifferentdaybutton
				+ " displayed ========>",
				choosedifferentdaybutton.isDisplayed());
		choosedifferentdaybutton.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifychoosedifferentdaybuttonPopupElements() {
		WC.wait(3);
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,400);", choosedifferentdaydatepicker);
		Assert.assertTrue("Is " + choosedifferentdaydatepicker
				+ " displayed ========>",
				choosedifferentdaydatepicker.isDisplayed());
		Assert.assertTrue("Is " + choosedifferentdayconfirmdate
				+ " displayed ========>",
				choosedifferentdayconfirmdate.isDisplayed());
		Assert.assertTrue("Is " + choosedifferentdaycancel
				+ " displayed ========>",
				choosedifferentdaycancel.isDisplayed());
		Assert.assertTrue("Is " + choosedifferentdaydeliverychargefree
				+ " displayed ========>",
				choosedifferentdaydeliverychargefree.isDisplayed());
		choosedifferentdaycancel.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyTotalToPayBlockforFuelSave() {
		Assert.assertTrue("Is " + promotions + " displayed ========>",
				promotions.isDisplayed());
		Assert.assertTrue("Is " + totaltopay + " displayed ========>",
				totaltopay.isDisplayed());
		Assert.assertTrue("Is " + paynowbutton + " displayed ========>",
				paynowbutton.isDisplayed());
		Assert.assertTrue("Is " + clubcardpoints + " displayed ========>",
				clubcardpoints.isDisplayed());
		Assert.assertTrue("Is " + clubcardfuelsavings + " displayed ========>",
				clubcardfuelsavings.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyTotalToPayBlockforFuelSaveMessage() {
		Assert.assertTrue("Is " + promotions + " displayed ========>",
				promotions.isDisplayed());
		Assert.assertTrue("Is " + totaltopay + " displayed ========>",
				totaltopay.isDisplayed());
		Assert.assertTrue("Is " + paynowbutton + " displayed ========>",
				paynowbutton.isDisplayed());
		Assert.assertTrue("Is " + clubcardpoints + " displayed ========>",
				clubcardpoints.isDisplayed());
		Assert.assertTrue("Is " + clubcardfuelsavingsmessage
				+ " displayed ========>",
				clubcardfuelsavingsmessage.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO clickonClubCardFuelSavingsLink() {
		WC.waitForElement(clubcardfuelsavings, 10);
		Assert.assertTrue("Is " + clubcardfuelsavings + " displayed ========>",
				choosedifferentdaybutton.isDisplayed());
		clubcardfuelsavings.click();
		WC.wait(2);
		Assert.assertTrue("Is " + clubcardfuelsavetooltip
				+ " displayed ========>", clubcardfuelsavetooltip.isDisplayed());
		Assert.assertTrue("Is " + clubcardfuelsavetooltipmessageline1
				+ " displayed ========>",
				clubcardfuelsavetooltipmessageline1.isDisplayed());
		Assert.assertTrue("Is " + clubcardfuelsavetooltipmessageline2
				+ " displayed ========>",
				clubcardfuelsavetooltipmessageline2.isDisplayed());
		Assert.assertTrue("Is " + clubcardfuelsavetooltipclose
				+ " displayed ========>",
				clubcardfuelsavetooltipclose.isDisplayed());
		clubcardfuelsavetooltipclose.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifyTheseitemscanonlybedeliveredmessage() {
		WC.verifyText("These items can only be delivered.",
				theseitemscanonlybedelivered);
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifytheDeliveryoptionsforEditableaddresspage() {
		Assert.assertTrue("Is " + eastddeliveryradiobutton
				+ " displayed ========>",
				eastddeliveryradiobutton.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifytheaddressdropdownunderDeliverydetails() {
		((JavascriptExecutor) WC.getDriver()).executeScript(
				"window.scrollBy(0,400);", eaaddressdropdown);
		Assert.assertTrue("Is " + eaaddressdropdown + " displayed ========>",
				eaaddressdropdown.isDisplayed());
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public CheckOutPagePO verifythesendtodifferentaddresseslinkexistsandworkasexpected() {
		Assert.assertTrue("Is " + sendtodifferentaddresseslink
				+ " displayed ========>",
				sendtodifferentaddresseslink.isDisplayed());
		sendtodifferentaddresseslink.click();
		WC.handlePopup();
		WC.wait(3);
		WC.verifyText("Send your items to different addresses", stdatext);
		Assert.assertTrue("Is " + stdaproductdetails + " displayed ========>",
				stdaproductdetails.isDisplayed());
		Assert.assertTrue("Is " + stdaaddressdropdown + " displayed ========>",
				stdaaddressdropdown.isDisplayed());
		Assert.assertTrue("Is " + stdanewaddresslink + " displayed ========>",
				stdanewaddresslink.isDisplayed());
		Assert.assertTrue("Is " + stdacancelbutton + " displayed ========>",
				stdacancelbutton.isDisplayed());
		Assert.assertTrue("Is " + stdasavebutton + " displayed ========>",
				stdasavebutton.isDisplayed());
		stdanewaddresslink.click();
		Assert.assertTrue("Is " + newaddressmodule + " displayed ========>",
				newaddressmodule.isDisplayed());
		WC.waitForElement(namenternicknametextfield, 10);
		Assert.assertTrue("Is " + namenternicknametextfield
				+ " displayed ========>",
				namenternicknametextfield.isDisplayed());
		Assert.assertTrue("Is " + namenterpostcodetextfield
				+ " displayed ========>",
				namenterpostcodetextfield.isDisplayed());
		Assert.assertTrue("Is " + nameditbutton + " displayed ========>",
				nameditbutton.isDisplayed());
		Assert.assertTrue("Is " + namcancelbutton + " displayed ========>",
				namcancelbutton.isDisplayed());
		Assert.assertTrue("Is " + namaddressbutton + " displayed ========>",
				namaddressbutton.isDisplayed());
		namcancelbutton.click();
		return (CheckOutPagePO) WC.getPageObject(CheckOutPagePO.class);
	}

	public Boolean checkClubcardBoostImageIsDisplayed() {

		return (WC.elementIsDisplayedOrNot(ClubcardBoostImage));

	}

	public Boolean checkInClubcardBoostMoreInfoLinkIsDisplayed() {

		WC.waitForElementToBePresent(InClubcardBoostMoreInfoLink, 30);
		return (WC.elementIsDisplayedOrNot(InClubcardBoostMoreInfoLink));

	}

	public void clickOnNewAddressLinkForBillingAddress() {
		WC.waitForElementToBePresent(NewAddressLinkForBillingAddress, 30);
		WC.click(NewAddressLinkForBillingAddress);

	}

	public void AddANewBillingAddresss() {
		WC.waitForElementToBePresent(BillingAddressNickNameTextBox, 30);
		WC.type(BillingAddressNickNameTextBox, "New Billing Address");
		typingPostCode();
		selectingAddressFromDropDown();
		WC.waitForElementToBePresent(AddNewBillingAddressButton, 30);
		WC.wait(5);
		// WC.pressTabKey(AddNewBillingAddressButton);
		WC.click(AddNewBillingAddressButton);
		System.out.println("Clicked on AddNewBillingAddressButton");
		WC.wait(10);

	}

	public boolean checkNewBillingAddressIsAdded() {
		WC.waitForElementToBePresent(billingaddressdropdown, 30);
		WC.getSelectedOptionFromDropdown(billingaddressdropdown);
		if (WC.getSelectedOptionFromDropdown(billingaddressdropdown)
				.equalsIgnoreCase("New Billing Address"))
			return true;
		else
			return false;
	}

	public void clickOnMyAccountLink() {
		WC.clickOn(MyAccountLink);

	}

}