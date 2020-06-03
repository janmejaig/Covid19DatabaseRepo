package com.covid19.qa.HomePageTestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;
import com.covid19.qa.pages.AboutUsPage;
import com.covid19.qa.pages.AdvanceSearchHomePage;

public class AdvanceSearchFunction extends TestBase {

	
	
	
	AdvanceSearchHomePage AdvanceSearchHomePageObject; 
	
	public AdvanceSearchFunction(){
		super();
		
}

	
	@BeforeClass
	public void setup() {
		
		initialization();
		
		AdvanceSearchHomePageObject = new AdvanceSearchHomePage();
	}

	
	@Test(priority = 1)
	public void AdvanceSearch_function() throws InterruptedException {
		
		//logger=extent.createTest("AdvanceSearch_function");


		// Advance Search title

		String ButtonTitle = AdvanceSearchHomePageObject.AdvnaceSearchButtonTitle();

		System.out.println(ButtonTitle);

		Assert.assertEquals(ButtonTitle, prop.getProperty("ButtonTitle"));

		AdvanceSearchHomePageObject.AdvnaceSearchExpandButton();
	}

	@Test(priority = 2)
	public void VerifypaitentIDequaltoPlaceholdertext() throws InterruptedException {

		String VerifypaitentIDequaltoPlaceholdertext = AdvanceSearchHomePageObject
				.VerifypaitentIDequaltoPlaceholdertext();

		System.out.println(VerifypaitentIDequaltoPlaceholdertext);
		Assert.assertEquals(VerifypaitentIDequaltoPlaceholdertext,
				prop.getProperty("VerifypaitentIDequaltoPlaceholdertext"));

		TestUtil.Pause(500);

	}

	@Test(priority = 3)
	public void VerifyPaitentIDPLaceholderText_function() throws InterruptedException {

		String VerifyPaitentIDPLaceholderText = AdvanceSearchHomePageObject.VerifyPaitentIDPLaceholderText();
		System.out
				.println("VerifyPaitentIDPLaceholderText for textfield2 of paitentID" + VerifyPaitentIDPLaceholderText);

		Assert.assertEquals(VerifyPaitentIDPLaceholderText, prop.getProperty("PaitentID"));

		AdvanceSearchHomePageObject.PaitentIDSelectEqualtoOperator();

		AdvanceSearchHomePageObject.InputPaitentID();

	}

	@Test(priority = 4)
	public void VerifyStatePatientIDTitle() throws InterruptedException {

		String VerifyStatePatientIDTitle = AdvanceSearchHomePageObject.VerifyStatePatientIDTitle();

		System.out.println(VerifyStatePatientIDTitle);

		Assert.assertEquals(VerifyStatePatientIDTitle, prop.getProperty("StatePatientID"));
	}

	// VerifyStatePatientIDPlace holder text

	@Test(priority = 5)
	public void VerifyStatePatientIDPlaceHoldertext() throws InterruptedException {

		String VerifyStatePatientIDPlaceHoldertext = AdvanceSearchHomePageObject.VerifyStatePatientIDPlaceHoldertext();

		System.out.println(VerifyStatePatientIDPlaceHoldertext);

		Assert.assertEquals(VerifyStatePatientIDPlaceHoldertext, prop.getProperty("StatePatientID"));

		AdvanceSearchHomePageObject.StatePatientNumberInput();

	}

	// District title

	@Test(priority = 6)
	public void VerifyDistrictTitle() throws InterruptedException {

		String DistrictTitle = AdvanceSearchHomePageObject.VerifyDistrictTitle();

		System.out.println("this is district title name " + DistrictTitle);

		Assert.assertEquals(DistrictTitle, prop.getProperty("DistrictTitle"));

		// District title place holder text

		String VerifyDistrictPlaceHolderText = AdvanceSearchHomePageObject.VerifyDistrictPlaceHolderText();

		System.out.println(VerifyDistrictPlaceHolderText);

		Assert.assertEquals(VerifyDistrictPlaceHolderText, prop.getProperty("DistrictTitle"));

		AdvanceSearchHomePageObject.InputDistrictName();

	}

	@Test(priority = 7)
	public void VerifyCityTitle() throws InterruptedException {

		String VerifyCityTitle = AdvanceSearchHomePageObject.VerifyCityTitle();

		System.out.println(VerifyCityTitle);

		Assert.assertEquals(VerifyCityTitle, prop.getProperty("CityTitle"));

	}

