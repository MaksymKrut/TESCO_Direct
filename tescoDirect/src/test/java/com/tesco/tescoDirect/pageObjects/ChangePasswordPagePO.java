package com.tesco.tescoDirect.pageObjects;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.util.WebConnector;

public class ChangePasswordPagePO extends PageObject {
	private final static Logger LOG = Logger
			.getLogger(ChangePasswordPagePO.class);
	private static final WebConnector WC = WebConnector.getInstance();

	@FindBy(css = Constants.ChangePasswordPage.Breadcrumbs)
	@CacheLookup
	private WebElement Breadcrumbs;
	@FindBy(xpath = Constants.ChangePasswordPage.ChangePasswordHeaderText)
	@CacheLookup
	private WebElement ChangePasswordHeaderText;
	@FindBy(xpath = Constants.ChangePasswordPage.ChangePasswordDirectionsText)
	@CacheLookup
	private WebElement ChangePasswordDirectionsText;
	@FindBy(xpath = Constants.ChangePasswordPage.OldPasswordLabel)
	@CacheLookup
	private WebElement OldPasswordLabel;
	@FindBy(css = Constants.ChangePasswordPage.OldPasswordTextbox)
	private WebElement OldPasswordTextbox;
	@FindBy(xpath = Constants.ChangePasswordPage.NewPasswordLabel)
	@CacheLookup
	private WebElement NewPasswordLabel;
	@FindBy(css = Constants.ChangePasswordPage.NewPasswordTextbox)
	private WebElement NewPasswordTextbox;
	@FindBy(xpath = Constants.ChangePasswordPage.ConfirmPasswordLabel)
	@CacheLookup
	private WebElement ConfirmPasswordLabel;
	@FindBy(css = Constants.ChangePasswordPage.ConfirmPasswordTextbox)
	private WebElement ConfirmPasswordTextbox;
	@FindBy(xpath = Constants.ChangePasswordPage.PasswordTipInformationalText)
	@CacheLookup
	private WebElement PasswordTipInformationalText;
	@FindBy(xpath = Constants.ChangePasswordPage.PasswordStrengthLabel)
	@CacheLookup
	private WebElement PasswordStrengthLabel;
	@FindBy(css = Constants.ChangePasswordPage.PasswordStrengthIndicator)
	@CacheLookup
	private WebElement PasswordStrengthIndicator;
	@FindBy(css = Constants.ChangePasswordPage.SaveChangesButton)
	@CacheLookup
	private WebElement SaveChangesButton;
	@FindBy(xpath = Constants.ChangePasswordPage.PasswordsDoNotMatchError)
	@CacheLookup
	private WebElement PasswordsDoNotMatchError;
	@FindBy(xpath = Constants.ChangePasswordPage.PasswordUpdatedText)
	@CacheLookup
	private WebElement PasswordUpdatedText;
	@FindBy(partialLinkText = Constants.ChangePasswordPage.SignOutLink)
	@CacheLookup
	private WebElement SignOutLink;

	public void checkUserIsOnChangePasswordPage() {
		Assert.assertTrue(WC.getPageTitle().contains(
				"Change password - Tesco.com"));
	}

	public Boolean checkBreadcrumbsIsDisplayed() {

		return (WC.elementIsDisplayedOrNot(Breadcrumbs));
	}

	public Boolean checkChangePasswordHeaderTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ChangePasswordHeaderText));
	}

	public Boolean checkChangePasswordDirectionsTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ChangePasswordDirectionsText));
	}

	public Boolean checkOldPasswordLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(OldPasswordLabel));
	}

	public Boolean checkOldPasswordTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(OldPasswordTextbox));
	}

	public Boolean checkNewPasswordLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(NewPasswordLabel));
	}

	public Boolean checkNewPasswordTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(NewPasswordTextbox));
	}

	public Boolean checkConfirmPasswordLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ConfirmPasswordLabel));
	}

	public Boolean checkConfirmPasswordTextboxIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(ConfirmPasswordTextbox));
	}

	public Boolean checkPasswordTipInformationalTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(PasswordTipInformationalText));
	}

	public Boolean checkPasswordStrengthLabelIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(PasswordStrengthLabel));
	}

	public Boolean checkPasswordStrengthIndicatorIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(PasswordStrengthIndicator));
	}

	public Boolean checkSaveChangesButtonIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(SaveChangesButton));
	}

	public void enterCurrentPasswordInTheOldPasswordTextbox(
			String currentPassword) {

		WC.type(OldPasswordTextbox, currentPassword);

	}

	public void clickOnSaveChangesButton() {

		WC.click(SaveChangesButton);

	}

	public boolean checkPasswordsDoNotMatchErrorIsDisplayed() {

		return (WC.elementIsDisplayedOrNot(PasswordsDoNotMatchError));

	}

	public void enterNewPassword(String newPassword) {
		WC.waitForElementToBePresent(NewPasswordTextbox, 30);
		WC.type(NewPasswordTextbox, newPassword);

	}

	public void enterConfirmPassword(String confirmPassword) {
		WC.type(ConfirmPasswordTextbox, confirmPassword);

	}

	public void clearOldPasswordTextbox() {

		WC.clearTextBox(OldPasswordTextbox);

	}

	public void clearNewPasswordTextbox() {
		WC.clearTextBox(NewPasswordTextbox);

	}

	public void clearConfirmPasswordTextbox() {
		WC.clearTextBox(ConfirmPasswordTextbox);

	}

	public boolean checkPasswordStrengthIndicatorIsEnabled() {

		Boolean result = null;
		while (true) {
			String attributeValue = WC.getAttributeValue(
					PasswordStrengthIndicator, "class");
			if (attributeValue.equalsIgnoreCase("state-0")) {
				result = true;
				;
				break;
			}

		}
		return result;
	}

	public boolean checkPasswordStrengthIsDisplayed() {

		String text = WC.getText(PasswordStrengthIndicator);
		if (text.equalsIgnoreCase("Very Weak"))
			return true;
		else
			return false;

	}

	public boolean checkPasswordUpdatedTextIsDisplayed() {
		return (WC.elementIsDisplayedOrNot(PasswordUpdatedText));
	}

	public void pressTabKey() {

		WC.pressTabKey(ConfirmPasswordTextbox);

	}

	public void signOut() {
		WC.click(SignOutLink);

	}

}
