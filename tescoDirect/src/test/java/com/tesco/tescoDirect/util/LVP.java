package com.tesco.tescoDirect.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.tesco.tescoDirect.util.WebConnector.Browsers;
import com.tesco.tescoDirect.checkOutPage.steps.CheckOutPage;
import com.tesco.tescoDirect.pageObjects.CheckOutPagePO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LVP {

	public static final WebConnector WC = WebConnector.getInstance();

	@Given("^the user defines the required webdriver for the LVP device$")
	public void the_user_defines_the_required_webdriver_for_the_LLVP_device()
			throws Throwable {
		WC.openBrowsers(Browsers.valueOf("Firefox"));
	}

	@And("^configure the required tests that he wishes to run on LVP$")
	public void configure_the_required_tests_that_he_wishes_to_run()
			throws Throwable {
		WC.getDriver();
	}

}
