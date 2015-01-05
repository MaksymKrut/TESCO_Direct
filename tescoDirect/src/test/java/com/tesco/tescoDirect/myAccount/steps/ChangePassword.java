package com.tesco.tescoDirect.myAccount.steps;



import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tesco.tescoDirect.login.steps.Login;
import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.pageObjects.AquaMarinePDPPagePO;
import com.tesco.tescoDirect.pageObjects.BasketDetailsPagePO;
import com.tesco.tescoDirect.pageObjects.BasketPagePO;
import com.tesco.tescoDirect.pageObjects.ChangePasswordPagePO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.DvdCategoryPagePO;
import com.tesco.tescoDirect.pageObjects.HarryPotterDVDPDPPagePO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2PinkPLPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftProtectiveShellPinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.Hudl2SoftTouchCasePinkPDPPagePO;
import com.tesco.tescoDirect.pageObjects.IpadPDPPagePO;
import com.tesco.tescoDirect.pageObjects.MyAccountPO;
import com.tesco.tescoDirect.pageObjects.TescoMobileSimPDPPagePO;
import com.tesco.tescoDirect.util.WebConnector;
import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePassword {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(ChangePassword.class);
	private HomePagePO homePagePO;
	private TescoMobileSimPDPPagePO tescoMobileSimPDPPagePO;
	private BasketDetailsPagePO basketDetailsPagePO;
	private HarryPotterDVDPDPPagePO harryPotterDVDPDPPagePO;
	private CheckOutPagePO checkOutPagePO;
	private AboutYouPagePO aboutYouPagePO;
	private BasketPagePO basketPagePO;
	private MyAccountPO myAccountPO;
	private ChangePasswordPagePO changePasswordPagePO;
	private Login login;
	
	

	@Given("^I navigate to the my account page as a logged in user$")
	public void I_navigate_to_the_my_account_page_as_a_logged_in_user(DataTable table) throws Throwable {
	   
		WC.getDriver().get(WC.getFullUrl("home_page"));
		WC.getDriver().navigate().refresh();
		WC.removeCookies();
		JavascriptExecutor js = (JavascriptExecutor) WC.getDriver();
		System.out.println(js.executeScript("return window.innerWidth"));
		System.out.println(js.executeScript("return window.innerHeight"));
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.closeCookiesMsg();
		login = new Login();
		login.I_click_on_the_Sign_in_or_Register_Link();
		login.I_login_with_the_following_valid_credentials(table);
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.checkUserisLoggedin();
		homePagePO.clickOnMyAccountLink();
		
		
	}

	@Then("^the Change password link is present$")
	public void the_Change_password_link_is_present() throws Throwable {
		myAccountPO = WC.getPageObject(MyAccountPO.class);
		Assert.assertTrue(myAccountPO.checkChangePasswordLinkIsPresent());
	}

	@When("^I click on the Change password link$")
	public void I_click_on_the_Change_password_link() throws Throwable {
		myAccountPO.clickOnChangePasswordLink();
		
	}

	@Then("^I am taken to the change password page$")
	public void I_am_taken_to_the_change_password_page() throws Throwable {
		changePasswordPagePO = WC.getPageObject(ChangePasswordPagePO.class);
		changePasswordPagePO.checkUserIsOnChangePasswordPage();
	}

	@Given("^I am on the change password page$")
	public void I_am_on_the_change_password_page() throws Throwable {
		changePasswordPagePO = WC.getPageObject(ChangePasswordPagePO.class);
		changePasswordPagePO.checkUserIsOnChangePasswordPage();
	}

	@Then("^the following elements are present on the change password page$")
	public void the_following_elements_are_present_on_the_change_password_page(DataTable table) throws Throwable {
		
		Boolean result;
		List<Map<String, String>> mappedTable = table.asMaps();
		for (Map<String,String> myValue : mappedTable) {
		    for (Map.Entry<String, String> entry : myValue.entrySet())
		{
		    String value = entry.getValue();
		    switch(value){
		    
		    case "Breadcrumbs of the page":
		    	result =changePasswordPagePO.checkBreadcrumbsIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Breadcrumbs of the page is displayed");
		    break;
		    case "Change password header text":
		    	result =changePasswordPagePO.checkChangePasswordHeaderTextIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Change password header text is displayed");
		    break;
		    case "Change password directions text":
		    	result =changePasswordPagePO.checkChangePasswordDirectionsTextIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Change password directions text is displayed");
		    break;
		    case "Old password label":
		    	result =changePasswordPagePO.checkOldPasswordLabelIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Old password label is displayed");
		    break;
		    case "Old password textbox":
		    	result =changePasswordPagePO.checkOldPasswordTextboxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Old password textbox is displayed");
		    break;
		    case "New password label":
		    	result =changePasswordPagePO.checkNewPasswordLabelIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("New password label is displayed");
		    break;
		    case "New password textbox":
		    	result =changePasswordPagePO.checkNewPasswordTextboxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("New password textbox is displayed");
		    break;
		    case "Confirm password label":
		    	result =changePasswordPagePO.checkConfirmPasswordLabelIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Confirm password label is displayed");
		    break;
		    case "Confirm password textbox":
		    	result =changePasswordPagePO.checkConfirmPasswordTextboxIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Confirm password textbox is displayed");
		    break;
		    case "Password tip Informational Text":
		    	result =changePasswordPagePO.checkPasswordTipInformationalTextIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Password tip Informational Text is displayed");
		    break;
		    case "Password strength label":
		    	result =changePasswordPagePO.checkPasswordStrengthLabelIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Password strength label is displayed");
		    break;
		    case "Password strength indicator in disabled state":
		    	result =changePasswordPagePO.checkPasswordStrengthIndicatorIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Password strength indicator in disabled state is displayed");
		    break;
		    case "Save Changes Button":
		    	result =changePasswordPagePO.checkSaveChangesButtonIsDisplayed();
		    	Assert.assertTrue(result);
		    	LOG.debug("Save Changes Button is displayed");
		    break;
		    
		    
		    	
		    
		    }
		}


		}
		
		LOG.debug("the following elements are displayed");
	   
	}

	@Given("^I enter the current password in the Old password textbox$")
	public void I_enter_the_current_password_in_the_Old_password_textbox(DataTable table) throws Throwable {
		changePasswordPagePO = WC.getPageObject(ChangePasswordPagePO.class);
		changePasswordPagePO.clearOldPasswordTextbox();
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String currentPassword = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);
				
				currentPassword = usrdetails.get("CurrentPassword");
			}

			if (currentPassword != null) {
				
				changePasswordPagePO.enterCurrentPasswordInTheOldPasswordTextbox(currentPassword);
				
			}
			
		}

		catch (Exception ex)

		{
			LOG.error("Error in enterLoginDetails: ", ex);
		}
	}

	@Given("^I enter the following for New password$")
	public void I_enter_the_following_for_New_password(DataTable table) throws Throwable {
		changePasswordPagePO.clearNewPasswordTextbox();
		//WC.wait(5);
		
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String newPassword = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);
				
				newPassword = usrdetails.get("NewPassword");
			}

			if (newPassword != null) {
				
				changePasswordPagePO.enterNewPassword(newPassword);
				
			}
			
		}

		catch (Exception ex)

		{
			ex.printStackTrace();
			LOG.error("Error in enterLoginDetails: ", ex);
		}
	}

	@Given("^I enter the following for Confirm password$")
	public void I_enter_the_following_for_Confirm_password(DataTable table) throws Throwable {
		
		changePasswordPagePO.clearConfirmPasswordTextbox();
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String confirmPassword = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);
				
				confirmPassword = usrdetails.get("ConfirmPassword");
			}

			if (confirmPassword != null) {
				
				changePasswordPagePO.enterConfirmPassword(confirmPassword);
				
			}
			
		}

		catch (Exception ex)

		{
			ex.printStackTrace();
			LOG.error("Error in enterLoginDetails: ", ex);
		}
		changePasswordPagePO.pressTabKey();
	   
	}

	@When("^I click on the Save Changes Button$")
	public void I_click_on_the_Save_Changes_Button() throws Throwable {
		
		changePasswordPagePO.clickOnSaveChangesButton();
		
	}
	    

	@Then("^the passwords do not match error is displayed$")
	public void the_passwords_do_not_match_error_is_displayed() throws Throwable {
		Assert.assertTrue(changePasswordPagePO.checkPasswordsDoNotMatchErrorIsDisplayed());
	}

	@Then("^the Password strength indicator is enabled$")
	public void the_Password_strength_indicator_is_enabled() throws Throwable {
		
	   Assert.assertTrue(changePasswordPagePO.checkPasswordStrengthIndicatorIsEnabled());
	}

	@Then("^the Password strength is displayed$")
	public void the_Password_strength_is_displayed() throws Throwable {
		Assert.assertTrue(changePasswordPagePO.checkPasswordStrengthIsDisplayed());
	}

	@Then("^the password updated text is displayed$")
	public void the_password_updated_text_is_displayed() throws Throwable {
		Assert.assertTrue(changePasswordPagePO.checkPasswordUpdatedTextIsDisplayed());
	}

	
	@After("@ChangePassword_CleanUp")
	public void cleanUp(){
		changePasswordPagePO = WC.getPageObject(ChangePasswordPagePO.class);
		changePasswordPagePO.enterCurrentPasswordInTheOldPasswordTextbox("Password2");
		changePasswordPagePO.enterNewPassword("Password1");
		changePasswordPagePO.enterConfirmPassword("Password1");
		changePasswordPagePO.clickOnSaveChangesButton();
		Assert.assertTrue(changePasswordPagePO.checkPasswordUpdatedTextIsDisplayed());
		changePasswordPagePO.signOut();
		
		
		
	}
	
	
	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) WC.getDriver())
						.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
		} catch (Exception e) {
			LOG.error("error in taking screen shot ", e);
		}
		
	}
}
