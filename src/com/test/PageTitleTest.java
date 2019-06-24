package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.utilities.DriverFactory;

import junit.framework.Assert;

public class PageTitleTest {
	WebDriver driver;
	String browserType = "chrome";
	static String webUrl;
	String actualTitle;
	String expectedTitle;

	@Before
	public void setup() {
		 driver = DriverFactory.webDriver(browserType);
		System.out.println("Before");
	}

	@Test
	public void pageTitleTest() {
//		driver = DriverFactory.webDriver(browserType);
		webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(webUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		expectedTitle = "SDET Training | Account Management";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@After
	public void afterTest() {
		System.out.println("close");
		driver.close();
	}

}
