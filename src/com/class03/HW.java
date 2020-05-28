package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.syntax.utils.ConfigsReader;
import com.syntax.utils.PageInitializer;

public class HW extends PageInitializer{
	
	//As an admin while adding employee if 
	//I leave required fields empty I should see “Required” message
	
	@Test
	public void addEmployeePage() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(2);
		
		WebElement add=driver.findElement(By.id("btnSave"));
		click(add);
		
		wait(1);
		String expectedMsg="Requird";
		String actualMsg=driver.findElement(By.xpath("//span[@for='firstName']")).getText();
		if(actualMsg.equals(expectedMsg)) {
			System.out.println("The message is correct");
		}else {
			System.out.println("The message is NOT correct");
		}
		wait(2);
	}
}
