package com.tesco.tescoDirect.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author maddy #
 * 
 */
public class Constants {
	public final static String SCREENSHOTSDIR = "screenshotsDir";
	public final static String CHROMER_DRIVER_LOCATION = "chromeDriverExeLocation";
	public final static String IE_DRIVER_LOCATION = "ieDriverExeLocation";
	public final static String REMOTE_WEB_DRIVER_LOCATION = "remoteWebDriverUrl";
	public final static int IMPLICIT_TIME_SECONDS = 10;
	public final static String IMGSRC = "src";

	public final static String BASE_DOMAIN = "baseDomain";
	// Pages
	public final static String Home_Page = "/direct";
	public final static String Category_Page = "/category.php";
	public final static String Basket_Attachment_Page = "/basket-attachment.php";
	public final static String Basket_Page = "/basket.php";
	public final static String Basket_Page_with_No_Items = "/basket.php?no-items";
	public final static String BasketPage_with_NO_Saveforlater = "/basket.php?no-save-for-later";
	public final static String Integrated_Reg_Phase1 = "/integrated-registration.php";
	public final static String Integrated_Reg_Phase2_checkout = "/checkout.php?irspc";
	public final static String Checkout_Page = "/checkout.php";
	public final static String Checkout_Page_FuelSave = "/checkout.php?fuel-save";
	public final static String Checkout_FuelSaveMessage = "/checkout.php?fuel-save-message";
	public final static String Checkout_Page_EditableAddress = "/checkout.php?editable=1";
	public final static String Order_Confirmation_Page = "/order-confirmation.php";
	public final static String Order_Confirmation_Page_Fuelsave = "/order-confirmation.php?fuel-save";
	public final static String Order_Confirm_Page_FuesaveMessage = "/order-confirmation.php?fuel-save-message";
	public final static String My_Wishlists = "/my-wishlists.php";
	public final static String Wishlist = "/wishlist.php";
	public final static String Cancel_MyOrder = "/cancel-my-order.php";
	public final static String Change_Password = "/change-password.php";
	public final static String Change_email_address = "/change-email-address.php";
	public final static String Manage_my_clubcard_details = "/manage-clubcard.php";
	public final static String Manage_my_payment_card = "/manage-payment-details.php";
	public final static String Edit_Address = "/edit-address.php";
	public final static String Add_Address = "/add-address.php";
	public final static String My_Account = "/my-account.php";
	public final static String Request_VAT_Invoice = "/vat-invoice.php";
	public final static String VAT_Invoice_confirmation = "/vat-invoice-confirmation.php";
	public final static String Discover_Sanity_Pack = "TBC";
	public final static String PDP_page = "/pdp.php?breakup";

	public static final Map<String, String> COMMON_PAGES;

	static {
		Map<String, String> map = new HashMap<String, String>();
		map.put("home_page", Home_Page);
		map.put("category_page", Category_Page);
		map.put("basket_attachment_page", Basket_Attachment_Page);
		map.put("basket_page", Basket_Page);
		map.put("basket_page_with_no_items", Basket_Page_with_No_Items);
		map.put("basketpage_with_no_saveforlater",
				BasketPage_with_NO_Saveforlater);
		map.put("integrated_reg_phase1", Integrated_Reg_Phase1);
		map.put("integrated_reg_phase2_checkout",
				Integrated_Reg_Phase2_checkout);
		map.put("checkout_page", Checkout_Page);
		map.put("checkout_page_fuelsave", Checkout_Page_FuelSave);
		map.put("checkout_fuelsavemessage", Checkout_FuelSaveMessage);
		map.put("checkout_page_editableaddress", Checkout_Page_EditableAddress);
		map.put("order_confirmation_page", Order_Confirmation_Page);
		map.put("order_confirmation_page_fuelsave",
				Order_Confirmation_Page_Fuelsave);
		map.put("order_confirm_page_fuesavemessage",
				Order_Confirm_Page_FuesaveMessage);
		map.put("my_wishlists", My_Wishlists);
		map.put("wishlist", Wishlist);
		map.put("cancel_myorder", Cancel_MyOrder);
		map.put("change_password", Change_Password);
		map.put("change_email_address", Change_email_address);
		map.put("manage_my_clubcard_details", Manage_my_clubcard_details);
		map.put("manage_my_payment_card", Manage_my_payment_card);
		map.put("edit_address", Edit_Address);
		map.put("add_address", Add_Address);
		map.put("my_account", My_Account);
		map.put("request_vat_invoice", Request_VAT_Invoice);
		map.put("vat_invoice_confirmation", VAT_Invoice_confirmation);
		map.put("discover_sanity_pack", Discover_Sanity_Pack);
		map.put("pdp_page", PDP_page);
		COMMON_PAGES = Collections.unmodifiableMap(map);
	}
	public final static List<String> ALPHABET = new ArrayList<String>(
			Arrays.asList("#", "A", "B", "C", "D", "E", "F", "G", "H", "I",
					"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
					"V", "W", "X", "Y", "Z"));

	public final class CheckOutPage {

		public final static String Basket = "Basket";
		public final static String Order = ".active";
		public final static String ThankYou = ".disabled";
		public final static String SecureCheckoutmessage = ".checkout-info";
		public final static String DeliveryTypeCollectionRadiobutton = "//li[@class='selected store-collect']";
		public final static String DeliveryTypeDeliveryRadiobutton = "//li[contains(@data-url,'/stubs/checkout/homeDelivery.php')]";
		public final static String ClosestToPostcode = ".stores-container>p";
		public final static String NearestStore = "//ul[@class='closest-stores stores']";
		public final static String NearestStoreDetails = "//form[@class='store-tes']//label[contains(text(),'HATFIELD EXTRA')]/a";
		public final static String NearestStoreDialogBoxDetails = "//div[@class='store-details-container active']//a[contains(text(),'Details')]";
		public final static String NearestStoreDialogBoxMapView = "//div[@class='store-details-container active']//a[contains(text(),'Map view')]";
		public final static String NearestStoreDialogBoxStoreAddressDetails = "//div[@class='store-details-container active']//div[@class='vcard store-address']";
		public final static String NearestStoreDialogClickAndCollectOpeningTime = "//div[@class='store-details-container active']//div[@class='store-opening-times']";
		public final static String ViewMoreStores = "View more";
		public final static String ViewLessStores = "View less";
		public final static String ViewMoreExtraStores = "//fieldset[@class='more-list-holder more-stores-holder']/form";
		public final static String ViewMoreStoresEnterTownTextfield = "store-finder-postalcode";
		public final static String ViewMoreStoresFindButton = "store-search-submit";
		public final static String DeliveryRadioButton = "//form[@class='shipping-group-form']//li[contains(@data-url,'/stubs/checkout/homeDelivery.php')]/div";
		public final static String StoreOptionModuleStdDeliveryRadioButton = "//div[contains(@id,'dg-delivery-option')]//form[contains(@id,'delOptionFormsg')]//div[@class='custom-radio checked']";
		public final static String StoreOptionModuleExpDeliveryRadioButton = "//div[contains(@id,'dg-delivery-option')]//form[contains(@id,'delOptionFormsg')]//div[@class='custom-radio']";
		public final static String DeliverySavermessage = "//form[contains(@id,'delOptionFormsg')]//div[@class='delivery-saver-message info']";
		public final static String DeliverySaverHelpButton = "//form[contains(@id,'delOptionFormsg')]//div[@class='delivery-saver-message info']/span";
		public final static String DeliverySaverHelpButtonMessage = "//div[@class='delivery-saver-tooltip-content popup']/p[contains(text(),'Delivery Saver')]";
		public final static String ExpressDeliveryDialogBoxDatepicker = "//form[contains(@id,'delOptionFormsg')]//div[@class='datepicker']";
		public final static String ExpressDeliveryDialogBoxConfirmdateButton = "//form[contains(@id,'delOptionFormsg')]//input[@value='Confirm date']";
		public final static String ExpressDeliveryDialogBoxCancelButton = "//form[contains(@id,'delOptionFormsg')]//input[@value='Cancel']";
		public final static String ExpressDeliveryDialogBoxDeliveryCharge = "//form[contains(@id,'delOptionFormsg')]//p[@class='cost']";
		public final static String DeliveryDetailsContactPersonEditLink = "//div[@class='delivery-contact-snippet']//span[@class='name']/following-sibling::a";
		public final static String DeliveryDetailsNewAddressLink = "//div[@class='address']//span[@class='line-1']/preceding-sibling::a";
		public final static String DeliveryDetailsCourierInstructionsEditLink = "//div[@class='courier-instructions']//p[contains(text(),'No courier instructions')]//preceding-sibling::a";
		public final static String NameOnCard = "nameoncard";
		public final static String CardNumber = "numberoncard";
		public final static String ExpiryDateMonth = "expiry-month";
		public final static String ExpiryDateYear = "expiry-year";
		public final static String SecurityCode = "security-code";
		public final static String BillingAddressDropDown = "billing-address";
		public final static String PaymentCardNewAddressLink = "//div[@id='payment-card']//div[@class='address-update']//preceding-sibling::a";
		public final static String SaveThisCard = "//div[@id='payment-card']//div[@class='checkbox eventBound']";
		public final static String Promotions = "//fieldset[@id='totalCost']//p[contains(text(),'Promotion')]//preceding-sibling::span";
		public final static String TotalToPay = "//fieldset[@id='totalCost']//p[contains(text(),'Total to pay')]//preceding-sibling::span";
		public final static String PayNowButton = "#totalCost > div.summary.total-cost-snippet.no-subtotal > input.place-order";
		public final static String ClubCardPoints = "//fieldset[@id='totalCost']//p[contains(text(),'Clubcard points')]//preceding-sibling::span";
		public final static String AddClubCardVoucher = ".module-header.vouchers-link";
		public final static String AddClubCardVoucherMessage = ".add-new-form";
		public final static String AddeCoupons = ".module-header.ecoupon-link";
		public final static String AddeCouponsMessage = "//form[@id='ecoupon-voucher-form-container']//label";
		
