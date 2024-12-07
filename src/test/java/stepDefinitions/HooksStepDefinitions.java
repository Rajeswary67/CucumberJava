package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinitions {

	@Before
	public void setup()
	{
		System.out.println("launch chrome browser");
		System.out.println("Entered URL of application");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Closed browser");
	}

	@Given("user is on add customer page")
	public void user_is_on_add_customer_page() {
		 System.out.println("User is on add customer page");	

	}
	@When("user fills the customer details")
	public void user_fills_the_customer_details() {
		System.out.println("Closed browser");

	}
	@Then("customer is added")
	public void customer_is_added() {
		 System.out.println("User is on add customer page");	
		 System.out.println("User fills the customer details");
	}


	@Given("user is on edit customer page")
	public void user_is_on_edit_customer_page() {
		System.out.println("customer is added");
		System.out.println("user is on edit customer page");
	}
	@When("user edits contact details")
	public void user_edits_contact_details() {
		System.out.println("user edits the contact detail");
	}
	@Then("contact details updated")
	public void contact_details_updated() {
		System.out.println("contact details updated");
	}

	

	@Given("user is on delete customer page")
	public void user_is_on_delete_customer_page() {
		System.out.println("user is on delete customer page");
	}
	@When("user delete customer")
	public void user_delete_customer() {
		System.out.println("user is on delete customer page");
	}
	@Then("customer deleted")
	public void customer_deleted() {
		System.out.println("customer deleted");

	}





}
