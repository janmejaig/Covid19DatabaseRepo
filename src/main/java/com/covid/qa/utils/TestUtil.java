package com.covid.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TestUtil extends com.covid.qa.base.TestBase {

//	public static long PageLoadTimeout = 20;
//	public static long ImplicitWait = 10;
	
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public static Actions action;

	
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	
	public static void drawBorder(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

	
	//Mouse Hover
	 public static void mouseHover(WebElement element)
	 {
		new Actions(driver).moveToElement(element).perform();
		
	 }
	

	
	public void navigateToURL(String URL) {
		System.out.println("Navigating to: " + URL);
	}	
	
	public void  ClickbackButtonOnBrowser()
	{
		driver.navigate().back();
	}
	
	// Switch by Index

	public void switchFrameByIndex() {
		driver.switchTo().frame("indexValue");
	}

//Switch by frame name
	public void switchFrameByName() {
		driver.switchTo().frame("frameName");
	}

	// Switch by frame ID
	public void switchFrameById() {
		driver.switchTo().frame("frameId");
	}

//Switch by frame WebElement
	public void switchFrameByWebElement() {
		driver.switchTo().frame("iframeElement");
	}

//Switch back to the main window from iframe
	public void switchBackToWindow() {
		driver.switchTo().defaultContent();
	}

	// switch to simple alert
	public void switchToSimpleAlert() {
	Alert simpleAlert = driver.switchTo().alert();
	 String alertText = simpleAlert.getText();
	 System.out.println("Alert text is " + alertText);
	 simpleAlert.accept();
	 }
	 
     public void clearField(WebElement element) {
         try {
             element.clear();
         } catch (Exception e) {
             System.out.print(String.format("The following element could not be cleared: [%s]", element.getText()));
         }
     
     
        
     

     
}}

