package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.Wait;
import com.covid19.qa.pages.AboutUsPage;

public class AboutUsPageTaseCase extends TestBase{
	
	AboutUsPage  AboutUsPageObject ;
	

	
	public AboutUsPageTaseCase(){
		super();
	}

	
		
	@BeforeMethod
	public void setUp(){
		initialization();
		AboutUsPageObject = new AboutUsPage();	
	}


	
	@Test(priority=1)
	public void AbouUsPageNavigation() throws InterruptedException {
		
		String TitleAboutUsPage =AboutUsPageObject.AboutUsLinkClick();
		
		
		Assert.assertEquals(TitleAboutUsPage, "About Us");
		
		System.out.println("Title of the AboutUsPage is : " +TitleAboutUsPage);

		Wait.Pause(2000);
	}
	
	
	
	@Test(priority=2)
	public void ValidateAbouUsPageUrl()  {
		
		//AboutUsPageObject.AboutUsLinkClick();
		
		String TitleAboutUsPageUrl = AboutUsPageObject.AboutUsPageUrl();
		
		
		Assert.assertEquals(TitleAboutUsPageUrl, "https://covid19database.srijan.net/about-us");
		
		System.out.println("Title of the Page is : " + TitleAboutUsPageUrl);

	}
	
	

	
	@Test(priority=3)
	public void ValidateAbouUsPageLogo() throws InterruptedException {
		
		//AboutUsPageObject.AboutUsLinkClick();
		
			boolean flag = AboutUsPageObject.AboutUsPageLOGO();
			Assert.assertTrue(flag);
			System.out.println("AbouUs page logo is displayed");
			
			//prop.getProperty("url");
	}

	
   

	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		
		
		driver.quit();

		Wait.Pause(2000);
	}
	
	
	
	
}
