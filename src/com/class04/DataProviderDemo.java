package com.class04;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.utils.PageInitializer;

public class DataProviderDemo extends PageInitializer{
	
	@Test
	public void login(String username, String password, int age) {
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginBtn);
		
		boolean isDisplayed=dashboard.welcome.isDisplayed();
		Assert.assertTrue(isDisplayed, "Welcome message is not displayed");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {
				{"Admin", "Hum@nhrm123", 23},
				{"Syntax", "Syntax123!", 15},
				{"SyntaxUser", "Syntax123!", 46},};
		
		Object[][] data2=new Object[3][3];
		data2[0][0]="Admin";
		data2[0][1]="Hum@nhrm123";
		data2[0][2]=23;
		
		data2[1][0]="Syntax";
		data2[1][1]="Syntax123!";
		data2[1][2]=15;
		
		data2[2][0]="SyntaxUser";
		data2[2][1]="Syntax123!";
		data2[2][2]=46;
		return data;
	}
}
