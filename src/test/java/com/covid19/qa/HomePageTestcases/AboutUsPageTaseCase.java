package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;
import com.covid19.qa.pages.AboutUsPage;

//@Listeners(com.covid.qa.ExtentReport.TestNGListener.class)

public class AboutUsPageTaseCase extends TestBase {

	AboutUsPage AboutUsPageObject; 
	
	public AboutUsPageTaseCase(){
		super();
		
}

	
	@BeforeClass
	public void setup() {
		
		initialization();
		
		AboutUsPageObject = new AboutUsPage();
	}

	@Test(priority = 1)
	public void AbouUsPageNavigation() throws InterruptedException {

		//logger=extent.createTest("AbouUsPageNavigation");
		String TitleAboutUsPage = AboutUsPageObject.AboutUsLinkClick();

		Assert.assertEquals(TitleAboutUsPage, "About Us");

		System.out.println("Title of the AboutUsPage is : " + TitleAboutUsPage);
	}

	@Test(priority = 2)
	public void ValidateAbouUsPageUrl() throws InterruptedException {

		String TitleAboutUsPageUrl = AboutUsPageObject.AboutUsPageUrl();

		Assert.assertEquals(TitleAboutUsPageUrl, prop.getProperty("aboutusUrl"));

		System.out.println("Url of AboutUs  Page is : " + TitleAboutUsPageUrl);
	}

	@Test(priority = 3)
	public void ValidateAbouUsPageLogo() throws InterruptedException {

		boolean flag = AboutUsPageObject.AboutUsPageLOGO();
		Assert.assertTrue(flag);
		System.out.println("AboutUs page logo is displayed");
	}

	@Test(priority = 4)
	public void VerifyFirstCovid19IndiaLink() throws InterruptedException {

		String VerifyFirstCovid19IndiaLink = AboutUsPageObject.VerifyFirstCovid19IndiaLink();

		System.out.println(VerifyFirstCovid19IndiaLink);

		Assert.assertEquals(VerifyFirstCovid19IndiaLink, prop.getProperty("covidUrl"));
	}

	@Test(priority = 5)
	public void VerifysecondCovid19IndiaLink() throws InterruptedException {

		String VerifysecondCovid19IndiaLink = AboutUsPageObject.VerifysecondCovid19IndiaLink();

		System.out.println(VerifysecondCovid19IndiaLink);

		Assert.assertEquals(VerifysecondCovid19IndiaLink, prop.getProperty("covidUrl"));
	}

	@Test(priority = 6)
	public void Covid19IndiaLinkNavigation() throws InterruptedException {
		String Covid19IndiaLinkNavigationUrl = AboutUsPageObject.Covid19IndiaLinkNavigation();

		System.out.println(Covid19IndiaLinkNavigationUrl);
	}

	@Test(priority = 7)
	public void Covid19IndiaLinkNavigation2() throws InterruptedException {

		String Covid19IndiaLinkNavigation2 = AboutUsPageObject.Covid19IndiaLinkNavigation2();

		System.out.println(Covid19IndiaLinkNavigation2);
	}

	@Test(priority = 8)
	public void VerifyApisLink() throws InterruptedException {

		String VerifyApisLink = AboutUsPageObject.VerifyApisLink();

		System.out.println(VerifyApisLink);

		Assert.assertEquals(VerifyApisLink, prop.getProperty("apisurl"));
	}

	@Test(priority = 9)
	public void VerifyApisLinkNavigation() throws InterruptedException {

		String VerifyApisLinkNavigation = AboutUsPageObject.VerifyApisLinkNavigation();

		System.out.println(VerifyApisLinkNavigation);
		Assert.assertEquals(VerifyApisLinkNavigation, prop.getProperty("apisurl"));
		TestUtil.ClickbackButtonOnBrowser();
	}

	@Test(priority = 10)
	public void VerifyCOVIDPatientDataTitleUnderAboutUsPAge() throws InterruptedException {

		String VerifyCOVIDPatientDataTitleUnderAboutUsPAge = AboutUsPageObject
				.VerifyCOVIDPatientDataTitleUnderAboutUsPAge();

		System.out.println(VerifyCOVIDPatientDataTitleUnderAboutUsPAge);

		Assert.assertEquals(VerifyCOVIDPatientDataTitleUnderAboutUsPAge, prop.getProperty("COVIDPatientDataTitle"));

	}

	@Test(priority = 11)
	public void VerifyCOVIDPatientDataNavigationUnderAboutUsPAge() throws InterruptedException {

		String VerifyCOVIDPatientDataNavigationUnderAboutUsPAge = AboutUsPageObject
				.VerifyCOVIDPatientDataNavigationUnderAboutUsPAge();

		System.out.println(VerifyCOVIDPatientDataNavigationUnderAboutUsPAge);

		Assert.assertEquals(VerifyCOVIDPatientDataNavigationUnderAboutUsPAge,
				prop.getProperty("COVIDPatientDataNavigationUnderAboutUsPAge"));

		TestUtil.ClickbackButtonOnBrowser();
	}

	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
	
	
}
