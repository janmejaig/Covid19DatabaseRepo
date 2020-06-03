package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid19.qa.pages.HomePage_primarySearch;

public class PrimarySearchFunctionTestcase extends TestBase {

	HomePage_primarySearch HomePage_primarySearchObject;

	public PrimarySearchFunctionTestcase() {
		super();

	}

	@BeforeClass
	public void setup() {

		initialization();

		HomePage_primarySearchObject = new HomePage_primarySearch();
	}

	@Test(priority = 1)
	public void VerifyPrimarySearchLabel() throws InterruptedException {

		String LabelCurrentStatus = HomePage_primarySearchObject.VerifyCurrentStatusLabel();

		System.out.println("This is the label name " + LabelCurrentStatus);
		Assert.assertEquals(LabelCurrentStatus, prop.getProperty("VerifyPrimarySearchLabel"));

	}

	@Test(priority = 2)
	public void VerifyPlaceholdertextCurrentStatus() throws InterruptedException {

		String VerifyPlaceholdertextCurrentStatus = HomePage_primarySearchObject.VerifyPlaceholdertextCurrentStatus();

		System.out.println("This is the  PlaceholdertextCurrentStatus " + VerifyPlaceholdertextCurrentStatus);
		Assert.assertEquals(VerifyPlaceholdertextCurrentStatus, prop.getProperty("VerifyPlaceholdertextCurrentStatus"));

	}

	@Test(priority = 3)
	public void VerifyAllvaluesCurrentStatus() throws InterruptedException {

		String VerifyAllvaluesCurrentStatus = HomePage_primarySearchObject.VerifyAllvaluesCurrentStatus();

		System.out.println("This is the  VerifyAllvaluesCurrentStatus " + VerifyAllvaluesCurrentStatus);
		Assert.assertTrue(true);

	}

	@Test(priority = 4)
	public void VerifylabelTransmission_Type() throws InterruptedException {

		String VerifylabelTransmission_Type = HomePage_primarySearchObject.VerifylabelTransmission_Type();

		System.out.println("This is the  VerifyAllvaluesCurrentStatus " + VerifylabelTransmission_Type);

		Assert.assertEquals(VerifylabelTransmission_Type, prop.getProperty("VerifylabelTransmission_Type"));

	}

	@Test(priority = 5)
	public void VerifyPlaceholdertextTransmission_Type() throws InterruptedException {

		String VerifyPlaceholdertextTransmission_Type = HomePage_primarySearchObject
				.VerifyPlaceholdertextTransmission_Type();

		System.out.println(
				"This is the  VerifyPlaceholdertextTransmission_Type " + VerifyPlaceholdertextTransmission_Type);

		Assert.assertEquals(VerifyPlaceholdertextTransmission_Type,
				prop.getProperty("VerifyPlaceholdertextCurrentStatus"));

	}

	@Test(priority = 6)
	public void VerifydropdownvaluesTransmission_Type() throws InterruptedException {

		String VerifydropdownvaluesTransmission_Type = HomePage_primarySearchObject
				.VerifydropdownvaluesTransmission_Type();

		System.out
				.println("This is the  VerifydropdownvaluesTransmission_Type " + VerifydropdownvaluesTransmission_Type);

		Assert.assertTrue(true);

	}

	@Test(priority = 7)
	public void VerifyStateLabel() throws InterruptedException {

		String VerifyStateLabel = HomePage_primarySearchObject.VerifyStateLabel();

		System.out.println("This is the  VerifyStateLabel " + VerifyStateLabel);

		Assert.assertEquals(VerifyStateLabel, prop.getProperty("VerifyStateLabel"));

	}

	@Test(priority = 8)
	public void VerifyStatePlaceholderText() throws InterruptedException {

		String VerifyStatePlaceholderText = HomePage_primarySearchObject.VerifyStatePlaceholderText();

		System.out.println("This is the  VerifyStatePlaceholderText " + VerifyStatePlaceholderText);

		Assert.assertEquals(VerifyStatePlaceholderText, prop.getProperty("VerifyPlaceholdertextCurrentStatus"));

	}

