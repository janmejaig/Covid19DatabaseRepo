package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;
import com.covid19.qa.pages.APIsPage;

public class APIsPageTestCases extends TestBase {

	APIsPage APIsPageObject;

	public APIsPageTestCases() {
		super();

	}

	@BeforeClass
	public void setup() {

		initialization();

		APIsPageObject = new APIsPage();
	}

	@Test(priority = 1)
	public void APIsPageNavigation() throws InterruptedException {

		// logger=extent.createTest("APIsPageNavigation");

		String APIsPageTitle = APIsPageObject.VerifyAPIsLinkClick();

		Assert.assertEquals(APIsPageTitle, "APIs");

		System.out.println("Title of the APIs Page Title is : " + APIsPageTitle);

	}

	@Test(priority = 2)
	public void VerifyAPIsLinkUrl() throws InterruptedException {

		String VerifyAPIsLinkUrl = APIsPageObject.VerifyAPIsLinkUrl();

		Assert.assertEquals(VerifyAPIsLinkUrl, prop.getProperty("apisurl"));

		System.out.println("URL of the APIs Page is : " + VerifyAPIsLinkUrl);

	}

	@Test(priority = 3)
	public void VerifyAPIListingHeading() throws InterruptedException {

		String VerifyAPIListingHeading = APIsPageObject.VerifyAPIListingHeading();

		Assert.assertEquals(VerifyAPIListingHeading, prop.getProperty("VerifyAPIListingHeading"));

		System.out.println("API Listing Heading of the APIs Page is : " + VerifyAPIListingHeading);

	}

	@Test(priority = 4)
	public void VerifyCOvid19APIHeading() throws InterruptedException {

		String VerifyCOvid19APIHeading = APIsPageObject.VerifyCOvid19APIHeading();

		Assert.assertEquals(VerifyCOvid19APIHeading,
				"COvid19 API\n" + "API for COVID-19 stats & patient tracing in India");

		System.out.println("Covid 19  Heading of the  Page is : " + VerifyCOvid19APIHeading);

	}

	@Test(priority = 5)
	public void ClickCOvid19APIViewDocumentastion() throws InterruptedException {

		String ClickCOvid19APIViewDocumentastion = APIsPageObject.ClickCOvid19APIViewDocumentastion();

		Assert.assertEquals(ClickCOvid19APIViewDocumentastion, prop.getProperty("ClickCOvid19APIViewDocumentastion"));

		System.out.println("click view documentation on Covid 19  Page : " + ClickCOvid19APIViewDocumentastion);

	}

	@Test(priority = 6)
	public void Covid19OauthAPIHeading() throws InterruptedException {

		String Covid19OauthAPIHeading = APIsPageObject.Covid19OauthAPIHeading();

		Assert.assertEquals(Covid19OauthAPIHeading,
				"Covid19-Oauth API\n" + "This API is used to retrieve access token, authorization based on OAuth 2.0");

		System.out.println("Covid19OauthAPI Heading   is  : " + Covid19OauthAPIHeading);

		// driver.navigate().back();

	}

	@Test(priority = 7)
	public void Covid19OauthAPIclickViewDocumentation() throws InterruptedException {

		TestUtil.Pause(500);
		String Covid19OauthAPIclickViewDocumentation = APIsPageObject.Covid19OauthAPIclickViewDocumentation();

		Assert.assertEquals(Covid19OauthAPIclickViewDocumentation,
				prop.getProperty("ClickCOvid19APIViewDocumentastion"));

		TestUtil.implicitWait(500);

		System.out.println(
				"click view documentation under Covid19OauthAPI Heading   : " + Covid19OauthAPIclickViewDocumentation);

	}

	@Test(priority = 8)
	public void VerifyCOVID19PatientDatabaseAPIHeading() throws InterruptedException {

		String COVID19PatientDatabaseAPIHeading = APIsPageObject.COVID19PatientDatabaseAPIHeading();

		Assert.assertEquals(COVID19PatientDatabaseAPIHeading, "COVID19- Patient-Database API\n"
				+ "This API is used to retrieve create update and delete the covid19 patients' records respectively.\n"
				+ "View Documentation");

		System.out.println("COVID19PatientDatabaseAPI Heading is : " + COVID19PatientDatabaseAPIHeading);

	}

	@Test(priority = 9)
	public void clickviewdocumentationunderCOVID19PatientDatabaseAPI() throws InterruptedException {

		String clickviewdocumentationunderCOVID19PatientDatabaseAPI = APIsPageObject
				.clickviewdocumentationunderCOVID19PatientDatabaseAPI();

		Assert.assertEquals(clickviewdocumentationunderCOVID19PatientDatabaseAPI,
				prop.getProperty("ClickCOvid19APIViewDocumentastion"));

		System.out.println("clicking view documentation under COVID19PatientDatabaseAPI Heading : "
				+ clickviewdocumentationunderCOVID19PatientDatabaseAPI);

	}

	@Test(priority = 10)
	public void VerifyREQUESTACCESSTOAPIsHeading() throws InterruptedException {

		String VerifyREQUESTACCESSTOAPIsHeading = APIsPageObject.VerifyREQUESTACCESSTOAPIsHeading();

		Assert.assertEquals(VerifyREQUESTACCESSTOAPIsHeading, prop.getProperty("VerifyREQUESTACCESSTOAPIsHeading"));

		System.out.println("verify requestaccess to api  Heading : " + VerifyREQUESTACCESSTOAPIsHeading);

	}

	@Test(priority = 11)
	public void clickREQUESTACCESS() throws InterruptedException {

		String clickREQUESTACCESS = APIsPageObject.clickREQUESTACCESS();

		Assert.assertEquals(clickREQUESTACCESS, prop.getProperty("ClickCOvid19APIViewDocumentastion"));

		System.out.println("verify requestaccess page naviagation : " + clickREQUESTACCESS);

	}

	@Test(priority = 12)
	public void verifyHowToGetStartedHeading() throws InterruptedException {

		String verifyHowToGetStartedHeading = APIsPageObject.verifyHowToGetStartedHeading();

		Assert.assertEquals(verifyHowToGetStartedHeading, prop.getProperty("verifyHowToGetStartedHeading"));

		TestUtil.implicitWait(500);

		System.out.println("verify how to get started  page  : " + verifyHowToGetStartedHeading);

	}

	@Test(priority = 13)
	public void clickHowToGetStartedbutton() throws InterruptedException {

		String clickHowToGetStartedbutton = APIsPageObject.clickHowToGetStartedbutton();

		Assert.assertEquals(clickHowToGetStartedbutton, prop.getProperty("clickHowToGetStartedbutton"));

		System.out.println(" click how to get start button  : " + clickHowToGetStartedbutton);

		TestUtil.ClickbackButtonOnBrowser();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