	@Test(priority = 8)
	public void VerifyCityPlaceHolderText() throws InterruptedException {

		String VerifyCityPlaceHolderText = AdvanceSearchHomePageObject.VerifyCityPlaceHolderText();

		System.out.println(VerifyCityPlaceHolderText);

		Assert.assertEquals(VerifyCityPlaceHolderText, prop.getProperty("CityTitle"));

		AdvanceSearchHomePageObject.InputCityName();

	}

	@Test(priority = 9)
	public void VerifyZipcodeTitle() throws InterruptedException {

		String VerifyZipcodeTitle = AdvanceSearchHomePageObject.VerifyZipcodeTitle();

		System.out.println(VerifyZipcodeTitle);

		Assert.assertEquals(VerifyZipcodeTitle, prop.getProperty("Zipcode"));
	}

	@Test(priority = 10)
	public void VerifyZipcodePlaceholderText() throws InterruptedException {

		String VerifyZipcodePlaceholderText = AdvanceSearchHomePageObject.VerifyZipcodePlaceholderText();

		System.out.println(VerifyZipcodePlaceholderText);

		Assert.assertEquals(VerifyZipcodePlaceholderText, prop.getProperty("Zipcode"));

	}

	@Test(priority = 11)
	public void VerifyAgeEqualToPlaceholderText() throws InterruptedException {

		String VerifyAgeEqualToPlaceholderText = AdvanceSearchHomePageObject.VerifyAgeEqualToPlaceholderText();

		System.out.println(VerifyAgeEqualToPlaceholderText);

		Assert.assertEquals(VerifyAgeEqualToPlaceholderText, prop.getProperty("VerifypaitentIDequaltoPlaceholdertext"));
		AdvanceSearchHomePageObject.SelectAgeEqualtoOperator();

	}

	@Test(priority = 12)
	public void VerifyInputTextfieldPlaceholderText() throws InterruptedException {

		String VerifyInputTextfieldPlaceholderText = AdvanceSearchHomePageObject.VerifyInputTextfieldPlaceholderText();

		System.out.println(VerifyInputTextfieldPlaceholderText);

		Assert.assertEquals(VerifyInputTextfieldPlaceholderText, prop.getProperty("age"));

		AdvanceSearchHomePageObject.InputAge();

	}

	@Test(priority = 13)
	public void VerifyDateAnnouncedequaltoPlaceholderText() throws InterruptedException {

		String VerifyDateAnnouncedequaltoPlaceholderText = AdvanceSearchHomePageObject
				.VerifyDateAnnouncedequaltoPlaceholderText();

		System.out.println(VerifyDateAnnouncedequaltoPlaceholderText);

		Assert.assertEquals(VerifyDateAnnouncedequaltoPlaceholderText, prop.getProperty("verifyequalto"));

		AdvanceSearchHomePageObject.DateAnnouncedEqualtoOperator();

	}

	@Test(priority = 14)
	public void VerifyDateAnnouncedInputFieldPlaceholderText() throws InterruptedException {

		String VerifyDateAnnouncedInputFieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyDateAnnouncedInputFieldPlaceholderText();

		System.out.println(VerifyDateAnnouncedInputFieldPlaceholderText);

		Assert.assertEquals(VerifyDateAnnouncedInputFieldPlaceholderText, prop.getProperty("verifydateannounce"));

		AdvanceSearchHomePageObject.DateAnnounced();

	}

	@Test(priority = 15)
	public void VerifyStatusChangeDatePlaceholderText() throws InterruptedException {

		String VerifyStatusChangeDatePlaceholderText = AdvanceSearchHomePageObject
				.VerifyStatusChangeDatePlaceholderText();

		System.out.println(VerifyStatusChangeDatePlaceholderText);

		Assert.assertEquals(VerifyStatusChangeDatePlaceholderText, prop.getProperty("verifyequalto"));

	}

