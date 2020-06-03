package com.covid19.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;

public class SignUPForm extends TestBase {

	public SignUPForm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='SignUp']")
	WebElement SignUPLink;

	@FindBy(xpath = "	//a[@href='/volunteers']")
	WebElement VerifySignUPLinkUrl;

	@FindBy(xpath = "//li[@class='active']")
	WebElement VerifyRegistrationFormHeading;

	@FindBy(xpath = "//h2[@class='block-title']")
	WebElement VerifyHeadingVolunteerRegistrationForm;

	@FindBy(xpath = "//label[@for='edit-mail']")
	WebElement VerifyHeadingEmailaddress;

	@FindBy(xpath = "//label[@for='edit-name']")
	WebElement VerifyHeadingUsername;

	@FindBy(xpath = "//label[@for='edit-field-user-first-name-0-value']")
	WebElement VerifyHeadingFirstName;

	@FindBy(xpath = "//label[@for='edit-field-user-last-name-0-value']")
	WebElement VerifyHeadingLastName;

	@FindBy(xpath = "//label[@for='edit-field-user-occupation-0-value']")
	WebElement VerifyHeadingOccupation;

	@FindBy(xpath = "	//input[@id='edit-mail']")
	WebElement EnterEmailaddress;

	@FindBy(xpath = "//input[@id='edit-name']")
	WebElement EnterUsernameaddress;

	@FindBy(xpath = "//input[@id='edit-field-user-first-name-0-value']")
	WebElement EnterFirstName;

	@FindBy(xpath = "//button[@id='edit-submit']")
	WebElement clickRegisterButton;

	@FindBy(xpath = "//input[@id='edit-user-picture-0-upload']")
	WebElement SelectImage;

	@FindBy(xpath = "	//button[@name='user_picture_0_remove_button']")
	WebElement RemoveImage;

	@FindBy(xpath = "//input[@id='edit-field-user-last-name-0-value']")
	WebElement EnterLastname;

	@FindBy(xpath = "	//input[@id='edit-field-user-occupation-0-value']")
	WebElement EnterOccupation;

	@FindBy(xpath = "	//div[@class='messages__wrapper']")
	WebElement CaptureMessage;

	public String CaptureMessage()

	{

		TestUtil.visibiltyOfElement(driver, 400, CaptureMessage);

		return CaptureMessage.getText();

	}

	public String EnterOccupation()

	{

		EnterOccupation.sendKeys("JJoccupation");
		;

		return EnterOccupation.getText();

	}

	public String EnterLastname()

	{

		EnterLastname.sendKeys("JJLast");
		;

		return EnterLastname.getText();

	}

	public String RemoveImage()

	{
		TestUtil.visibiltyOfElement(driver, 500, RemoveImage);

		RemoveImage.click();

		return RemoveImage.getText();

	}

	public String SelectImage()

	{
		SelectImage.click();

		SelectImage.sendKeys(prop.getProperty("SelectImagepath"));

		return SelectImage.getText();

	}

	public String clickRegisterButton()

	{

		clickRegisterButton.click();

		return clickRegisterButton.getText();

	}

	public String SignUPLink()

	{
		TestUtil.visibiltyOfElement(driver, 700, SignUPLink);
		SignUPLink.click();

		return SignUPLink.getText();

	}

	public String VerifySignUPLinkUrl()

	{

		return driver.getCurrentUrl();

	}

	public String VerifyHeadingRegistrationForm()

	{

		return VerifyRegistrationFormHeading.getText();

	}

	public String VerifyHeadingVolunteerRegistrationForm()

	{

		TestUtil.visibiltyOfElement(driver, 300, VerifyHeadingVolunteerRegistrationForm);

		return VerifyHeadingVolunteerRegistrationForm.getText();

	}

	public String VerifyHeadingEmailaddress()

	{
		TestUtil.visibiltyOfElement(driver, 300, VerifyHeadingEmailaddress);

		return VerifyHeadingEmailaddress.getText();

	}

	public String EnterEmailaddress()

	{

		EnterEmailaddress.sendKeys(prop.getProperty("EnterEmailaddressValue"));

		return EnterEmailaddress.getText();

	}

	public String VerifyHeadingUsername()

	{

		return VerifyHeadingUsername.getText();

	}

	public String EnterUsernameaddress()

	{
		TestUtil.visibiltyOfElement(driver, 300, EnterUsernameaddress);

		EnterUsernameaddress.sendKeys(prop.getProperty("EnterUsernameaddressValue"));

		return EnterUsernameaddress.getText();

	}

	public String VerifyHeadingFirstName()

	{
		TestUtil.visibiltyOfElement(driver, 300, VerifyHeadingFirstName);

		return VerifyHeadingFirstName.getText();

	}

	public String EnterFirstName()

	{

		EnterFirstName.sendKeys(prop.getProperty("EnterFirstNameVlaue"));

		return EnterFirstName.getText();

	}

	public String VerifyHeadingLastName()

	{

		return VerifyHeadingLastName.getText();

	}

	public String VerifyHeadingOccupation()

	{

		return VerifyHeadingOccupation.getText();

	}

}