		public final static String PaywithaGiftCard = ".gift-card>h3";
		public final static String PaywithaGiftCardMessage = "//form[@id='gift-card']//p";
		
		public final static String AddeCouponsTextbox = "//form[@id='ecoupon-voucher-form-container']//fieldset//div//input[@id='coupon-code']";
		public final static String AddeCouponscancelButton = "//form[@id='ecoupon-voucher-form-container']//fieldset//input[@class='cancel-voucher']";
		public final static String AddeCouponsAddButton = "//form[@id='ecoupon-voucher-form-container']//fieldset//input[@class='add-voucher']";
		
		public final static String PaywithaGiftCardcodeTextfield = "#code";
		public final static String PaywithaGiftCardPINTextfield = "#pin";
		public final static String PaywithaGiftCardCancelButton = "//form[@id='gift-card']//fieldset//input[@class='cancel-voucher']";
		public final static String PaywithaGiftCardAddButton = "#btn-giftcard-add";

		public final static String PaywithaGiftCardcodeTextfieldMob = "form[id='gift-card'] >fieldset >div > div >input#code";
		public final static String PaywithaGiftCardPINTextfieldMob = "form[id='gift-card'] >fieldset >div > div >input#pin";
		public final static String PaywithaGiftCardCancelButtonMob = "";
		public final static String PaywithaGiftCardAddButtonMob = "form[id='gift-card'] >fieldset >div >input#btn-giftcard-add";
		/************************************************************ CheckOut page fuel save ************************************************************/

		public final static String ChoosedifferentdayButton = "//div[contains(@id,'dg-store-infor')]//a[contains(text(),'Choose a different day')]";
		public final static String ChoosedifferentdayDatePicker = "//div[contains(@id,'dg-store-infor')]//div[@class='datepicker']";
		public final static String ChoosedifferentdayConfirmdate = "//div[contains(@id,'dg-store-infor')]//input[@value='Confirm date']";
		public final static String ChoosedifferentdayCancel = ".button.tertiary-button.close-button";
		public final static String ChoosedifferentdayDeliveryChargefree = "//div[contains(@id,'dg-store-infor')]//p[@class='cost']";
		public final static String ClubCardFuelSavings = "//fieldset[@id='totalCost']//a[contains(text(),'Clubcard Fuel Savings')]";
		public final static String ClubCardFuelSaveToolTip = "//fieldset[@id='totalCost']//div[@id='fuel-save-tooltip']";
		public final static String ClubCardFuelSaveToolTipClose = "//fieldset[@id='totalCost']//div[@id='fuel-save-tooltip']/a";
		public final static String ClubCardFuelSaveToolTipMessageLine1 = "//p[contains(text(),'With Clubcard Fuel Save, for every £50 you spend you save 2p a litre on Fuel.')]";
		public final static String ClubCardFuelSaveToolTipMessageLine2 = "//p[contains(text(),'More information on')]//following-sibling::a";

		/************************************************************* CheckOut page fuel save message ************************************************************/

		public final static String ClubCardFuelSavingsMessage = "//fieldset[@id='totalCost']//p[contains(text(),'This purchase will contribute towards your')]";

		/************************************************************* CheckOut page Editable Address ************************************************************/

		public final static String Theseitemscanonlybedelivered = "//form[@class='shipping-group-form']//span[contains(text(),'These items can only be delivered')]";
		public final static String EAStdDeliveryradioButton = "//div[contains(@id,'dg-delivery-option')]//form[contains(@id,'delOptionFormsg')]//div[@class='custom-radio checked']";
		public final static String EAAddressDropDown = "//form[@id='changeAddressForm']//div[@class='customDropdown']//span[@class='innerText']";
		public final static String SendToDifferentAddressesLink = "//div[@class='different-address']//a[contains(text(),'Send to different addresses')]";
		public final static String EADeliveryTypeCollectionRadiobutton = "//li[contains(@data-url,'/betadirect/blocks/singleCheckout/deliveryOptions/storeInfo.jsp?shippingGroupId')]";
		public final static String EADeliveryTypeDeliveryRadiobutton = "//li[@class='selected home-delivery']";
		// STDA --> SendToDifferentAddresses
		public final static String STDAText = "//h2[contains(text(),'Send your items to different addresses')]";
		public final static String STDAProductDetails = "//form[contains(@id,'splitShipGroupsg')]//div[@class='product-details']";
		public final static String STDAAddressDropDown = "//form[contains(@id,'splitShipGroupsg')]//span[contains(@class,'innerText')]";
		public final static String STDANewAddressLink = "//form[contains(@id,'splitShipGroupsg')]//a[contains(text(),'New Address')]";
		public final static String STDACancelButton = "//form[contains(@id,'splitShipGroupsg')]//input[contains(@value,'Cancel')]";
		public final static String STDASaveButton = "//form[contains(@id,'splitShipGroupsg')]//input[contains(@value,'Save')]";

		public final static String NewAddressModule = "//div[@class='edit-da-block new-address']";
		// NAM -->NewAddressModule
		public final static String NAMEnterNickNameTextField = "//div[@class='edit-da-block new-address']//input[@id='spc-delivery2-nickname']";
		public final static String NAMEnterpostcodeTextField = "//div[@class='edit-da-block new-address']//input[@id='postal-code-pca']";
		public final static String NAMEditButton = "//div[@class='edit-da-block new-address']//button[contains(text(),'Edit')]";
		public final static String NAMCancelButton = "//div[@class='edit-da-block new-address']//input[contains(@value,'Cancel')]";
		public final static String NAMAddressButton = "//div[@class='edit-da-block new-address']//input[contains(@value,'Add address')]";
		
		
		
