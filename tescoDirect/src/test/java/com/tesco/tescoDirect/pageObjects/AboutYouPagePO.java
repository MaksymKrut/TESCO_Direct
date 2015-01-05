package com.tesco.tescoDirect.pageObjects;

import io.appium.java_client.android.AndroidDriver;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.GenerateData;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

public class AboutYouPagePO extends PageObject {
	private final static Logger LOG = Logger.getLogger(AboutYouPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();
	GenerateData generateData = new GenerateData();;

	@FindBy(xpath = Constants.AboutYouPage.ImAnExistingCustomerRadioButton)
	@CacheLookup
	private WebElement ImAnExistingCustomerRadioButton;
	@FindBy(css = Constants.AboutYouPage.SignInEmailInputBox)
	@CacheLookup
	private WebElement SignInEmailInputBox;
	@FindBy(css = Constants.AboutYouPage.SignInPasswordInputBox)
	@CacheLookup
	private WebElement SignInPasswordInputBox;
	@FindBy(css = Constants.AboutYouPage.SignInButton)
	@CacheLookup
	private WebElement SignInButton;
	@FindBy(css = Constants.AboutYouPage.IamAnewCustomerRadioButton)
	@CacheLookup
	private WebElement IamAnewCustomerRadioButton;
	@FindBy(css = Constants.AboutYouPage.TitleDropDown)
	@CacheLookup
	private WebElement TitleDropDown;
	@FindBy(css = Constants.AboutYouPage.TitleDropDownInnerText)
	@CacheLookup
	private WebElement TitleDropDownInnerText;
	@FindBy(css = Constants.AboutYouPage.TitleDropDownMR)
	@CacheLookup
	private WebElement TitleDropDownMR;
	@FindBy(css = Constants.AboutYouPage.TitleDropDownMobile)
	@CacheLookup
	private WebElement TitleDropDownMobile;
	@FindBy(css = Constants.AboutYouPage.TitleDropDownMRMobile)
	@CacheLookup
	private WebElement TitleDropDownMRMobile;
	@FindBy(css = Constants.AboutYouPage.FirstNameTextBox)
	@CacheLookup
	private WebElement FirstNameTextBox;
	@FindBy(css = Constants.AboutYouPage.LastNameTextBox)
	@CacheLookup
	private WebElement LastNameTextBox;
	@FindBy(css = Constants.AboutYouPage.EmailTextBox)
	@CacheLookup
	private WebElement EmailTextBox;
	@FindBy(css = Constants.AboutYouPage.PostCodeTextBox)
	@CacheLookup
	private WebElement PostCodeTextBox;

	@FindBy(css = Constants.AboutYouPage.EditButton)
	@CacheLookup
	private WebElement EditButton;
	@FindBy(css = Constants.AboutYouPage.CompanyName)
	@CacheLookup
	private WebElement CompanyName;
	@FindBy(css = Constants.AboutYouPage.FlatNumber)
	@CacheLookup
	private WebElement FlatNumber;
	@FindBy(css = Constants.AboutYouPage.BuildingNumber)
	@CacheLookup
	private WebElement BuildingNumber;
	@FindBy(css = Constants.AboutYouPage.Street)
	@CacheLookup
	private WebElement Street;

	@FindBy(css = Constants.AboutYouPage.DropdownMatchingAllofthePostcode)
	@CacheLookup
	private WebElement DropdownMatchingAllofthePostcode;
	@FindBy(css = Constants.AboutYouPage.FirstAddress)
	@CacheLookup
	private WebElement FirstAddress;

	@FindBy(css = Constants.AboutYouPage.ClubcardNumberTextBox)
	@CacheLookup
	private WebElement ClubcardNumberTextBox;

	@FindBy(css = Constants.AboutYouPage.IDontHaveAclubcardCheckBox)
	@CacheLookup
	private WebElement IDontHaveAclubcardCheckBox;
	@FindBy(css = Constants.AboutYouPage.RegFirstPageNextButton)
	@CacheLookup
	private WebElement RegFirstPageNextButton;
	@FindBy(css = Constants.AboutYouPage.EmailEditLink)
	@CacheLookup
	private WebElement EmailEditLink;
	@FindBy(css = Constants.AboutYouPage.ContactPhoneNumber)
	@CacheLookup
	private WebElement ContactPhoneNumber;
	@FindBy(css = Constants.AboutYouPage.PasswordStrength)
	@CacheLookup
	private WebElement PasswordStrength;
	@FindBy(css = Constants.AboutYouPage.Password)
	@CacheLookup
	private WebElement Password;
	@FindBy(css = Constants.AboutYouPage.ConfirmPassword)
	@CacheLookup
	private WebElement ConfirmPassword;
	@FindBy(css = Constants.AboutYouPage.AgreeAndTC)
	@CacheLookup
	private WebElement AgreeAndTC;
	@FindBy(css = Constants.AboutYouPage.BackButton)
	@CacheLookup
	private WebElement BackButton;
	@FindBy(css = Constants.AboutYouPage.RegSecondPageNextButton)
	@CacheLookup
	private WebElement RegSecondPageNextButton;
	@FindBy(partialLinkText = Constants.AboutYouPage.MyAccount)
	@CacheLookup
	private WebElement MyAccount;

	public void checkIDontHaveAClubcardCheckboxIsUnChecked() {
		WC.CheckboxStatus(IDontHaveAclubcardCheckBox);
	}

	public void checkEditButtonIsDisabled() {
		Assert.assertTrue(EditButton.isEnabled());
	}

	public void checkNextButtonIsEnabled() {
		Assert.assertTrue(EditButton.isEnabled());
	}

	public AboutYouPagePO checkExistingCustomerRadioButtonIsSelected() {
		Assert.assertTrue(WC
				.statusofRadiobutton(ImAnExistingCustomerRadioButton));
		return (AboutYouPagePO) WC.getPageObject(AboutYouPagePO.class);
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
		SignInButton.click();
		LOG.debug("Clicked on sign in button");
	}

	public void clickOnIamAnewCustomerRadioButton() {
		IamAnewCustomerRadioButton.click();

	}

	public String getActualTitleDropDownValue() {
		WC.waitForElement(TitleDropDownInnerText, 60);
		String actualTitleDropDownValue = TitleDropDownInnerText.getText();
		return actualTitleDropDownValue;

	}

	public String getActualFirstNameTextBoxValue() {
		String actualFirstNameTextBoxValue = FirstNameTextBox.getText();
		return actualFirstNameTextBoxValue;
	}

	public String getActualLastNameTextBoxValue() {
		String actualLastNameTextBoxValue = LastNameTextBox.getText();
		return actualLastNameTextBoxValue;
	}

	public String getActualEmailTextBoxValue() {
		String actualEmailTextBoxValue = EmailTextBox.getText();
		return actualEmailTextBoxValue;
	}

	public String getActualPostCodeTextBoxValue() {
		String actualPostCodeTextBoxValue = PostCodeTextBox.getText();
		return actualPostCodeTextBoxValue;
	}

	public String getActualClubcardNumberTextBoxValue() {
		String actualClubcardNumberTextBoxValue = ClubcardNumberTextBox
				.getText();
		return actualClubcardNumberTextBoxValue;
	}

	public void selectingTitle() {
		WC.wait(10);
		if (WC.LVP()) {
			WC.waitForElement(TitleDropDown, 50);
			WC.assertingWebElement(TitleDropDown);
			TitleDropDown.click();
			WC.wait(3);
			TitleDropDownMR.click();
		} else if (WC.SVP()) {
			WC.waitForElement(TitleDropDownMobile, 50);
			WC.assertingWebElement(TitleDropDownMobile);
			TitleDropDownMobile.click();
			WC.handlePopup();
			TitleDropDownMRMobile.click();
		} else if (WC.MVP()) {
			WC.waitForElement(TitleDropDown, 50);
			WC.assertingWebElement(TitleDropDown);
			WC.click(TitleDropDown);
			WC.handlePopup();
			WC.implicitwait(50);
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

	public void checkingDropdownMatchingAllOfthePostCodeAddress() {

	}

	public void selectingAddressFromDropDown() {
		if (WC.LVP()) {
			WC.wait(5);
			WC.assertingWebElement(DropdownMatchingAllofthePostcode);
			PostCodeTextBox.sendKeys(Keys.ENTER);
			// FirstAddress.click();
		} else if (WC.SVP()) {
			WC.wait(5);
			PostCodeTextBox.sendKeys(Keys.ENTER);
			LOG.debug("clicked on first address");
		} else if (WC.MVP()) {
			WC.wait(5);
			PostCodeTextBox.sendKeys(Keys.ENTER);
			LOG.debug("clicked on first address");
		}

	}

	public void clickOnIDontHaveAclubcardCheckBox() {

		if (WC.LVP()) {
			WC.wait(3);
			WC.assertingWebElement(IDontHaveAclubcardCheckBox);
			IDontHaveAclubcardCheckBox.click();
		} else if (WC.SVP()) {
			WC.wait(3);
			WC.assertingWebElement(IDontHaveAclubcardCheckBox);
			IDontHaveAclubcardCheckBox.click();
		} else if (WC.MVP()) {
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

	public void checkingadditionalregistrationdetails() {
		WC.assertingWebElement(EmailEditLink);
		WC.assertingWebElement(ContactPhoneNumber);
		WC.assertingWebElement(Password);
		WC.assertingWebElement(PasswordStrength);
		WC.assertingWebElement(ConfirmPassword);
	}

	public void checkingStatusOfAgreeAndTC() {
		WC.assertingWebElement(AgreeAndTC);
		WC.setCheckboxStatus(AgreeAndTC);
		WC.assertingWebElement(BackButton);
		BackButton.isEnabled();
		WC.assertingWebElement(RegSecondPageNextButton);
		RegSecondPageNextButton.isEnabled();
	}

	public void checkingStatusOfBackButton() {
		WC.assertingWebElement(BackButton);
		BackButton.isEnabled();
		WC.assertingWebElement(RegSecondPageNextButton);
		RegSecondPageNextButton.isEnabled();
	}

	public void checkingStatusOfRegSecondPageNextButton() {
		WC.assertingWebElement(RegSecondPageNextButton);
		RegSecondPageNextButton.isEnabled();
	}

	public void typingPhoneNumber() {
		WC.assertingWebElement(ContactPhoneNumber);
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

	public boolean checkEmailAddressIsUpdated() {
		String actualPageTitle = WC.getPageTitle();
		String EmailTextBoxValue = WC.getAttributeValue(SignInEmailInputBox,
				"value");
		if ((actualPageTitle.equalsIgnoreCase("About you - Tesco.com"))
				&& (EmailTextBoxValue
						.equalsIgnoreCase("tescodirecttestframework1@gmail.com")))
			return true;
		else
			return false;

	}
}
