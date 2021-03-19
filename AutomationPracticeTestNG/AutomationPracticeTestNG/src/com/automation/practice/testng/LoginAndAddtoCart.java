package com.automation.practice.testng;

/**
 * Aim: To login and add product to cart and check out
 * Author: Vaishvi Patel
 * Created on:2/03/2021
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.common.utilities.CommonUtilities;
import com.common.utilities.Locators;

public class LoginAndAddtoCart {
	CommonUtilities commonUtilities = new CommonUtilities();
	Locators loc = new Locators();

	@Test
	public void f() {

		WebDriver driver=commonUtilities.driverReturn();
		WebElement signUp = driver.findElement(By.className(loc.signUpClassName));
		signUp.click();

		WebElement loginEmail = driver.findElement(By.id(loc.loginEmailId));
		loginEmail.sendKeys("vaishvi@123.c");

		WebElement loginPassword = driver.findElement(By.id(loc.loginPasswordId));
		loginPassword.sendKeys("1234567890");

		WebElement signin = driver.findElement(By.id(loc.signinId));
		signin.click();
		
		WebElement womenCategory = driver.findElement(By.xpath(loc.womenCategoryXpath));
		womenCategory.click();

		WebElement tshirt = driver.findElement(By.xpath(loc.tshirtXpath));

		WebElement addToCart1 = driver.findElement(By.xpath(loc.addToCartXpath));

		Actions actions = new Actions(driver);
		actions.moveToElement(tshirt).moveToElement(addToCart1).click().perform();

		WebElement proceedToCheckout1 = driver.findElement(By.xpath(loc.proceedToCheckoutXpath));
		proceedToCheckout1.click();

		WebElement proceedToCheckoutFinal = driver.findElement(By.xpath(loc.proceedToCheckoutFinalXpath));
		proceedToCheckoutFinal.click();

		WebElement proceedToCheckoutFinal2 = driver.findElement(By.xpath(loc.proceedToCheckoutFinal2Xpath));
		proceedToCheckoutFinal2.click();

		WebElement checkBox = driver.findElement(By.id(loc.checkBoxId));
		checkBox.click();

		WebElement proceedToCheckoutFinal3 = driver.findElement(By.xpath(loc.proceedToCheckoutFinal3Xpath));
		proceedToCheckoutFinal3.click();

		WebElement bankPayment = driver.findElement(By.className(loc.bankPaymentClassName));
		bankPayment.click();

		WebElement confirmOrder = driver.findElement(By.xpath(loc.confirmOrderXpath));
		confirmOrder.click();
		driver.quit();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing the browser session");

	}
}
