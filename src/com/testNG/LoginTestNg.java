package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilities.DriverFactory;

public class LoginTestNg {
	WebDriver driver;
	String browserType = "chrome";
	String webUrl;

	@Test
	public void loginTestNG() {
		webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(webUrl);
		boolean emailPresent = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		Assert.assertTrue(emailPresent,"Email present");
	}

	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.webDriver(browserType);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