		public final static String OrderTab = "div[id='progress-bar'] ul li:nth-of-type(2)";
		public final static String BasketTab = "div[id='progress-bar'] ul li:nth-of-type(1)";
		public final static String ThankYouTab = "div[id='progress-bar'] ul li:nth-of-type(3)";
		public final static String CheckOutItemImageHarryPotter = "img[alt='Harry Potter and the Chamber of Secrets']";
		public final static String CheckOutItemImageTescoSim = "img[alt='Tesco Mobile 4G Pay as you go SIM Pack']";
		public final static String HarryPotterCatalogueNumber = "//span[contains(text(),'M3E-C8KG')]";
		public final static String TescoSimCatalogueNumber = "//span[contains(text(),'574-7120')]";
		public final static String HarryPotterSoldBYText1 = "//p[contains(text(),'Sold by')]";
		public final static String HarryPotterSoldBYText2 = "//span[contains(text(),'Tesco')]";
		public final static String HarryPotterItemPrice = "//span[contains(text(),'£3.85')]";
		public final static String HarryPotterItemQuantityXItemName1 = "//span[contains(text(),'1')]";
		public final static String HarryPotterItemQuantityXItemName2 = "//span[contains(text(),'Harry Potter and the Chamber of Secrets')]";
		public final static String DeliveryMethodCollectionRadioButton = "input[value='storeCollect']";
		public final static String DeliveryMethodHomeDeliveryRadioButton = "input[value='homeDelivery']";
		public final static String DeliveryCostFreeText = "//p[contains(text(),'FREE')]";
		public final static String SubtotalText = "//p[contains(text(),'Subtotal')]";
		public final static String SubtotalAmountText = "//span[@id='payment-summary-subtotal'][contains(text(),'£3.86')]";
		public final static String TotalToPayText = "//p[contains(text(),'Total to pay')]";
		public final static String TotalToPayAmountText = "//span[@class='value total-price'][contains(text(),'£3.86')]";
		public final static String ClubCardPointsText = "//p[contains(text(),'Clubcard points')]";
		public final static String ClubCardPointsEarnedText = "//span[@id='payment-summary-points'][contains(text(),'3')]";
		public final static String SignInEmailInputBox = "#signin-email";
		public final static String SignInPasswordInputBox = "#signin-password";
		public final static String SignInButton = "#signin-button";
		public final static String CustomerName = "//span[contains(text(),'Mr')]";
		
		
		public final static String IamAnewCustomerRadioButton = "#ir-about-you > ul > li:nth-child(2) > div";
		public final static String TitleDropDown = "#ir-register1 > fieldset > div.salutation-wrapper > div.field-wrapper.reg-title > div > a > span.icon";
		public final static String TitleDropDownMR = "#ir-register1 > fieldset > div.salutation-wrapper > div.field-wrapper.reg-title > div > ul > li:nth-child(3) > a";
		public final static String TitleDropDownMobile = "#ir-register1 > fieldset > div.salutation-wrapper > div.field-wrapper.reg-title > label";
		public final static String TitleDropDownMRMobile = "#reg-title > option:nth-child(2)";
		public final static String FirstNameTextBox = "#register-firstname";
		public final static String LastNameTextBox = "#register-lastname";
		public final static String EmailTextBox = "#register-email";
		public final static String PostCodeTextBox = "#postal-code-pca";
		public final static String IDontHaveAclubcardCheckBox = "#clubcard-checkbox > div";
		public final static String RegFirstPageNextButton = "#register-button";
		public final static String EmailEditLink = "#register-email > a";
		public final static String ContactPhoneNumber = "#register-phone";
		public final static String Password = "#register-password";
		public final static String ConfirmPassword = "#register-password-confirm";
		public final static String AgreeAndTC = "#ir-register2 > fieldset > div.field-wrapper.checkbox-wrapper.terms-checkbox-wrapper > div";
		public final static String RegSecondPageNextButton = "#register-button2";
		public final static String DropdownMatchingAllofthePostcode = "[id*='ed']> div.pnlResultsSmall";
		public final static String FirstAddress = "//span[contains(.,'Capita Hartshead Unit 2, Welwyn Garden City')]";
		
		
		public final static String Stores = "//h2[contains(text(),'Stores')]";
		public final static String FirstStore = "//label[contains(text(),'CIRRUS C STAFF ONLY')]";
		public final static String SecondStore = "//label[contains(text(),'WELWYN GARDEN CTY EXP')]";
		public final static String ThirdStore = "//label[contains(text(),'WELWYN EXPRESS')]";
		public final static String FirstStoreRadioButton = ".closest-stores.stores>li:nth-of-type(1)>div>input";
		public final static String SecondStoreRadioButton = ".closest-stores.stores>li:nth-of-type(2)>div>input";
		public final static String ThirdStoreRadioButton = ".closest-stores.stores>li:nth-of-type(3)>div>input";
		public final static String ViewMoreCollectionPoints1 = "//span[contains(text(),'View more collection points')]";
		public final static String ViewMoreCollectionPoints2 = "//span[@data-icon='a']";
		public final static String TelephoneNumber = "//span[contains(text(),'07438305914')]";
		public final static String SelectedStoreNameForCollection = "//b[contains(text(),'CIRRUS C STAFF ONLY')]";
		public final static String ItemCollectionDateAndTimeText = "//p[contains(text(),'You can collect from your chosen store after')]";
		public final static String ItemCollectionInformationText = "//p[contains(text(),'email you when your collection is ready')]";
		public final static String BillingAddress = ".address-details";
		
		public final static String ClubcardBoostImage = ".bcve_ping";
        public final static String InClubcardBoostMoreInfoLink = "//a[contains(text(),'More Info')]";
        
        public static final String NewAddressLinkForBillingAddress = "//a[contains(text(),'new address')]";
		public static final String BillingAddressNickNameTextBox = "#add-billadr-nickname";
		public static final String AddNewBillingAddressButton = ".button.secondary-button.save";
		public static final String MyAccountLink = "My account";

	}

	public final class GlobalHeader {
		public final static String TescoDirectLogo = "branding";
		public final static String WebsiteFeedback = "Website Feedback";
		public final static String MyWishlists = "My Wishlists";
		public final static String RecentlyViewed = "Recently Viewed";
		public final static String MyAccount = "My Account";
		public final static String Help = "Help";
		/************************************************************ Basket Page Header ************************************************************/
		public final static String ShopbyDepartmentmenubutton = "main-menu-button";
		public final static String Imlookingforsearchbar = "search-text-field";
		public final static String ImlookingforsearchIcon = "//span[contains(@class,'icon searchIcon')]";
		public final static String RegisterorSignInbutton = "//div[@id='ssb_block_2']//a[contains(.,'Register or Sign in')]";
		public final static String Yourbasketbutton = "//div[@id='ssb_block_2']//span[contains(@data-icon,'b')]";
		public final static String Offerslink = "//div[@id='nav-bar']//a[contains(.,'Offers')]";
		public final static String Clearancelink = "//div[@id='nav-bar']//a[contains(.,'Clearance')]";
		public final static String StoreLocatorlink = "//div[@id='nav-bar']//a[contains(.,'Store Locator')]";

	}

	public final class GlobalFooter {

		public final static String VISA = ".visa>a";
		public final static String MasterCard = ".mastercard>a";
		public final static String AmericanExpress = ".american-express>a";
		public final static String Maestro = ".maestro>a";
		public final static String TESCOBank = ".tesco-bank>a";
		public final static String VeriSignSecured = ".verisign>a";
		public final static String VerifiedbyVISA = ".visa-verified>a";
		public final static String MasterCardSecureCode = ".mastercard-securecode>a";
		public final static String AmericanExpressSafekey = ".amex-safekey>a";
		/************************************************************ Basket Page Footer ************************************************************/
		public final static String FooterStoreLocator = "//div[@id='footer']//a[contains(@href,'http://www.tesco.com/storelocator/')]";
		public final static String FooterNeedHelp = "//div[@id='footer']//a[@class='need-help']";

