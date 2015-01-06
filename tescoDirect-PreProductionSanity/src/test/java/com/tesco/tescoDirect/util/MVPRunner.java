package com.tesco.tescoDirect.util;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


/**
 * 
 * @author MMahadevan 
 * Runner class 
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
		features = {"src/test/resources/com/tesco/tescoDirect/utility","src/test/resources" }, 
		strict = true, 
		format = { "pretty","html:target/cucumber", "json:target/Cucumber.json" }, 
		tags = { "@testMVP" }, 
		monochrome = true, 
				glue = {"com.tesco.tescoDirect.util",
				"com.tesco.tescoDirect.checkOutPage.steps",
				"com.tesco.tescoDirect.basketPage.steps" ,
				"com.tesco.tescoDirect.cancelMyOrder.steps",
				"com.tesco.tescoDirect.myAccount.steps",
				"com.tesco.tescoDirect.login.steps",
				"com.tesco.tescoDirect.registration.steps",
				"com.tesco.tescoDirect.plp.steps",
				"com.tesco.tescoDirect.searchAndBrowse.steps",
				"com.tesco.tescoDirect.PDP.steps",
				"com.tesco.tescoDirect.checkOut.steps",
				"com.tesco.tescoDirect.placingOrder.steps"})
public class MVPRunner {

	@AfterClass
	public static void close() {

		WebConnector.getInstance().quitbrowser();
	}
}

/*
 * Tags In Use:
 * 
 * @RegisteredUser @NewUser @AnonymousUser @MVP @S4  @testChrome
 */