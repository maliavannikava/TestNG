package com.syntax.utils;

import com.class03.AddEmployeeTest;
import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.pages.PersonalDetailsPageElements;

public class PageInitializer extends CommonMethods{
	
	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static AddEmployeeTest addEmp;
	
	public static void initialize() {
	
		login=new LoginPageElements();
		dashboard=new DashBoardPageElements();
		pdetails=new PersonalDetailsPageElements();
		addEmp=new AddEmployeeTest();
		
	}
}
