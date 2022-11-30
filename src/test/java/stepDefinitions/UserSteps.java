package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPageObjects;

public class UserSteps {
	
	UserPageObjects userpgObj;
	
	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the button with text {string}")
	public void admin_user_staff_should_see_the_button_with_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the {string} dialog box")
	public void admin_user_staff_should_see_the_dialog_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the table header as Empty checkbox-icon,ID with sort icon, Name with Sort icon, Email Address with sort icon, Contact Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void admin_user_staff_should_see_the_table_header_as_empty_checkbox_icon_id_with_sort_icon_name_with_sort_icon_email_address_with_sort_icon_contact_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Verify the functionality of sort icon present in table header")
	public void verify_the_functionality_of_sort_icon_present_in_table_header() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("No rows is checked")
	public void no_rows_is_checked() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    userpgObj.DeleteIndividualUserRecord_ConfirmNo();
	}

	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    userpgObj.DeleteIndividualUserRecord_ConfirmYes();
	}

	@When("Admin\\/User\\/Staff clicks button with text {string}")
	public void admin_user_staff_clicks_button_with_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
	    // Write code here that turns the phrase above into concrete actions
	    userpgObj.DeleteMultipleUserRecords_ConfirmNo();
	}

	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    userpgObj.DeleteMultipleUserRecords_ConfirmYes();
	}

	@When("Admin\\/User\\/Staff clicks the close\\(x) icon")
	public void admin_user_staff_clicks_the_close_x_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