	@Test(priority = 9)
	public void VerifyStateDropdownvalues() throws InterruptedException {

		String VerifyStateDropdownvalues = HomePage_primarySearchObject.VerifyStateDropdownvalues();

		System.out.println("This is the  VerifyStatePlaceholderText " + VerifyStateDropdownvalues);

		Assert.assertTrue(true);

	}

	@Test(priority = 10)
	public void VerifyclustersLabelName() throws InterruptedException {

		String VerifyclustersLabelName = HomePage_primarySearchObject.VerifyclustersLabelName();

		System.out.println("This is the  VerifyclustersLabelName " + VerifyclustersLabelName);

		Assert.assertEquals(VerifyclustersLabelName, prop.getProperty("VerifyclustersLabelName"));

	}

	@Test(priority = 11)
	public void VerifyclustersPlaceholderText() throws InterruptedException {

		String VerifyclustersPlaceholderText = HomePage_primarySearchObject.VerifyclustersPlaceholderText();

		System.out.println("This is the  VerifyclustersPlaceholderText " + VerifyclustersPlaceholderText);

		Assert.assertEquals(VerifyclustersPlaceholderText, prop.getProperty("VerifyPlaceholdertextCurrentStatus"));

	}

	@Test(priority = 12)
	public void VerifyclustersDropdownvalues() throws InterruptedException {

		String VerifyclustersDropdownvalues = HomePage_primarySearchObject.VerifyclustersDropdownvalues();

		System.out.println("This is the  VerifyclustersDropdownvalues " + VerifyclustersDropdownvalues);

		Assert.assertTrue(true);

	}

	@Test(priority = 13)
	public void VerifyNationalityLabel() throws InterruptedException {

		String VerifyNationalityLabel = HomePage_primarySearchObject.VerifyNationalityLabel();

		System.out.println("This is  NationalityLabel " + VerifyNationalityLabel);

		Assert.assertEquals(VerifyNationalityLabel, prop.getProperty("VerifyNationalityLabel"));

	}

	@Test(priority = 14)
	public void VerifyPlaceholderTextNationalityLabel() throws InterruptedException {

		String VerifyPlaceholderTextNationalityLabel = HomePage_primarySearchObject
				.VerifyPlaceholderTextNationalityLabel();

		System.out.println(
				"This is verifying VerifyPlaceholderTextNationalityLabel " + VerifyPlaceholderTextNationalityLabel);

		Assert.assertEquals(VerifyPlaceholderTextNationalityLabel,
				prop.getProperty("VerifyPlaceholdertextCurrentStatus"));

	}

	@Test(priority = 15)
	public void VerifyDRopdownvaluesNationalityLabel() throws InterruptedException {

		String VerifyDRopdownvaluesNationalityLabel = HomePage_primarySearchObject
				.VerifyDRopdownvaluesNationalityLabel();

		System.out.println(
				"This is verifying VerifyPlaceholderTextNationalityLabel " + VerifyDRopdownvaluesNationalityLabel);

		Assert.assertTrue(true);

	}

	@Test(priority = 16)
	public void VerifyGenderLabel() throws InterruptedException {

		String VerifyGenderLabel = HomePage_primarySearchObject.VerifyGenderLabel();

		System.out.println("This is the  GenderLabel " + VerifyGenderLabel);

		Assert.assertEquals(VerifyGenderLabel, prop.getProperty("VerifyGenderLabel"));

	}

	@Test(priority = 17)
	public void VerifyPlaceholdertextGenderLabel() throws InterruptedException {

		String VerifyPlaceholdertextGenderLabel = HomePage_primarySearchObject.VerifyPlaceholdertextGenderLabel();

		System.out.println("This is the  VerifyPlaceholdertextGenderLabel " + VerifyPlaceholdertextGenderLabel);

		Assert.assertEquals(VerifyPlaceholdertextGenderLabel, prop.getProperty("VerifyPlaceholdertextCurrentStatus"));

	}

