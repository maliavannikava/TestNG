package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Captcha extends CommonMethods {
	// TODO Auto-generated constructor stub
	public static void main (String []args) {
	//https://ww5.fmovie.sc/search-query/lighthouse/
	setUp();
	WebElement element=driver.findElement(By.className("recaptcha-checkbox-border"));
	jsClick(element);
	
	}
}
