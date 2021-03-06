package com.covid19.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;

public class HomePageCovidDatabase extends TestBase {

	public HomePageCovidDatabase() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='is-active']")
	WebElement covidhomepage_title;

	@FindBy(xpath = "//a[@class='name navbar-brand']")

	WebElement CovidPaitenDataHeading;

	@FindBy(xpath = "//h1[@class='page-header']")

	WebElement PatientsHeading;

	@FindBy(xpath = "	//a[@class='views-display-link views-display-link-patient_listing_page_grid']")

	WebElement GridView;

	@FindBy(xpath = "//a[text() ='Table']")

	WebElement TableView;

	@FindBy(xpath = "//div[@class='view-header']")

	WebElement DiplayingText;

	@FindBy(xpath = "//section[@class='block block-covid-user block-custom-last-updated-block clearfix']")

	WebElement LastUpdatedText;

	@FindBy(xpath = "//a[text()='How search works?']")

	WebElement HowSearchWorks;

	@FindBy(xpath = "//a[@class='button-redirect']")

	WebElement ButtonRedirect;

	public String covidHomePageTitle() {

		return covidhomepage_title.getText();
	}

	public String covidHomePageUrl() {

		covidhomepage_title.click();
		return driver.getCurrentUrl();
	}

	public String CovidPaitenDataHeading() {

		return CovidPaitenDataHeading.getText();
	}

	public String PatientsHeading() {

		return PatientsHeading.getText();
	}

	public String GridView() {

		GridView.click();
		return driver.getCurrentUrl();
	}

	public String TableView() {

		TestUtil.visibiltyOfElement(driver, 400, TableView);

		TableView.click();
		return driver.getCurrentUrl();
	}

	public String DiplayingText() {

		TestUtil.visibiltyOfElement(driver, 400, DiplayingText);

		return DiplayingText.getText();
	}

	public String LastUpdatedText() {

		TestUtil.visibiltyOfElement(driver, 400, LastUpdatedText);

		return LastUpdatedText.getText();
	}

	public String HowSearchWorks() throws InterruptedException {

		TestUtil.visibiltyOfElement(driver, 500, HowSearchWorks);

		TestUtil.mouseHover(HowSearchWorks);
		TestUtil.drawBorder(HowSearchWorks, driver);

		TestUtil.Pause(600);
		return HowSearchWorks.getText();
	}

	public String ButtonRedirect() {

		TestUtil.visibiltyOfElement(driver, 400, ButtonRedirect);
		ButtonRedirect.click();
		driver.getCurrentUrl();
		return driver.getCurrentUrl();

	}

	public void navigateback() {
		driver.navigate().back();

	}

}
