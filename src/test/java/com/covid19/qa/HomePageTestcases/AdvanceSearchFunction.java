package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.Wait;
import com.covid19.qa.pages.AdvanceSearchHomePage;
import com.covid19.qa.pages.HomePage_primarySearch;

public class AdvanceSearchFunction extends TestBase {

	AdvanceSearchHomePage  AdvanceSearchHomePageObject ;
	
	
	public AdvanceSearchFunction(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		AdvanceSearchHomePageObject = new AdvanceSearchHomePage();	
	}
	
	
	@Test(priority=1)
	public void AdvanceSearch_function() throws InterruptedException {
	
    
 //Advance Search 
       
      String ButtonTitle =  AdvanceSearchHomePageObject.AdvnaceSearchButtonTitle();
       
       System.out.println(ButtonTitle);
       
       Assert.assertEquals(ButtonTitle, "Advanced Search");
       
       AdvanceSearchHomePageObject.AdvnaceSearchExpandButton();
       
//       HomePage_primarySearchObject.AdvanceSectionBody();
//       
       
      // String PaitentIDLabelVisible = AdvanceSearchHomePageObject.PaitentIDLabelVisible();
      // Assert.assertEquals(PaitentIDLabelVisible, expected);
       
       //System.out.println("the Apitent id label visible:"+ PaitentIDLabelVisible);
       
       AdvanceSearchHomePageObject.PaitentIDSelectEqualtoOperator();
       
       Wait.Pause(2000);



      AdvanceSearchHomePageObject.InputPaitentID();
       
      AdvanceSearchHomePageObject.StatePatientNumberInput();
       
       AdvanceSearchHomePageObject.InputDistrictName();
       
       
      AdvanceSearchHomePageObject.InputCityName();
      
      AdvanceSearchHomePageObject.SelectAgeEqualtoOperator();
      
      Wait.Pause(200);


      
      AdvanceSearchHomePageObject.InputAge();
      
      Wait.Pause(200);


       
      //AdvanceSearchHomePageObject.InputZipCode();

     // Wait.Pause(2000);

      AdvanceSearchHomePageObject.DateAnnouncedEqualtoOperator(); 
       
      AdvanceSearchHomePageObject.DateAnnounced();
       
       
       Wait.Pause(2000);
       
       
       
       
      AdvanceSearchHomePageObject.clickSearch();
       
       
      Wait.Pause(2000);
//
//       
       AdvanceSearchHomePageObject.AdvnaceSearchExpandButton();
       
       AdvanceSearchHomePageObject.PaitentIDIsBetweenOperator();
       
       AdvanceSearchHomePageObject.InputPaitentIDMinimumValue();
       
       AdvanceSearchHomePageObject.InputPaitentIDMaximumValue();
       
       AdvanceSearchHomePageObject.SelectAgeBetweenOperator();
       
       AdvanceSearchHomePageObject.InputAgeMinimumValue();
       AdvanceSearchHomePageObject.InputAgeMaximumValue();
//       
       Wait.Pause(200);
//       
//

       
       AdvanceSearchHomePageObject.clickSearch();

       
       
     // AdvanceSearchHomePageObject.clickRangeSearchButton();


       Wait.Pause(2000);


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
 	  
       
       
       
       
       
      
       Wait.Pause(20);
       
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}}
	

	
		

	
	