	@Test(priority = 16)
	public void VerifyStatusChangeDateInputTextFieldPlaceholderText() throws InterruptedException {

		String VerifyStatusChangeDateInputTextFieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyStatusChangeDateInputTextFieldPlaceholderText();

		System.out.println(VerifyStatusChangeDateInputTextFieldPlaceholderText);

		Assert.assertEquals(VerifyStatusChangeDateInputTextFieldPlaceholderText, "Status Change Date");

		String VerifySearchButton = AdvanceSearchHomePageObject.VerifySearchButton();

		System.out.println(VerifySearchButton);

		Assert.assertEquals(VerifySearchButton, prop.getProperty("verifySearch"));

		AdvanceSearchHomePageObject.clickSearch();

		TestUtil.Pause(5000);

		AdvanceSearchHomePageObject.AdvnaceSearchExpandButton();

		TestUtil.Pause(500);

		AdvanceSearchHomePageObject.PaitentIDIsBetweenOperator();

		TestUtil.Pause(500);

	}

	@Test(priority = 17)
	public void VerifyPaitentIDMinPLaceholderText() throws InterruptedException {

		String VerifyPaitentIDMinPLaceholderText = AdvanceSearchHomePageObject.VerifyPaitentIDMinPLaceholderText();

		System.out.println(VerifyPaitentIDMinPLaceholderText);

		Assert.assertEquals(VerifyPaitentIDMinPLaceholderText, prop.getProperty("PaitentID"));

		// TestUtil.Pause(500);

	}

	@Test(priority = 18)
	public void VerifyPaitentIDMaxPLaceholderText() throws InterruptedException {

		String VerifyPaitentIDMaxPLaceholderText = AdvanceSearchHomePageObject.VerifyPaitentIDMaxPLaceholderText();

		System.out.println(VerifyPaitentIDMaxPLaceholderText);

		Assert.assertEquals(VerifyPaitentIDMaxPLaceholderText, prop.getProperty("PaitentID"));

		AdvanceSearchHomePageObject.InputPaitentIDMinimumValue();

		AdvanceSearchHomePageObject.InputPaitentIDMaximumValue();

		AdvanceSearchHomePageObject.SelectAgeBetweenOperator();

	}

	@Test(priority = 19)
	public void VerifyAgeMinInputFieldPlaceholderText() throws InterruptedException {

		String VerifyAgeMinInputFieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyAgeMinInputFieldPlaceholderText();

		System.out.println(VerifyAgeMinInputFieldPlaceholderText);

		Assert.assertEquals(VerifyAgeMinInputFieldPlaceholderText, prop.getProperty("minage"));

	}

	@Test(priority = 20)
	public void VerifyAgeMaxInputFieldPlaceholderText() throws InterruptedException {

		String VerifyAgeMaxInputFieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyAgeMaxInputFieldPlaceholderText();

		System.out.println(VerifyAgeMaxInputFieldPlaceholderText);

		Assert.assertEquals(VerifyAgeMaxInputFieldPlaceholderText, prop.getProperty("maxage"));

		AdvanceSearchHomePageObject.InputAgeMinimumValue();
		AdvanceSearchHomePageObject.InputAgeMaximumValue();

	}

	@Test(priority = 21)
	public void VerifyDateAnnouncedMinInputFieldPlaceholderText() throws InterruptedException {

		AdvanceSearchHomePageObject.SelectDateAnnouncedIsbetweenOperator();

		String VerifyDateAnnouncedMinInputFieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyDateAnnouncedMinInputFieldPlaceholderText();

		System.out.println(VerifyDateAnnouncedMinInputFieldPlaceholderText);

		Assert.assertEquals(VerifyDateAnnouncedMinInputFieldPlaceholderText, prop.getProperty("verifydateannounce"));
	}

	@Test(priority = 22)
	public void VerifyDateAnnouncedMaxInputFieldPlaceholderText() throws InterruptedException {

		String VerifyDateAnnouncedMaxInputFieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyDateAnnouncedMaxInputFieldPlaceholderText();

		System.out.println(VerifyDateAnnouncedMaxInputFieldPlaceholderText);

		Assert.assertEquals(VerifyDateAnnouncedMaxInputFieldPlaceholderText, prop.getProperty("verifydateannounce"));

	}

	@Test(priority = 23)
	public void VerifyStatusChangeDateMinInputtextfieldPlaceholderText() throws InterruptedException {

		driver.findElement(By.xpath("//select[@name='field_status_change_date_value_op'][1]//option[2]")).click();

		TestUtil.Pause(50);

	}

