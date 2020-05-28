package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Task extends CommonMethods{

	
		@BeforeMethod
		public void  openAndNavigate() {
			setUp();
		    wait(3);
		}
		
		@AfterMethod
		public void  quitBrowser() {
			tearDown();
		}
		@Test
		public void logoValidation() {
			LoginPageElements login=new LoginPageElements();
			DashBoardPageElements dashboard=new DashBoardPageElements();
			boolean logoIsDisplayed=login.logo.isDisplayed();
			
			Assert.assertTrue(logoIsDisplayed, "Logo is not displayed");
		
			sendText(login.username, ConfigsReader.getProperty("username"));
			sendText(login.password, ConfigsReader.getProperty("password"));
			
			wait(1);
			login.loginBtn.click();
			wait(2);
			
			boolean msgDisplayed=dashboard.welcome.isDisplayed();
			Assert.assertTrue(msgDisplayed);
			System.out.println(msgDisplayed);
		}
}
