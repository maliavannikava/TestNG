package com.class03;

import org.testng.annotations.Test;

import com.syntax.utils.ConfigsReader;
import com.syntax.utils.PageInitializer;

public class AddEmployeeTest extends PageInitializer{

	@Test
	public void addEmployeePage() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(7);	
	}
}
