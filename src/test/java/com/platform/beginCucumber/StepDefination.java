package com.platform.beginCucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//glue= "com.platform.beginCucumber"
public class StepDefination {
	@Given("^I am on the customer login page$")
	public void i_am_on_the_customer_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Open login page");
	}
	@Then("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verify login page is open");
	}


	@When("^I enter username as \"([^\"]*)\"  and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Enter login id and password");
	}
	@When("^I enter  invalid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_invalid_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Enter invalid login id and password");
	}
	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Submit login page");
	}

	@Then("^I should be redirected to home page$")
	public void i_should_be_redirected_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Verify: current page is user home page");
	}
}
