package com.covid19.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;

public class NoResultFoundPageMethods extends TestBase {

	public NoResultFoundPageMethods() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='edit-field-state-value']")

	WebElement State_selction;

	@FindBy(xpath = "//select[@id='edit-field-transmission-type-value']")

	WebElement Transmission_Type;

	@FindBy(xpath = "//button[@id='edit-submit-covid-patient-data']")

	WebElement SearchButton;

	public void clickSearch() throws InterruptedException {
		
		SearchButton.click();

	}

	@FindBy(xpath = "//div[@class='view-empty']")
	WebElement NoResultFound;
	
	
	@FindBy(xpath = "//a[@title='sort by City']")
	WebElement City;
	
	

	@FindBy(xpath = "//a[@title='sort by Zip Code']")
	WebElement Zipcode;
	

	@FindBy(xpath = "//a[@title='sort by Transmission Type']")
	WebElement TransmissionType;

	
	
	
	
	public void SelectState()

	{
		State_selction.click();
		State_selction.sendKeys(prop.getProperty("State_selctionValue"));

	}

	public void SelectTransmissionType()

	{
		Transmission_Type.click();
		Transmission_Type.sendKeys(prop.getProperty("TransmissionType2"));

	}


	public void  NoResultFound() throws InterruptedException {
		
		//Boolean dd = City.isDisplayed();
		//System.out.println(dd);
		
		TestUtil.Pause(5000);

		
		//if(( City.isDisplayed() || Zipcode.isDisplayed() || TransmissionType.isDisplayed() ))
		
		if(driver.findElements(By.xpath("//a[@title='sort by City']")).size()>0)
 


//	//	if(( TestUtil.visibiltyOfElement(driver, 500, City) || TestUtil.visibiltyOfElement(driver, 500, Zipcode) ))
//
//		//if(dd==true)
		{
            System.out.println("Verification Successful - The correct title is displayed on the web page.");
		}
		else {
			System.out.println("No result is visible upon filtering");
			
		}
		
//		TestUtil.visibiltyOfElement(driver, 500, NoResultFound);
//		Assert.assertTrue(NoResultFound.isDisplayed()); 
//	
//			return NoResultFound.getText();
//        
	}

	
}