	@Test(priority = 24)
	public void VerifyStatusChangeDateMinInputtextfieldPlaceholderText1() throws InterruptedException {

		String VerifyStatusChangeDateMinInputtextfieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyStatusChangeDateMinInputtextfieldPlaceholderText();

		System.out.println(VerifyStatusChangeDateMinInputtextfieldPlaceholderText);

		Assert.assertEquals(VerifyStatusChangeDateMinInputtextfieldPlaceholderText, prop.getProperty("statuschange"));

	}

	@Test(priority = 25)
	public void VerifyStatusChangeDateMaxInputtextfieldPlaceholderText() throws InterruptedException {

		String VerifyStatusChangeDateMaxInputtextfieldPlaceholderText = AdvanceSearchHomePageObject
				.VerifyStatusChangeDateMaxInputtextfieldPlaceholderText();

		System.out.println(VerifyStatusChangeDateMaxInputtextfieldPlaceholderText);

		Assert.assertEquals(VerifyStatusChangeDateMaxInputtextfieldPlaceholderText, prop.getProperty("statuschange"));

		String VerifySearchButton = AdvanceSearchHomePageObject.VerifySearchButton();

		System.out.println(VerifySearchButton);

		Assert.assertEquals(VerifySearchButton, "Search");

		String VerifyResetButton = AdvanceSearchHomePageObject.VerifyResetButton();

		System.out.println(VerifyResetButton);

		Assert.assertEquals(VerifyResetButton, "Reset");

		AdvanceSearchHomePageObject.clickSearch();

		String title = AdvanceSearchHomePageObject.PaitentIDVisible();
		Assert.assertEquals(title, "Patient Id");
		System.out.println("Paitent ID visible in the grid:" + title);

		String title2 = AdvanceSearchHomePageObject.StatePaitentIDVisible();
		Assert.assertEquals(title2, "State Patient Id");
		System.out.println("State Paitent ID visible in the grid:" + title2);

		String title3 = AdvanceSearchHomePageObject.AgeVisible();
		Assert.assertEquals(title3, "Age");
		System.out.println("Age visible in the grid:" + title3);

		String title4 = AdvanceSearchHomePageObject.GenderVisible();
		Assert.assertEquals(title4, "Gender");
		System.out.println("Gender visible in the grid:" + title4);

		String title5 = AdvanceSearchHomePageObject.NationalityVisible();
		Assert.assertEquals(title5, "Nationality");
		System.out.println("Nationality header visible in the grid:" + title5);

		String title6 = AdvanceSearchHomePageObject.StateVisible();
		Assert.assertEquals(title6, "State");
		System.out.println("State header visible in the grid:" + title6);

		String title7 = AdvanceSearchHomePageObject.DistrictVisible();
		Assert.assertEquals(title7, "District");
		System.out.println("District header visible in the grid:" + title7);

		String title8 = AdvanceSearchHomePageObject.CityVisible();
		Assert.assertEquals(title8, "City");
		System.out.println("City header visible in the grid:" + title8);

		String title9 = AdvanceSearchHomePageObject.ZipcodeVisible();
		Assert.assertEquals(title9, "Zip Code");
		System.out.println("ZipCode header visible in the grid:" + title9);

		String title10 = AdvanceSearchHomePageObject.TransmissionType();
		Assert.assertEquals(title10, "Transmission Type");
		System.out.println("TransmissionType header visible in the grid:" + title10);

		String title11 = AdvanceSearchHomePageObject.ClusterHeadingVisible();
		Assert.assertEquals(title11, "Clusters");
		System.out.println("Clusters header visible in the grid:" + title11);

		String title12 = AdvanceSearchHomePageObject.CurrentStatusHeadingVisible();
		Assert.assertEquals(title12, "Current Status");
		System.out.println("Current Status header visible in the grid:" + title12);

		String title13 = AdvanceSearchHomePageObject.AnnouncedDateHeadingVisible();
		Assert.assertEquals(title13, "Announced Date");
		System.out.println("AnnouncedDate header visible in the grid:" + title13);

		String title14 = AdvanceSearchHomePageObject.ActionsHeadingVisible();
		Assert.assertEquals(title14, "Actions");
		System.out.println("Actions header visible in the grid:" + title14);
	}

	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
}
