package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.Batchpagesreeja;

public class Batchstepssreeja {
	public Batchpagesreeja bp; 
	
	@Given("Admin/User/Staff is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page() {
	    bp.verifyTitle();
	}

	@When("Admin/User/Staff Enters newly added  Batch Name in Search")
	public void admin_user_staff_enters_newly_added_batch_name_in_search() {
	    bp.Search();
	}

	@Then("Entry for the newly added Batch Name is shown")
	public void entry_for_the_newly_added_batch_name_is_shown() {
	   bp.Display();
	}
	
	@When("User/Staff/Staff Clicks on  {string} button")
	public void user_staff_staff_clicks_on_button(String string) {
	   bp.addNewBatch();
	}
		
	@Given("Admin is on Manage Batch page")
	public void admin_is_on_manage_batch_page() {
	    bp.verifyTitle();
	}

	@When("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_buttton() {
	    bp.Edit();
	    
	}

	@Given("Admin clicks on {string} botton")
	public void admin_clicks_on_botton(String Edit) {
	    bp.verifyHeader();
	}

	@When("Admin Clicks on Save Button after Name")
	public void admin_clicks_on_save_button_after_name(String name) {
	    bp.enterName(name);
	    bp.clickSave();
	}

	@Then("Admin see Success Updated Name")
	public void admin_see_success_updated_name() {
	   bp.readMsg();
	}

	@When("Admin Clicks on Save Button after Description")
	public void admin_clicks_on_save_button_after_description(String description) {
	    bp.enterDescription(description);
	    bp.clickSave();
	}

	@Then("Admin see Success Updated Description")
	public void admin_see_success_updated_description() {
		 bp.readMsg();
	}

	@When("Admin Clicks on Save Button after Selecting another Program Name")
	public void admin_clicks_on_save_button_after_selecting_another_program_name() {
	   bp.ddselect();
	   bp.clickSave();
	}

	@Then("Admin see Success Updated Program Name")
	public void admin_see_success_updated_program_name() {
		bp.readMsg();
	}

	@When("Admin Clicks on Save Button after Status")
	public void admin_clicks_on_save_button_after_status() {
	    bp.Status();
	    bp.clickSave();
	}

	@Then("Admin see Success Updated Status")
	public void admin_see_success_updated_status() {
		bp.readMsg();
	}

	@When("Admin Clicks on Save Button after No of Classes")
	public void admin_clicks_on_save_button_after_no_of_classes(String number) {
		bp.enterNoOfClasses(number);
		bp.clickSave();
	}

	@Then("Admin see Success Updated No of Classes")
	public void admin_see_success_updated_no_of_classes() {
		bp.readMsg();
	}
	@Given("Admin  Clicks on {string} button")
	public void admin_clicks_on_button(String Edit) {
		bp.Edit();
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
	    bp.Cancel();
	}

	@Then("Admin see a Batch Details window getting closed")
	public void admin_see_a_batch_details_window_getting_closed() {
		 bp.verifyTitle();
	}

	@Given("Admin/User/Staff is on Manage Batch page")
	public void admin_user_staff_is_on_manage_batch_page() {
		bp.verifyTitle();
	}

	@When("Admin/User/Staff  Enters edited Batch Name/Batch Description in Search")
	public void admin_user_staff_enters_edited_batch_name_batch_description_in_search() {
	   bp.Search();
	}

	@Then("Entry for the edited  Batch Name/Batch Description is shown")
	public void entry_for_the_edited_batch_name_batch_description_is_shown() {
	    bp.Display();
	}

	@Given("User/Staff is on Manage Batch page")
	public void user_staff_is_on_manage_batch_page() {
	    bp.verifyTitle();
	}

	@When("User/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
		bp.Edit();
	}

	@Then("User/Staff see a Error message  {string}")
	public void user_staff_see_a_error_message(String message) {
	    bp.Alert();
	}

}
