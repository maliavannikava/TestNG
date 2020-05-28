package com.class03;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.utils.ConfigsReader;
import com.syntax.utils.PageInitializer;


public class LoginTest extends PageInitializer{
	
	
	@Test
	public void validAdminLogin() {
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		
		//DashBoardPageElements db=new DashBoardPageElements();
		String expectedUser="Welcome Admin";
		String actualUser=dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is NOT logged in");
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
	}
	
	public void invalidAdminLogin() {
		sendText(login.username, ConfigsReader.getProperty("marga"));
		sendText(login.password, ConfigsReader.getProperty("mmmm"));
		String expectedText="Invalid credentials";
		String actualText=login.errorMsg.getText();
		Assert.assertEquals(actualText, expectedText, "Error message is not correct");
	}
}
