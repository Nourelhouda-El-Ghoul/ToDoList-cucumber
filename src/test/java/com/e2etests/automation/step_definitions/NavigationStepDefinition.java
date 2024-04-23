package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.NavigationPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefinition {
	
	private NavigationPage navigationPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public NavigationStepDefinition() {
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
		this.navigationPage = new NavigationPage();

	}
	
	@When("je ne suis pas identife")
	public void jeNeSuisPasIdentife() {
		String currentUrl = seleniumUtils.getCurrentUrl();
		validations.assertEquals(currentUrl, configFileReader.getProperties("home.url"));

	}
	
//	@Then("les liens tache et deconnxion ne sont pas affiches")
//	public void lesLiensTacheEtDeconnxionNeSontPasAffiches() {
		//validations.assertTrueBoolean(navigationPage.taskLink);
	    //validations.assertTrueBoolean(navigationPage.deconnectionLink);
		
	//}


	@Then("les liens {string} n est pas affiche")
	public void lesLiensNEstPasAffiche(String text) {
		String task = navigationPage.taskLink.getText();
		Assert.assertEquals(text, task);

	}
	@Then("le lien {string} n est pass affiche")
	public void leLienNEstPassAffiche(String text) {
		String deconnexion = navigationPage.deconnectionLink.getText();
		Assert.assertEquals(text, deconnexion);


	}





}