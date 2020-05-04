package com.covid19.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.Wait;

public class AdvanceSearchHomePage extends TestBase {

	public AdvanceSearchHomePage(){
		PageFactory.initElements(driver, this);
	}

	
	//Advance Search 

	@FindBy(xpath="//a[@class='panel-title']")
	WebElement AdavceSerachButton ;



	@FindBy(xpath="//div[@id='edit-secondary--62dv-HCmrKI--content']")
	WebElement AdavceSectionBody ;




	@FindBy(xpath="//input[@name='field_patient_number_value[value]']")
	WebElement InputPaitentID ;
	
	@FindBy(xpath="	//label[@for='edit-field-patient-number-value-op--clXcJmNYcG0']")
	WebElement PaitentIDLabel ;
	
	@FindBy(xpath="//select[@name='field_patient_number_value_op']")
	WebElement SelectEqualto ;
	
	
	@FindBy(xpath="//input[@name='field_patient_number_value[min]']")
	WebElement InputMinimumPatientID ;
	
	
	@FindBy(xpath="	//input[@name='field_patient_number_value[max]']")
	WebElement InputMaximumPatientID ;
	
	

   
	
	
	
	@FindBy(xpath="	//input[@name='field_state_patient_number_value']")
	WebElement StatePatientNumber ;

	
	
	
	

	
	
	@FindBy(xpath="//input[@name='field_detected_district_value']")
	WebElement InputDistrictName ;

	@FindBy(xpath="//input[@name='field_detected_city_value']")
	WebElement cityName ;

	

	@FindBy(xpath="//button[@class='button js-form-submit form-submit btn-primary btn icon-before']")

	WebElement SearchButton ;
	
	
	@FindBy(xpath="	//div[@id='edit-actions--4bZ0jkFBh88']")

	WebElement RangeSearchButtonSection ;

	
	
	@FindBy(xpath="//button[@id='edit-submit-covid-patient-data--VXN-fYfp-2A']")

	WebElement RangeSearchButton ;

	
	
	
	
	@FindBy(xpath="//select[@name='field_age_value_op']")

	WebElement AgeEqualtoOperator ;

	
	
	
	
	@FindBy(xpath="	//input[@name='field_age_value[value]']")

	WebElement Age  ;
	
	
	@FindBy(xpath="//input[@name='field_age_value[min]']")

	WebElement InputAgeMinimumValue  ;

	@FindBy(xpath="//input[@name='field_age_value[max]']")

	WebElement InputAgeMaximumValue  ;

	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//input[@name='field_zip_code_value']")

	WebElement ZipCode  ;

	@FindBy(xpath="//select[@name='field_date_announced_value_op']")

	WebElement DateAnnouncedEqualtoOperator  ;

	
	
	
	@FindBy(xpath="//input[@name='field_date_announced_value[value]']")

	WebElement DateAnnounced  ;
	
	
	@FindBy(xpath="//a[@title='sort by Patient Id']")

	WebElement PatientID ;



	@FindBy(xpath="//a[@title='sort by State Patient Id']")

	WebElement StatePatientId ;


	@FindBy(xpath="//a[contains(text(),'Age')]")

	WebElement AgeHeader ;


	@FindBy(xpath="//a[contains(text(),'Gender')]")
	WebElement gender ;



	@FindBy(xpath="//a[contains(text(),'Nationality')]")
	WebElement nationality;

	@FindBy(xpath="//a[@title='sort by State']")
	WebElement State;

	@FindBy(xpath="//a[contains(text(),'District')]")
	WebElement District;

	@FindBy(xpath="//a[@title='sort by City']")
	WebElement City;



	@FindBy(xpath="//a[@title='sort by Zip Code']")
	WebElement Zipcode;


	@FindBy(xpath="//a[@title='sort by Transmission Type']")
	WebElement TransmissionType;

	@FindBy(xpath="//label[contains(text(),'Clusters')]")
	WebElement Clusters;

	@FindBy(xpath="//a[contains(text(),'Current Status')]")
	WebElement CurrentStatus;


	@FindBy(xpath="//a[@title='sort by Announced Date']")
	WebElement AnnouncedDate;


	@FindBy(xpath="//th[@class='views-field views-field-nothing-1']")
	WebElement ActionsHeading ;



	

	
	
	
	
	
	
	