		public final static String FooterTescoDirectLogo = "//div[@id='footer']//a[@class='logo']";
		public final static String CustomerService = "//div[@id='footer']//a[contains(.,'Customer Service')]";
		public final static String Help = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Help')]";
		public final static String MyAccount = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'My Account')]";
		public final static String WhereIsMyOrder = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Where is my order?')]";
		public final static String DeliveryInformation = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Delivery information')]";
		public final static String ReturnsPolicy = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Returns policy')]";
		public final static String ContactUs = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Contact us')]";
		public final static String BuyingGuides = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Buying guides')]";

		public final static String OurWebsite = "//div[@id='footer']//a[contains(.,'Our Website')]";
		public final static String Sitemap = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Sitemap')]";
		public final static String Accessibility = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Accessibility')]";
		public final static String PrivacyPolicy = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Privacy policy')]";
		public final static String TermsAndCondition = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Terms and Conditions')]";
		public final static String SignUpforEmail = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Sign up for email')]";
		public final static String SellersAtTesco = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Sellers at Tesco')]";

		public final static String ExploreTesco = "//div[@id='footer']//a[contains(.,'Explore Tesco')]";
		public final static String TescoPLC = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Tesco PLC')]";
		public final static String WineByTheCase = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Wine by the case')]";
		public final static String TescoBank = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Tesco Bank')]";
		public final static String ClubCard = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Clubcard')]";
		public final static String GreenerLiving = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Greener Living')]";
		public final static String Carrers = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Careers')]";

		public final static String Groceries = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Groceries')]";
		public final static String Entertainment = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Entertainment')]";
		public final static String PhoneShop = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Phone Shop')]";
		public final static String TescoDiets = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Tesco Diets')]";
		public final static String Opticians = "//div[@id='footer']//div[@class='accordion']//li[contains(.,'Opticians')]";

		public final static String EveryLittleHelps = "//div[@id='footer']//span[@class='icon-every-little']//span[contains(.,'Every little helps')]";
		public final static String AllRightsReserved = "//div[@id='footer']//span[contains(.,'Tesco.com 2013 All Rights Reserved')]";

	}

	public final class BasketPage {
		public final static String BasketAttachmentPageTitle = ".page-title";
		public final static String BAPageProductImage = "//div[@id='basket-attach']//img[contains(@src,'http://placehold.it/140x140')]";
		public final static String BAPageProductDescription = "//div[@id='basket-attach']//a";
		public final static String BAPageProductCost = "//div[@id='basket-attach']//div[@class='basket-item-holder']//p[contains(text(),'£')]";
		public final static String BAPageOtherDetailsOfProduct = "//div[@id='basket-attach']//h3";
		public final static String BAPageAddtoBasketButton = "//form[@id='more-option0']//input[contains(@value,'Add to basket')]";
		public final static String BasketSummaryNumOfItems = "//div[@id='basket-attach']//div[@class='basket-summary']//strong[contains(text(),'items')]";
		public final static String BasketSummaryCostOfTheProduct = "//div[@id='basket-attach']//div[@class='basket-summary']//span[contains(text(),'£')]";
		public final static String BasketSummaryClubcardPoints = "//div[@id='basket-attach']//div[@class='basket-summary']//p[contains(text(),'Total Clubcard points')]";
		public final static String BasketSummaryContinueShoppingLink = "//div[@id='basket-attach']//div[@class='basket-summary']//a[contains(text(),'Continue shopping')]";
		public final static String BasketSummaryViewBasketAndcheckoutButton = "//div[@id='basket-attach']//div[@class='basket-summary']//a[contains(text(),'View basket & checkout')]";
		public final static String BasketSummaryNoticeMessage = "//div[@id='basket-attach']//div[@class='basket-summary']//a[contains(text(),' More about delivery options')]";

		public final static String BAPagePopularProducts = "//div[@id='rr_placement_1']/div[@class='product-carousel tabbed rr-product rrDone']";
		public final static String BAPagePopularProductsPreviousArrow = "//div[@id='rr_placement_1']//ul[@class='product-carousel-nav']//a[@class='previous']";
		public final static String BAPagePopularProductsNextArrow = "//div[@id='rr_placement_1']//ul[@class='product-carousel-nav']//a[@class='next']";
		public final static String BAPagePopularProductsXbox1 = "//div[@id='rr_placement_1']//a[contains(text(),'Xbox One FIFA 15 Bundle')]";
		public final static String XboxResultPage = ".page-title";
		public final static String BAPagePopularProductsXbox2 = "//div[@id='rr_placement_1']//a[contains(text(),' Fifa 15 Xbox 360')]";

		public final static String BAPageTrendingProducts = "//div[@id='rr_placement_0']/div[@class='product-carousel tabbed rr-product rrDone']";
		public final static String BAPageTrendingProductsPreviousArrow = "//div[@id='rr_placement_0']//ul[@class='product-carousel-nav']//a[@class='previous']";
		public final static String BAPageTrendingProductsNextArrow = "//div[@id='rr_placement_0']//ul[@class='product-carousel-nav']//a[@class='next']";
		public final static String BAPageTrendingProductsPlayStation = "//div[@id='rr_placement_0']//a[contains(text(),'PlayStation 4 Console')]";
		public final static String PlayStationResultPage = ".page-title";
		public final static String BAPageTrendingProductsXboxOneConsole = "//div[@id='rr_placement_0']//a[contains(text(),'Xbox One Console (without Kinect)')]";

		public final static String BAPageRecentlyViewedProducts = "//div[@id='recently-viewed']";
		public final static String BAPageRecentlyViewedProductsPreviousArrow = "//div[@id='recently-viewed']//ul[@class='product-carousel-nav']//a[@class='previous']";
		public final static String BAPageRecentlyViewedProductsNextArrow = "//div[@id='recently-viewed']//ul[@class='product-carousel-nav']//a[@class='next']";
		public final static String BAPageRecentlyViewedProductsItem1 = "//div[@id='recently-viewed']//a[contains(text(),'lorem ipsum litora euismod nec suspendisse sem curabitur')]";
		public final static String Item1ResultPage = ".page-title";
		public final static String BAPageRecentlyViewedProductsItem2 = "//div[@id='recently-viewed']//a[contains(text(),'lorem ipsum')]";

		public final static String BAPageRecentlyViewedTurnOffButton = "//div[@id='recently-viewed']//a[@class='toggle-block']";
		public final static String BAPageRecentlyViewedTurnONButton = "//div[@id='recently-viewed']//a[contains(text(),'Turn on')]";
		public final static String BAPageRecentlyViewedClearAllButton = "//div[@id='recently-viewed']//a[@class='clear-all']";
		public final static String BAPageRecentlyViewedClearAllMessages = "//div[@id='recently-viewed']//p[@class='no-items']";
		public final static String BAPageRecentlyViewedProductRemoveButton = "//div[@id='recently-viewed']//a[@class='remove']";

		/************************************************************ Basket Summary ************************************************************/
		public final static String BPBasketSummary = "//div[@id='basket-summary']//h2[contains(.,'Basket summary')]";
		public final static String BPSubtotal = "//div[@id='basket-summary']//p[contains(text(),'Subtotal')]//following-sibling::span";
		public final static String BPPromotionalsavings = "//div[@id='basket-summary']//div[contains(@class,'savings-wrapper')]//li[@class='amount']";
		public final static String BPTotalsavings = "//div[@id='basket-summary']//div[contains(@class,'savings-wrapper')]//li[@class='total']//following-sibling::span";
		public final static String BPBaskettotal = "//div[@id='basket-summary']//h3[contains(text(),'Basket total')]//following-sibling::span";
		public final static String BPClubcardpoints = "//div[@id='basket-summary']//li[contains(@class,'amount first')]//following-sibling::span";
		public final static String BPExtraclubcardpoints = "//div[@id='basket-summary']//li[contains(text(),'Extra Clubcard points')]";
		public final static String BPTotalClubcardpoints = "//div[@id='basket-summary']//li[contains(text(),'Total Clubcard points')]";
		public final static String BPContinuetocheckout = "#basket-checkout";
		public final static String BPGotAnEcouponmessage = "//div[@id='basket-redeem']/h2[contains(text(),'Got an eCoupon, Clubcard voucher or Giftcard?')]";
		public final static String BPYouCanaddtheseincheckoutMessage = "//div[@id='basket-redeem']//p[contains(text(),'You can add these in checkout')]";
		public final static String BPContinueShoppingButton = "//div[@id='basket-continue-shopping']//a[contains(text(),'Continue shopping')]";

		public final static String YouHaveTwoItemsInYourBasket = "//div[@id='basket-summary-mini']//h2[contains(.,' You have')]";
		public final static String BPContinueShoppingLink = "//div[@id='basket-summary-mini']//a[@class='continue-shopping']";
		public final static String BPCheckOutButton = "//input[@id='basket-checkout-mini']";
		public final static String BPItems = "//div[@id='basket-main']";
		public final static String BPQuantity = "//div[@id='basket-main']//div[@class='quantity']";
		public final static String Quantity = "input[id*='ci']";
		public final static String QuantityMobile = "#basket-main > div.basket-item-container > div.basket-item > div.quantity > form > a.increase.tertiary-button";
		public final static String BPPrice = "//div[@id='basket-main']//div[@class='price']";
		public final static String BPItemSubtotal = "//div[@id='basket-main']//div[@class='subtotal']";
		public final static String BPProductDescription = "//div[@id='basket-main']//div[@class='description']";
		public final static String BPProductSupplier = "//div[@id='basket-main']//p[@class='supplier']";
		public final static String BPProductOffer = "//div[@id='basket-main']//p[contains(text(),'spend')]";
		public final static String BPProductDeliveryOption = "//div[@id='basket-main']//div[@class='delivery-options']";
		public final static String BPUpdateLink = "#updateItem";
		public final static String BPRemoveLink = "//div[@id='basket-main']//a[contains(text(),'Remove')]";
		public final static String BPSaveForLaterLink = "//div[@id='basket-main']//a[contains(text(),'Save for later')]";
		public final static String BPQuantityTextField = "//input[contains(@id,'ci')]";
		public final static String BPServiceProductDesc = "//div[@id='basket-main']//div[@class='product-option']//div[@class='description']";
		public final static String BPServiceProductQuantity = "//div[@id='basket-main']//div[@class='product-option']//div[@class='quantity']";
		public final static String BPServiceProductPrice = "//div[@id='basket-main']//div[@class='product-option']//div[@class='price']";
		public final static String BPServiceProductSubtotal = "//div[@id='basket-main']//div[@class='product-option']//div[@class='subtotal']";
		public final static String BPServiceProductUpdateLink = "//div[@id='basket-main']//div[@class='product-option']//input[@id='updateItemservice1']";
		public final static String BPServiceProductRemoveLink = "//div[@id='basket-main']//div[@class='product-option']//a[contains(text(),'Remove')]";
		public final static String BPServiceProductSaveForLaterLink = "//div[@id='basket-main']//div[@class='product-option']//a[contains(text(),'Save for later')]";
		public final static String BPServiceProductQuantityTextField = "//div[@id='basket-main']//div[@class='product-option']//input[@class='quantity-display']";
		
		public final static String BPEmptyBasketButton = "#emptyBasket > input[name='empty-basket']:nth-child(7)";
		public final static String BPEmptyBasketButtonMobile = "#emptyBasket > input[name='empty-basket']:nth-child(7)";
		public final static String AreYouSureYouWantToEmptyYourBasketYesButton = "#emptyBasketConfirm >input.yes";
		public final static String AreYouSureYouWantToEmptyYourBasketYesButtonMobile = "#lightbox > div >form[id='emptyBasketConfirm'] > input.yes"; 
		
		public final static String ItemSavedForLaterProducts = "//div[@id='save-for-later']/h2";
		public final static String ItemSavedForLaterProductTitle = "//div[@id='save-for-later']//a[contains(@onclick,'s_objectID')]";
		public final static String ItemSavedForLaterSuppliedBy = "//div[@id='save-for-later']//p[contains(@class,'supplier')]";
		public final static String ItemSavedForLaterCostOftheProduct = "//div[@id='save-for-later']//p[contains(@class,'current')]";
		public final static String ItemSavedForLaterSavings = "//div[@id='save-for-later']//p[contains(@class,'previous')]";
		public final static String ItemSavedForLaterMoveToBasketButton = "//div[@id='save-for-later']//input[contains(@class,'move-to-basket')]";
		public final static String ItemSavedForLaterXbutton = "//div[@id='save-for-later']//a[contains(@class,'remove')]";
		public final static String ItemSavedForLaterShowAllbutton = "//div[@id='save-for-later']//a[contains(@class,'show-more tertiary-button')]";
		public final static String SignOutLink = "Sign Out";

	}

	public final class CancelMyOrderPage {
		public final static String CancelMyOrderTitle = ".page-title";
		public final static String OrderNumber = "//div[@id='main-content']//div[@class='order-details-header']/h2";
		public final static String Notification = "//div[@id='main-content']//div[@class='notification']";
		public final static String HowMuchMoney = "cancel-order-csc";
		public final static String Primaryreasondropdown = "//select[@id='priReason']";
		public final static String Secondaryreasondropdown = "//select[@id='secReason']";
		public final static String YourCommentsTextBox = "//textarea[@id='comments']";
		public final static String Backtoorderdetailsbutton = "//form[@id='cancelOrderForm']//a[contains(text(),'Back to order details')]";
		public final static String Submitrequestbutton = "//form[@id='cancelOrderForm']//input[@id='cancelOrder']";
		public final static String PrintThisPagelink = "//form[@id='cancelOrderForm']//a[contains(text(),'Print this page')]";

		public final static String RefundDetails = "//form[@id='cancelOrderForm']//h2";
		public final static String Cardtype = "//form[@id='cancelOrderForm']//span[contains(text(),'Card type:')]";
		public final static String CardNumber = "//form[@id='cancelOrderForm']//span[contains(text(),'Card number:')]";
		public final static String Expirydate = "//form[@id='cancelOrderForm']//span[contains(text(),'Expiry date:')]";
		public final static String Nameoncard = "//form[@id='cancelOrderForm']//strong[contains(text(),'Name on card:')]";
		public final static String BillingAddress = "//form[@id='cancelOrderForm']//strong[contains(text(),'Billing address:')]";
		public final static String Amountrefunded = "//form[@id='cancelOrderForm']//strong[contains(text(),'Amount refunded:')]";
		public final static String Clubcardendingin = "//form[@id='cancelOrderForm']//strong[contains(text(),'Clubcard ending in:')]";
		public final static String Clubcardpointsdeducted = "//form[@id='cancelOrderForm']//strong[contains(text(),'Clubcard points deducted:')]";
		public final static String Thispageissecure = "//p[contains(text(),'This page is secure. All of your personal details are safe.')]";

	}

	public final class MyAccountPage {
		public final static String SignInButton = "#user";
		public final static String YourAccount = "Your Account";
		public final static String YourDirectOrders = "Your Direct Orders";
		public final static String YourWishlists = "Your Wishlists";
		public final static String Yourrecentlyvieweditems = "Your recently viewed items";
		public final static String Managecontactdetails = "Manage contact details";
		public final static String Manageaddressbook = "Manage address book";
		public final static String Managepaymentdetails = "Manage payment details";
		public final static String HelpButton = ".button.help";
		public final static String HelpButtonMobile = "#wrapper > div.uiOverlay > div > div > div > div > a.button.help";
		public final static String SignOutButton = ".button.sign-out";
		public final static String SignOutButtonMobile = "#wrapper > div.uiOverlay > div > div > div > div > a.button.sign-out";

		public final static String Edityouraddress = ".page-title";
		public final static String Addressnicknametextfield = "add-billadr-nickname";
		public final static String AddressnicknameLabel = "//label[contains(.,'Address nickname*required')]";
		public final static String Postcodetextfield = "postal-code-pca";
		public final static String PostcodeLabel = "//label[contains(.,'Postcode*')]";
		public final static String Editbutton = "//button[contains(.,'Edit')]";
		public final static String CompanyNametextfield = "nv-Company";
		public final static String CompanyNameLabel = "//label[contains(.,'Company name')]";
		public final static String Flatunitnumbertextfield = "nv-FlatNumber";
		public final static String FlatunitnumberLabel = "//label[contains(.,'Flat/unit number')]";
		public final static String Buildingnumbernametextfield = "nv-BuildingName";
		public final static String BuildingnumbernameLabel = "//label[contains(.,'Building number / name')]";
		public final static String Streettextfield = "nv-PrimaryStreet";
		public final static String StreetLabel = "//label[contains(.,'Street')]";
		public final static String Propertytypedropdown = "//form[@id='add-address']//a[@class='control']";
		public final static String PropertytypeLabel = "//label[contains(.,'Property type*required')]";
		public final static String Daytimephonetextfield = "dayphone";
		public final static String DaytimephoneLabel = "//label[contains(.,'Daytime phone*required')]";
		public final static String Eveningphonetextfield = "eveningphone";
		public final static String EveningphoneLabel = "//label[contains(.,'Evening phone*required')]";
		public final static String Mobilephonetextfield = "mobilephone";
		public final static String MobilephonetextLabel = "//label[contains(.,'Mobile phone')]";
		public final static String Savechangesbutton = "//div[@id='main-content']//input[@value='Save changes']";
		public final static String Cancelbutton = "//div[@id='main-content']//input[@value='Cancel']";
		
		public final static String ViewDirectOrdersbutton = "#microsite-nav > div > div:nth-child(1) > ul > li:nth-child(1) > a";
		
		public static final String ChangeMyEmailAddressLink = "Change my email address";
		public static final String ChangePasswordLink = "Change password";
		public final static String AddAPaymentCardLink = "Add a payment card";
		public final static String ManageMyPaymentDetailsLink = "Manage my payment details";
		public final static String ManageMyAddressBookLink = "Manage my address book";
		public final static String AddANewAddressLink = "Add a new address";

	}
	
	public final class MyOrdersPage {
		public final static String ViewOrdersbutton = "#order-summary > div > div.items-dispatched > div.delivery-block > a";
		public final static String CancelOrdersbutton = "#order-header-actions > div > ul > li:nth-child(4) > a";
		public final static String IWantToDropDown = "#order-header-actions > a";
		public final static String ReasonDropDown = "#secondaryReasonDiv > div > a";
		public final static String CheapElseWhere_Option = "#secondaryReasonDiv > div > ul > li:nth-child(3) > a";
		public final static String ReasonDropDownMob = "select[id='secReason']";
		public final static String CommentsTextBox = "#comments";
		public final static String SubmitRequestButton = "#cancelOrder";
		public final static String CancelInfoNotification = "#cancel-order-csc";
	}
	public final class HomePage {
		public final static String SignInButton = "#user";
		public final static String SignInOrRegisterLink = "Sign in";
		public final static String WelcomeMsg = "//*[@id='nav-bar']/div[2]/ul/li[1][contains(text(),'Hello')]";
		public final static String WelcomeMsgMVP = "//div[@id='nav-bar']/div[1][contains(text(),'Hello')]";
		public final static String WelcomeMsgMobile = "#nav-bar > div.navigation > ul > li.first.sign-in";
		public final static String SignOutLink = "Sign Out";
		public final static String SignOutMobile = "#nav-bar > div.navigation > ul > li.first.sign-in > form > a";
		public final static String ViewBasketButton = "#go-to-basket > div.basket-icon-wrapper > div.icon.icon-basket";
		public final static String BasketContainerViewBasketButtonMobile = "#edit-basket-items";
		public final static String SearchSuggestionAsYouTypeOverLayType1 = "#spf-listContainer";
		public final static String SearchSuggestionAsYouTypeOverLayType2 = "body > div.ac_results";
		public final static String SearchOverlayFirstSuggestion = "#spf-autocompleteItem";
		public final static String SearchButton= "#search-submit";
		public final static String SearchByProductNameCatalogueNoOrKeywordTextField = "#search-text-field";
		//
		public static final String MyAccountLink = "My Account";
		public static final String CookiesMsg = ".tesco-cookie";
		public static final String CookiesMsgCloseButton = ".tesco-cookie-accept>div>img";
	}

	public final class AboutYouPage {
		public final static String MyAccount = "My Account";
		public final static String ImAnExistingCustomerRadioButton = "//form[@id='ir-about-you']/ul/li[1]/div/input[@id='existingCustomer']";
		public final static String SignInEmailInputBox = "#signin-email";
		public final static String SignInPasswordInputBox = "#signin-password";
		public final static String SignInButton = "#signin-button";
		public final static String IamAnewCustomerRadioButton = "#ir-about-you > ul > li:nth-child(2) > div";
		public final static String TitleDropDown = "#ir-register1 > fieldset > div.salutation-wrapper > div.field-wrapper.reg-title > div > a > span.icon";
		//public final static String TitleDropDown = "select[id='reg-title']";
		public final static String TitleDropDownMR = "#ir-register1 > fieldset > div.salutation-wrapper > div.field-wrapper.reg-title > div > ul > li:nth-child(3) > a";
		public final static String TitleDropDownMobile = "#ir-register1 > fieldset > div.salutation-wrapper > div.field-wrapper.reg-title > label";
		public final static String TitleDropDownMRMobile = "#reg-title > option:nth-child(2)";
		public final static String FirstNameTextBox = "#register-firstname";
		public final static String LastNameTextBox = "#register-lastname";
		public final static String EmailTextBox = "#register-email";
		public final static String PostCodeTextBox = "#postal-code-pca";
		public final static String EditButton = "#ir-register1 > fieldset > div.field-wrapper.post-code > div > button";
		public final static String CompanyName = "#nv-Company";
		public final static String FlatNumber = "#nv-FlatNumber";
		public final static String BuildingNumber = "#nv-BuildingName";
		public final static String Street = "#nv-PrimaryStreet";
		public final static String DropdownMatchingAllofthePostcode = "[id*='ed']> div.pnlResultsSmall";
		public final static String FirstAddress = "div[id*='filterItem'] > span:nth-child(2)";
		public final static String ClubcardNumberTextBox = "#register-clubcard";
		public final static String IDontHaveAclubcardCheckBox = "#clubcard-checkbox > div";
		public final static String RegFirstPageNextButton = "#register-button";
		public final static String EmailEditLink = "#register-email > a";
		public final static String ContactPhoneNumber = "#register-phone";
		public final static String PasswordStrength = "#ps-strength";
		public final static String Password = "#register-password";
		public final static String ConfirmPassword = "#register-password-confirm";
		public final static String AgreeAndTC = "#ir-register2 > fieldset > div.field-wrapper.checkbox-wrapper.terms-checkbox-wrapper > div";
		public final static String BackButton = "#ir-register2-back > a";
		public final static String RegSecondPageNextButton = "#register-button2";

	}
	
	public final class SearchResultsPage{
		public final static String SearchBar = "#search-text-field";
		public final static String GoButton = "#search-submit";
		public final static String ResultspageTitle = "#breadcrumb > ul > li.last";
		public final static String NoOfProducts = "//form[@id='frmTest']//div[@class='filter-productCount']";
		public final static String NoOfProductsMobile = "#filter-controls > div";
		public final static String HudlImage = "img[alt*='hudl']";
		public final static String HudlText = "li[id*='pt']> div > div.title-author-format > h3 > div > a[href*='hudl']";
		public final static String ViewByCategory = "#product-categories > h3[class='filter-categoryLabel']";
		public final static String DifferentCategory = "#product-categories > div.filter-categoryOptionList > a:nth-child(1)";
		public final static String NumberofProductsAvailableWithinEachRange = "#product-categories > div.filter-categoryOptionList > a:nth-child(1) > span";
		public final static String RefineByClearAllButtonLVP = "#clear-all-filters";
		public final static String RefineByClearAllButtonMobile = "#product-filter-actions > li.refine > a";
		public final static String RefineByCloseButtonMobile = "#product-filters-wrapper > div.filter-overlay.filter-activeList_disabled.filter-overlay_active > div.filter-activeList > div";
		public final static String PriceFilter ="//div[@class='filter-filterList']//h3[contains(text(),'Price')]";
		public final static String PriceRanges ="//div[@class='filter-filterList']//a[contains(text(),'Under')]";
		public final static String PriceRangesWithinEachRange ="//div[@class='filter-filterList']//a[contains(text(),'Under')]/span";
		public final static String ProductImage1 ="ul.products > li[id*='pt']:first-child  > div > div.title-author-format > h3 > div > a";
		public final static String AddToBasketButton ="#addToBasket_PLP_0 > input.add-to-basket.primary-button";
		public final static String AddToBasketButton1 ="#addToBasket_PLP_0 > input.add-to-basket.primary-button";
		public final static String AddToBasketButton2 ="#addToBasket_PLP_1 > input.add-to-basket.primary-button";
		public final static String AddToBasketButton3 ="#addToBasket_PLP_2 > input.add-to-basket.primary-button";
		public final static String TurnOffButton ="#recently-viewed > a.toggle-block";
		public final static String ViewMoreButton ="#listing > div.products-wrapper > ul.products > li.load-more-tile > div";
		public final static String ProductImage = "li[id*='pt'] > div > a.thumbnail > div > img";
		public final static String ProductTitle = "li[id*='pt'] > div > div.title-author-format > h3 > div > a";
		public final static String RatingStar = "li[id*='pt'] > div > div.rating-container > span.average-rating.rating";
		public final static String SellerInformation = "li[id*='pt'] > div > p.buy-block > span";
		public final static String SelectOptions = "form[id*='addToBasket_PLP'] > a";
		public final static String AddToCompareCheckBox = "li[id*='pt'] > div > div.add-to-compare > div";
		
		public final static String PriceButtonMobile = "#product-filters-wrapper > div.filter-overlay.filter-activeList_disabled.filter-overlay_active > div.filter-filterList > div.filter-filterListWrap > div:nth-child(1)";
		public final static String PriceFilterCheckBox = "a[data-facet-option-value='Under £5']";
		public final static String PriceFilterCheckBoxMVP = "#product-filters-wrapper > div.filter-overlay.filter-activeList_disabled.filter-overlay_active > div.filter-filterOptionTablet > div.filter-filterListWrap > ul > li:nth-child(1) > a[data-facet-option-value='Under £5']";
		public final static String filterOptionTablet = "#product-filters-wrapper > div.filter-overlay.filter-activeList_disabled.filter-overlay_active > div.filter-filterOptionTablet";
		public final static String ShowProductsbuttonMobile = "#product-filters-wrapper > div.filter-overlay.filter-overlay_active > div.filter-footer > div";
		public final static String ShowProductsbuttonMVP = "#product-filters-wrapper > div.filter-overlay.filter-overlay_active > div.filter-footer > div";
		public final static String PriceOfTheproduct = "li[id*='pt'] > div > p.price";
		public final static String SortByRelavance = "#product-filter-actions > li.sort > a";
		public final static String SortByLowToHigh = "a[data-val='3']";
		public final static String SortByLowToHighMobile = "#lightbox > ul > li:nth-child(5) > a";
		public final static String ClearAllButton = "#clear-all-filters";
		public final static String BreadCrumbMobile = "#breadcrumb > div";
		public final static String BreadCrumbHomeLink = "#breadcrumb > ul > li.first > a > span";
		public final static String SortByNew = "a[data-val='10']";
		public final static String SortByNEWMobile = "#lightbox > ul > li:nth-child(11) > a";
		public final static String ImNewPingImage = "li[id*='pt'] > div > a:nth-child(1) > div > img";
		public final static String ClubCardBoostImage = "li[id*='pt'] > div > a:nth-child(1) > div > img";
		public final static String Category = "#product-categories > div.filter-categoryOptionList > a:nth-child(1)";
		public final static String CategoryNumber = "#product-categories > div.filter-categoryOptionList > a:nth-child(1) > span";
		public final static String ShowingProducts = "#product-filter-actions > li.product-count > div > b";
		public final static String ShowingProductsMobile = "#filter-controls > div > b";
		}
	public final class StreamlineBasketPage{
		public final static String StreamlinebasketOverlay = "#lightbox";
		public final static String OneItemAddedToBasket = ".updated-info>article>p>span";
		public final static String OneItemAddedToBasketMobile = "#virtual-page > div.current-details > div.section-main > section > div.updated-info > article > p > span";
		public final static String NumberofItemsinBasket = "div.summary > article > p";
		public final static String NumberofItemsinBasketMobile = "#virtual-page > div.current-details > div.section-main > section > div.summary > article > p";
		public final static String Subtotal = "div.summary > article > ul > li:nth-child(1) > p";
		public final static String SubtotalMobile = "#virtual-page > div.current-details > div.section-main > section > div.summary > article > ul > li:nth-child(1) > p";
		public final static String ClubCardPoints = "div.summary > article > ul > li:nth-child(2) > p:nth-child(1)";
		public final static String ClubCardPointsMobile = "#virtual-page > div.current-details > div.section-main > section > div.summary > article > ul > li:nth-child(2) > p:nth-child(1)";
		public final static String BasketTotal = "div.summary > article > div > p";
		public final static String BasketTotalMobile = "#virtual-page > div.current-details > div.section-main > section > div.summary > article > div > p";
		public final static String ViewBasketButton = "div.current-details > div.section-nav > nav > ul > li:nth-child(1) > a";
		public final static String ViewBasketButtonMobile = "#virtual-page > div.current-details > div.section-nav > nav > ul > li:nth-child(1) > a";
		public final static String ViewBasketButtonHudl = "#lightbox > div.current-details > div.section-nav > nav > ul > li:nth-child(1) > a";
		public final static String CheckoutButton = "#basket-checkout-mini";
		public final static String CheckoutButtonMobile = "#basket-checkout-mini";
		public final static String ContinueShoppingLink = "div[id='lightbox'] > div.current-details > div.section-nav > nav > p > a";
		public final static String ContinueShoppingLinkMobile = "#virtual-page > div.current-details > div.section-nav > nav > p > a";
		public final static String ContinueShoppingLinkHudl = "#lightbox > div.current-details > div.section-nav > nav > p > a";
		public final static String Itemsrelatedtoyourbasketblock = "#rr_placement_0 > div";
		public final static String ItemsrelatedtoyourbasketblockMobile = "#rr_placement_0 > div";
		public final static String Customerswithsimilarinterestsalsoviewedblock = "#rr_placement_1 > div";
		public final static String CustomerswithsimilarinterestsalsoviewedblockMobile = "#rr_placement_1 > div";
		
	}
	public final class PdpPage{
		public final static String AddTobasketButton = "#addToBasket_PDP-1 > div.buttons > input.primary-button.add-to-basket";
	}
	
	public final class OrderConfirmationPage{
		public final static String YourOrderHasBeenConfirmed = "#ssb_block_3 > h1";
		public final static String MyAccount = "My account";
		
		
	}
	
	public final class TescoMobileSimPDPPage{
		
		public final static String AddToBasketButton = "input[value='Add to basket']";
		public final static String SearchByProductNameCatalogueNoOrKeywordTextField = "#search-text-field";
		public final static String SearchButton= "#search-submit";
		
		
	}

	public final class BasketDetailsPage{
		
		public final static String ContinueShoppingLink = ".continue";
		public final static String CheckOutButton = "input[value='Checkout']";
		public final static String Page = "#lightbox";
		public final static String ClosePageButton = "#lightbox > a > span.icon";
			
		}

	public final class HarryPotterDVDPDPPage{
		
		public final static String AddToBasketButton = "input[value='Add to basket']";		
		
	}
	
	public final class IpadPDPPage{
		
		public final static String BreadcrumbsOfTheProduct = "#breadcrumb";
		public final static String ProductTitle = ".page-title";
		public final static String ProductCatalogueNumber = ".cat-no";
		public final static String ProductImage = ".carousel-items-container>li>img";
		public final static String ProductStarRating = ".bv-rating-stars.bv-rating-stars-off";
		public final static String WriteAReviewlink = ".bv-write-review.bv-focusable.bv-submission-button";
		public final static String SocialMediaIcons = "//div[@id='social-network-share-buttons']/div[2]";
		public final static String ProductBuyBox = ".content.seller-price-info";
		public final static String ProductDetailsBlock = "#product-details-link";
		public final static String ProductSpecificationsBlock = ".product-specifications";
		public final static String CustomersWhoViewedBlock = "//*[@id='rrSwitch1']/div";
		public final static String CustomerReviewsBlock = ".bv-content-list-container";
		public final static String AddToWishlistButton = ".tertiary-button.add-to-wishlist";
		public final static String SpecialOffersBlock = "#product-promotions";
		public final static String SearchByProductNameCatalogueNoOrKeywordTextField = "#search-text-field";
		public final static String SearchButton= "#search-submit";
		
		
	}
	
