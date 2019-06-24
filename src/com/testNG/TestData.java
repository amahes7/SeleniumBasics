package com.testNG;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.CSVReader;

public class TestData {
	public static CSVReader reader;
	
	@Test(dataProvider = "getData")
	public void test1(String name, String email, String phone) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}

	@DataProvider
	public List<String[]> getData() {
		return reader.get("C:\\Users\\MA08578\\Desktop\\Selenium\\UserAccounts.csv");
	}
}
