package com.covid19.qa.HomePageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid19.qa.pages.SignUPForm;

public class SignUPFormTestCase extends TestBase {

	
	
	
	SignUPForm SignUPFormObject; 
	
	public SignUPFormTestCase(){
		super();
		
}

	
	@BeforeClass
	public void setup() {
		
		initialization();
		
		SignUPFormObject = new SignUPForm();
	}


	
	@Test(priority = 1)
	public void VerifySignUPLink() throws InterruptedException {

		String SignUPLink = SignUPFormObject.SignUPLink();

		System.out.println("Title of the SignUPLinkPage is : " + SignUPLink);

		Assert.assertEquals(SignUPLink, prop.getProperty("SignUPLink"));

	}

	@Test(priority = 2)
	public void VerifySignUPLinkUrl() throws InterruptedException {

		String VerifySignUPLinkUrl = SignUPFormObject.VerifySignUPLinkUrl();

		System.out.println("Url of the SignUPLinkPage is : " + VerifySignUPLinkUrl);

		Assert.assertEquals(VerifySignUPLinkUrl, prop.getProperty("VerifySignUPLinkUrl"));

	}

	@Test(priority = 3)
	public void VerifyHeadingRegistrationForm() throws InterruptedException {

		String VerifyHeadingRegistrationForm = SignUPFormObject.VerifyHeadingRegistrationForm();

		System.out.println("Verify Heading of RegistrationForm under SignUp Page: " + VerifyHeadingRegistrationForm);

		Assert.assertEquals(VerifyHeadingRegistrationForm, prop.getProperty("VerifyHeadingRegistrationForm"));

	}

	@Test(priority = 4)
	public void VerifyHeadingVolunteerRegistrationForm() throws InterruptedException {

		String VerifyHeadingVolunteerRegistrationForm = SignUPFormObject.VerifyHeadingVolunteerRegistrationForm();

		System.out.println(
				"Verify Heading of RegistrationForm under SignUp Page: " + VerifyHeadingVolunteerRegistrationForm);

		Assert.assertEquals(VerifyHeadingVolunteerRegistrationForm,
				prop.getProperty("VerifyHeadingVolunteerRegistrationForm"));

	}

	@Test(priority = 5)
	public void VerifyHeadingEmailaddress() throws InterruptedException {

		String VerifyHeadingEmailaddress = SignUPFormObject.VerifyHeadingEmailaddress();

		System.out.println("Verify Email address Heading  under SignUp Page: " + VerifyHeadingEmailaddress);

		Assert.assertEquals(VerifyHeadingEmailaddress, prop.getProperty("VerifyHeadingEmailaddress"));

	}

	@Test(priority = 6)
	public void EnterEmailaddress() throws InterruptedException {

		String EnterEmailaddress = SignUPFormObject.EnterEmailaddress();

		System.out.println(" Email address entered is :" + EnterEmailaddress);

	}

	@Test(priority = 7)
	public void VerifyHeadingUsername() throws InterruptedException {

		String VerifyHeadingUsername = SignUPFormObject.VerifyHeadingUsername();

		System.out.println("Verify Heading Username under SignUp Page: " + VerifyHeadingUsername);

		Assert.assertEquals(VerifyHeadingUsername, prop.getProperty("VerifyHeadingUsername"));

	}

	@Test(priority = 8)
	public void EnterUsernameaddress() throws InterruptedException {

		String EnterUsernameaddress = SignUPFormObject.EnterUsernameaddress();

		System.out.println("enter Username under SignUp Page: " + EnterUsernameaddress);

	}

	@Test(priority = 9)
	public void VerifyHeadingFirstName() throws InterruptedException {

		String VerifyHeadingFirstName = SignUPFormObject.VerifyHeadingFirstName();

		System.out.println("Verify Heading Username under SignUp Page: " + VerifyHeadingFirstName);

		Assert.assertEquals(VerifyHeadingFirstName, prop.getProperty("VerifyHeadingFirstName"));

	}

	@Test(priority = 10)
	public void EnterFirstName() throws InterruptedException {

		String EnterFirstName = SignUPFormObject.EnterFirstName();

		System.out.println("Enter firstname  under SignUp Page: " + EnterFirstName);

	}

	@Test(priority = 11)
	public void VerifyHeadingLastName() throws InterruptedException {

		String VerifyHeadingLastName = SignUPFormObject.VerifyHeadingLastName();

		System.out.println("Verify Heading Lastname under SignUp Page: " + VerifyHeadingLastName);

		Assert.assertEquals(VerifyHeadingLastName, prop.getProperty("VerifyHeadingLastName"));

	}

	@Test(priority = 12)
	public void EnterLastname() throws InterruptedException {

		String EnterLastname = SignUPFormObject.EnterLastname();

		System.out.println("EnterLastname under SignUp Page: " + EnterLastname);

	}

	@Test(priority = 13)
	public void VerifyHeadingOccupation() throws InterruptedException {

		String VerifyHeadingOccupation = SignUPFormObject.VerifyHeadingOccupation();

		System.out.println("Verify Heading Lastname under SignUp Page: " + VerifyHeadingOccupation);

		Assert.assertEquals(VerifyHeadingOccupation, prop.getProperty("VerifyHeadingOccupation"));

	}

	@Test(priority = 13)
	public void EnterOccupation() throws InterruptedException {

		String EnterOccupation = SignUPFormObject.EnterOccupation();

		System.out.println("enter occupation under SignUp Page: " + EnterOccupation);

	}

	@Test(priority = 14)
	public void SelectImage() throws InterruptedException {

		String SelectImage = SignUPFormObject.SelectImage();

		System.out.println("select image under SignUp Page: " + SelectImage);

	}

	@Test(priority = 20)
	public void RemoveImage() throws InterruptedException {

		String RemoveImage = SignUPFormObject.RemoveImage();

		System.out.println("remove image under SignUp Page: " + RemoveImage);

	}

	@Test(priority = 21)
	public void clickRegisterButton() throws InterruptedException {

		String clickRegisterButton = SignUPFormObject.clickRegisterButton();

		System.out.println("Verify RegisterButton under SignUp Page: " + clickRegisterButton);

		Assert.assertEquals(clickRegisterButton, prop.getProperty("clickRegisterButton"));

	}

	@Test(priority = 22)
	public void CaptureMessage() throws InterruptedException {

		String CaptureMessage = SignUPFormObject.CaptureMessage();

		System.out.println("Status Message: " + CaptureMessage);

	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
}
