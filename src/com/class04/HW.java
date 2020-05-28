package com.class04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.utils.ConfigsReader;
import com.syntax.utils.PageInitializer;

public class HW extends PageInitializer{
	
	@Test
	public void test(String firstName, String lastName, String username, String password) {
		//System.out.println(firstName+" "+lastName+" "+username+" "+password);
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= {
				{"Raj", "Capoor", "raj123", "AmirKhan123"},
				{"John", "Smith", "john123", "AmirKhan123"},
				{"Mary", "Ann", "mary123", "AmirKhan123"},
				{"Rohani", "Sakhi", "rohani123", "AmirKhan123"},
		};
		return data;
	}
}
