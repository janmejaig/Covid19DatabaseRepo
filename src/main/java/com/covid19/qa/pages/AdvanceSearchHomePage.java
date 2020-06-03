package com.covid19.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;

public class AdvanceSearchHomePage extends TestBase {

	public AdvanceSearchHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "	//label[@class='control-label'][contains(text(),'Operator')]")
	WebElement VerifypaitentIDTitle;

	@FindBy(xpath = "//select[@name='field_patient_number_value_op']//option[@selected='selected']")
	WebElement VerifypaitentIDequaltoPlaceholdertext;

	@FindBy(xpath = "//input[@placeholder='Patient ID']")
	WebElement VerifyPaitentIDPLaceholderText;

	@FindBy(xpath = "//input[@placeholder='Patient ID'and @name='field_patient_number_value[min]' ]")
	WebElement VerifyPaitentIDMinPLaceholderText;

	@FindBy(xpath = "	//input[@placeholder='Patient ID'and @name='field_patient_number_value[max]' ]")
	WebElement VerifyPaitentIDMaxPLaceholderText;

	@FindBy(xpath = "//div//label[contains(text(),'State Patient ID ')]")
	WebElement VerifyStatePatientIDTitle;

	@FindBy(xpath = "//input[@placeholder ='State Patient ID']")
	WebElement VerifyStatePatientIDPlaceHoldertext;

	@FindBy(xpath = "//label[text()='District']")
	WebElement DistrictTitle;

	@FindBy(xpath = "//input[@placeholder='District']")
	WebElement DistrictPlaceHolderText;

	// city
	@FindBy(xpath = "//label[contains(text(),'City')]")
	WebElement VerifyCityTitle;

	@FindBy(xpath = "	//input[@placeholder='City']")
	WebElement VerifyCityPlaceHolderText;

//zip code 
	@FindBy(xpath = "//label[@for='edit-field-zip-code-value']")
	WebElement VerifyZipcodeTitle;

	@FindBy(xpath = "//input[@placeholder='Zip Code']")
	WebElement VerifyZipcodePlaceholderText;

	// Age
	@FindBy(xpath = "//label[@for='edit-field-age-value-op']")
	WebElement VerifyAgeTitle;

	@FindBy(xpath = "	//select[@ name ='field_age_value_op']//option[@selected='selected']")
	WebElement VerifyAgeEqualToPlaceholderText;

	@FindBy(xpath = "	//input[@ placeholder ='Age']")
	WebElement VerifyInputTextfieldPlaceholderText;

	@FindBy(xpath = "	//input[@placeholder='Age Min'and @name='field_age_value[min]' ]")
	WebElement VerifyAgeMinInputFieldPlaceholderText;

	@FindBy(xpath = "    //input[@placeholder='Age Max'and @name='field_age_value[max]' ]")
	WebElement VerifyAgeMaxInputFieldPlaceholderText;

