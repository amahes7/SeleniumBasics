package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Define the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MA08578\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. open and navigate to the address in the Chrome
		// address : http://sdettraining.com/trguitransactions/AccountManagement.aspx
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");

		// 3. Enter details
		String pageTitle=driver.getTitle();
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("tim1@testemail.com");
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("trpass");
		System.out.println(pageTitle);
		// Click the submit button
		driver.findElement(By.id("MainContent_btnLogin")).click();

		// confirming
		String pageTitle1=driver.getTitle();
		try {
			String message = driver.findElement(By.id("conf_message")).getText();
			if (message.equalsIgnoreCase("Logged in successfully")) {
				System.out.println("Yes");
				System.out.println(pageTitle1);
			}
		} catch (NoSuchElementException e) {
			System.out.println("No");
			System.out.println(pageTitle1);
		}
		
		// Close the browser
		driver.close();

	}

}
