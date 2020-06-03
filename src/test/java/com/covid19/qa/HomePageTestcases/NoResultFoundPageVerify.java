package com.covid19.qa.HomePageTestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.covid.qa.base.TestBase;
import com.covid.qa.utils.TestUtil;
import com.covid19.qa.pages.HomePageCovidDatabase;
import com.covid19.qa.pages.NoResultFoundPageMethods;

public class NoResultFoundPageVerify extends TestBase {

	NoResultFoundPageMethods NoResultFoundPageMethodsObject;

	public NoResultFoundPageVerify() {
		super();

	}

	@BeforeClass
	public void setup() {

		initialization();

		NoResultFoundPageMethodsObject = new NoResultFoundPageMethods();
	}

	@Test
	public void verifyNoresult() throws InterruptedException {

		NoResultFoundPageMethodsObject.SelectState();

		NoResultFoundPageMethodsObject.clickSearch();

		NoResultFoundPageMethodsObject.NoResultFound();

	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		driver.quit();
	}

}
