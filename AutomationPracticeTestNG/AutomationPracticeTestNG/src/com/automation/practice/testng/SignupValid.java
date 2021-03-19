package com.automation.practice.testng;
/**
 * Aim:To perform signup with valid details
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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SignupValid {
	Locators loc = new Locators();
	CommonUtilities commonUtilities = new CommonUtilities();

	@Test
	public void f() {
		WebDriver driver=commonUtilities.driverReturn();
		WebElement signUp = driver.findElement(By.className(loc.signUpClassName));
		signUp.click();

		WebElement createEmail = driver.findElement(By.id(loc.createEmailId));
		createEmail.sendKeys("vaishvi123@gmail.com");

		WebElement creatAccount = driver.findElement(By.id(loc.createAccountId));
		creatAccount.click();

		WebElement mrs = driver.findElement(By.id(loc.mrsId));
		mrs.click();

		WebElement firstName = driver.findElement(By.id(loc.firstNameId));
		firstName.clear();
		firstName.click();
		firstName.sendKeys("Vaishvi");

		WebElement lastName = driver.findElement(By.id(loc.lastNameId));
		lastName.clear();
		lastName.click();
		lastName.sendKeys("Patel");

		WebElement password = driver.findElement(By.id(loc.passwordId));
		password.clear();
		password.click();
		password.sendKeys("Patel");

		Select days = new Select(driver.findElement(By.id(loc.dayId)));
		days.selectByValue("22");

		WebElement month = driver.findElement(By.id(loc.monthId));
		month.click();
		Select months = new Select(month);
		months.selectByValue("3");

		WebElement year = driver.findElement(By.id(loc.yearId));
		year.click();
		Select years = new Select(year);
		years.selectByValue("1999");

		WebElement company = driver.findElement(By.id(loc.companyId));
		company.clear();
		company.click();
		company.sendKeys("gateway");

		WebElement address = driver.findElement(By.id(loc.addressId));
		address.clear();
		address.click();
		address.sendKeys("gateway corp house");

		WebElement city = driver.findElement(By.id(loc.cityId));
		city.clear();
		city.click();
		city.sendKeys("ahemdabad");

		WebElement state = driver.findElement(By.id(loc.stateId));
		state.click();
		Select states = new Select(state);
		states.selectByValue("9");

		WebElement postCode = driver.findElement(By.id(loc.postCodeId));
		postCode.clear();
		postCode.click();
		postCode.sendKeys("00000");

		WebElement phone = driver.findElement(By.id(loc.phoneId));
		phone.clear();
		phone.click();
		phone.sendKeys("871231234");

		WebElement aliasAddress = driver.findElement(By.id(loc.aliasAddressId));
		aliasAddress.clear();
		aliasAddress.click();
		aliasAddress.sendKeys("gateway corp house");

		WebElement submitAccount = driver.findElement(By.id(loc.submitAccountId));
		submitAccount.click();

		WebElement profile = driver.findElement(By.xpath(loc.profileXpath));

		if (profile.getText().toString().equalsIgnoreCase("Vaishvi patel")) {
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
