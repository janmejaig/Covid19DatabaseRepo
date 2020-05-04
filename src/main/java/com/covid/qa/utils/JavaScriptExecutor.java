package com.covid.qa.utils;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends com.covid.qa.base.TestBase{
	
	
	public JavaScriptExecutor() throws IOException {
		super();
		
	}


	
	
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
	}
        
       


		private static void changeColor(String string, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}




		public static void drawBorder(WebElement element, WebDriver driver){
        	JavascriptExecutor js = ((JavascriptExecutor) driver);
        	js.executeScript("arguments[0].style.border='3px solid red'", element);
        }
        

}