//DateAnnouncedequalto text field 
	@FindBy(xpath = "	//select[@name='field_date_announced_value_op']//option[@selected='selected']")
	WebElement VerifyDateAnnouncedequaltoPlaceholderText;

	@FindBy(xpath = "//input[@placeholder='Date Announced ']")
	WebElement VerifyDateAnnouncedInputFieldPlaceholderText;

	@FindBy(xpath = "	//input[@placeholder='Date Announced 'and @name='field_date_announced_value[min]' ]")
	WebElement VerifyDateAnnouncedMinInputFieldPlaceholderText;

	@FindBy(xpath = "	//input[@placeholder='Date Announced 'and @name='field_date_announced_value[max]' ]")
	WebElement VerifyDateAnnouncedMaxInputFieldPlaceholderText;

	// StatusChangeDate

	@FindBy(xpath = "	//select[@name='field_status_change_date_value_op' ]//option[@selected='selected']")
	WebElement VerifyStatusChangeDatePlaceholderText;

	@FindBy(xpath = "//input[@placeholder='Status Change Date' ]")
	WebElement VerifyStatusChangeDateInputTextFieldPlaceholderText;

	@FindBy(xpath = "//select[@name='field_status_change_date_value_op']//option[@value='between']")

	WebElement SelectIsBetweenStatusChangeDate;

	@FindBy(xpath = "(//input[@placeholder='Status Change Date'])[2]")
	WebElement VerifyStatusChangeDateMinInputtextfieldPlaceholderText;

	@FindBy(xpath = "(//input[@placeholder='Status Change Date' ])[3]")
	WebElement VerifyStatusChangeDateMaxInputtextfieldPlaceholderText;

	// Advance Search

	@FindBy(xpath = "//a[@class='panel-title']")
	WebElement AdavceSerachButton;

	@FindBy(xpath = "//div[@id='edit-secondary--62dv-HCmrKI--content']")
	WebElement AdavceSectionBody;

	@FindBy(xpath = "//input[@id='edit-field-patient-number-value-value']")
	WebElement InputPaitentID;

	@FindBy(xpath = "	//label[@for='edit-field-patient-number-value-op--clXcJmNYcG0']")
	WebElement PaitentIDLabel;

	@FindBy(xpath = "//select[@name='field_patient_number_value_op']")
	WebElement SelectEqualto;

	@FindBy(xpath = "//input[@name='field_patient_number_value[min]']")
	WebElement InputMinimumPatientID;

	@FindBy(xpath = "	//input[@name='field_patient_number_value[max]']")
	WebElement InputMaximumPatientID;

	@FindBy(xpath = "	//input[@name='field_state_patient_number_value']")
	WebElement StatePatientNumber;

	@FindBy(xpath = "//input[@name='field_detected_district_value']")
	WebElement InputDistrictName;

	@FindBy(xpath = "//input[@name='field_detected_city_value']")
	WebElement cityName;

	// Search Button

	@FindBy(xpath = "//button[@class='button js-form-submit form-submit btn-primary btn icon-before']")

	WebElement SearchButton;

	// Verify Reset Button

	@FindBy(xpath = "//button[@name='op'and @value='Reset']")
	WebElement VerifyResetButton;

	@FindBy(xpath = "	//div[@id='edit-actions--4bZ0jkFBh88']")

	WebElement RangeSearchButtonSection;

	@FindBy(xpath = "//button[@id='edit-submit-covid-patient-data--VXN-fYfp-2A']")

	WebElement RangeSearchButton;

	@FindBy(xpath = "//select[@name='field_age_value_op']")

	WebElement AgeEqualtoOperator;

	@FindBy(xpath = "	//input[@name='field_age_value[value]']")

	WebElement Age;

	@FindBy(xpath = "//input[@name='field_age_value[min]']")

	WebElement InputAgeMinimumValue;

	@FindBy(xpath = "//input[@name='field_age_value[max]']")

	WebElement InputAgeMaximumValue;

	@FindBy(xpath = "//input[@name='field_zip_code_value']")

	WebElement ZipCode;

	@FindBy(xpath = "//select[@name='field_date_announced_value_op']")

	WebElement DateAnnouncedEqualtoOperator;

	@FindBy(xpath = "	//select[@name='field_date_announced_value_op' and //@selected='selected']")
	WebElement SelectDateAnnouncedIsequaltoOperator;

	@FindBy(xpath = "//input[@name='field_date_announced_value[value]']")

	WebElement DateAnnounced;

	@FindBy(xpath = "//a[@title='sort by Patient Id']")

	WebElement PatientID;

	@FindBy(xpath = "//a[@title='sort by State Patient Id']")

	WebElement StatePatientId;

	@FindBy(xpath = "//a[@title='sort by Age']")
	WebElement AgeHeader;

	@FindBy(xpath = "//a[contains(text(),'Gender')]")
	WebElement gender;

	@FindBy(xpath = "//a[@title='sort by Nationality']")
	WebElement nationality;

	@FindBy(xpath = "//a[@title='sort by State']")
	WebElement State;

	@FindBy(xpath = "//a[contains(text(),'District')]")
	WebElement District;

	@FindBy(xpath = "//a[@title='sort by City']")
	WebElement City;

	@FindBy(xpath = "//a[@title='sort by Zip Code']")
	WebElement Zipcode;

	@FindBy(xpath = "//a[@title='sort by Transmission Type']")
	WebElement TransmissionType;

	@FindBy(xpath = "//label[contains(text(),'Clusters')]")
	WebElement Clusters;

	@FindBy(xpath = "//a[contains(text(),'Current Status')]")
	WebElement CurrentStatus;

	@FindBy(xpath = "//a[@title='sort by Announced Date']")
	WebElement AnnouncedDate;

	@FindBy(xpath = "//th[@class='views-field views-field-nothing-1']")
	WebElement ActionsHeading;

	public String VerifypaitentIDTitle()

	{
		return VerifypaitentIDTitle.getText();

	}

	public String VerifyPaitentIDMinPLaceholderText()

	{
		return VerifyPaitentIDMinPLaceholderText.getAttribute("placeholder");

	}

	public String VerifyPaitentIDMaxPLaceholderText()

	{
		return VerifyPaitentIDMaxPLaceholderText.getAttribute("placeholder");

	}

	public String VerifypaitentIDequaltoPlaceholdertext()

	{
		TestUtil.visibiltyOfElement(driver, 500, VerifypaitentIDequaltoPlaceholdertext);
		return VerifypaitentIDequaltoPlaceholdertext.getText();
	}

	public String VerifyPaitentIDPLaceholderText()

	{
		return InputPaitentID.getAttribute("placeholder");
	}

	public String VerifyStatePatientIDTitle()

	{
		return VerifyStatePatientIDTitle.getText();
	}

	public String VerifyStatePatientIDPlaceHoldertext()

	{
		System.out.println(VerifyStatePatientIDPlaceHoldertext.getAttribute("placeholder"));
		return VerifyStatePatientIDPlaceHoldertext.getAttribute("placeholder");
	}

	public String VerifyDistrictTitle()

	{
		return DistrictTitle.getText();

	}

	public String VerifyDistrictPlaceHolderText()

	{

		return DistrictPlaceHolderText.getAttribute("placeholder");
	}

	// city title and placeholder text
	public String VerifyCityTitle()

	{
		return VerifyCityTitle.getText();
	}

	public String VerifyCityPlaceHolderText()

	{
		return VerifyCityPlaceHolderText.getAttribute("placeholder");
	}

	// zip code
	public String VerifyZipcodeTitle()

	{

		return VerifyZipcodeTitle.getText();

	}

	public String VerifyZipcodePlaceholderText()

	{
		return VerifyZipcodePlaceholderText.getAttribute("placeholder");

	}

	// age
	public String VerifyAgeTitle()

	{
		return VerifyAgeTitle.getText();

	}

	public String VerifyAgeEqualToPlaceholderText() {
		return VerifyAgeEqualToPlaceholderText.getText();

	}

	public String VerifyInputTextfieldPlaceholderText() {
		return VerifyInputTextfieldPlaceholderText.getAttribute("placeholder");

	}

	public String VerifyAgeMinInputFieldPlaceholderText()

	{

		TestUtil.visibiltyOfElement(driver, 500, VerifyAgeMinInputFieldPlaceholderText);
		return VerifyAgeMinInputFieldPlaceholderText.getAttribute("placeholder");

	}

	public String VerifyAgeMaxInputFieldPlaceholderText() {
		TestUtil.visibiltyOfElement(driver, 500, VerifyAgeMaxInputFieldPlaceholderText);
		return VerifyAgeMaxInputFieldPlaceholderText.getAttribute("placeholder");

	}

	// date announce

	public String VerifyDateAnnouncedequaltoPlaceholderText() {
		return VerifyDateAnnouncedequaltoPlaceholderText.getText();

	}

	public String VerifyDateAnnouncedInputFieldPlaceholderText() {
		return VerifyDateAnnouncedInputFieldPlaceholderText.getAttribute("placeholder");

	}

	public String VerifyDateAnnouncedMinInputFieldPlaceholderText() {
		return VerifyDateAnnouncedMinInputFieldPlaceholderText.getAttribute("placeholder");

	}

	public String VerifyDateAnnouncedMaxInputFieldPlaceholderText() {
		TestUtil.visibiltyOfElement(driver, 500, VerifyDateAnnouncedMaxInputFieldPlaceholderText);
		return VerifyDateAnnouncedMaxInputFieldPlaceholderText.getAttribute("placeholder");

	}

	// StatusChangeDate

	public String VerifyStatusChangeDatePlaceholderText() {
		return VerifyStatusChangeDatePlaceholderText.getText();

	}

	public String VerifyStatusChangeDateInputTextFieldPlaceholderText() {
		return VerifyStatusChangeDateInputTextFieldPlaceholderText.getAttribute("placeholder");

	}

	public String VerifyStatusChangeDateMinInputtextfieldPlaceholderText()

	{
		TestUtil.visibiltyOfElement(driver, 5000, VerifyStatusChangeDateMinInputtextfieldPlaceholderText);
		return VerifyStatusChangeDateMinInputtextfieldPlaceholderText.getAttribute("placeholder");

	}

	public String VerifyStatusChangeDateMaxInputtextfieldPlaceholderText()

	{

		TestUtil.visibiltyOfElement(driver, 5000, VerifyStatusChangeDateMaxInputtextfieldPlaceholderText);
		return VerifyStatusChangeDateMaxInputtextfieldPlaceholderText.getAttribute("placeholder");

	}

	// Advance Search Functions or MEthods

	public void PaitentIDSelectEqualtoOperator()

	{
		TestUtil.visibiltyOfElement(driver, 500, SelectEqualto);
		SelectEqualto.click();
		SelectEqualto.sendKeys("Is equal to");
	}

	public void PaitentIDIsBetweenOperator()

	{
		SelectEqualto.click();
		SelectEqualto.sendKeys("Is between");
	}

	public void InputPaitentIDMinimumValue()

	{
		TestUtil.visibiltyOfElement(driver, 500, InputMinimumPatientID);
		InputMinimumPatientID.sendKeys("0");
	}

	public void InputPaitentIDMaximumValue()

	{
		TestUtil.visibiltyOfElement(driver, 500, InputMaximumPatientID);

		InputMaximumPatientID.sendKeys("196");
	}

	public void InputAgeMinimumValue()

	{
		TestUtil.visibiltyOfElement(driver, 500, InputAgeMinimumValue);

		InputAgeMinimumValue.sendKeys("10");
	}

	public void InputAgeMaximumValue()

	{
		TestUtil.visibiltyOfElement(driver, 500, InputAgeMaximumValue);
		InputAgeMaximumValue.sendKeys("90");
	}

	public void SelectAgeEqualtoOperator()

	{
		AgeEqualtoOperator.click();
		AgeEqualtoOperator.sendKeys("Is equal to");
	}

	public void SelectAgeBetweenOperator()

	{
		TestUtil.visibiltyOfElement(driver, 500, AgeEqualtoOperator);
		AgeEqualtoOperator.click();
		AgeEqualtoOperator.sendKeys("Is between");
	}

	public void DateAnnouncedEqualtoOperator()

	{
		DateAnnouncedEqualtoOperator.click();
		DateAnnouncedEqualtoOperator.sendKeys("Is equal to");
	}

	public void SelectDateAnnouncedIsbetweenOperator()

	{
		TestUtil.visibiltyOfElement(driver, 500, DateAnnouncedEqualtoOperator);
		DateAnnouncedEqualtoOperator.click();
		DateAnnouncedEqualtoOperator.sendKeys("Is between");
	}

	public void SelectIsBetweenStatusChangeDate()

	{
		TestUtil.visibiltyOfElement(driver, 500, SelectIsBetweenStatusChangeDate);
		SelectIsBetweenStatusChangeDate.click();
		SelectIsBetweenStatusChangeDate.sendKeys("Is between");

	}

	public String AdvnaceSearchButtonTitle()

	{
		return AdavceSerachButton.getText();
	}

	public void AdvnaceSearchExpandButton()

	{

		TestUtil.visibiltyOfElement(driver, 500, AdavceSerachButton);
		AdavceSerachButton.click();
	}

	public Boolean AdvanceSectionBody() {

		return AdavceSectionBody.isDisplayed();
	}

	public void InputPaitentID() {

		InputPaitentID.sendKeys(prop.getProperty("paitentid"));
	}

	public void StatePatientNumberInput() {

		StatePatientNumber.sendKeys(prop.getProperty("StatePatientNumber"));
	}

	public void InputDistrictName() {

		InputDistrictName.sendKeys(prop.getProperty("DistrictName"));

	}

	public void InputCityName() {

		cityName.sendKeys(prop.getProperty("cityName"));

	}

	public void InputAge() {
		Age.sendKeys(prop.getProperty("Age"));
	}

	public void InputZipCode() {
		ZipCode.sendKeys("201301");
		ZipCode.sendKeys(prop.getProperty("ZipCodeNumber"));

	}

	public void DateAnnounced() {
		DateAnnounced.sendKeys(prop.getProperty("DateAnnouncedValue"));
	}

	public String PaitentIDVisible() {
		return PatientID.getText();

	}

	public String StatePaitentIDVisible() {
		return StatePatientId.getText();

	}

	public String AgeVisible() {

		return AgeHeader.getText();
	}

	public String GenderVisible() {

		return gender.getText();
	}

	public String NationalityVisible() {

		return nationality.getText();
	}

	public String StateVisible() {

		return State.getText();
	}

	public String DistrictVisible() {

		return District.getText();
	}

	public String CityVisible() {

		return City.getText();
	}

	public String ZipcodeVisible() {

		return Zipcode.getText();
	}

	public String TransmissionType() {

		return TransmissionType.getText();
	}

	public String ClusterHeadingVisible() {

		return Clusters.getText();
	}

	public String CurrentStatusHeadingVisible() {

		return CurrentStatus.getText();
	}

	public String AnnouncedDateHeadingVisible() {

		return AnnouncedDate.getText();
	}

	public String ActionsHeadingVisible() {

		return ActionsHeading.getText();
	}

	public String PaitentIDLabelVisible() {

		return PaitentIDLabel.getText();
	}

	public String VerifyResetButton() {
		TestUtil.visibiltyOfElement(driver, 5000, VerifyResetButton);
		return VerifyResetButton.getAttribute("value");
	}

	public void clickSearch()

	{
		TestUtil.visibiltyOfElement(driver, 500, SearchButton);
		SearchButton.click();
	}

	public String VerifySearchButton() {
		TestUtil.visibiltyOfElement(driver, 5000, SearchButton);
		return SearchButton.getText();

	}

	public void clickRangeSearchButton()

	{

		TestUtil.visibiltyOfElement(driver, 200, RangeSearchButtonSection);
		RangeSearchButton.click();

	}

}
