package com.tesco.tescoDirect.util;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MVP {
	public static final WebConnector WC = WebConnector.getInstance();

	@Given("^the user defines the required webdriver for the MVP device$")
	public void the_user_defines_the_required_webdriver_for_the_LLVP_device()
			throws Throwable {
		WC.openAndroidBrowserMVP();

	}

	@And("^configure the required tests that he wishes to run on MVP$")
	public void configure_the_required_tests_that_he_wishes_to_run()
			throws Throwable {
		WC.getDriver();
	}

}
