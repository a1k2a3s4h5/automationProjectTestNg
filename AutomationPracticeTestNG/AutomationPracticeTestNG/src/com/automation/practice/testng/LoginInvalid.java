package com.automation.practice.testng;

import org.testng.annotations.Test;
import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginInvalid {

	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();

	@Test
	public void f() {

		commonUtilities.login("ssdjdh", "hdjsj");
	}

	@BeforeMethod
	public void beforeMethod() {
		commonUtilities.browserSetup();
		System.out.println("Starting the browser");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Browser closing");
	}

}
