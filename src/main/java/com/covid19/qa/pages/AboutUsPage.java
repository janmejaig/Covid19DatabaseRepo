package com.covid19.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.covid.qa.base.TestBase;

public class AboutUsPage extends TestBase {
	
	public AboutUsPage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'About Us')]")
	WebElement AboutUsLinkClick ;
	
	
	@FindBy(xpath="//span[text()='ABOUT US']")
	WebElement AboutUsLogo ;
	
	
	
	
	
	
	public String  AboutUsLinkClick() 

	{
		AboutUsLinkClick.click();
		
		return AboutUsLinkClick.getText();
	}

	
	public String  AboutUsPageUrl() 

	{
		
		AboutUsLinkClick.click();

		
		return driver.getCurrentUrl();
	}

	public boolean  AboutUsPageLOGO() 

	{
		AboutUsLinkClick.click();

		return AboutUsLogo.isDisplayed();
	}

	
	
	
	
	
	
	
	
	
	

	

	
	
	
	
	
}
