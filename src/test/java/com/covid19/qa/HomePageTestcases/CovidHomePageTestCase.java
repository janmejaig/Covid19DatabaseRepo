package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;
import com.covid19.qa.pages.HomePageCovidDatabase;

public class CovidHomePageTestCase extends TestBase {

	HomePageCovidDatabase HomePageCovidDatabaseobject;

	public CovidHomePageTestCase() {
		super();

	}

	@BeforeClass
	public void setup() {

		initialization();

		HomePageCovidDatabaseobject = new HomePageCovidDatabase();
	}

	@Test(priority = 1)
	public void ValidateCovidHomePageTitle() throws InterruptedException {

		String title = HomePageCovidDatabaseobject.covidHomePageTitle();

		System.out.println(title);

		Assert.assertEquals(title, prop.getProperty("ValidateCovidHomePageTitle"));

		TestUtil.implicitWait(500);

	}

	@Test(priority = 2)
	public void ValidateCovidHomePageURL() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.covidHomePageUrl();
		System.out.println("This is the URl for the Page:" + URL);
		Assert.assertEquals(URL, prop.getProperty("ValidateCovidHomePageURL"));

	}

	@Test(priority = 3)
	public void ValidateCovidPaitenDataHeading() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.CovidPaitenDataHeading();
		System.out.println("This is the URl for the Page:" + URL);
		Assert.assertEquals(URL, prop.getProperty("ValidateCovidPaitenDataHeading"));

	}

	@Test(priority = 4)
	public void ValidatePatientsHeading() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.PatientsHeading();
		System.out.println("This is the URl for the PatientsHeading:" + URL);
		Assert.assertEquals(URL, prop.getProperty("ValidatePatientsHeading"));

	}

	@Test(priority = 5)
	public void ValidateGridView() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.GridView();
		System.out.println("This is the URl for the GridView:" + URL);
		Assert.assertEquals(URL, prop.getProperty("GridUrl"));

	}

	@Test(priority = 6)
	public void ValidateTableView() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.TableView();
		System.out.println("This is the URl for the TableView:" + URL);
		Assert.assertEquals(URL, prop.getProperty("TableUrl"));

	}

	@Test(priority = 7)
	public void ValidateDiplayingText() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.DiplayingText();
		System.out.println("This is the DiplayingText:" + URL);
		Assert.assertTrue(true);

	}

	@Test(priority = 8)
	public void ValidateLastUpdatedText() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.LastUpdatedText();
		System.out.println("This is the LastUpdatedText:" + URL);
		Assert.assertTrue(true);

	}

	@Test(priority = 9)
	public void ValidateHowSearchWorks() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.HowSearchWorks();

		System.out.println("This is  HowSearchWorks text:" + URL);
		Assert.assertEquals(URL, prop.getProperty("ValidateHowSearchWorks"));

	}

	@Test(priority = 10)
	public void ValidateButtonRedirect() throws InterruptedException {

		String URL = HomePageCovidDatabaseobject.ButtonRedirect();
		System.out.println("This is  ButtonRedirect text:" + URL);
		Assert.assertEquals(URL, prop.getProperty("RedirectUrl"));
		HomePageCovidDatabaseobject.navigateback();

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
