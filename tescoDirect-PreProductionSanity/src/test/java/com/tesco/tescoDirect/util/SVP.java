package com.tesco.tescoDirect.util;

import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidConfiguration;
import io.selendroid.SelendroidLauncher;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tesco.tescoDirect.util.WebConnector.Browsers;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SVP {
	public static final WebConnector WC = WebConnector.getInstance();

	@Given("^the user defines the required webdriver for the SVP device$")
	public void the_user_defines_the_required_webdriver_for_the_LLVP_device()
			throws Throwable {
		WC.openAndroidBrowserSVP();
		

	}

	@And("^configure the required tests that he wishes to run on SVP$")
	public void configure_the_required_tests_that_he_wishes_to_run()
			throws Throwable {
		WC.getDriver();
	}

}
