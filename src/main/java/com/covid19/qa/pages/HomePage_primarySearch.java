package com.covid19.qa.pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.Wait;

public class HomePage_primarySearch extends TestBase {

	public HomePage_primarySearch(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='is-active']")
		
		WebElement Homepage_link ;
		
	
	
	
	@FindBy(xpath="//select[@id='edit-field-current-status-value']")
	
	WebElement Current_Status ;
	
@FindBy(xpath="//label[text()='Current Status']")
	
	WebElement VerifyCurrentStatusLabel ;
	

@FindBy(xpath="//select[@id='edit-field-current-status-value']//option[@selected='selected' and text()='- Any -']")

WebElement VerifyPlaceholdertextCurrentStatus;



@FindBy(xpath="//select[@id='edit-field-current-status-value']")

WebElement VerifyAllvaluesCurrentStatus ;



	


	

	
@FindBy(xpath="//select[@id='edit-field-state-value']")
	
	WebElement State_selction ;


@FindBy(xpath="//label[text()='State']")

WebElement VerifyStateLabel;


@FindBy(xpath="//select[@name='field_state_value']//option[@selected='selected']")

WebElement VerifyStatePlaceholderText;



@FindBy(xpath="//select[@name='field_state_value']")

WebElement VerifyStateDropdownvalues;



	
@FindBy(xpath="//select[@id='edit-field-transmission-type-value']")

WebElement Transmission_Type ;



@FindBy(xpath="//label[text()='Transmission Type']")

WebElement VerifylabelTransmission_Type ;


@FindBy(xpath="//select[@id='edit-field-transmission-type-value']//option[@value='All']")

WebElement VerifyPlaceholdertextTransmission_Type ;


@FindBy(xpath="//select[@name='field_transmission_type_value']")

WebElement VerifydropdownvaluesTransmission_Type ;



	
@FindBy(xpath="//select[@id='edit-field-clusters-target-id']")

WebElement clusters ;


@FindBy(xpath="//label[text()='Clusters']")

WebElement clustersLabelName ;



@FindBy(xpath="//select[@name='field_clusters_target_id'] //option[@selected='selected']")

WebElement VerifyclustersPlaceholderText ;



@FindBy(xpath="//select[@name='field_clusters_target_id']")

WebElement VerifyclustersDropdownvalues ;




//verify nationality


@FindBy(xpath="//select[@id='edit-field-nationality-value']")

WebElement Nationality ;

@FindBy(xpath="//label[text()='Nationality']")

WebElement VerifyNationalityLabel ;

@FindBy(xpath="//select[@id ='edit-field-nationality-value']//option[@selected='selected']")

WebElement VerifyPlaceholderTextNationalityLabel ;


@FindBy(xpath="//select[@id ='edit-field-nationality-value']")

WebElement VerifyDRopdownvaluesNationalityLabel ;











//verify gender

@FindBy(xpath="//label[text()='Gender']")

WebElement VerifyGenderLabel ;

@FindBy(xpath="//select[@id ='edit-field-gender-value']//option[@selected='selected']")

WebElement VerifyPlaceholdertextGenderLabel ;

@FindBy(xpath="//select[@name ='field_gender_value']")

WebElement VerifyDropdownValuesGenderLabel ;








@FindBy(xpath="//select[@id='edit-field-gender-value']")

WebElement Gender ;


@FindBy(xpath="//button[@id='edit-submit-covid-patient-data']")

WebElement SearchButton ;



@FindBy(xpath="/html/body/div[1]/div/div/section/div[2]/div/div/div/div[3]/div/table/tbody/tr[1]/td[14]/a[1]")

WebElement ViewLink ;




@FindBy(xpath="//button[@type='submit' and @name = 'op']")

WebElement ResetButton ;


@FindBy(xpath="//span[@class='icon glyphicon glyphicon-trash']")

WebElement VerifyResetButton ;



@FindBy(xpath="//table[@class='table table-hover table-striped']//tbody")

WebElement TableBody ;


@FindBy(xpath="//h1[@class='page-header']")

WebElement PaitentDeatils  ;


@FindBy(xpath="//th[@id='view-field-patient-number-table-column']//a[contains(text(),'Patient Id')]")

WebElement PatientID ;



@FindBy(xpath="//a[contains(text(),'State Patient Id')]")

WebElement StatePatientId ;


@FindBy(xpath="//a[contains(text(),'Age')]")

WebElement Age ;


@FindBy(xpath="//a[contains(text(),'Gender')]")
WebElement gender ;



@FindBy(xpath="//a[contains(text(),'Nationality')]")
WebElement nationality;

@FindBy(xpath="//th[@id='view-field-state-table-column']//a[contains(text(),'State')]")
WebElement State;

@FindBy(xpath="//a[contains(text(),'District')]")
WebElement District;

@FindBy(xpath="//th[@id='view-field-detected-city-table-column']")
WebElement City;



@FindBy(xpath="//a[contains(text(),'Zip Code')]")
WebElement Zipcode;


@FindBy(xpath="//th[@id='view-field-transmission-type-table-column']")
WebElement TransmissionType;

@FindBy(xpath="//label[contains(text(),'Clusters')]")
WebElement Clusters;

@FindBy(xpath="//a[contains(text(),'Current Status')]")
WebElement CurrentStatus;


@FindBy(xpath="//a[contains(text(),'Announced Date')]")
WebElement AnnouncedDate;


@FindBy(xpath="//th[@id='view-nothing-1-table-column']")
WebElement ActionsHeading ;




















//label name --- current status


public String VerifyCurrentStatusLabel() 
{
	return VerifyCurrentStatusLabel.getText();
}


public String VerifyPlaceholdertextCurrentStatus() 
{
	return VerifyPlaceholdertextCurrentStatus.getText();
}




public String VerifyAllvaluesCurrentStatus() 

{
	VerifyAllvaluesCurrentStatus.getTagName();
	
	
	return VerifyAllvaluesCurrentStatus.getText();
	
}




//transmission type label


public String VerifylabelTransmission_Type() 

{
	
	
	return VerifylabelTransmission_Type.getText();
	
}


public String VerifyPlaceholdertextTransmission_Type() 

{
	
	return VerifyPlaceholdertextTransmission_Type.getText();
	
}

public String VerifydropdownvaluesTransmission_Type() 

{
	//Select selectValue = new Select(VerifydropdownvaluesTransmission_Type);
	
	//java.util.List<WebElement> dropdownvalues = selectValue.getOptions();
	
	
	return VerifydropdownvaluesTransmission_Type.getText();
	
}



//state label 



public String VerifyStateLabel() 

{
	return VerifyStateLabel.getText();
}


public String VerifyStatePlaceholderText() 

{
	return VerifyStatePlaceholderText.getText();
}

public String VerifyStateDropdownvalues() 

{
	return VerifyStateDropdownvalues.getText();
}


//clusters label

public String VerifyclustersLabelName() 

{
	return clustersLabelName.getText();
}


public String VerifyclustersPlaceholderText() 

{
	return VerifyclustersPlaceholderText.getText();
}

public String VerifyclustersDropdownvalues() 

{
	return VerifyclustersDropdownvalues.getText();
}


//nationality label



public String VerifyNationalityLabel() 

{
	return VerifyNationalityLabel.getText();
}


public String VerifyPlaceholderTextNationalityLabel() 

{
	return VerifyPlaceholderTextNationalityLabel.getText();
}


public String VerifyDRopdownvaluesNationalityLabel() 

{
	return VerifyDRopdownvaluesNationalityLabel.getText();
}








//Gender


public String VerifyGenderLabel() 

{
	return VerifyGenderLabel.getText();
}


public String VerifyPlaceholdertextGenderLabel() 

{
	return VerifyPlaceholdertextGenderLabel.getText();
}

public String VerifyDropdownValuesGenderLabel() 

{
	return VerifyDropdownValuesGenderLabel.getText();
}









	
	
	
	
	
	public void  Homepage_link_click(){
		//return driver.getTitle();
		Homepage_link.click();
	}
	
	
	public void  Homepage_heading(){
		
		System.out.println(Homepage_link.getText());
		
	}
	
	
	public void selectCurrentStatus() 
	
