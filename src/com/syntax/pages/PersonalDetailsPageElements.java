package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(id="personal_cmNation")
	WebElement nationalityDD;
	
	@FindBy(name="personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
