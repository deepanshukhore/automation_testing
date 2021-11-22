package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinations {
	
	@Given("^user is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		
		System.out.println("net banking");
		throw new PendingException();
		
	}
	@When("^user login with username and password$")
	public void user_login_with_username_and_password() throws Throwable{
		System.out.println("login with username and password");
		throw new PendingException();
	}
	@Then("^home page is populated$")
	public void home_page_is_populated() throws Throwable{
		System.out.println("home is populated");
		throw new PendingException();
	}	  
	@And("^cards are displayed$")
	public void cards_are_displayed() throws Throwable{
		System.out.println("cards is displayed");
		throw new PendingException();
	}
}