public final class AquaMarinePDPPage{
		
		public final static String VariantItemsDropdown = "//*[@id='v1']/article/a";
		public final static String RecentlyViewedItemsBlock = "#recently-viewed";
		public final static String WriteAReviewlink = ".bv-write-review.bv-focusable.bv-submission-button";
		public final static String MyReviewOverlay = "#bv-mbox-lightbox-list";
		public final static String QuantityBox = "input[id^='quantity']";
		public final static String AddToBasketButton = ".primary-button.add-to-basket";
		public final static String FeasibleDeliveryOptions = ".delivery.newDeliveryOptions.tescoBuyBox>ul";
		public final static String CloseMyReviewOverlayButton = "#bv-mbox-lightbox-list > button > span:nth-child(1)";
		public final static String VariantItemsDropdownFirstOption = "#ring_size>li:nth-child(1)";
		public final static String VariantItemsDropdownMobile = "#v1 > article > select";
		public final static String ProductTitle = ".page-title";
		
	}

public final class Hudl2PinkPLPPage{
	public final static String PinkItem = "#pt-621-0911_270-7552 > div > div.title-author-format > h3 > div > a";
	
	
	
	
}

public final class AddANewAddressPage{
	
	public final static String Breadcrumbs = "#breadcrumb";
	public final static String AddANewAddressHeaderText = "//h1[contains(text(),'Add a new address')]";
	public final static String AddressInformationalText = "//p[contains(text(),'Please enter your postcode and then')]";
	public final static String AddressNicknameLabel = "//label[contains(text(),'Address nickname')]";
	public final static String AddressNicknameExampleText = "//p[contains(text(),'e.g. work, home')]";
	public final static String AddressNicknameTextbox = "#add-billadr-nickname";
	public final static String PostcodeLabel = "//label[contains(text(),'Postcode')]";
	public final static String PostcodeTextbox = "#postal-code-pca";
	public final static String DisabledEditButton = ".secondary-button.disabled.edit-address-button.edit-add-button";
	public final static String DaytimePhoneLabel = "//label[contains(text(),'Daytime phone')]";
	public final static String DaytimePhoneTextbox = "#dayphone";
	public final static String EveningPhoneLabel = "//label[contains(text(),'Evening phone')]";
	public final static String EveningPhoneTextbox = "#eveningphone";
	public final static String MobilePhoneLabel = "//label[contains(text(),'Mobile phone')]";
	public final static String MobilePhoneTextbox = "#mobilephone";
	public final static String EnabledCancelButton = ".button.tertiary-button.cancel1";
	public final static String DisabledSaveAddressButton = ".button.secondary-button.save.disabled";
	public static final String EnabledEditButton = ".secondary-button.edit-address-button.edit-add-button";
	public final static String DropdownMatchingAllofthePostcode = "[id*='yy']> div.pnlResultsSmall";
	public final static String FirstAddress = "//span[contains(.,'Capita Hartshead Unit 2, Welwyn Garden City')]";
	public final static String EnabledSaveAddressButton = ".button.secondary-button.save";
	
	
	
}