	{
		Current_Status.click();
		Current_Status.sendKeys("Recovered");
		//return Current_Status.getText();
		
		
	}
	
	
public void SelectState() 
	
	{
	   State_selction.click();
	   State_selction.sendKeys("Andhra Pradesh");
		
	}
	

public void SelectTransmissionType() 

{
	Transmission_Type.click();
	Transmission_Type.sendKeys(prop.getProperty("TransmissionType"));
	
}


public void ClusterSelection() {
	clusters.click();
	clusters.sendKeys("Any");
}
	

public void selectNationality() {
	
	Nationality.click();
	
	Nationality.sendKeys(prop.getProperty("country"));
}


public void selectGender() {
	
	Gender.click();
	
	Gender.sendKeys(prop.getProperty("gender"));
}


public void clickSearch() 
{
	SearchButton.click();
	
}



public void MoveToTable() 
{
	Actions act = new Actions(driver);
	act.moveToElement(TableBody);
}

public void clickView()
{
	
	Actions act = new Actions(driver);
	
	act.moveToElement(ViewLink);

	ViewLink.click();

}


public String PaitentDeatils() {
	
	
	
	return PaitentDeatils.getText();
	
} 


public String  PaitentIDVisible() {
	
	
	
	
	return PatientID.getText();

}

public String  StatePaitentIDVisible() {

	
	return StatePatientId.getText();

}


public String  AgeVisible() {
	
	return Age.getText();
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






public String VerifyResetButton() {
	
	return VerifyResetButton.getText();
	
}






public void Reset_click() {
	
	ResetButton.click();
	
}

}
