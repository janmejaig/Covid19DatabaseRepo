package com.covid19.qa.HomePageTestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
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

	@BeforeClass
	public void setUp(){
		initialization();
		AdvanceSearchHomePageObject = new AdvanceSearchHomePage();	
	}
	
	
	@Test(priority=1)
	public void AdvanceSearch_function() throws InterruptedException {
	
    
 //Advance Search title
       
      String ButtonTitle =  AdvanceSearchHomePageObject.AdvnaceSearchButtonTitle();
       
       System.out.println(ButtonTitle);
       
       Assert.assertEquals(ButtonTitle, "Advanced Search");
       
       AdvanceSearchHomePageObject.AdvnaceSearchExpandButton();
       
      
//       String PaitentIDTitle = AdvanceSearchHomePageObject.VerifypaitentIDTitle();
//       System.out.println(">>>>>>>>this is  paitnet ID title" +PaitentIDTitle);
//  
       
       Wait.Pause(500);

	
	}
	
	
	
	
	@Test(priority=2)
	public void VerifypaitentIDequaltoPlaceholdertext() throws InterruptedException {
	
		
 String VerifypaitentIDequaltoPlaceholdertext =  AdvanceSearchHomePageObject.VerifypaitentIDequaltoPlaceholdertext();
      
      System.out.println(VerifypaitentIDequaltoPlaceholdertext);       
     Assert.assertEquals(VerifypaitentIDequaltoPlaceholdertext, "Is equal to");
       
       
     Wait.Pause(500);

       
	}
       
      @Test(priority=3)
  	public void VerifyPaitentIDPLaceholderText_function() throws InterruptedException {
//   	
     String VerifyPaitentIDPLaceholderText =  AdvanceSearchHomePageObject.VerifyPaitentIDPLaceholderText();
     
    // String placeholder= driver.findElement(By.xpath("//input[@placeholder='Patient ID']")).getAttribute("placeholder");
     System.out.println("VerifyPaitentIDPLaceholderText for textfield2 of paitentID" + VerifyPaitentIDPLaceholderText);
     
     
     
     Assert.assertEquals(VerifyPaitentIDPLaceholderText, "Patient ID");
     
     Wait.Pause(500);
       
       AdvanceSearchHomePageObject.PaitentIDSelectEqualtoOperator();
       
      

      AdvanceSearchHomePageObject.InputPaitentID();
      
      
  }
      
    
      
      @Test(priority=4)
     	public void VerifyStatePatientIDTitle() throws InterruptedException {
    	 
      
      String VerifyStatePatientIDTitle =  AdvanceSearchHomePageObject.VerifyStatePatientIDTitle();
      
      System.out.println(VerifyStatePatientIDTitle);
      
      Assert.assertEquals(VerifyStatePatientIDTitle, "State Patient ID");
      
      Wait.Pause(500);

      
      }
      
      
    //VerifyStatePatientIDPlace holder text
      
      @Test(priority=5)
  	public void VerifyStatePatientIDPlaceHoldertext() throws InterruptedException {
      
      
      String VerifyStatePatientIDPlaceHoldertext =  AdvanceSearchHomePageObject.VerifyStatePatientIDPlaceHoldertext();
 
    
////String   PatientIDPlaceHoldertext =  driver.findElement(By.xpath("//input[@placeholder ='State Patient ID']")).getAttribute("State Patient ID");
    
   System.out.println(VerifyStatePatientIDPlaceHoldertext);
    
   Assert.assertEquals(VerifyStatePatientIDPlaceHoldertext, "State Patient ID");

AdvanceSearchHomePageObject.StatePatientNumberInput();

   
Wait.Pause(500);

      }
      
      //District title

      @Test(priority=6)
  	public void VerifyDistrictTitle() throws InterruptedException {
  
       
      
      
      String DistrictTitle =  AdvanceSearchHomePageObject.VerifyDistrictTitle();
      
      System.out.println("this is district title name "+ DistrictTitle);
      
     Assert.assertEquals(DistrictTitle, "District");
      
      
     Wait.Pause(500);

    
      //District title place holder text

         
        
      String VerifyDistrictPlaceHolderText =  AdvanceSearchHomePageObject.VerifyDistrictPlaceHolderText();
      
      System.out.println(VerifyDistrictPlaceHolderText);
      
   Assert.assertEquals(VerifyDistrictPlaceHolderText, "District");
      
    AdvanceSearchHomePageObject.InputDistrictName();

       
    Wait.Pause(500);

    
      }
       

      @Test(priority=7)
    	public void VerifyCityTitle() throws InterruptedException {
       
     String VerifyCityTitle =  AdvanceSearchHomePageObject.VerifyCityTitle();
     
     System.out.println(VerifyCityTitle);
     
   Assert.assertEquals(VerifyCityTitle, "City");
    
   Wait.Pause(500);
 
      }
   
      @Test(priority=8)
  	public void VerifyCityPlaceHolderText() throws InterruptedException {
  
   
   String   VerifyCityPlaceHolderText = AdvanceSearchHomePageObject.VerifyCityPlaceHolderText();
   
   System.out.println(VerifyCityPlaceHolderText);
   
   Assert.assertEquals(VerifyCityPlaceHolderText, "City");
    
      
       
      AdvanceSearchHomePageObject.InputCityName();
      
      }  
      
      @Test(priority=9)
    	public void VerifyZipcodeTitle() throws InterruptedException {
    
      String   VerifyZipcodeTitle = AdvanceSearchHomePageObject.VerifyZipcodeTitle();
      
      System.out.println(VerifyZipcodeTitle);
      
      Assert.assertEquals(VerifyZipcodeTitle, "Zip Code");
      }  
      
      @Test(priority=10)
  	public void VerifyZipcodePlaceholderText() throws InterruptedException {
  
 String   VerifyZipcodePlaceholderText = AdvanceSearchHomePageObject.VerifyZipcodePlaceholderText();
      
      System.out.println(VerifyZipcodePlaceholderText);
      
      Assert.assertEquals(VerifyZipcodePlaceholderText, "Zip Code");
     
      
      Wait.Pause(500);
      
      }

      
      
      @Test(priority=11)
   	public void VerifyAgeEqualToPlaceholderText() throws InterruptedException {
    
       String   VerifyAgeEqualToPlaceholderText = AdvanceSearchHomePageObject.VerifyAgeEqualToPlaceholderText();
      
      System.out.println(VerifyAgeEqualToPlaceholderText);
      
      Assert.assertEquals(VerifyAgeEqualToPlaceholderText, "Is equal to");
 

      

      
      AdvanceSearchHomePageObject.SelectAgeEqualtoOperator();
      
      Wait.Pause(500);

      
      }
      
      @Test(priority=12)
     	public void VerifyInputTextfieldPlaceholderText() throws InterruptedException {
      
         String   VerifyInputTextfieldPlaceholderText = AdvanceSearchHomePageObject.VerifyInputTextfieldPlaceholderText();
        
        System.out.println(VerifyInputTextfieldPlaceholderText);
        
        Assert.assertEquals(VerifyInputTextfieldPlaceholderText, "Age");
   
      
      
      


      
      AdvanceSearchHomePageObject.InputAge();
      
      Wait.Pause(500);

      
      }
      
       
      //AdvanceSearchHomePageObject.InputZipCode();

     // Wait.Pause(2000);
      
      @Test(priority=13)
   	public void VerifyDateAnnouncedequaltoPlaceholderText() throws InterruptedException {
    
       String   VerifyDateAnnouncedequaltoPlaceholderText = AdvanceSearchHomePageObject.VerifyDateAnnouncedequaltoPlaceholderText();
      
      System.out.println(VerifyDateAnnouncedequaltoPlaceholderText);
      
      Assert.assertEquals(VerifyDateAnnouncedequaltoPlaceholderText, "Is equal to");
 
      
      
      

      AdvanceSearchHomePageObject.DateAnnouncedEqualtoOperator(); 
      
      Wait.Pause(500);

      
      }
      
      
      @Test(priority=14)
     	public void VerifyDateAnnouncedInputFieldPlaceholderText() throws InterruptedException {
      
         String   VerifyDateAnnouncedInputFieldPlaceholderText = AdvanceSearchHomePageObject.VerifyDateAnnouncedInputFieldPlaceholderText();
        
        System.out.println(VerifyDateAnnouncedInputFieldPlaceholderText);
        
        Assert.assertEquals(VerifyDateAnnouncedInputFieldPlaceholderText, "Date Announced ");
   
      
      
      
       
      AdvanceSearchHomePageObject.DateAnnounced();
       
       
      Wait.Pause(500);
       
      }
      
      
       
       @Test(priority=15)
    	public void VerifyStatusChangeDatePlaceholderText() throws InterruptedException {
     
        String   VerifyStatusChangeDatePlaceholderText = AdvanceSearchHomePageObject.VerifyStatusChangeDatePlaceholderText();
       
       System.out.println(VerifyStatusChangeDatePlaceholderText);
       
       Assert.assertEquals(VerifyStatusChangeDatePlaceholderText, "Is equal to");
  
       Wait.Pause(500);

       } 
       
       @Test(priority=16)
   	public void VerifyStatusChangeDateInputTextFieldPlaceholderText() throws InterruptedException {
    
       String   VerifyStatusChangeDateInputTextFieldPlaceholderText = AdvanceSearchHomePageObject.VerifyStatusChangeDateInputTextFieldPlaceholderText();
      
      System.out.println(VerifyStatusChangeDateInputTextFieldPlaceholderText);
      
      Assert.assertEquals(VerifyStatusChangeDateInputTextFieldPlaceholderText, "Status Change Date");
 
       
       String   VerifySearchButton = AdvanceSearchHomePageObject.VerifySearchButton();
      
      System.out.println(VerifySearchButton);
      
      Assert.assertEquals(VerifySearchButton, "Search");
 
       
       
      AdvanceSearchHomePageObject.clickSearch();
       
       
      Wait.Pause(5000);
//
//       
       AdvanceSearchHomePageObject.AdvnaceSearchExpandButton();
       
       Wait.Pause(500);

       
       AdvanceSearchHomePageObject.PaitentIDIsBetweenOperator();
       
       Wait.Pause(500);

       
       }
       
       @Test(priority=17)
      	public void VerifyPaitentIDMinPLaceholderText() throws InterruptedException {
       
          String   VerifyPaitentIDMinPLaceholderText = AdvanceSearchHomePageObject.VerifyPaitentIDMinPLaceholderText();
         
         System.out.println(VerifyPaitentIDMinPLaceholderText);
         
         Assert.assertEquals(VerifyPaitentIDMinPLaceholderText, "Patient ID");
         
         Wait.Pause(500);

    
       }
         
       
         @Test(priority=18)
       	public void VerifyPaitentIDMaxPLaceholderText() throws InterruptedException {
        
           String   VerifyPaitentIDMaxPLaceholderText = AdvanceSearchHomePageObject.VerifyPaitentIDMaxPLaceholderText();
          
          System.out.println(VerifyPaitentIDMaxPLaceholderText);
          
          Assert.assertEquals(VerifyPaitentIDMaxPLaceholderText, "Patient ID");
     
       
       AdvanceSearchHomePageObject.InputPaitentIDMinimumValue();
       
       AdvanceSearchHomePageObject.InputPaitentIDMaximumValue();
       
       AdvanceSearchHomePageObject.SelectAgeBetweenOperator();
       
       
       Wait.Pause(500);

       
         }
       
       @Test(priority=19)
      	public void VerifyAgeMinInputFieldPlaceholderText() throws InterruptedException {
       
          String   VerifyAgeMinInputFieldPlaceholderText = AdvanceSearchHomePageObject.VerifyAgeMinInputFieldPlaceholderText();
         
         System.out.println(VerifyAgeMinInputFieldPlaceholderText);
         
         Assert.assertEquals(VerifyAgeMinInputFieldPlaceholderText, "Age Min");
         
         
         Wait.Pause(500);

    
       }
         @Test(priority=20)
       	public void VerifyAgeMaxInputFieldPlaceholderText() throws InterruptedException {
        
           String   VerifyAgeMaxInputFieldPlaceholderText = AdvanceSearchHomePageObject.VerifyAgeMaxInputFieldPlaceholderText();
          
          System.out.println(VerifyAgeMaxInputFieldPlaceholderText);
          
          Assert.assertEquals(VerifyAgeMaxInputFieldPlaceholderText, "Age Max");
     
       
       AdvanceSearchHomePageObject.InputAgeMinimumValue();
       AdvanceSearchHomePageObject.InputAgeMaximumValue();
       
       Wait.Pause(500);
    
       
         }
       @Test(priority=21)
      	public void VerifyDateAnnouncedMinInputFieldPlaceholderText() throws InterruptedException {
    	   
    	   
           AdvanceSearchHomePageObject.SelectDateAnnouncedIsbetweenOperator();

       
          String   VerifyDateAnnouncedMinInputFieldPlaceholderText = AdvanceSearchHomePageObject.VerifyDateAnnouncedMinInputFieldPlaceholderText();
         
         System.out.println(VerifyDateAnnouncedMinInputFieldPlaceholderText);
         
         Assert.assertEquals(VerifyDateAnnouncedMinInputFieldPlaceholderText, "Date Announced ");
       }
         @Test(priority=22)
       	public void VerifyDateAnnouncedMaxInputFieldPlaceholderText() throws InterruptedException {
     	   
     	   
          //  AdvanceSearchHomePageObject.VerifyDateAnnouncedMaxInputFieldPlaceholderText();

        
           String   VerifyDateAnnouncedMaxInputFieldPlaceholderText = AdvanceSearchHomePageObject.VerifyDateAnnouncedMaxInputFieldPlaceholderText();
          
          System.out.println(VerifyDateAnnouncedMaxInputFieldPlaceholderText);
          
          Assert.assertEquals(VerifyDateAnnouncedMaxInputFieldPlaceholderText, "Date Announced ");

          
         }   

     
         
         @Test(priority=23)
         	public void VerifyStatusChangeDateMinInputtextfieldPlaceholderText() throws InterruptedException {
       	   
             
           //  Wait.Pause(5000);
             
             driver.findElement(By.xpath("//select[@name='field_status_change_date_value_op'][1]//option[2]")).click();

        	 
           //   AdvanceSearchHomePageObject.SelectIsBetweenStatusChangeDate();
              
              Wait.Pause(50);


        }
             
         @Test(priority=24)
      	public void VerifyStatusChangeDateMinInputtextfieldPlaceholderText1() throws InterruptedException {
    	   
          

     	 
             Wait.Pause(5000);
          
      

              
             String   VerifyStatusChangeDateMinInputtextfieldPlaceholderText = AdvanceSearchHomePageObject.VerifyStatusChangeDateMinInputtextfieldPlaceholderText();
            
            System.out.println(VerifyStatusChangeDateMinInputtextfieldPlaceholderText);
            
            Assert.assertEquals(VerifyStatusChangeDateMinInputtextfieldPlaceholderText, "Status Change Date");

            Wait.Pause(5000);
     
         }
            
            @Test(priority=25)
          	public void VerifyStatusChangeDateMaxInputtextfieldPlaceholderText() throws InterruptedException {
        	   
                 Wait.Pause(5000);
                                
                 String   VerifyStatusChangeDateMaxInputtextfieldPlaceholderText = AdvanceSearchHomePageObject.VerifyStatusChangeDateMaxInputtextfieldPlaceholderText();
                
                System.out.println(VerifyStatusChangeDateMaxInputtextfieldPlaceholderText);
                
                Assert.assertEquals(VerifyStatusChangeDateMaxInputtextfieldPlaceholderText, "Status Change Date");

                Wait.Pause(5000);

        
            
                String   VerifySearchButton = AdvanceSearchHomePageObject.VerifySearchButton();
                
                System.out.println(VerifySearchButton);
                
                Assert.assertEquals(VerifySearchButton, "Search");
                
                
           
             String   VerifyResetButton = AdvanceSearchHomePageObject.VerifyResetButton();
                
                System.out.println(VerifyResetButton);
                
                Assert.assertEquals(VerifyResetButton, "Reset");
           
                
           
     
       AdvanceSearchHomePageObject.clickSearch();

       
       
     // AdvanceSearchHomePageObject.clickRangeSearchButton();


       Wait.Pause(5000);


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
 	  
       
       
       
       
       
      
        Wait.Pause(5000);
      }  
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		
		Wait.Pause(5000);

		
		driver.quit();
	}}
	

	
		

	
	
