package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class ToDoPageObject {

	

	/* @FindBy */

	@FindBy(how = How.XPATH, using = "//input[contains(@type, 'email')]")
	public static WebElement emailInput;

	@FindBy(how = How.XPATH, using = "//input[contains(@type, 'password')]")
	public static WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@type, 'submit')]")
	public static WebElement envoyerButton;
	
	@FindBy(how = How.CLASS_NAME, using = "alert-danger")
	public static WebElement messgae;
	


	public ToDoPageObject() {
		PageFactory.initElements(Setup.driver, this);
	}


}