public final class AddCardPage{
	
	public final static String Breadcrumbs = "#breadcrumb";
	public final static String AddAPaymentCardHeaderText = "//h1[contains(text(),'Add a payment card')]";
	public final static String PaymentCardInformationaltext = "//p[contains(text(),'We securely save your card')]";
	public final static String CardDetailsHeader = "//h2[contains(text(),'Card details')]";
	public final static String CardNumberLabel = "//label[contains(text(),'Card number')]";
	public final static String CardNumberTextbox = "#creditCardNumber";
	public final static String CardHoldersNameLabel = "//label[contains(text(),'Cardholder')]";
	public final static String CardHoldersNameTextbox = "#cardholder";
	public final static String IssueNumberLabel = "//label[contains(text(),'Issue number')]";
	public final static String IssueNumberTextbox = "#cardissue";
	public final static String ExpiryDateLabel = "//label[contains(text(),'Expiry date')]";
	public final static String ExpiryDateMonthDropdown = "#expirydatemonth";
	public final static String ExpiryDateYearDropdown = "#expirydateyear";
	public final static String BillingAddressHeader = "//h2[contains(text(),'Billing address')]";
	public final static String BillingAddressInformationalText = "//p[contains(text(),'Please select a billing address')]";
	public final static String MyBillingAddressRadioButtonLabel = "//label[contains(text(),'My billing address')]";
	public final static String MyBillingAddressRadioButton = "#address-option-1";
	public final static String AddressName = "//h3[contains(text(),'Home (main)')]";
	public final static String StreetAddress = "//span[contains(text(),'Capita Hartshead, Unit 2 Falcon Gate Falcon Way Shire Park')]";
	public final static String Region = "//span[contains(text(),'Welwyn Garden City')]";
	public final static String PostCode = "//span[contains(text(),'AL7 1TW')]";
	public final static String AddButton = ".button.input-standard";
	
}

