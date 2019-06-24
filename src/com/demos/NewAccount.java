package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utilities.DriverFactory;

public class NewAccount {
	static String pageTitle;
	static String MALE_CONSTANT = "Male";
	static String CREATE_ACCOUNT_X_PATH_CONSTANT = "//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a";
	static String URL_CONSTANT = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	static String SUCCESS_MESSAGE = "Customer information added successfully";
	static String YES_CONSTANT = "Yes";
	static String NO_CONSTANT = "No";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String browserType = "chrome";
		String name = "Abhijeet";
		String email = "a@a.com";
		String phone = "123";
		String password = "asdfasdf";
		String verifyPasword = "asdfasdf";
		String country = "Germany";
		String gender = "Male";
		boolean weeklyUpdates = true;
		boolean monthlyUpdates = true;
		boolean occasionalUpdates = false;

		// Define Driver
		driver = DriverFactory.webDriver(browserType);

		// Open Browser and Navigate to the home page
		driver.get(URL_CONSTANT);

		// print the title.
		System.out.println(getPageTitle(driver));

		// navigate to the registration page
		driver.findElement(By.xpath(CREATE_ACCOUNT_X_PATH_CONSTANT)).click();

		// print the title.
		System.out.println(getPageTitle(driver));
		// Defining Elements

		WebElement nameElement = driver.findElement(By.id("MainContent_txtFirstName"));
		WebElement emailElement = driver.findElement(By.id("MainContent_txtEmail"));
		WebElement phoneElement = driver.findElement(By.id("MainContent_txtHomePhone"));
		WebElement passwordElement = driver.findElement(By.id("MainContent_txtPassword"));
		WebElement vPasswordElement = driver.findElement(By.id("MainContent_txtVerifyPassword"));
		WebElement countryElement = driver.findElement(By.id("MainContent_menuCountry"));
		WebElement maleRadio = driver.findElement(By.id("MainContent_Male"));
		WebElement femaleRadio = driver.findElement(By.id("MainContent_Female"));
		WebElement weeklyEmailUpdateElement = driver.findElement(By.id("MainContent_checkWeeklyEmail"));
		WebElement monthlyEmailUpdatesElement = driver.findElement(By.id("MainContent_checkMonthlyEmail"));
		WebElement occasionalUpdatesElement = driver.findElement(By.id("MainContent_checkUpdates"));
		WebElement buttonElement = driver.findElement(By.id("MainContent_btnSubmit"));

		// setting the data

		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElement.sendKeys(phone);
		passwordElement.sendKeys(password);
		vPasswordElement.sendKeys(verifyPasword);

		new Select(countryElement).selectByVisibleText(country);

		// Gender
		if (gender.equals(MALE_CONSTANT)) {
			maleRadio.click();
		} else {
			femaleRadio.click();
		}

		// Weekly Email Updates
		if (weeklyUpdates) {
			if (!weeklyEmailUpdateElement.isSelected()) {
				weeklyEmailUpdateElement.click();
			}
		} else {
			if (weeklyEmailUpdateElement.isSelected()) {
				weeklyEmailUpdateElement.click();
			}
		}

		// Monthly Email Updates
		if (monthlyUpdates) {
			if (!monthlyEmailUpdatesElement.isSelected()) {
				monthlyEmailUpdatesElement.click();
			}
		} else {
			if (monthlyEmailUpdatesElement.isSelected()) {
				monthlyEmailUpdatesElement.click();
			}
		}

		// Occasional Email Updates
		if (occasionalUpdates) {
			if (!occasionalUpdatesElement.isSelected()) {
				occasionalUpdatesElement.click();
			}
		} else {
			if (occasionalUpdatesElement.isSelected()) {
				occasionalUpdatesElement.click();
			}
		}

		// Click on submit button
		buttonElement.click();

		// Confirmation Message
		String confMessage = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		System.out.println(confMessage);

		// Conditional Test
		if (confMessage.equals(SUCCESS_MESSAGE)) {
			System.out.println(YES_CONSTANT);
		} else {
			System.out.println(NO_CONSTANT);
		}

		// Close the browser
		driver.close();

	}

	private static String getPageTitle(WebDriver driver) {
		return pageTitle = driver.getTitle();
	}

}
