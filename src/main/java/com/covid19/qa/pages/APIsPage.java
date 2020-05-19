package com.covid19.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.Wait;

public class APIsPage extends TestBase {
	
	public APIsPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy(xpath="//li//a[@class='active-trail is-active']")
	
	@FindBy(xpath="//a[contains(text(),'APIs')]")
	WebElement APIsLinkClick ;
	
	
	
	
	
	@FindBy(xpath="//h1[@class='page-header']")
	WebElement APIListingHeading ;
	
	
	@FindBy(xpath="//a[text()=' COvid19 API ']")
	WebElement COvid19APIHeading ;
	
	
	@FindBy(xpath="	//div[@class='views-col col-1']//a[contains(text(),'View Documentation')]")
	WebElement ClickCOvid19APIViewDocumentastion ;
	
	
	@FindBy(xpath="	//div[@class='views-col col-2']//a[text()=' Covid19-Oauth API ']")
	WebElement  Covid19OauthAPIHeading   ;
	
	
	
	@FindBy(xpath="	//div[@class='views-col col-2']//a[contains(text(),'View Documentation')]")
	WebElement  Covid19OauthAPIclickViewDocumentation   ;
	
	
	
	@FindBy(xpath="	//div[@class='views-col col-3']//div[@class='views-field views-field-title']")
	WebElement  COVID19PatientDatabaseAPIHeading   ;
	
	
	
	
	@FindBy(xpath="	//div[@class='views-col col-3']//a[contains(text(),'View Documentation')]")
	WebElement  clickviewdocumentationunderCOVID19PatientDatabaseAPI   ;
	
	
	
	@FindBy(xpath="//div[@class='field field--name-body field--type-text-with-summary field--label-hidden field--item']//h1[@class='text-align-center'][1]")
	WebElement  VerifyREQUESTACCESSTOAPIsHeading   ;
	
	
	
	@FindBy(xpath="//p[2]//a[@class='button']")
	WebElement  clickREQUESTACCESS   ;
	
	
	
	@FindBy(xpath="//h1[text()='How To Get Started?']")
	WebElement  verifyHowToGetStartedHeading   ;
	
	
	
	
	@FindBy(xpath="//a[text()='CLICK HERE']")
	WebElement  clickHowToGetStartedbutton   ;
	
	
	
	
	
	
	
	
	
	
	
	
	public String   clickHowToGetStartedbutton() throws InterruptedException 

	{
		clickHowToGetStartedbutton.click();
		
		Wait.Pause(500);
		
		
		return driver.getCurrentUrl();
		
		//driver.navigate().back();

	}

	
	
	
	
	
	
	
	public String   verifyHowToGetStartedHeading() 

	{
		
		return verifyHowToGetStartedHeading.getText();
	}

	
	
	
	
	
	
	public String   clickREQUESTACCESS() throws InterruptedException 

	{
		clickREQUESTACCESS.click();
		
		Wait.Pause(5000);
		
		driver.navigate().back();
		
		return driver.getCurrentUrl();
	}

	
	
	
	
	
	
	public String   VerifyREQUESTACCESSTOAPIsHeading() 

	{
		
		return VerifyREQUESTACCESSTOAPIsHeading.getText();
	}

	
	
	
	
	
	
	
	
	
	public String   clickviewdocumentationunderCOVID19PatientDatabaseAPI() 

	{
		clickviewdocumentationunderCOVID19PatientDatabaseAPI.click();
		
		driver.navigate().back();
		
		return driver.getCurrentUrl();
	}

	
	
	
	
	
	
	
	
	public String   COVID19PatientDatabaseAPIHeading() 

	{
		
		return COVID19PatientDatabaseAPIHeading.getText();
	}

	
	
	
	
	
	
	
	
	
	public String   Covid19OauthAPIclickViewDocumentation() 

	{
		Covid19OauthAPIclickViewDocumentation.click();
		
		driver.navigate().back();
		
		return driver.getCurrentUrl();
	}

	
	
	
	
	
	
	
	
	
	public String   Covid19OauthAPIHeading() 

	{
		
		return Covid19OauthAPIHeading.getText();
	}

	
	

	
	public String   ClickCOvid19APIViewDocumentastion() 

	{
		ClickCOvid19APIViewDocumentastion.click();
		
		
		//assert.assertEquals(ClickCOvid19APIViewDocumentastion, "https://covid19database-dev.srijan.net/node/19461");
		
		driver.navigate().back();
		
		return driver.getCurrentUrl();
	}

	
	
	
	
	public String  VerifyCOvid19APIHeading() 

	{
		//APIsLinkClick.click();
		
		return COvid19APIHeading.getText();
	}

	
	
	
	
	
	public String  VerifyAPIListingHeading() 

	{
		//APIsLinkClick.click();
		
		return APIListingHeading.getText();
	}

	
	
	
	
	
	
	
	public String  VerifyAPIsLinkClick() 

	{
		APIsLinkClick.click();
		
		return APIsLinkClick.getText();
	}

	
	public String  VerifyAPIsLinkUrl() 

	{
		APIsLinkClick.click();
		
		return driver.getCurrentUrl();
	}

	
	

}
