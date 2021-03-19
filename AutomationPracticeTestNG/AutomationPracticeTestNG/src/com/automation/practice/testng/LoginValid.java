package com.automation.practice.testng;

import org.testng.annotations.Test;

import com.common.utilities.CommonUtilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginValid {
	CommonUtilities commonUtilities = new CommonUtilities();

	@Test
	public void f() {
		commonUtilities.login("vaishvi@123.c", "1234567890");
	}

	@BeforeMethod
	public void beforeMethod() {
		commonUtilities.browserSetup();
		System.out.println("Starting browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing browser");
	}

}