public final class ChangeEmailAddressPage{
	
	public final static String Breadcrumbs = "#breadcrumb";
	public final static String ChangeMyEmailAddressHeaderText = "//h1[contains(text(),'Change my email address')]";
	public final static String NewEmailAddressHeaderText = "//h2[contains(text(),'Please enter your new email address')]";
	public final static String OldEmailAddressLabel = "//label[contains(text(),'Old email address')]";
	public final static String OldEmailAddressTextbox = "#old-email";
	public final static String PasswordLabel = "//label[contains(text(),'Password')]"; 
	public final static String PasswordTextbox = "#oldpass-password";
	public final static String NewEmailAddressLabel = "//label[contains(text(),'New email address')]";
	public final static String NewEmailAddressTextbox = "#new-email";
	public final static String ConfirmNewEmailAddressLabel = "//label[contains(text(),'Confirm new email address')]";
	public final static String ConfirmNewEmailAddressTextbox = "#confirm-email";
	public final static String CancelButton = ".button.generic-standard";
	public final static String SaveButton = ".button.input-standard";
	public final static String EmailMismatchErrorMsg = "//label[contains(text(),'Sorry, the email you have entered')]";
	
}

public final class ChangePasswordPage{
	
	public static final String Breadcrumbs = "#breadcrumb";
	public static final String ChangePasswordHeaderText = "//h1[contains(text(),'Change password')]";
	public static final String ChangePasswordDirectionsText = "//p[contains(text(),'To change the password')]";
	public static final String OldPasswordLabel = "//label[contains(text(),'Old password')]";
	public static final String OldPasswordTextbox = "#oldpass";
	public static final String NewPasswordLabel = "//label[contains(text(),'New password')]";
	public static final String NewPasswordTextbox = "#newpass";
	public static final String ConfirmPasswordLabel = "//label[contains(text(),'Confirm password')]";
	public static final String ConfirmPasswordTextbox = "#confirmnewpass";
	public static final String PasswordTipInformationalText = "//div[contains(text(),'Your password must be a minimum')]";
	public static final String PasswordStrengthLabel = "//span[contains(text(),'Password strength')]";
	public static final String PasswordStrengthIndicator = "#passStrengthIndicator";
	public static final String SaveChangesButton = ".button.input-standard";
	public static final String PasswordsDoNotMatchError = "//label[contains(text(),'Sorry, the passwords entered')]";
	public static final String PasswordUpdatedText = "//strong[contains(text(),'Your password has been updated')]";
	public static final String SignOutLink = "Sign Out";
	
	
}

