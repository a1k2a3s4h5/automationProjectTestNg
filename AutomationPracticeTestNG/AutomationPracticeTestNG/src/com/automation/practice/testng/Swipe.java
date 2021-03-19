package com.automation.practice.testng;
/**
 * Aim: To check the swipe functionality 
 * Author: Vaishvi Patel
 * Date: 06/03/2021
 */
import org.testng.annotations.Test;

import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Swipe {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();
	
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver= commonUtilities.driverReturn();
	  WebElement side1=driver.findElement(By.className(loc.sideClass));
	  side1.click();
	  Thread.sleep(2000);
	  side1.click();
	  Thread.sleep(2000);
	  side1.click();
	  Thread.sleep(2000);
	  side1.click();
	  Thread.sleep(2000);
	  driver.quit();
	  
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
