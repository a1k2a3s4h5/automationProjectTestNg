package com.automation.practice.testng;
/**
 * Aim: To test the contact us link of automation practice website
 * Date:2/03/2021
 * Author:Akash Patel
 */
import org.testng.annotations.Test;

import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class ContactUs {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();
	

	@Test
	public void f() {
		WebDriver driver=commonUtilities.driverReturn();
		
		WebElement contactUs = driver.findElement(By.xpath(loc.contactUsXpath));
		contactUs.click();

		Select subHead = new Select(driver.findElement(By.id(loc.subHeadId)));
		subHead.selectByVisibleText("Webmaster");

		WebElement email = driver.findElement(By.id(loc.loginEmailId));
		email.click();
		email.clear();
		email.sendKeys("vaishvi@123.c");

		WebElement orderRef = driver.findElement(By.id(loc.orderRefId));
		orderRef.click();
		orderRef.clear();
		orderRef.sendKeys("12345");

		WebElement fileUpload = driver.findElement(By.id(loc.fileUploadId));
		fileUpload.sendKeys(loc.file);

		WebElement messege = driver.findElement(By.id(loc.messegeId));
		messege.sendKeys("Hey I have complain.");

		WebElement send = driver.findElement(By.id(loc.sendId));
		send.click();

		WebElement successMessege = driver.findElement(By.xpath(loc.sucessMessegeXpath));
		String successMessegeText = successMessege.getText();
		if (successMessegeText != null) {
			System.out.println("Test case passed");
		} else
			System.out.println("Test case failed");
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
