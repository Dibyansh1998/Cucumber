package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on NetBanking Landing Page$")
	public void User_is_on_NetBanking_Landing_Page() throws Throwable {
		System.out.println("navigated to landing page");
	}

	@When("^User log into application with Username and Password$")
	public void User_log_into_application_with_Username_and_Password() throws Throwable {
		System.out.println("Successfully Login with Correct Credentails.");
	}

	@Then("^Home Page is populated$")
	public void Home_Page_is_populated() throws Throwable {
		System.out.println("Home Page is opening");
	}

	@And("^Cards are displayed$")
	public void Cards_are_displayed() throws Throwable {
		System.out.println("All the Card are displayed.");

	}
}
