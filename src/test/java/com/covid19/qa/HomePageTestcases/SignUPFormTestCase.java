package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.Wait;
import com.covid19.qa.pages.SignUPForm;

public class SignUPFormTestCase  extends TestBase{
	
	SignUPForm  SignUPFormObject ;
	

	
	public SignUPFormTestCase(){
		super();
	}

	
		
	@BeforeClass
	public void setUp(){
		initialization();
		SignUPFormObject = new SignUPForm();	
	}


	
	@Test(priority=1)
	public void VerifySignUPLink() throws InterruptedException {
		
		String SignUPLink =SignUPFormObject.SignUPLink();
		
		System.out.println("Title of the SignUPLinkPage is : " + SignUPLink);

		Assert.assertEquals(SignUPLink, prop.getProperty("SignUPLink"));
		

		//Wait.Pause(2000);
	}

	
	@Test(priority=2)
	public void VerifySignUPLinkUrl() throws InterruptedException {
		
		String VerifySignUPLinkUrl =SignUPFormObject.VerifySignUPLinkUrl();
		
		System.out.println("Url of the SignUPLinkPage is : " + VerifySignUPLinkUrl);

		Assert.assertEquals(VerifySignUPLinkUrl, prop.getProperty("VerifySignUPLinkUrl"));
		

		//Wait.Pause(20);
	}

	
	@Test(priority=3)
	public void VerifyHeadingRegistrationForm() throws InterruptedException {
		
		String VerifyHeadingRegistrationForm =SignUPFormObject.VerifyHeadingRegistrationForm();
		
		System.out.println("Verify Heading of RegistrationForm under SignUp Page: " + VerifyHeadingRegistrationForm);

		Assert.assertEquals(VerifyHeadingRegistrationForm, prop.getProperty("VerifyHeadingRegistrationForm"));
		

		//Wait.Pause(20);
	}

	
	
	@Test(priority=4)
	public void VerifyHeadingVolunteerRegistrationForm() throws InterruptedException {
		
		String VerifyHeadingVolunteerRegistrationForm =SignUPFormObject.VerifyHeadingVolunteerRegistrationForm();
		
		System.out.println("Verify Heading of RegistrationForm under SignUp Page: " + VerifyHeadingVolunteerRegistrationForm);

		Assert.assertEquals(VerifyHeadingVolunteerRegistrationForm, prop.getProperty("VerifyHeadingVolunteerRegistrationForm"));
		

		//Wait.Pause(20);
	}

	
	
	@Test(priority=5)
	public void VerifyHeadingEmailaddress() throws InterruptedException {
		
		String VerifyHeadingEmailaddress =SignUPFormObject.VerifyHeadingEmailaddress();
		
		System.out.println("Verify Email address Heading  under SignUp Page: " + VerifyHeadingEmailaddress);

		Assert.assertEquals(VerifyHeadingEmailaddress, prop.getProperty("VerifyHeadingEmailaddress"));
		

		//Wait.Pause(20);
	}

	
	
	
	@Test(priority=6)
	public void EnterEmailaddress() throws InterruptedException {
		
		String EnterEmailaddress =SignUPFormObject.EnterEmailaddress();
		
		System.out.println(" Email address entered is :" + EnterEmailaddress);

	//	Assert.assertEquals(EnterEmailaddress, "Email address");
		

		//Wait.Pause(20);
	}

	
	
	
	@Test(priority=7)
	public void VerifyHeadingUsername() throws InterruptedException {
		
		String VerifyHeadingUsername =SignUPFormObject.VerifyHeadingUsername();
		
		System.out.println("Verify Heading Username under SignUp Page: " + VerifyHeadingUsername);

		Assert.assertEquals(VerifyHeadingUsername, prop.getProperty("VerifyHeadingUsername"));
		

		//Wait.Pause(20);
	}

	
	
	
	
	
	@Test(priority=8)
	public void EnterUsernameaddress() throws InterruptedException {
		
		String EnterUsernameaddress =SignUPFormObject.EnterUsernameaddress();
		
		System.out.println("enter Username under SignUp Page: " + EnterUsernameaddress);

		//Assert.assertEquals(VerifyHeadingUsername, "Username");
		

		//Wait.Pause(20);
	}


	
	
	
	
	
	
