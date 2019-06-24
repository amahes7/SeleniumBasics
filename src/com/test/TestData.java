package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.utilities.CSVReader;

@RunWith(value = Parameterized.class)
public class TestData {
	
	public static CSVReader reader;
	String name;
	String email;
	String phone;
	String country;

	public TestData(String name, String email, String phone, String gender, String password, String country,
			String weeklyEmail, String monthlyEmail, String occasionalEmail) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.country = country;

	}

	@Parameters
	public static List<String[]> getData() {
		return reader.get("C:\\Users\\MA08578\\Desktop\\Selenium\\UserAccounts.csv");
	}
	
	@Test
	public void test1() {
		System.out.println(name);
	}
	
	
}
