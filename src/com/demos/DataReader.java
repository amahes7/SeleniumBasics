package com.demos;

import java.util.List;

import com.utilities.CSVReader;

public class DataReader {
	static String fileLocation = "C:\\Users\\MA08578\\Desktop\\Selenium\\UserAccounts.csv";
	static CSVReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readCSV();
	}

	public static void readCSV() {
		List<String[]> records = reader.get(fileLocation);
		for (String[] record : records) {
			for (String fields : record) {
				System.out.println(fields);
			}
			System.out.println("~~~~~~~~~~~~~~~~~End!!~~~~~~~~~~~~~~~~~~~~~~");
		}

	}

}
