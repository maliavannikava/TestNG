package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeeElements {
	
	@FindBy (id="firstName")
	public WebElement firstName;
	@FindBy (id="lastName")
	public WebElement lastName;
	@FindBy (id="user_name")
	public WebElement username;
	@FindBy (id="user_password")
	public WebElement password;
	@FindBy (id="re_password")
	public WebElement passConfirm;
	@FindBy (id="btnSave")
	public WebElement saveBtn;
	@FindBy (id="chkLogin")
	public WebElement loginCheckbox;

}
