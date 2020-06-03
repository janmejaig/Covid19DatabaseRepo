package com.covid19.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;

public class AboutUsPage extends TestBase {

	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	WebElement AboutUsLinkClick;

	@FindBy(xpath = "//span[text()='ABOUT US']")
	WebElement AboutUsLogo;

	@FindBy(xpath = "//div[@class='content']//p[11]//a")
	WebElement Covid19IndiaLinkNavigation;

	@FindBy(xpath = "//div[@class='content']//p[14]//a")
	WebElement Covid19IndiaLinkNavigation2;

	@FindBy(xpath = "//div[@class='content']//div//p[26]//a")
	WebElement VerifyApisLink;

	@FindBy(xpath = "//a[@title='Home'][2]")

	WebElement VerifyCOVIDPatientDataTitleUnderAboutUsPAge;

	public String VerifyCOVIDPatientDataTitleUnderAboutUsPAge()

	{
		TestUtil.visibiltyOfElement(driver, 500, VerifyCOVIDPatientDataTitleUnderAboutUsPAge);

		return VerifyCOVIDPatientDataTitleUnderAboutUsPAge.getText();
	}

	public String VerifyCOVIDPatientDataNavigationUnderAboutUsPAge()

	{
		TestUtil.visibiltyOfElement(driver, 500, VerifyCOVIDPatientDataTitleUnderAboutUsPAge);
		VerifyCOVIDPatientDataTitleUnderAboutUsPAge.click();

		return driver.getCurrentUrl();
	}

	public String VerifyFirstCovid19IndiaLink()

	{
		TestUtil.visibiltyOfElement(driver, 500, Covid19IndiaLinkNavigation);
		return Covid19IndiaLinkNavigation.getText();
	}

	public String VerifysecondCovid19IndiaLink()

	{
		TestUtil.visibiltyOfElement(driver, 500, Covid19IndiaLinkNavigation2);

		return Covid19IndiaLinkNavigation2.getText();
	}

	public String AboutUsLinkClick()

	{
		TestUtil.visibiltyOfElement(driver, 400, AboutUsLinkClick);
		AboutUsLinkClick.click();
		return AboutUsLinkClick.getText();
	}

	public String AboutUsPageUrl()

	{
		TestUtil.visibiltyOfElement(driver, 500, AboutUsLinkClick);

		AboutUsLinkClick.click();

		TestUtil.visibiltyOfElement(driver, 500, AboutUsLinkClick);

		return driver.getCurrentUrl();
	}

	public boolean AboutUsPageLOGO()

	{
		TestUtil.visibiltyOfElement(driver, 500, AboutUsLinkClick);
		AboutUsLinkClick.click();
		TestUtil.visibiltyOfElement(driver, 500, AboutUsLinkClick);

		return AboutUsLogo.isDisplayed();
	}

	public String Covid19IndiaLinkNavigation() throws InterruptedException

	{
		Covid19IndiaLinkNavigation.click();

		TestUtil.Pause(500);

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();

		String childWindowId = it.next();

		TestUtil.Pause(500);

		driver.switchTo().window(childWindowId);

		TestUtil.Pause(500);

		System.out.println(driver.getCurrentUrl());

		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("urlcovid"));

		TestUtil.Pause(500);

		driver.close();

		driver.switchTo().window(parentWindowId);

		return parentWindowId;

	}

	public String Covid19IndiaLinkNavigation2() throws InterruptedException

	{

		Covid19IndiaLinkNavigation2.click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child window id:" + childWindowId);

		TestUtil.Pause(500);

		driver.switchTo().window(childWindowId);

		System.out.println(driver.getCurrentUrl());

		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("urlcovid"));

		TestUtil.Pause(500);

		driver.close();

		driver.switchTo().window(parentWindowId);

		return parentWindowId;

	}

	public String VerifyApisLink()

	{

		TestUtil.visibiltyOfElement(driver, 500, VerifyApisLink);

		return VerifyApisLink.getText();
	}

	public String VerifyApisLinkNavigation()

	{
		VerifyApisLink.click();
		return driver.getCurrentUrl();
	}

}
