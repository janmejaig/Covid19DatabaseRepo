package com.covid.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.covid.qa.utils.TestUtil;
import com.covid19.qa.pages.APIsPage;
import com.covid19.qa.pages.AdvanceSearchHomePage;
import com.covid19.qa.pages.HomePageCovidDatabase;
import com.covid19.qa.pages.HomePage_primarySearch;
import com.covid19.qa.pages.NoResultFoundPageMethods;
import com.covid19.qa.pages.SignUPForm;

//import com.covid.qa.utils.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public static ExtentReports extent;
	public static ExtentTest logger;
	public static ExtentHtmlReporter reporter;

	public static AdvanceSearchHomePage AdvanceSearchHomePageObject;

	public static APIsPage APIsPageObject;

	public static APIsPage AboutUsPageObject;

	public static HomePageCovidDatabase HomePageCovidDatabaseobject;

	public static HomePage_primarySearch HomePage_primarySearchObject;

	public static SignUPForm SignUPFormObject;

	public static NoResultFoundPageMethods NoResultFoundPageMethodsObject;

	public static EventFiringWebDriver e_driver;

	public TestBase() {
		try {

			prop = new Properties();
			String filepath = System.getProperty("user.dir");

			String absolutePath = filepath + "/config.properties";

			FileInputStream ip = new FileInputStream(absolutePath);

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver(); // launch chrome

//			ChromeOptions chromeOptions = new ChromeOptions();
//
//		chromeOptions.addArguments("headless");
//			driver = new ChromeDriver(chromeOptions);

		} else if (browserName.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("no browser value is given");
		}

		e_driver = new EventFiringWebDriver(driver);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

	public static void browserQuit() {
		driver.manage().deleteAllCookies();

		TestUtil.implicitWait(500);
		driver.quit();
	}

	public static void Failed(String testmethodname) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,
					new File("/Users/janmejai.gupta/Documents/SeleniumRepo/Automation/Covid19Database/Reports/extent/"
							+ testmethodname + "" + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
