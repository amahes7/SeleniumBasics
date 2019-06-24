package com.testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilities.DriverFactory;

public class ATagTest {

	WebDriver driver;
	String browserType = "chrome";
	String webUrl;
	boolean createAccountPresent = false;
	boolean sdetPresent = false;

	@Test
	public void aTagTest1() {
		webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(webUrl);
		List<WebElement> aTagElements = driver.findElements(By.tagName("a"));
		for (WebElement aTagElement : aTagElements) {
			System.out.println(aTagElement.getText());
			if (aTagElement.getText().equalsIgnoreCase("Create Account")) {
				System.out.println("here");
				createAccountPresent = true;
				break;
			}
		}

		Assert.assertTrue(createAccountPresent);

	}

	@Test
	public void aTagTest2() {
		webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(webUrl);
		List<WebElement> aTagElements = driver.findElements(By.tagName("a"));
		for (WebElement aTagElement : aTagElements) {
			System.out.println(aTagElement.getText());
			if (aTagElement.getText().equalsIgnoreCase("SDET Training Projects")) {
				System.out.println("here");
				sdetPresent = true;
			}
		}

		Assert.assertTrue(sdetPresent);

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
