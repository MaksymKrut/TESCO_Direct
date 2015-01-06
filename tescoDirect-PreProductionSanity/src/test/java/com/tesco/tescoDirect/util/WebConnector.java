package com.tesco.tescoDirect.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidConfiguration;
import io.selendroid.SelendroidDriver;
import io.selendroid.SelendroidLauncher;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tesco.tescoDirect.constants.Constants;
import com.tesco.tescoDirect.pageObjects.PageObject;

/**
 * Utility class for interaction with driver and common utils. It is a Singleton
 * object
 * 
 * @author Maddy
 * 
 */
public final class WebConnector {
	private String prevWindowHandle = "";
	private static final Logger LOG = Logger.getLogger(WebConnector.class);

	/** Browser to be used */
	public enum Browsers {
		Firefox, Chrome, InternetExplorer, Android, Ipad, Iphone, Opera, Safari, RemoteFirefox, RemoteChrome, RemoteInternetExplorer7, RemoteInternetExplorer8, RemoteInternetExplorer9, RemoteInternetExplorer10, RemoteInternetExplorer11
	};

	/** Locators to be used */
	public enum Locators {
		xpath, id, name, classname, paritallinktext, linktext, tagname, cssSelector
	};

	/**
	 * Pseudo boolean value.
	 * 
	 * @author RNaylor
	 * 
	 */
	public enum MimickClick {
		YES, NO
	};

	// Selenium servers
	private String chromeDriverExeLocation;
	private String ieDriverExeLocation;
	private String remoteWebDriverLocation;

	private static WebConnector webConnectorInstance;
	private SelendroidLauncher selendroidServer = null;
	public SelendroidDriver selen;
	private Properties configProperties;
	public WebDriver driver;
	public AndroidDriver androidDriver;
	public AppiumDriver appiumDriver;
	private Map<Browsers, WebDriver> drivers = new HashMap<Browsers, WebDriver>();
	private LoadProperties loadPropertiesObj;
	private boolean remoteScreenshooter = false;
	public Process appium;

	// Constructors

	private WebConnector() {
		init();
	}

	// END Constructors

	/**
	 * Initial method, loads properties
	 */
	private void init() {
		loadPropertiesObj = new LoadProperties();
		loadPropertiesObj.init();
		configProperties = loadPropertiesObj.getConfigProperties();

		if (configProperties != null) {
			chromeDriverExeLocation = configProperties
					.getProperty(Constants.CHROMER_DRIVER_LOCATION);
			ieDriverExeLocation = configProperties
					.getProperty(Constants.IE_DRIVER_LOCATION);
			remoteWebDriverLocation = configProperties
					.getProperty(Constants.REMOTE_WEB_DRIVER_LOCATION);
		}
	}

	/**
	 * Singleton pattern to get the WebConnector Instance
	 * 
	 * @return instance
	 */
	public static WebConnector getInstance() {
		if (webConnectorInstance == null) {
			webConnectorInstance = new WebConnector();
		}

		return webConnectorInstance;
	}

	// Helper methods

