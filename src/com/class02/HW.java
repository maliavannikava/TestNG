package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;

public class HW extends CommonMethods{

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
	public void f() {
		
		WebElement username=driver.findElement(By.id("txtusername"));
		//1st way
		//username.sendKeys(ConfigsReader.getProperty("username"));
		
		//2nd way
		//sendText(username, ConfigsReader.getProperty("username"));
		
		//3rd way
		LoginPageElements login=new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//1st way
		WebDriverWait wait=new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		wait.until(ExpectedConditions.elementToBeClickable(login.loginBtn));
		login.loginBtn.click();
		
		
		//2nd way
		waitForClickability(login.loginBtn);
		login.loginBtn.click();
		
		//3rd way
		click(login.loginBtn);
	}
}
