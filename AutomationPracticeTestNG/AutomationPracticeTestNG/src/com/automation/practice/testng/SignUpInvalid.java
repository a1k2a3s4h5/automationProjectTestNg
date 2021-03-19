package com.automation.practice.testng;
/**
 * Aim: To perform signup of the automationpractice with invalid email
 * Date: 2/3/2021
 * Author: Vaishvi Patel
 */

import org.testng.annotations.Test;
import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class SignUpInvalid {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();

	@Test
	public void f() {
		WebDriver driver = commonUtilities.driverReturn();
		WebElement signUp = driver.findElement(By.className(loc.signUpClassName));
		signUp.click();

		WebElement createEmail = driver.findElement(By.id(loc.createEmailId));
		createEmail.sendKeys("vaishvi");

		WebElement creatAccount = driver.findElement(By.id(loc.createAccountId));
		creatAccount.click();

		WebElement createAccountError = driver.findElement(By.xpath(loc.createAccountErrorXpath));
		String expectedError = "Invalid email address.";
		String actualError = createAccountError.getText().toString();

		if (actualError.equalsIgnoreCase(expectedError)) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}

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
