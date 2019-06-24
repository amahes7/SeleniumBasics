package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver webDriver(String browserType) {

		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MA08578\\Desktop\\Selenium\\chromedriver.exe");
			return new ChromeDriver();
		} else { // more conditions can be applied if there are more drivers.
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MA08578\\Desktop\\Selenium\\chromedriver.exe");
			return new ChromeDriver();
		}
	}

}
