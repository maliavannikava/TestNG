package com.class02;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;

public class AssertionDemo extends CommonMethods{
	
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
	public void titleValidation() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
		System.out.println("Text after assertion");
	}
	
	@Test
	public void logoValidation() {
		LoginPageElements login=new LoginPageElements();
		boolean logoisDisplayed=login.logo.isDisplayed();	
	}
}
