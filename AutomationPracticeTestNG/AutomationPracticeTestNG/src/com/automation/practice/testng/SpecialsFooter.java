package com.automation.practice.testng;

import org.testng.annotations.Test;

import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class SpecialsFooter {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();
  @Test
  public void f() {
	  WebDriver driver= commonUtilities.driverReturn();
	//  WebElement specials=driver.findElement(By.xpath(loc.footerSpecialsXpath));
	  
  }
  @BeforeMethod
	public void beforeMethod() {
		commonUtilities.browserSetup();
		System.out.println("Starting Browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
	}
}
