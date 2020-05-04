package com.covid.qa.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait extends com.covid.qa.base.TestBase{


	WebDriverWait Wait;
	
	public Wait() throws IOException {
		super();
		
	}

	public static void implicitWait(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public static void Pause(long millis) throws InterruptedException
	{
		
		Thread.sleep(millis);
	}
	
	public static void elementClickable(WebDriver driver,long timeout,WebElement element)
	{
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
				 
	}
	
	public static void visibiltyOfElement(WebDriver driver,long timeout,WebElement element)
	{
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void pageLoad(long time) {
		
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		
	}
	
	
}


