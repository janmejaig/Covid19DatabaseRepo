package com.covid.qa.ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.covid.qa.base.TestBase;

public class TestNGListener2WithExtent extends TestBase implements ITestListener {
	
//	private static ExtentReports extent = ExtentManager.createInstance("extentJJ2.html");
	private static ThreadLocal parentTest = new ThreadLocal();
    private static ThreadLocal test = new ThreadLocal();
	
	

	@Override
	public void onTestStart(ITestResult result) {
System.out.println("Testcases Start and details are "+result.getName() );		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcases Success and details are "+result.getName() );		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcases failed and details are "+result.getName() );	
		Failed(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcases Skipped and details are "+result.getName() );		
		
	}


	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Testcases Finish and details are "+result.getName() );		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}}

	

