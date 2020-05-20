package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;
import com.covid.qa.utils.Wait;
import com.covid19.qa.pages.AboutUsPage;

public class AboutUsPageTaseCase extends TestBase{
	
	AboutUsPage  AboutUsPageObject ;
	

	
	public AboutUsPageTaseCase(){
		super();
	}

	
		
	@BeforeClass
	public void setUp(){
		initialization();
		AboutUsPageObject = new AboutUsPage();	
	}


	
	@Test(priority=1)
	public void AbouUsPageNavigation() throws InterruptedException {
		
		String TitleAboutUsPage =AboutUsPageObject.AboutUsLinkClick();
		
		
		Assert.assertEquals(TitleAboutUsPage, "About Us");
		
		System.out.println("Title of the AboutUsPage is : " +TitleAboutUsPage);

		//Wait.Pause(500);
	}
	
	
	
	@Test(priority=2)
	public void ValidateAbouUsPageUrl() throws InterruptedException  {
		
		//AboutUsPageObject.AboutUsLinkClick();
		
		String TitleAboutUsPageUrl = AboutUsPageObject.AboutUsPageUrl();
		
		
	//	Assert.assertEquals(TitleAboutUsPageUrl, "https://covid19database.srijan.net/about-us");
		
			Assert.assertEquals(TitleAboutUsPageUrl, prop.getProperty("aboutusUrl"));

		
		System.out.println("Url of AboutUs  Page is : " + TitleAboutUsPageUrl);
		
		//Wait.Pause(500);


	}
	
	

	
	@Test(priority=3)
	public void ValidateAbouUsPageLogo() throws InterruptedException {
		
		//AboutUsPageObject.AboutUsLinkClick();
		
			boolean flag = AboutUsPageObject.AboutUsPageLOGO();
			Assert.assertTrue(flag);
			System.out.println("AboutUs page logo is displayed");
			
			//Wait.Pause(500);

			
			//prop.getProperty("url");
	}

	
	
	
	
	
	
	
	@Test(priority=4)
	public void VerifyFirstCovid19IndiaLink() throws InterruptedException {
		
			String VerifyFirstCovid19IndiaLink = AboutUsPageObject.VerifyFirstCovid19IndiaLink();
			
			System.out.println(VerifyFirstCovid19IndiaLink);

			Assert.assertEquals(VerifyFirstCovid19IndiaLink,prop.getProperty("covidUrl"));
			
			//Wait.Pause(500);

}
	
	
	@Test(priority=5)
	public void VerifysecondCovid19IndiaLink() throws InterruptedException {
		
		
			String VerifysecondCovid19IndiaLink = AboutUsPageObject.VerifysecondCovid19IndiaLink();
			
			System.out.println(VerifysecondCovid19IndiaLink);

			Assert.assertEquals(VerifysecondCovid19IndiaLink,prop.getProperty("covidUrl"));
			
		//	Wait.Pause(500);

}

	
	
	

	
	
	
	
	@Test(priority=6)
	public void Covid19IndiaLinkNavigation() throws InterruptedException {
		
		
		
		
		
			String Covid19IndiaLinkNavigationUrl = AboutUsPageObject.Covid19IndiaLinkNavigation();
			
			System.out.println(Covid19IndiaLinkNavigationUrl);

//			Assert.assertEquals(Covid19IndiaLinkNavigationUrl,"https://www.covid19india.org/");
//			
//			TestUtil.ClickbackButtonOnBrowser();

			
		//	Wait.Pause(500);

	}
	
	
	
	@Test(priority=7)
	public void Covid19IndiaLinkNavigation2() throws InterruptedException {
		
		
			String Covid19IndiaLinkNavigation2 = AboutUsPageObject.Covid19IndiaLinkNavigation2();
			
			System.out.println(Covid19IndiaLinkNavigation2);

			//Assert.assertEquals(Covid19IndiaLinkNavigation2,"https://www.covid19india.org/");
			
			//Wait.Pause(5000);
			
			//TestUtil.ClickbackButtonOnBrowser();
			
			//Wait.Pause(500);

			
	}


	
	@Test(priority=8)
	public void VerifyApisLink() throws InterruptedException {
		
		
		
		
		
			String VerifyApisLink = AboutUsPageObject.VerifyApisLink();
			
			System.out.println(VerifyApisLink);

			Assert.assertEquals(VerifyApisLink,prop.getProperty("apisurl"));
			
			//Wait.Pause(500);


			}
	
	
	
	@Test(priority=9)
	public void VerifyApisLinkNavigation() throws InterruptedException {
		
		
			String VerifyApisLinkNavigation = AboutUsPageObject.VerifyApisLinkNavigation();
			
			System.out.println(VerifyApisLinkNavigation);

			Assert.assertEquals(VerifyApisLinkNavigation,prop.getProperty("apisurl"));
			
			//Wait.Pause(500);
			
			TestUtil.ClickbackButtonOnBrowser();
}


	@Test(priority=10)
	public void VerifyCOVIDPatientDataTitleUnderAboutUsPAge() throws InterruptedException {
		
		
			String VerifyCOVIDPatientDataTitleUnderAboutUsPAge = AboutUsPageObject.VerifyCOVIDPatientDataTitleUnderAboutUsPAge();
			
			System.out.println(VerifyCOVIDPatientDataTitleUnderAboutUsPAge);

			Assert.assertEquals(VerifyCOVIDPatientDataTitleUnderAboutUsPAge,prop.getProperty("COVIDPatientDataTitle"));
			
		//	Wait.Pause(500);
			

	}

	
	@Test(priority=11)
	public void VerifyCOVIDPatientDataNavigationUnderAboutUsPAge() throws InterruptedException {
		
		
			String VerifyCOVIDPatientDataNavigationUnderAboutUsPAge = AboutUsPageObject.VerifyCOVIDPatientDataNavigationUnderAboutUsPAge();
			
			System.out.println(VerifyCOVIDPatientDataNavigationUnderAboutUsPAge);

			Assert.assertEquals(VerifyCOVIDPatientDataNavigationUnderAboutUsPAge,prop.getProperty("COVIDPatientDataNavigationUnderAboutUsPAge"));
			
			//Wait.Pause(500);
			
			TestUtil.ClickbackButtonOnBrowser();

	}


	
	
	

   
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		
	//	Wait.Pause(500);

		driver.quit();

	}
	
	
	
	
}
