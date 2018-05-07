package org.sgcib.itec.fcc.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	
	@Given("^I am a customer with (.*) on my account (.*)")
	public void saveAcountIdBalance(double balance, String account) {
	
		// TODO
		}
	
	
	@When("^I check my account (.*)")
	public void chekAccountId(String account) throws Throwable {
		// TODO
		
	}
	
	@Then("^my balance should be (.*)")
	public void checkBalanceByAccountAndBalanceIn(double balance) {
		// TODO

	}
	
	
}
