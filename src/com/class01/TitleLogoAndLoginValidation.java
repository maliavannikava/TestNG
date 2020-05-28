package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class TitleLogoAndLoginValidation extends CommonMethods{
	
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
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title validation passed");
		}else {
			System.out.println("Title validation failed");
		}
	}
	
	@Test
	public void logoValidation() {
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		if(logo.isDisplayed()) {
			System.out.println("Logo validation passed");
		}else {
			System.out.println("Logo validation failed");
		}
	}
	
	@Test
	public void validLogin() {
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.id("btnLogin")));
	}
}
