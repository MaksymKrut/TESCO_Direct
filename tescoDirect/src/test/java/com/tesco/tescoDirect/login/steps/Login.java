package com.tesco.tescoDirect.login.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tesco.tescoDirect.pageObjects.CancelMyOrderPO;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;
import com.tesco.tescoDirect.pageObjects.GlobalFooterPO;
import com.tesco.tescoDirect.pageObjects.GlobalHeaderPO;
import com.tesco.tescoDirect.pageObjects.HomePagePO;
import com.tesco.tescoDirect.pageObjects.AboutYouPagePO;
import com.tesco.tescoDirect.util.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	private static final WebConnector WC = WebConnector.getInstance();
	private final static Logger LOG = Logger.getLogger(Login.class);
	private HomePagePO homePagePO;
	private AboutYouPagePO aboutYouPagePO;

	@When("^I click on the Sign in or Register Link$")
	public void I_click_on_the_Sign_in_or_Register_Link() throws Throwable {
		LOG.debug("I click on the Sign in or Register Link");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickingOnSigninorRegisterLink();

	}

	@Then("^the I'm an existing customer radio button is selected by default$")
	public void the_I_m_an_existing_customer_radio_button_is_selected_by_default()
			throws Throwable {
		LOG.debug("the I'm an existing customer radio button is selected by default");
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);

		aboutYouPagePO.checkExistingCustomerRadioButtonIsSelected();

	}

	@When("^I login with the following valid credentials$")
	public void I_login_with_the_following_valid_credentials(DataTable table)
			throws Throwable {
		LOG.debug("I login with the following valid credentials");
		aboutYouPagePO = WC.getPageObject(AboutYouPagePO.class);
		try {
			LOG.info("Entering user details");
			List<Map<String, String>> aux = table.asMaps();
			String userName = null;
			String password = null;
			for (int i = 0; i < aux.size(); i++) {
				Map<String, String> usrdetails = aux.get(i);
				userName = usrdetails.get("UserName");
				password = usrdetails.get("Password");
			}

			if (userName != null && password != null) {
				LOG.debug("User Name======>" + userName);
				LOG.debug("Password======>" + password);
				aboutYouPagePO.enterUserName(userName);
				aboutYouPagePO.enterPassword(password);
			}
			aboutYouPagePO.clickOnSignInButton();
		}

		catch (Exception ex)

		{
			LOG.error("Error in enterLoginDetails: ", ex);
		}
	}

	@Then("^my login is successful and I am redirected to the home page$")
	public void my_login_is_successful_and_I_am_redirected_to_the_home_page()
			throws Throwable {
		LOG.debug("my login is successful and I am redirected to the home page");
		homePagePO = WC.getPageObject(HomePagePO.class);
		//homePagePO.checkUserisLoggedin();
		homePagePO.checkUserisOnHomePage();
		homePagePO.clickOnSignOutLink();

	}
	
	@Then("^I Sign Out Completely$")
	public void SignOutCompletely()
			throws Throwable {
		LOG.debug("I Sign Out Completely");
		homePagePO = WC.getPageObject(HomePagePO.class);
		homePagePO.clickOnSignOutLink();

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
