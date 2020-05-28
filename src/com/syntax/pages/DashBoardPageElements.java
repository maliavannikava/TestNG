package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods{
	
	@FindBy (id="welcome")
	public WebElement welcome;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public static WebElement logo;
	
	@FindBy(xpath ="//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	
	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver,  this);
	}
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
}