public final class ManageMyAddressBookPage {
	
	public final static String NewAddressCard = ".address-card";
	public static final String DeleteAddressButton = "#btn-del-2";
	public static final String YesButton = "#tooltip-btn-del-2 > div > ul > li:nth-child(2) > a";
	public static final String DeletedAddressConfirmationText = "//h2[contains(text(),'Thanks, we can confirm your address has been deleted')]";
	public static final String SignOutLink = "Sign Out";
	public final static String Breadcrumbs = "#breadcrumb";
	public final static String ManageMyAddressBookHeaderText = "//h1[contains(text(),'Manage my address book')]";
	public final static String AddressInformationalText = "//p[contains(text(),'Below are the addresses that')]";
	public final static String RadioButtonForTheFirstAddress = "#addressRadio1";
	public final static String RadioButtonForTheSecondAddress = "#addressRadio2";
	public final static String AddressName = "//*[contains(text(),'Home')]";
	public final static String StreetAddress = "//span[contains(text(),'Capita Hartshead')]";
	public final static String Locality = "//span[contains(text(),'Welwyn Garden City')]";
	public final static String PostCode = "//span[contains(text(),'AL7 1TW')]";
	public final static String Country = "//span[contains(text(),'Gb')]";
	public final static String DayPhoneLabel = "//span[contains(text(),'Day phone')]";
	public final static String DayPhoneNumber = "//span[contains(text(),'07438305914')]";
	public final static String EveningPhoneLabel = "//span[contains(text(),'Evening phone')]";
	public final static String EveningPhoneNumber = "//span[contains(text(),'07438305914')]";
	public final static String MobilePhoneLabel = "//span[contains(text(),'Mobile phone')]";
	public final static String MobilePhoneNumber = "//span[contains(text(),'07438305914')]";
	public final static String EditButtonInFirstAddress = "#btn-edit-1";
	public final static String EditButtonInSecondAddress = "#btn-edit-2";
	public final static String DeleteButtonInSecondAddress = "#btn-del-2";
	public final static String AddANewAddressButton = ".button.generic-standard";
	public final static String SaveChangesButton = "#saveAddress";
	public static final String PaymentCardLinkedToAddressError = "//p[contains(text(),'payment card linked to this address')]";
	public static final String ViewBasketButton = "#go-to-basket > div.label";
	
}

public final class ManageMyPaymentCardPage{
	
	
	public final static String NewCardAddedConfirmationText = "//*[contains(text(),'Your new payment card details have been saved')]";
	public final static String Breadcrumbs = "#breadcrumb";
	public final static String ManageMyPaymentCardHeaderText = "//h1[contains(text(),'Manage my payment card')]";
	public final static String CardInformationalText = "//h3[contains(text(),'This is your main card')]";
	public final static String CardTypeLabel = "//span[contains(text(),'Card type')]";
	public final static String CardTypeText = "//span[contains(text(),'VisaDebit')]";
	public final static String CardNumberLabel = "//span[contains(text(),'Card number')]";
	public final static String CardNumberText = "//span[contains(text(),'3333')]";
	public final static String IssueNumberLabel = "//span[contains(text(),'Issue number')]";
	public final static String ExpiryDateLabel = "//span[contains(text(),'Expiry date')]";
	public final static String ExpiryDateText = "//span[contains(text(),'18')]";
	public final static String BillingAddressLabel = "//span[contains(text(),'Billing address ')]";
	public final static String AddressName = "//span[contains(text(),'Home')]";
	public final static String StreetAddress = "//span[contains(text(),'Capita Hartshead')]";
	public final static String Locality = "//span[contains(text(),'Welwyn Garden City')]";
	public final static String PostCode = "//span[contains(text(),'AL7 1TW')]";
	public final static String DeleteButton = ".button.disabled-standard.delete-card";
	public static final String ConfirmButton = ".button.input-standard.confirm-button";
	public static final String CardDeletedConfirmationText = "//strong[contains(text(),'Thanks, we can confirm your payment card details have been deleted')]";
	public static final String SignOutLink = "Sign Out";
	
	
	
	
}

public final class Hudl2SoftTouchCasePinkPDPPage{
	
	public final static String VariantItemsDropdown = "//*[@id='v1']/article/a";
	public final static String RecentlyViewedItemsBlock = "#recently-viewed";
	public final static String WriteAReviewlink = ".bv-write-review.bv-focusable.bv-submission-button";
	public final static String MyReviewOverlay = "#bv-mbox-lightbox-list";
	public final static String QuantityBox = "input[id^='quantity']";
	public final static String AddToBasketButton = ".primary-button.add-to-basket";
	public final static String FeasibleDeliveryOptions = ".delivery.newDeliveryOptions.tescoBuyBox>ul";
	public final static String CloseMyReviewOverlayButton = "#bv-mbox-lightbox-list > button > span:nth-child(1)";
	public final static String VariantItemsDropdownFirstOption = "#colour > li:nth-child(1)";     //"#ring_size>li:nth-child(1)";
	public final static String VariantItemsDropdownMobile = "#v1 > article > select";
	public final static String ProductTitle = ".page-title";
	
}

	}
