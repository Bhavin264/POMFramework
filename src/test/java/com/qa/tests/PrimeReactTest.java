package com.qa.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.PrimeReactPage;


public class PrimeReactTest extends TestBase{
	
	
	PrimeReactPage primeReactPage;
	
	public PrimeReactTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization(); // calling initialization method to start driver
		primeReactPage = new PrimeReactPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority=1)
	public void blueBandCheckboxTest() {
		
		primeReactPage.clickOnBlueBand();
		Assert.assertTrue(primeReactPage.isClickedOnBlueBand());
	}
	


}