	////Advance Search Functions or MEthods 
	
	
	
	public void  PaitentIDSelectEqualtoOperator() 

	{
		SelectEqualto.click();
		 SelectEqualto.sendKeys("Is equal to");
	}

	public void  PaitentIDIsBetweenOperator() 

	{
		SelectEqualto.click();
		 SelectEqualto.sendKeys("Is between");
	}

	
	public void  InputPaitentIDMinimumValue() 

	{
		InputMinimumPatientID.sendKeys("0");
	}

	
	public void  InputPaitentIDMaximumValue() 

	{
		InputMaximumPatientID.sendKeys("196");
	}

	
	public void  InputAgeMinimumValue() 

	{
		InputAgeMinimumValue.sendKeys("10");
	}
 
	public void  InputAgeMaximumValue() 

	{
		InputAgeMaximumValue.sendKeys("90");
	}

	
	
	
	
	
	
	public void  SelectAgeEqualtoOperator() 

	{
		AgeEqualtoOperator.click();
		AgeEqualtoOperator.sendKeys("Is equal to");
	}
	
	public void  SelectAgeBetweenOperator() 

	{
		AgeEqualtoOperator.click();
		AgeEqualtoOperator.sendKeys("Is between");
	}


	public void  DateAnnouncedEqualtoOperator() 

	{
		DateAnnouncedEqualtoOperator.click();
		DateAnnouncedEqualtoOperator.sendKeys("Is equal to");
	}

	
	
	
	
	
	public String  AdvnaceSearchButtonTitle() 

	{
		return AdavceSerachButton.getText();
	}

	public void   AdvnaceSearchExpandButton() 

	{
		 AdavceSerachButton.click();
	}

	public Boolean AdvanceSectionBody()
	{
		
		return AdavceSectionBody.isDisplayed();
	}


	public void InputPaitentID() 
	{
		InputPaitentID.sendKeys("196");
	}
	
	
	
	public void StatePatientNumberInput() 
	{
		StatePatientNumber.sendKeys("AP-P3");
	}
	
	
	
	
	
	public void   InputDistrictName() 
	{
		InputDistrictName.sendKeys("Visakhapatnam");
	}
	
	public void   InputCityName() 
	{
		cityName.sendKeys("Visakapatnam");
	}
	
	public void   InputAge() 
	{
	  	Age.sendKeys("65");
	}
	
	public void   InputZipCode() 
	{
		ZipCode.sendKeys("201301");
	}
	
	
	public void   DateAnnounced() 
	{
		DateAnnounced.sendKeys("2020-03-19");
	}
	
	
	
	public String  PaitentIDVisible() {
		
		
		
		
		return PatientID.getText();

	}

	public String  StatePaitentIDVisible() {

		
		return StatePatientId.getText();

	}


	public String  AgeVisible() {
		
		return AgeHeader.getText();
	}

	public String  GenderVisible() {
		
		return gender.getText();
	}


	public String  NationalityVisible() {
		
		return nationality.getText();
	}

	public String  StateVisible() {
		
		return State.getText();
	}


	public String  DistrictVisible() {
		
		return District.getText();
	}

	public String  CityVisible() {
		
		return City.getText();
	}


	public String  ZipcodeVisible() {
		
		return Zipcode.getText();
	}


	public String  TransmissionType() {
		
		return TransmissionType.getText();
	}

	public String  ClusterHeadingVisible() {
		
		return Clusters.getText();
	}

	public String  CurrentStatusHeadingVisible() {
		
		return CurrentStatus.getText();
	}


	public String  AnnouncedDateHeadingVisible() {
		
		return AnnouncedDate.getText();
	}

	public String  ActionsHeadingVisible() {
		
		return ActionsHeading.getText();
		
		
	}
	
	
public String  PaitentIDLabelVisible() {
		
		return PaitentIDLabel.getText();
		
		
	}
	
	


	
	
	
	
	public void clickSearch() 
	{
		SearchButton.click();
		
		
	}
	
	public void clickRangeSearchButton() 
	
	{
		
		Wait.visibiltyOfElement(driver, 200, RangeSearchButtonSection);
		RangeSearchButton.click();
		
	}
	
	
	

	
	

}