	@Test(priority=9)
	public void VerifyHeadingFirstName() throws InterruptedException {
		
		String VerifyHeadingFirstName =SignUPFormObject.VerifyHeadingFirstName();
		
		System.out.println("Verify Heading Username under SignUp Page: " + VerifyHeadingFirstName);

		Assert.assertEquals(VerifyHeadingFirstName, prop.getProperty("VerifyHeadingFirstName"));
	
		//Wait.Pause(20);
	}

	@Test(priority=10)
	public void EnterFirstName() throws InterruptedException {
		
		String EnterFirstName =SignUPFormObject.EnterFirstName();
		
		System.out.println("Enter firstname  under SignUp Page: " + EnterFirstName);

		//Assert.assertEquals(VerifyHeadingFirstName, "First Name");
	
		//Wait.Pause(20);
	}

	
	
	
	
	
	@Test(priority=11)
	public void VerifyHeadingLastName() throws InterruptedException {
		
		String VerifyHeadingLastName =SignUPFormObject.VerifyHeadingLastName();
		
		System.out.println("Verify Heading Lastname under SignUp Page: " + VerifyHeadingLastName);

		Assert.assertEquals(VerifyHeadingLastName, prop.getProperty("VerifyHeadingLastName"));
	
		//Wait.Pause(20);
	}

	
	
	
	
	@Test(priority=12)
	public void EnterLastname() throws InterruptedException {
		
		String EnterLastname =SignUPFormObject.EnterLastname();
		
		System.out.println("EnterLastname under SignUp Page: " + EnterLastname);

		//Assert.assertEquals(VerifyHeadingLastName, "Last Name");
	
		//Wait.Pause(20);
	}

	
	
	
	@Test(priority=13)
	public void VerifyHeadingOccupation() throws InterruptedException {
		
		String VerifyHeadingOccupation =SignUPFormObject.VerifyHeadingOccupation();
		
		System.out.println("Verify Heading Lastname under SignUp Page: " + VerifyHeadingOccupation);

		Assert.assertEquals(VerifyHeadingOccupation, prop.getProperty("VerifyHeadingOccupation"));
	
		//Wait.Pause(20);
	}

	@Test(priority=13)
	public void EnterOccupation() throws InterruptedException {
		
		String EnterOccupation =SignUPFormObject.EnterOccupation();
		
		System.out.println("enter occupation under SignUp Page: " + EnterOccupation);

		//Assert.assertEquals(VerifyHeadingOccupation, "Occupation");
	
		//Wait.Pause(20);
	}


	
	
	
	@Test(priority=14)
	public void SelectImage() throws InterruptedException {
		
		String SelectImage =SignUPFormObject.SelectImage();
		
		System.out.println("select image under SignUp Page: " + SelectImage);

		//Assert.assertEquals(clickRegisterButton, "Register");
	
		//Wait.implicitWait(5000);
	}
	
	
	
	
	
	
	
	

	@Test(priority=20)
	public void RemoveImage() throws InterruptedException {
		
		//Wait.Pause(500);

		
		String RemoveImage =SignUPFormObject.RemoveImage();
		
		System.out.println("remove image under SignUp Page: " + RemoveImage);

		//Assert.assertEquals(clickRegisterButton, "Register");
	
	}


	
	
	
	
	
	@Test(priority=21)
	public void clickRegisterButton() throws InterruptedException {
		
		String clickRegisterButton =SignUPFormObject.clickRegisterButton();
		
		System.out.println("Verify RegisterButton under SignUp Page: " + clickRegisterButton);

		Assert.assertEquals(clickRegisterButton, prop.getProperty("clickRegisterButton") );
	
		//Wait.Pause(20);
	}

	
	
	

	
	
	@Test(priority=22)
	public void CaptureMessage() throws InterruptedException {
		
		String CaptureMessage =SignUPFormObject.CaptureMessage();
		
		System.out.println("Status Message: " + CaptureMessage);

		//Assert.assertEquals(clickRegisterButton, "Register");
	
		//Wait.Pause(500);
	}

	
	
	
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		
		//Wait.Pause(500);

		driver.quit();

	}}

	
	
	