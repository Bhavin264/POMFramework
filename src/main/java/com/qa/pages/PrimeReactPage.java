package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class PrimeReactPage extends TestBase {

	
	
	@FindBy(xpath="(//div[@role='checkbox'])[4]")
	WebElement checkBoxBlueBand;
	
	
	
	
	//Initializing the Page Objects:
		public PrimeReactPage() {
			PageFactory.initElements(driver, this);
		}
		
	//Action methods
		public void clickOnBlueBand() {
			checkBoxBlueBand.click();		
			
		}


		public boolean isClickedOnBlueBand() {
			return checkBoxBlueBand.isEnabled();
		}
}