	/**
	 * Opens the specific browser and points to the URL
	 * 
	 * @param browser
	 * @param url
	 */
	public void openBrowsers(Browsers browser) {
		try {
			openBrowser(browser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception ex) {
			LOG.error("Error while opening the Browser/URL, aborting test: ",
					ex);
			throw new RuntimeException(ex);
		}
	}

	/**
	 * Opens the specific browser
	 * 
	 * @param browser
	 */
	public void openBrowser(Browsers browser) {
		try {
			switch (browser) {
			case Firefox:
				LOG.debug("Firefox Browser");

				if (drivers.get(Browsers.Firefox) == null) {
					LOG.debug("--New Firefox Browser");
					DesiredCapabilities capabilities = DesiredCapabilities
							.firefox();
					capabilities.setPlatform(Platform.ANY);
					capabilities.setJavascriptEnabled(true);
					drivers.put(Browsers.Firefox, new FirefoxDriver(
							capabilities));
				}
				driver = drivers.get(Browsers.Firefox);
				break;
			case Chrome:
				LOG.debug("Chrome Browser");
				if (drivers.get(Browsers.Chrome) == null) {
					LOG.debug("--New Chrome Browser");
					drivers.put(Browsers.Chrome, openChromeBrowser());
				}
				driver = drivers.get(Browsers.Chrome);
				break;
			case InternetExplorer:
				LOG.debug("Internet explorer Browser");
				if (drivers.get(Browsers.InternetExplorer) == null) {
					LOG.debug("--New IE Browser");
					drivers.put(Browsers.InternetExplorer,
							openInternetExplorerBrowser());
					driver = drivers.get(Browsers.InternetExplorer);
				} else {
					driver = new InternetExplorerDriver();
				}
				break;
			case Safari:
				LOG.debug("Safari Browser");
				if (drivers.get(Browsers.Safari) == null) {
					LOG.debug("--New Safari Browser");
					drivers.put(Browsers.Safari, new SafariDriver());
				}
				driver = drivers.get(Browsers.Safari);
				break;
			case RemoteFirefox:
				LOG.debug("Firefox Remote Browser");
				if (drivers.get(Browsers.RemoteFirefox) == null) {
					 LOG.debug("--New Remote Firefox Browser");
                     FirefoxProfile fp  = new FirefoxProfile();
                     fp.setPreference("network.proxy.type", ProxyType.AUTODETECT.ordinal());
                     DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                     capabilities.setCapability(FirefoxDriver.PROFILE, fp);
                     capabilities.setJavascriptEnabled(true);
					drivers.put(Browsers.RemoteFirefox, new RemoteWebDriver(
							new URL(remoteWebDriverLocation), capabilities));
				}
				driver = drivers.get(Browsers.RemoteFirefox);
				remoteScreenshooter = true;
				break;
			case RemoteChrome:
				LOG.debug("Chrome Remote Browser");
				if (drivers.get(Browsers.RemoteChrome) == null) {
					LOG.debug("--New Remote Chrome Browser");
					DesiredCapabilities capabilities = DesiredCapabilities
							.chrome();
					capabilities.setJavascriptEnabled(true);
					drivers.put(Browsers.RemoteChrome, new RemoteWebDriver(
							new URL(remoteWebDriverLocation), capabilities));
				}
				driver = drivers.get(Browsers.RemoteChrome);
				remoteScreenshooter = true;
				break;

			case RemoteInternetExplorer7:
				LOG.debug("Internet Explorer Remote Browser");
				if (drivers.get(Browsers.RemoteInternetExplorer7) == null) {
					LOG.debug("--New Remote IE Browser 7");
					DesiredCapabilities capabilities = DesiredCapabilities
							.internetExplorer();
					capabilities.setJavascriptEnabled(true);

					capabilities.setCapability("version", "7");
					capabilities.setCapability("platform", Platform.WINDOWS);

					drivers.put(Browsers.RemoteInternetExplorer7,
							new RemoteWebDriver(
									new URL(remoteWebDriverLocation),
									capabilities));
				}
				driver = drivers.get(Browsers.RemoteInternetExplorer7);
				remoteScreenshooter = true;
				break;

			case RemoteInternetExplorer8:
				LOG.debug("Internet Explorer Remote Browser8");
				if (drivers.get(Browsers.RemoteInternetExplorer8) == null) {
					LOG.debug("--New Remote IE Browser 8");
					DesiredCapabilities capabilities = DesiredCapabilities
							.internetExplorer();
					capabilities.setJavascriptEnabled(true);

					capabilities.setCapability("version", "8");
					capabilities.setCapability("platform", Platform.WINDOWS);

					drivers.put(Browsers.RemoteInternetExplorer8,
							new RemoteWebDriver(
									new URL(remoteWebDriverLocation),
									capabilities));
				}
				driver = drivers.get(Browsers.RemoteInternetExplorer8);
				remoteScreenshooter = true;
				break;

			case RemoteInternetExplorer9:
				LOG.debug("Internet Explorer Remote Browser9");
				if (drivers.get(Browsers.RemoteInternetExplorer9) == null) {
					LOG.debug("--New Remote IE Browser9");
					DesiredCapabilities capabilities = DesiredCapabilities
							.internetExplorer();
					capabilities.setJavascriptEnabled(true);

					capabilities.setCapability("version", "9");
					capabilities.setCapability("platform", Platform.WINDOWS);

					drivers.put(Browsers.RemoteInternetExplorer9,
							new RemoteWebDriver(
									new URL(remoteWebDriverLocation),
									capabilities));
				}
				driver = drivers.get(Browsers.RemoteInternetExplorer9);
				remoteScreenshooter = true;
				break;

			case RemoteInternetExplorer10:
				LOG.debug("Internet Explorer Remote Browser10");
				if (drivers.get(Browsers.RemoteInternetExplorer10) == null) {
					LOG.debug("--New Remote IE Browse10r");
					DesiredCapabilities capabilities = DesiredCapabilities
							.internetExplorer();
					capabilities.setJavascriptEnabled(true);

					capabilities.setCapability("version", "10");
					capabilities.setCapability("platform", Platform.WINDOWS);

					drivers.put(Browsers.RemoteInternetExplorer10,
							new RemoteWebDriver(
									new URL(remoteWebDriverLocation),
									capabilities));
				}
				driver = drivers.get(Browsers.RemoteInternetExplorer10);
				remoteScreenshooter = true;
				break;

			case RemoteInternetExplorer11:
				LOG.debug("Internet Explorer Remote Browser11");
				if (drivers.get(Browsers.RemoteInternetExplorer11) == null) {
					LOG.debug("--New Remote IE Browser11");
					DesiredCapabilities capabilities = DesiredCapabilities
							.internetExplorer();
					capabilities.setJavascriptEnabled(true);

					capabilities.setCapability("version", "11");
					capabilities.setCapability("platform", Platform.WINDOWS);

					drivers.put(Browsers.RemoteInternetExplorer11,
							new RemoteWebDriver(
									new URL(remoteWebDriverLocation),
									capabilities));
				}
				driver = drivers.get(Browsers.RemoteInternetExplorer11);
				remoteScreenshooter = true;
				break;

			case Android:
				LOG.debug("Android browser");
				if (drivers.get(Browsers.Android) == null) {
					LOG.debug("--New Android Browser");
					SelendroidConfiguration config = new SelendroidConfiguration();
					config.addSupportedApp("selendroid-standalone-0.12.0-with-dependencies.jar");
					selendroidServer = new SelendroidLauncher(config);
					selendroidServer.launchSelendroid();
					DesiredCapabilities caps = SelendroidCapabilities.android();
					caps.setCapability("PORT", "4444");
					driver = new RemoteWebDriver(caps);
				}
				driver = drivers.get(Browsers.Android);
				break;

			// if our browser is not listed, throw an error
			default:
				LOG.debug("Browser not understood: " + browser.toString());
				throw new RuntimeException("Browser not found");
			}

		} catch (Exception ex) {
			LOG.error("Error while opening the Browser", ex);
			throw new RuntimeException(ex);
		}
	}

	/**
	 * Opens the IE Browser with the EXE server
	 */
	private WebDriver openInternetExplorerBrowser() {
		File file = new File(ieDriverExeLocation);
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		InternetExplorerDriverService service = InternetExplorerDriverService
				.createDefaultService();
		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
				"about:blank");
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,
				true);
		capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,
				true);
		capabilities.setCapability(
				InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		capabilities.setCapability(
				InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
		capabilities.setCapability(
				InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
		capabilities.setCapability("version", "9");
		return new InternetExplorerDriver(service, capabilities);
	}

	/**
	 * Opens the Chrome Browser with the EXE server
	 */
	private WebDriver openChromeBrowser() {
		try {
			File file = null;
			String os = System.getProperty("os.name").toLowerCase();
			LOG.debug("OS Name =>" + os);
			if (os.indexOf("win") >= 0) {
				System.out.println("Executing Windows Chrome Driver");
				file = new File(chromeDriverExeLocation);
				System.setProperty("webdriver.chrome.driver",
						file.getAbsolutePath());
				DesiredCapabilities capabilies = DesiredCapabilities.chrome();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("test-type", "start-maximized",
						"no-default-browser-check");
				capabilies.setCapability(ChromeOptions.CAPABILITY, options);
				capabilies.setBrowserName("chrome");
				capabilies.setPlatform(Platform.ANY);
				// capabilies.setCapability("chrome.binary",
				// "C:\\Users\\wo59\\AppData\\Local\\Google\\Chrome SxS\\Application\\chrome.exe");
			} else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0
					|| os.indexOf("aix") > 0) {
				System.out.println("Executing Linux Chrome Driver");
				file = new File(System.getProperty("user.dir")
						+ chromeDriverExeLocation);
				System.setProperty("webdriver.chrome.driver",
						file.getAbsolutePath());
			}
		} catch (Exception e) {
			LOG.error("Error openning Chrome Browser", e);
		}

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:/Selenium/BrowserDrivers/chromedriver.exe"); DesiredCapabilities
		 * capabilies = DesiredCapabilities.chrome(); ChromeOptions options =
		 * new ChromeOptions(); options.addArguments("test-type",
		 * "start-maximized", "no-default-browser-check");
		 * capabilies.setCapability(ChromeOptions.CAPABILITY, options);
		 * capabilies.setBrowserName("chrome");
		 * capabilies.setPlatform(Platform.ANY);
		 * capabilies.setCapability("chrome.binary",
		 * "D:/Selenium/BrowserDrivers/chromedriver.exe");
		 */
		return new ChromeDriver();
	}

	public void openAndroidBrowserSVP() throws Throwable {
		if (androidDriver() != null) {
			androidDriver.quit();
		}
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.android();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				"GT-I9300");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);
		desiredCapabilities.setCapability(
				MobileCapabilityType.PLATFORM_VERSION, "4.3");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
				"Chrome");
		desiredCapabilities.setCapability(MobileCapabilityType.ACCEPT_SSL_CERTS, true);
		desiredCapabilities.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
		desiredCapabilities.setCapability(MobileCapabilityType.PROXY, true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);
	}
	public void openIphone() throws Throwable {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("device","DX3LP8T4FML6");
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
		 capabilities.setCapability(CapabilityType.VERSION, "6.0");
		 capabilities.setCapability(CapabilityType.PLATFORM, "ANY");
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}


	public void openAndroidBrowserMVP() throws Throwable {
		if (androidDriver() != null) {
			androidDriver.quit();
		}
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.android();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				"Hudl HT7S3");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				MobilePlatform.ANDROID);
		desiredCapabilities.setCapability(
				MobileCapabilityType.PLATFORM_VERSION, "4.2.2");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
				"Chrome");
		desiredCapabilities.setCapability("rotatable", true);
		desiredCapabilities.setCapability(MobileCapabilityType.ACCEPT_SSL_CERTS, true);
		desiredCapabilities.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
		desiredCapabilities.setCapability(MobileCapabilityType.PROXY, true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);
		androidDriver = (AndroidDriver) driver;
		androidDriver.context("NATIVE_APP");
		androidDriver.rotate(ScreenOrientation.PORTRAIT);
		androidDriver.context("WEBVIEW_1");
	}

	public void suspendCookie() {
		//String name =driver.manage().getCookieNamed("fsr.a");
		//Set<Cookie> cookies = driver.manage().getCookies();
		Cookie ck = new Cookie("fsr.a", "suspend");
		//driver.manage().deleteCookieNamed("fsr.a");
		driver.manage().deleteCookie(ck);
	}

	public void removeCookies() {
		driver.manage().deleteAllCookies();
	}

	public void landscape() {
		((AppiumDriver) appiumDriver).rotate(ScreenOrientation.LANDSCAPE);
	}

	public void singleTap(WebElement element1) {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; HashMap<String,
		 * Double> tapObject = new HashMap<String, Double>(); tapObject.put("x",
		 * (double) element1.getLocation().getX()); tapObject.put("y", (double)
		 * element1.getLocation().getY()); tapObject.put("duration", 0.5);
		 * js.executeScript("mobile: tap", tapObject);
		 */
		TouchAction act = new TouchAction(androidDriver);
		act.tap(element1);
	}

	public boolean SVP() {

		String ExpectedSVP = "360x";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object width = js.executeScript("return window.innerWidth");
		Object height =js.executeScript("return window.innerHeight");
		String ActualSVP = width+"x";
		return ExpectedSVP.equals(ActualSVP);

	}

	public boolean LVP() {
		String ExpectedLVP = "1366x";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object width = js.executeScript("return window.innerWidth");
		Object height =js.executeScript("return window.innerHeight");
		String ActualLVP = width+"x";
		return ExpectedLVP.equals(ActualLVP);

	}
	public boolean MVP() {
		//Hudl - 600x791
		//Note2 - 640x279
		String ExpectedMVP = "600x";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object width = js.executeScript("return window.innerWidth");
		Object height =js.executeScript("return window.innerHeight");
		String ActualMVP = width+"x";
		return ExpectedMVP.equals(ActualMVP);

	}
	public void screensize()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(js.executeScript("return window.innerWidth"));
		System.out.println(js.executeScript("return window.innerHeight"));
	}

	/**
	 * Navigates to the url
	 * 
	 * @param url
	 */
	public void navigate(String url) {
		driver.get(url);
	}

	public String getPageTitle() {

		String pageTitle = driver.getTitle();

		return pageTitle;

	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Waiting functionality
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Allows selenium to pause for a set amount of time
	 * 
	 * @param seconds
	 *            time to wait in seconds
	 */
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			return;
		}
	}

	/**
	 * Waits 5 seconds or until an element is displayed
	 * 
	 * @param locator
	 *            type of locator for the element
	 * @param element
	 *            locator
	 * @throws Exception
	 */
	public void waitForElementDisplayed(Locators locator, String element)
			throws Exception {
		waitForElementDisplayed(getWebElement(locator, element), 5);
	}

	/**
	 * Waits for an specific amount of time or until an element is displayed
	 * 
	 * @param locator
	 *            type of locator for the element
	 * @param element
	 *            locator
	 * @param seconds
	 *            timeout in seconds
	 * @throws Exception
	 */
	public void waitForElementDisplayed(Locators locator, String element,
			int seconds) throws Exception {
		waitForElementDisplayed(getWebElement(locator, element), seconds);
	}

	/**
	 * Waits 5 seconds or until an element is displayed
	 * 
	 * @param element
	 *            WebElement to be displayed
	 * @throws Exception
	 */
	public void waitForElementDisplayed(WebElement element) throws Exception {
		waitForElementDisplayed(element, 5);
	}

	public void waitForElementDisplayed(WebElement element, int seconds) {
		// wait for up to XX seconds for our error message
		long end = System.currentTimeMillis() + (seconds * 1000);

		while (System.currentTimeMillis() < end) {
			// sleep for 200ms
			wait(0.2);

			// If results have been returned, the results are displayed in a
			// drop down.
			if (element.isDisplayed()) {
				break;
			}
		}
	}

	/**
	 * Fluent Wait Waits for an specific amount of time or until an element is
	 * displayed
	 * 
	 * @param element
	 *            WebElement to be displayed
	 * @param seconds
	 *            timeout in seconds
	 */
	public WebElement waitForpresenceofElement(final By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * Waits for an specific amount of time or until an element is displayed
	 * 
	 * @param element
	 *            WebElement to be displayed
	 * @param seconds
	 *            timeout in seconds
	 */

	public WebElement getSearchTermSavedMsgElement(String searchTerm,
			int waitForSecs) {
		return waitForpresenceofElement(By.xpath(searchTerm), waitForSecs);
	}

	/**
	 * 
	 * Waits for multiple elements to be present. Useful for locators that
	 * return a collection of WebElement. Internally it uses explicit wait
	 * 
	 * @param locator
	 *            for the element
	 * @param timeout
	 *            in seconds
	 * @return list of elements found
	 */
	public List<WebElement> waitForElementsDisplayed(final By locator,
			int timeout) {
		ExpectedCondition<List<WebElement>> e = new ExpectedCondition<List<WebElement>>() {
			public List<WebElement> apply(WebDriver webDriver) {
				if (webDriver.findElements(locator).size() > 0) {
					return webDriver.findElements(locator);
				} else {
					return null;
				}
			}
		};

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(e);
	}

	/**
	 * Allows selenium to pause for a set amount of time
	 * 
	 * @param seconds
	 *            time to wait in seconds
	 */
	public void wait(double seconds) {
		try {
			Thread.sleep(Math.round(seconds * 1000));
		} catch (InterruptedException e) {
			return;
		}
	}

	/**
	 * Waits for a single element to be present and returns it
	 * 
	 * @param locator
	 *            for the element
	 * @param timeout
	 *            in seconds
	 * @return web element found
	 */
	public WebElement waitForElementPresent(final By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public WebElement presenceOfElementLocated(final By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * Waits for a single element to be clickable and returns it
	 * 
	 * @param locator
	 *            for the element
	 * @param timeout
	 *            in seconds
	 * @return web element found
	 */
	public WebElement waitForElementClickable(final By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * FluentWait Waits for a single element to be clickable and returns it
	 * 
	 * 
	 */
	public void waitForElement(WebElement element, int timeout) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(timeout, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementByxpath(String element, int timeout) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(timeout, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath(element)));
	}

	public void assertingWebElement(WebElement element) {
		Assert.assertTrue("Is " + element + " displayed ========>",
				element.isDisplayed());
	}

	public void assertFalseWebElement(WebElement element) {
		Assert.assertFalse("Is " + element + " displayed ========>",
				element.isDisplayed());
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Robot
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void robotEnter() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Clicks
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * 
	 * right click using Xpath
	 */

	public void contextClick(WebElement webElement, String LinkingText) {
		LOG.debug("Right click element. Click on: " + LinkingText);
		Actions oAction = new Actions(driver);
		oAction.moveToElement(webElement);
		oAction.contextClick(webElement).build().perform();
		WebElement elementOpen = driver.findElement(By.xpath(LinkingText));
		elementOpen.click();
	}
	
	public void clearTextBox(WebElement textbox) {
		textbox.clear();		
	}

	/*
	 * this will perform doubleClick
	 */

	public void doubleClick(WebElement element) {
		Actions selAction = new Actions(driver);
		selAction.moveToElement(element).doubleClick().build().perform();
	}

	/**
	 * Clicks on a web element
	 * 
	 * @param locator
	 * @param element
	 */
	public void click(Locators locator, String element) {
		click(getWebElement(locator, element));
	}

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Checking element functionality
	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Checks if an element is displayed
	 * 
	 * @param locator
	 * @param element
	 * @param elementVal
	 */
	public void checkElementDisplayed(Locators locator, String element,
			String elementVal) {
		checkElementDisplayed(getWebElement(locator, element), elementVal);
	}

	/**
	 * Asserts if an element text matches the passed value
	 * 
	 * @param element
	 * @param elementVal
	 */
	public void checkElementDisplayed(WebElement element, String elementVal) {
		Assert.assertEquals(elementVal, element.getText());
	}
	
	public void waitForElementToBePresent(WebElement element){
		Boolean staleElement=true;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		while(staleElement){
		try{
		wait.until(ExpectedConditions.visibilityOf(element));
		break;
		}catch(StaleElementReferenceException e){
			
			
		    
		}
		
		}
		
	}

	/**
	 * Checks if an element is displayed
	 * 
	 * @param locator
	 * @param element
	 * @throws Exception
	 */
	public void checkElementDisplayed(Locators locator, String element)
			throws Exception {
		checkElementDisplayed(getWebElement(locator, element));
	}

	/**
	 * Checks if an element is displayed
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void checkElementDisplayed(WebElement element) throws Exception {
		Assert.assertTrue(element.isDisplayed());
	}

	/**
	 * Checks if an error element is displayed
	 * 
	 * @param locator
	 * @param element
	 * @throws Exception
	 */
	public void checkErrorMsgElementDisplayed(Locators locator, String element)
			throws Exception {
		checkErrorMsgElementDisplayed(getWebElement(locator, element));
	}

	/**
	 * Checks if an error element is displayed
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void checkErrorMsgElementDisplayed(WebElement element)
			throws Exception {
		try {
			Assert.assertFalse(element.isDisplayed());
		} catch (Throwable t) {
			log("Error: " + element.getText());
			log("Error in page: " + element);
			// takeScreenshot("ICSEmailResetError");
		}
	}

	public void verifyText(String actualValue, WebElement element) {
		String expectedtext = element.getText();
		Assert.assertEquals(actualValue, expectedtext);
		System.out.println(actualValue);
	}
	
	public void waitForElementToDisappear(String locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated((By) locator));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
		
	}
	
	public void clickOn(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

	// /////////////////////////////////////////////////////////////////////////////////////////////////
	// Selenium actions functionality
	// /////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Clicks on a web element
	 * 
	 * @param element
	 */
	public void click(WebElement element) {
		Actions selAction = new Actions(driver);
		selAction.click(element).perform();
	}

	/**
	 * Simulates the mouse hovering over an element
	 * 
	 * @param locator
	 * @param element
	 */
	public void hover(Locators locator, String element) {
		hover(getWebElement(locator, element));
	}

	/**
	 * 
	 * Simulates the mouse hovering over an element
	 * 
	 * @param element
	 */
	public void hover(WebElement element) {
		Actions builder = new Actions(driver);
		Actions mouseOver = builder.moveToElement(element);
		mouseOver.build().perform();
	}

	/**
	 * 
	 * Simulates the mouse hovering over an element and verify background colour
	 * 
	 * @param element
	 * @param colour
	 */
	public void HoverAndcheckingBackGroundColour(WebElement element,
			String colour) {
		String text;
		hover(element);
		wait(2);
		text = element.getCssValue("background-color").toString();
		// Split css value of rgb
		String[] numbers = text.replace("rgba(", "").replace(")", "")
				.split(",");
		int number1 = Integer.parseInt(numbers[0]);
		numbers[1] = numbers[1].trim();
		int number2 = Integer.parseInt(numbers[1]);
		numbers[2] = numbers[2].trim();
		int number3 = Integer.parseInt(numbers[2]);
		String hex = String.format("#%02x%02x%02x", number1, number2, number3);
		System.out.println("Actual background color after hovering:" + hex);
		System.out
				.println("Expected background color after hovering:" + colour);
		Assert.assertEquals(hex, colour);
	}

	public void HoverAndcheckingColour(WebElement element, String colour) {
		String text;
		hover(element);
		wait(2);
		text = element.getCssValue("color").toString();
		// Split css value of rgb
		String[] numbers = text.replace("rgba(", "").replace(")", "")
				.split(",");
		int number1 = Integer.parseInt(numbers[0]);
		numbers[1] = numbers[1].trim();
		int number2 = Integer.parseInt(numbers[1]);
		numbers[2] = numbers[2].trim();
		int number3 = Integer.parseInt(numbers[2]);
		String hex = String.format("#%02x%02x%02x", number1, number2, number3);
		System.out.println("Actual font color after hovering:" + hex);
		System.out.println("Expected font color after hovering:" + colour);
		Assert.assertEquals(hex, colour);
	}
	
	public String getAttributeValue(WebElement element, String attribute){
		
		String attributeValue = element.getAttribute(attribute);
		return attributeValue;
		
		
	}
	
	public void retryingFindClick(WebElement element) {
	    
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            element.click();
	            
	            break;
	        } catch(Throwable t) {
	        }
	        attempts++;
	    }
	   
	}
	
	public String getSelectedOptionFromDropdown(WebElement dropdown) {
		
		Select Dropdown = new Select(dropdown);
		String selectedOption = Dropdown.getFirstSelectedOption().getText();
		return selectedOption;
		
		
	}
	
	public String getText(WebElement element) {
		
		String text = element.getText();
		return text;
	}

	/**
	 * 
	 * verify background colour
	 * 
	 * @param element
	 * @param colour
	 */
	public void checkingBackGroundColour(WebElement element, String colour) {
		String text;
		text = element.getCssValue("background-color").toString();
		// Split css value of rgb
		String[] numbers = text.replace("rgba(", "").replace(")", "")
				.split(",");
		int number1 = Integer.parseInt(numbers[0]);
		numbers[1] = numbers[1].trim();
		int number2 = Integer.parseInt(numbers[1]);
		numbers[2] = numbers[2].trim();
		int number3 = Integer.parseInt(numbers[2]);
		String hex = String.format("#%02x%02x%02x", number1, number2, number3);
		System.out.println("Actual background color before hovering:" + hex);
		System.out.println("Expected background color before hovering:"
				+ colour);
		Assert.assertEquals(hex, colour);
	}

	public void checkingColour(WebElement element, String colour) {
		String text;
		text = element.getCssValue("color").toString();
		// Split css value of rgb
		String[] numbers = text.replace("rgba(", "").replace(")", "")
				.split(",");
		int number1 = Integer.parseInt(numbers[0]);
		numbers[1] = numbers[1].trim();
		int number2 = Integer.parseInt(numbers[1]);
		numbers[2] = numbers[2].trim();
		int number3 = Integer.parseInt(numbers[2]);
		String hex = String.format("#%02x%02x%02x", number1, number2, number3);
		System.out.println("Actual font color before hovering:" + hex);
		System.out.println("Expected font color before hovering:" + colour);
		Assert.assertEquals(hex, colour);
	}

	public void hoverAndClick(WebElement element) {
		Actions selAction = new Actions(driver);
		selAction.moveToElement(element).click().perform();
	}
	
	public void waitForElementClickable(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
		
	}
	
public Boolean elementIsDisplayedOrNot(WebElement element) {
		
		Boolean displayed = true;
		
		try{
			
			if(element.isDisplayed())
				displayed=true;
			
		}catch(Throwable t){
			
			displayed=false;
		}
		
		return displayed;
	}

	/**
	 * Enters the text string into the specified field (presumably an input
	 * field of some kind).
	 * <p>
	 * This method assumes that we are mimicking the "click" into the field in
	 * the browser - with the current jquery setup for the field it will blank
	 * the field's default entry (e.g. "enter username"). If this is NOT
	 * required use the overloaded version of the method to append to the
	 * content of the field {@link #type(WebElement, String, boolean)}
	 * 
	 * @param element
	 *            the field into which the text will be typed
	 * @param text
	 *            to type
	 */
	public void type(WebElement element, String text) {
		type(element, text, MimickClick.YES);
	}

	/**
	 * Enters the text string into the specified field (presumably an input
	 * field of some kind).
	 * <p>
	 * This method allows you to define if the initial click into the field is
	 * performed.
	 * 
	 * @param element
	 *            the field into which the text will be typed
	 * @param text
	 *            to type
	 * @param mimickClick
	 *            enum indicating whether to click into field before adding the
	 *            text
	 */
	public void type(WebElement element, String text, MimickClick mimickClick) {
		Actions selAction = new Actions(driver);

		// if not appending send a click to the field as if we are just entering
		// it...
		if (mimickClick == MimickClick.YES) {
			element.click();
		}

		selAction.sendKeys(element, text).perform();
	}

	public void acceptingJavascriptalert() {
		driver.switchTo().alert().accept();
	}

	public void dragandDrop(String drag, String drop) {
		WebElement dragElement = getWebElement(Locators.xpath, drag);
		WebElement dropElement = getWebElement(Locators.xpath, drop);
		Actions builder = new Actions(driver); // Configure the Action
		builder.dragAndDrop(dragElement, dropElement).build().perform();
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////
	// Window Handling functionality
	// ////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Switchs to the popup window
	 * 
	 * @param objectName
	 * @throws InterruptedException
	 */
	public void handlePopup() {
		driver.switchTo().activeElement();

	}

	public void popUpWindowHandling() {
		try {
			Set<String> windowids = driver.getWindowHandles();
			Iterator<String> iter = windowids.iterator();

			windowids = driver.getWindowHandles();
			iter = windowids.iterator();
			String mainWindowId = iter.next();
			String popupwindowid = iter.next();
			System.out.println(mainWindowId);
			System.out.println(popupwindowid);
			Thread.sleep(3000L);
			driver.switchTo().window(popupwindowid);
			driver.switchTo().window(popupwindowid).close();
			driver.switchTo().window(mainWindowId);
		} catch (Exception e) {
			System.out.println("Exception occurred in PopUpWindowHandling.");
			e.printStackTrace();
		}
	}

	public void MDPpopUpWindowHandling(WebElement destination) {
		try {
			Set<String> windowids = driver.getWindowHandles();
			Iterator<String> iter = windowids.iterator();

			windowids = driver.getWindowHandles();
			iter = windowids.iterator();
			String mainWindowId = iter.next();
			String popupwindowid = iter.next();
			System.out.println(mainWindowId);
			System.out.println(popupwindowid);
			Thread.sleep(3000L);
			driver.switchTo().window(popupwindowid);
			selectMultipleAssetsinDPcontainerwindow();
			driver.switchTo().window(mainWindowId);
			/*
			 * Actions builder = new Actions(driver); builder = new
			 * Actions(driver); builder.moveToElement(destination).perform();
			 * builder.build(); builder.release();
			 * builder.release(destination).perform();
			 */
			driver.switchTo().window(popupwindowid).close();
			driver.switchTo().window(mainWindowId);
		} catch (Exception e) {
			System.out.println("Exception occurred in PopUpWindowHandling.");
			e.printStackTrace();
		}
	}

	public void selectMultipleAssetsinDPcontainerwindow() {
		Actions actionProvider = new Actions(driver);
		actionProvider
				.keyDown(Keys.SHIFT)
				.click(driver.findElement(By
						.xpath("//div[@id='collections_content']//div[contains(text(),'14794')]")))
				.click(driver.findElement(By
						.xpath("//div[@id='collections_content']//div[contains(text(),'14795')]")))
				.click(driver.findElement(By
						.xpath("//div[@id='collections_content']//div[contains(text(),'14796')]")))
				.keyUp(Keys.SHIFT);
		Action selectMultiple = actionProvider.build();
		selectMultiple.perform();
	}

	public void switchToFramebyXpath(String frameName) {
		saveCurrentWindowHandle();
		getDriver().switchTo().frame(driver.findElement(By.xpath(frameName)));
	}

	public void switchToFramebyFrameWebElement(WebElement frameElement) {
		saveCurrentWindowHandle();
		getDriver().switchTo().frame(frameElement);
	}

	// END Getters and Setters
	public void switchToFrame(String frameName) {
		saveCurrentWindowHandle();
		getDriver().switchTo().frame(driver.findElement(By.id(frameName)));
	}

	public void switchToDefaultFrame() {
		saveCurrentWindowHandle();
		getDriver().switchTo().defaultContent();
	}

	/**
	 * Return to the previously saved window context
	 */
	public void switchToPreviousWindowContext() {

		revertToWindowHandle(getPreviousWindowHandle());
	}

	protected void saveCurrentWindowHandle() {
		try {
			prevWindowHandle = getCurrentWindowHandle();
		} catch (NoSuchWindowException ex) {
			LOG.warn("Window has been closed - Unable to save previous window handle");
		}
	}

	public String getCurrentWindowHandle() {
		return getDriver().getWindowHandle();
	}

	protected void revertToWindowHandle(String handle) {
		getDriver().switchTo().window(handle);
	}

	protected String getPreviousWindowHandle() {
		return prevWindowHandle;
	}

	/**
	 * Close the window handle which is currently in the driver context
	 */
	public void closeCurrentWindow() {
		LOG.debug("Closing current window: " + getDriver().getWindowHandle());
		getDriver().close();
	}

	public void PopUpWindowHandling() {
		try {
			Set<String> windowids = driver.getWindowHandles();
			Iterator<String> iter = windowids.iterator();

			windowids = driver.getWindowHandles();
			iter = windowids.iterator();
			String mainWindowId = iter.next();
			String popupwindowid = iter.next();
			Thread.sleep(3000L);
			driver.switchTo().window(popupwindowid);
			driver.switchTo()
					.window(popupwindowid)
					.getCurrentUrl()
					.equalsIgnoreCase(
							"https://theassetbank-qa.unilever.com/images/Quickstart-TAB.pdf");
			driver.switchTo().window(mainWindowId);
		} catch (Exception e) {
			System.out.println("Exception occurred in PopUpWindowHandling.");
			e.printStackTrace();
		}
	}

	public boolean switchToWindowWithTitle(String title, Boolean exactMatch) {
		Boolean retVal = false;
		saveCurrentWindowHandle();
		Set<String> windowIterator = getDriver().getWindowHandles();

		for (String window : windowIterator) {
			getDriver().switchTo().window(window);
			if (!exactMatch) {
				if (getDriver().getTitle().contains(title)) {
					retVal = true;
					break;
				}
			} else {
				if (getDriver().getTitle().equals(title)) {
					retVal = true;
					break;
				}
			}
		}
		return retVal;
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////
	// Extra base selenium functionality
	// ////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * A method to grab the web element using selenium webdriver
	 * 
	 * @param locator
	 * @param element
	 * @return web element
	 */
	public WebElement getWebElement(Locators locator, String element) {
		By byElement;
		switch (locator) {
		case xpath:
			byElement = By.xpath(element);
			break;
		case id:
			byElement = By.id(element);
			break;
		case name:
			byElement = By.name(element);
			break;
		case classname:
			byElement = By.className(element);
			break;
		case linktext:
			byElement = By.linkText(element);
			break;
		case paritallinktext:
			byElement = By.partialLinkText(element);
			break;
		case tagname:
			byElement = By.tagName(element);
			break;
		case cssSelector:
			byElement = By.cssSelector(element);
			break;
		default:
			throw new RuntimeException("Known Locator passed");
		}

		WebElement query = driver.findElement(byElement); // grab our element
															// based on the
															// locator
		return query; // return our query
	}

	/**
	 * This method takes an screenshot of the current page and save it in the
	 * configured repository concatenating the current date
	 * 
	 * @param fileNamePrefix
	 *            should be something descriptive as the class name
	 * @throws IOException
	 */

	public void takeScreenshot(WebElement element, String fileNamePrefix)
			throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				element, "color: yellow; border: 5px solid red;");
		File screenshot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		BufferedImage fullImg = ImageIO.read(screenshot);
		// Get the location of element on the page
		Point point = element.getLocation();
		// Get width and height of the element
		int eleWidth = element.getSize().getWidth();
		int eleHeight = element.getSize().getHeight();
		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(),
				point.getY(), eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);
		// Copy the element screenshot to disk
		// FileUtils.copyFile(screenshot, new File("c:\\partial.png"));
		// Store
		// String screenshotsDirPath = configProperties
		// .getProperty(Constants.SCREENSHOTSDIR);
		FileUtils.copyFile(screenshot, new File(
				"/Users/Tesco/Desktop/Screenshots" + File.separator
						+ fileNamePrefix));
	}

	/**
	 * Maximise the window
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * Sets the implicit wait time
	 * 
	 * @param val
	 *            seconds
	 */
	public void implicitwait(long val) {
		driver.manage().timeouts().implicitlyWait(val, TimeUnit.SECONDS);
	}

	public void webdriverWait(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)))
		wait.until(ExpectedConditions.stalenessOf(element));

	}

	/**
	 * Quits the browser
	 */
	public void quitbrowser() {
		driver.quit();
	}

	public void appiumQuit() {
		appium.destroy();
	}

	/**
	 * Closes the browser
	 */
	public void close() {
		driver.close();
	}

	/**
	 * Checks if text is present
	 * 
	 * @param textToBeVerified
	 * @return
	 */
	public boolean isTextPresent(String textToBeVerified) {
		try {
			if (driver.findElement(By.xpath("//*[contains(.,'"
					+ textToBeVerified + "')]")) != null) {
				return true;
			}
		} catch (Exception ex) {
			LOG.error("Text " + textToBeVerified + " is not present");
		}
		return false;
	}

	public boolean searchTerm(String searchTerm) {
		try {
			wait(5);
			if (driver.getPageSource().contains(searchTerm)) {
				LOG.debug("Text " + searchTerm + " is present");
				return true;
			}
		} catch (Exception ex) {
			LOG.error("Text " + searchTerm + " is not present");
		}
		return false;
	}

	/**
	 * Selects an element from a drop down list
	 * 
	 * @param element
	 * @param textToBeChosen
	 */
	public void select(String element, String textToBeChosen) {
		WebElement dropDownListBox = null;
		Select clickThis = null;
		try {
			dropDownListBox = getWebElement(Locators.xpath, element);
			clickThis = new Select(dropDownListBox);
			clickThis.selectByVisibleText(textToBeChosen);
		} catch (Exception e) {
			LOG.error("Failed in select: ", e);
		}

	}

	public void selectfromdropdown(WebElement element, String textToBeChosen) {
		WebElement dropDownListBox = element;
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(textToBeChosen);
	}

	/**
	 * Gets the links of an element and clicks them
	 * 
	 * @param tagName
	 * @param linkName
	 * @throws Exception
	 */
	public void getLinksAndClick(String tagName, String linkName,
			int waitAfterClickInSecs) {
		List<WebElement> links = driver.findElements(By.tagName(tagName));

		for (WebElement myElement : links) {
			String link = myElement.getText();
			if (link != "" && linkName.equals(link)) {
				myElement.click();
				try {
					Thread.sleep(waitAfterClickInSecs * 1000);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}

	/**
	 * Returns true if some of the CSS class matches the search. Intended to use
	 * with error classes
	 * 
	 * @param cssClass
	 * @return true if positive search or false otherwise
	 */
	public boolean findErrorsOnElements(String cssClass) {
		boolean isError = false;

		List<WebElement> errors = driver.findElements(By.className(cssClass));
		for (WebElement error : errors) {
			isError = true;
			LOG.debug("Errors: " + error);
		}

		return isError;
	}

	/**
	 * Checks a checkbox
	 * 
	 * @param element
	 */
	public boolean setCheckboxStatus(WebElement element) {
		try {
			if (element.isSelected()) {
				LOG.debug("Check Box " + element + " is selected");
				return true;
			}
		} catch (Exception ex) {
			LOG.error("Check Box  " + element + " is not selected");
		}
		return false;
	}
	
	/**
	 * If checkbox is not selected then it will return true
	 * 
	 * @param element
	 */
	public boolean CheckboxStatus(WebElement element) {
		try {
			if (element.isSelected()) {
				LOG.debug("Check Box " + element + " is not selected");
				return false;
			}
		} catch (Exception ex) {
			LOG.error("Check Box  " + element + " is selected");
		}
		return true;
	}
	public boolean statusofRadiobutton(WebElement element) {
		try {
			if (element.isSelected()) {
				LOG.debug("Radio button " + element + " is selected");
				return true;
			}
		} catch (Exception ex) {
			LOG.error("Radio button " + element + " is not selected");
		}
		return false;
	}

	/**
	 * Get elements by XPath
	 * 
	 * @param xpath
	 * @return list of elements
	 */
	public List<WebElement> getElementsByXpath(String xpath) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		return elements;
	}

	/**
	 * Get elements by CSS selector
	 * 
	 * @param css
	 * @return list of elements
	 */
	public List<WebElement> getElementsByCSS(String css) {
		List<WebElement> elements = driver.findElements(By.cssSelector(css));
		return elements;
	}

	/**
	 * Retrieves the page object
	 * 
	 * @param className
	 *            name of the class to be instantiated
	 * @return page object
	 */
	public <T extends PageObject> T getPageObject(Class<T> className) {
		if (this.driver == null) {
			throw new RuntimeException("Trying create PageObject for ["
					+ className + "] " + "before the browser has been opened. "
					+ "\nThis is not allowed - OPEN THE BROWSER first.");
		}

		T retVal = PageFactory.initElements(this.driver, className);
		return retVal;
	}

	/**
	 * Retrieves the base domain stored as property
	 * 
	 * @param msg
	 */

	public String getBaseDomain() {
		return configProperties.getProperty(Constants.BASE_DOMAIN);
	}

	/**
	 * Retrieves the full url based on the property used in a feature file
	 * 
	 * @param key
	 *            key in the constants page map
	 * @throws Exception
	 */
	public String getFullUrl(String key) {
		String relativeUrl = Constants.COMMON_PAGES.get(key);
		LOG.debug("relativeUrl ===> " + relativeUrl);

		if (relativeUrl == null) {
			LOG.error("There is no such page -" + key
					+ "- in the Constants Map");
			throw new RuntimeException("There is no such page [" + key
					+ "] in the Constants Map");
		}

		return getBaseDomain() + relativeUrl;
	}

	/**
	 * 
	 * Waits for multiple elements to be present. Useful for locators that
	 * return a collection of WebElement
	 * 
	 * @param locator
	 *            for the element
	 * @param timeout
	 *            in seconds
	 * @return list of elements found
	 */
	public List<WebElement> waitForElementsPresent(final By locator, int timeout) {
		ExpectedCondition<List<WebElement>> e = new ExpectedCondition<List<WebElement>>() {
			public List<WebElement> apply(WebDriver webDriver) {
				if (webDriver.findElements(locator).size() > 0) {
					return webDriver.findElements(locator);
				} else {
					return null;
				}
			}
		};

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(e);
	}

	public String getCurrentURL() {
		return getDriver().getCurrentUrl();
	}

	public boolean isElementPresent(String objectName) {
		log("Checking object presence " + objectName);
		int count = driver.findElements(By.cssSelector(objectName)).size();
		if (count == 0)
			return false;
		else
			return true;
	}

	public boolean isLinkPresent(String objectName) {
		log("Checking object presence " + objectName);
		int count = driver.findElements(By.partialLinkText(objectName)).size();
		if (count == 0)
			return false;
		else
			return true;
	}

	public boolean iselementPresent(String objectName) {

		if (isElementPresent(objectName))
			return true;
		else
			return false;
	}
	public boolean islinkPresent(String objectName) {

		if (isElementPresent(objectName))
			return true;
		else
			return false;
	}
	private boolean existsElement(String objectName) {
		try {
			driver.findElement(By.xpath(objectName));
		} catch (Exception e) {
			System.out.println("object is not present ");
			return false;
		}

		return true;
	}

	// //////////////////////////////////////////////////////////////////////////////////////////////
	// Logging
	// //////////////////////////////////////////////////////////////////////////////////////////////

	@Deprecated
	public static void log(String msg) {
		LOG.debug(msg);
	}

	@Deprecated
	public static void log(String msg, Throwable t) {
		LOG.debug(msg, t);
	}

	// END Helper methods

	// Getters and Setters

	public Properties getConfigProperties() {
		return configProperties;
	}
	
	public void pressTabKey(WebElement textBox) {
		textBox.sendKeys(Keys.TAB);
		
	}

	public void setConfigProperties(Properties configProperties) {
		this.configProperties = configProperties;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public AndroidDriver androidDriver() {
		return androidDriver;
	}

	public AppiumDriver getAppiumDriver() {
		return appiumDriver;
	}

	public WebElement getElement(By elementID, String priority) {
		return getElement(elementID, priority, true);
	}

	private WebElement getElement(By elementID, String priority,
			boolean highlight) {
		WebElement element = getDriver().findElement(elementID);
		return element;
	}

	// Code to kill The browser insatnce

	ArrayList<String> taskList = new ArrayList<String>();

	public void killBrowserInstance(String browser) {
		String line = "";
		Process process = null;

		try {
			process = Runtime.getRuntime().exec("tasklist");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			while ((line = reader.readLine()) != null) {
				// For Debug Purpose : Prints information of running processes
				// under windows.
				// System.out.println(line);
				taskList.add(line);
			}
			if (browser.equalsIgnoreCase("ie")) {
				if (isProcessRunning("iexplore.exe")) {
					Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
				}
				if (isProcessRunning("IEDriverServer.exe")) {
					Runtime.getRuntime().exec(
							"taskkill /F /IM IEDriverServer.exe");
				}
				if (isProcessRunning("IEDriverServer_32Bit.exe")) {
					Runtime.getRuntime().exec(
							"taskkill /F /IM IEDriverServer_32Bit.exe");
				}
				if (isProcessRunning("IEDriverServer_64Bit.exe")) {
					Runtime.getRuntime().exec(
							"taskkill /F /IM IEDriverServer_64Bit.exe");
				}
			} else if (browser.equalsIgnoreCase("firefox")) {
				if (isProcessRunning("firefox.exe")) {
					Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
				}
			} else if (browser.equalsIgnoreCase("chrome")) {
				if (isProcessRunning("chrome.exe")) {
					Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
				}
				if (isProcessRunning("chromedriver.exe")) {
					Runtime.getRuntime().exec(
							"taskkill /F /IM chromedriver.exe");
				}
			}
		} catch (Exception e) {

		}
	}

	/**
	 * isProcessRunning() method tells whether the process is running or not.
	 * 
	 * @param process
	 *            The name of a process.
	 * 
	 * @return return true if process is running else returns false
	 */
	public boolean isProcessRunning(String process) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).contains(process)) {
				return true;
			}
		}
		return false;
	}

	
	public void waitForElementTobePresent(WebElement element) {
		try{
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Throwable t){
			
		}
	}
}
