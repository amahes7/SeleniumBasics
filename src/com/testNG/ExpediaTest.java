package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilities.DriverFactory;

public class ExpediaTest {

	WebDriver driver;
	String browserType = "chrome";
	String webUrl = "https://www.expedia.com/";
	String city = "New York, New York";
	String checkinDate = "07/09/2019";
	String checkoutDate = "07/12/2019";
	String adultCount = "3";
	String childCount = "1";
	String roomCount = "2";

	@Test
	public void hotelReservation() {
		WebElement cityElement = driver.findElement(By.id("hotel-destination-hp-hotel"));
		WebElement checkinDateElement = driver.findElement(By.id("hotel-checkin-hp-hotel"));
		
		WebElement hotelTabElement = driver.findElement(By.xpath("//*[@id=\"tab-hotel-tab-hp\"]/span[2]"));
		WebElement travellerDetailsTab = driver
				.findElement(By.xpath("//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/button"));
		WebElement adultsCountElement = driver
				.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button/span/span[4]/span[1]"));
		WebElement childCountElement = driver
				.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button/span/span[4]/span[2]"));
		WebElement roomCountElement = driver
				.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button/span/span[4]/span[3]"));
		WebElement submitButtonElement = driver
				.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[10]/label/button"));
		// Actions
		// 1. Click on hotel tab
		hotelTabElement.click();

		// Enter the search criteria
		cityElement.sendKeys(city);
		checkinDateElement.sendKeys(checkinDate);
//		checkoutDateElement.clear();
		// checkoutDateElement.sendKeys(checkoutDate);
//		travellerDetailsTab.click();
//		adultsCountElement.sendKeys(adultCount);
//		childCountElement.sendKeys(childCount);
//		roomCountElement.sendKeys(roomCount);
//		submitButtonElement.click();
	}
	
	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.webDriver(browserType);
		driver.get(webUrl);
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
	}

}
