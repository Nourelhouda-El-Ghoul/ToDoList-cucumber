package com.e2etests.automation.step_definitions;
import com.e2etests.automation.page_object.ToDoPageObject;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToDoStepDefinition {

	private ToDoPageObject toDoPageObject;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public ToDoStepDefinition() {
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.toDoPageObject = new ToDoPageObject();
		this.validations = new Validations();

	}

	@Given("je me rends sur le site todolist {string}")
	public void jeMeRendsSurLeSiteTodolist(String string) {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}
	
	@When("je laisse le champ login vide")
	public void jeLaisseLeChampLoginVide() {
		toDoPageObject.emailInput.clear();
		
		
	}
	@When("je laisse le champ password vide")
	public void jeLaisseLeChampPasswordVide() {
		toDoPageObject.passwordInput.clear();
	}
	@Then("le bouton envoyer est desactive")
	public void leBoutonEnvoyerEstDesactive() {
      validations.assertTrueBoolean(toDoPageObject.envoyerButton);
	}
	

	@When("je remplie le champ avec un email incorrect")
	public void jeRemplieLeChampAvecUnEmailIncorrect() {
	seleniumUtils.writeText(toDoPageObject.emailInput, configFileReader.getProperties("home.email"));


	}
	@When("je remplie le champ avec un password incorrect")
	public void jeRemplieLeChampAvecUnPasswordIncorrect() {
		seleniumUtils.writeText(toDoPageObject.emailInput, configFileReader.getProperties("home.password"));

	}
	@When("je clique sur le bouton envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		seleniumUtils.click(toDoPageObject.envoyerButton);
	}

	@Then("un messgae d'erreur s affiche {string}")
	public void unMessgaeDErreurSAffiche(String text) {
		validations.assertEquals(toDoPageObject.messgae, text);

	}










}