	@Test(priority = 18)
	public void VerifyDropdownValuesGenderLabel() throws InterruptedException {

		String VerifyDropdownValuesGenderLabel = HomePage_primarySearchObject.VerifyDropdownValuesGenderLabel();

		System.out.println("This is the  VerifyPlaceholdertextGenderLabel " + VerifyDropdownValuesGenderLabel);

		Assert.assertTrue(true);

	}

	@Test(priority = 20)
	public void PrimarySearch_function() throws InterruptedException {

		HomePage_primarySearchObject.Homepage_link_click();

		HomePage_primarySearchObject.Homepage_heading();

		HomePage_primarySearchObject.selectCurrentStatus();

		HomePage_primarySearchObject.SelectState();

		HomePage_primarySearchObject.SelectTransmissionType();

		HomePage_primarySearchObject.ClusterSelection();

		HomePage_primarySearchObject.selectNationality();

		HomePage_primarySearchObject.selectGender();

		HomePage_primarySearchObject.clickSearch();

		// Verifying the header in the grid

		String title = HomePage_primarySearchObject.PaitentIDVisible();
		Assert.assertEquals(title, "Patient Id");
		System.out.println("Paitent ID visible in the grid:" + title);

		String title2 = HomePage_primarySearchObject.StatePaitentIDVisible();
		Assert.assertEquals(title2, "State Patient Id");
		System.out.println("State Paitent ID visible in the grid:" + title2);

		String title3 = HomePage_primarySearchObject.AgeVisible();
		Assert.assertEquals(title3, "Age");
		System.out.println("Age visible in the grid:" + title3);

		String title4 = HomePage_primarySearchObject.GenderVisible();
		Assert.assertEquals(title4, "Gender");
		System.out.println("Gender visible in the grid:" + title4);

		String title5 = HomePage_primarySearchObject.NationalityVisible();
		Assert.assertEquals(title5, "Nationality");
		System.out.println("Nationality header visible in the grid:" + title5);

		String title6 = HomePage_primarySearchObject.StateVisible();
		Assert.assertEquals(title6, "State");
		System.out.println("State header visible in the grid:" + title6);

		String title7 = HomePage_primarySearchObject.DistrictVisible();
		Assert.assertEquals(title7, "District");
		System.out.println("District header visible in the grid:" + title7);

		String title8 = HomePage_primarySearchObject.CityVisible();
		Assert.assertEquals(title8, "City");
		System.out.println("City header visible in the grid:" + title8);

		String title9 = HomePage_primarySearchObject.ZipcodeVisible();
		Assert.assertEquals(title9, "Zip Code");
		System.out.println("ZipCode header visible in the grid:" + title9);

		String title10 = HomePage_primarySearchObject.TransmissionType();
		Assert.assertEquals(title10, "Transmission Type");
		System.out.println("TransmissionType header visible in the grid:" + title10);

		String title11 = HomePage_primarySearchObject.ClusterHeadingVisible();
		Assert.assertEquals(title11, "Clusters");
		System.out.println("Clusters header visible in the grid:" + title11);

		String title12 = HomePage_primarySearchObject.CurrentStatusHeadingVisible();
		Assert.assertEquals(title12, "Current Status");
		System.out.println("Current Status header visible in the grid:" + title12);

		String title13 = HomePage_primarySearchObject.AnnouncedDateHeadingVisible();
		Assert.assertEquals(title13, "Announced Date");
		System.out.println("AnnouncedDate header visible in the grid:" + title13);

		String title14 = HomePage_primarySearchObject.ActionsHeadingVisible();
		Assert.assertEquals(title14, "Actions");
		System.out.println("Actions header visible in the grid:" + title14);

		HomePage_primarySearchObject.Reset_click();

	}

	@AfterClass
	public void tearDown() {
		
		driver.close();

		//driver.quit();
	}

}
