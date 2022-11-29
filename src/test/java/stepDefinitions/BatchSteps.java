package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BatchPageObjects;

public class BatchSteps {
	
	BatchPageObjects batchpgObj;

	@Given("Admin is on Manage Batch page")
	public void admin_is_on_manage_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin see header text as \"Delete Confirm")
	public void admin_see_header_text_as_delete_confirm() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
	    batchpgObj.DeleteIndividualRecord_ConfirmYes();
	}

	
	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
		batchpgObj.DeleteIndividualRecord_ConfirmNo();
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff  is on Manage Batch page")
	public void admin_user_staff_is_on_manage_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User\\/Staff is on Manage Batch page")
	public void user_staff_is_on_manage_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User\\/Staff see a Error message \"Only Admin have Access")
	public void user_staff_see_a_error_message_only_admin_have_access() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff selects more than one Batch Name using checkbox")
	public void admin_user_staff_selects_more_than_one_batch_name_using_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin selects more than one Batch Name using checkbox")
	public void admin_selects_more_than_one_batch_name_using_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin Clicks on Enabled Delete button after selecting  more than one Batch Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_batch_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin see Success message \"\"Program Deleted Succesfully")
	public void admin_see_success_message_program_deleted_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User\\/Staff selects more than one Batch  Name using checkbox")
	public void user_staff_selects_more_than_one_batch_name_using_checkbox() {
	    batchpgObj.DeleteMultipleRecords_ConfirmYes();
	}

	@When("User\\/Staff Cicks on Enabled Delete button on the top left hand side")
	public void user_staff_cicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
