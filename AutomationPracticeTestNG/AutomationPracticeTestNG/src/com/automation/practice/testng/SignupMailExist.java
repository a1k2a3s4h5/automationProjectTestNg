package com.automation.practice.testng;

/**
 * Aim:To perform signup with already exist mail
 *  Date: 2/3/2021 
 *  Author: Vaishvi  Patel
 */
import org.testng.annotations.Test;
import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class SignupMailExist {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();

	@Test
	public void f() {
		WebDriver driver = commonUtilities.driverReturn();
		WebElement signUp = driver.findElement(By.className(loc.signUpClassName));
		signUp.click();

		WebElement createEmail = driver.findElement(By.id(loc.createEmailId));
		createEmail.sendKeys("vaishvi12@gmail.com");

		WebElement creatAccount = driver.findElement(By.id(loc.createAccountId));
		creatAccount.click();

		WebElement signinError = driver.findElement(By.xpath(loc.signinErrorXpath));
		String expectedError = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		String actualError = signinError.getText().toString();

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
