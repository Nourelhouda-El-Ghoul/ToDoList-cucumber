package com.e2etests.automation.page_objects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;


public class NavigationPage {


	/* @FindBy */

	@FindBy(how = How.LINK_TEXT, using = "Tâches")
	public static WebElement taskLink;

	@FindBy(how = How.LINK_TEXT, using = "Déconnexion")
	public static WebElement  deconnectionLink;
	

	public NavigationPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
}