package com.automation.practice.testng;
/**
 * Aim: To check the search functionality and filter from highest to lowest
 * Author: Vaishvi Patel
 * Date: 06/03/2021
 */
import org.testng.annotations.Test;

import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Search {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();
  @Test
  public void f() {
	  
	  WebDriver driver= commonUtilities.driverReturn();
	  WebElement searchBar=driver.findElement(By.id(loc.searchBarId));
	  searchBar.click();
	  searchBar.sendKeys("Faded Short Sleeve T-shirts");
	  searchBar.sendKeys(Keys.ENTER);
	  
	  Select selectFilter=new Select(driver.findElement(By.id(loc.filterDropdownId)));
	  selectFilter.selectByVisibleText("Price: Highest first");
	  
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
