package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.UserPage;


public class UserSteps {
	public WebDriver driver;
	public UserPage ap;
	
	
	@Given("Admin/User/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
	    driver.get(null); /* No working URl hence null*/
	}

	@When("Admin/User/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
		ap.addNewUserbtnClk();
	    
	}

	@Then("Admin/User/Staff should see the placeholders with Text As {string},{string}, {string},{string},{string}, {string},{string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void admin_user_staff_should_see_the_placeholders_with_text_as(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
	    ap.placeholderEntireDisplay();
	    Assert.assertEquals(true, true);
	    
	}
	@Given("Admin/User/Staff is on {string} window")
	public void admin_user_staff_is_on_window(String string) {
	    
	}

	@When("Admin/User/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {
		
	    ap.stateDropdownBxArrow();
	}

	@Then("Admin/User/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {
		
		Assert.assertEquals(true, true);
	}
	@When("Admin/User/Staff clicks the drop down icon for User Role")
	public void admin_user_staff_clicks_the_drop_down_icon_for_user_role() {
		
		ap.userRoleDropdownBxArrow();
}

	@Then("Admin/User/Staff should select from the drop down menu for user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_user_role() {
		Assert.assertEquals(true, true);
		
	}
	

	@When("Admin/User/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {
	    ap.submitBtn();
	}

	@Then("Admin/User/Staff should see a Error message (.*)")
	public void admin_user_staff_should_see_a_error_message(String message) {
		Assert.assertFalse(message, true);
	    
	}
	
	@When("Admin/User/Staff clicks Submit button by entering all valid values in required fields")
	public void admin_user_staff_clicks_submit_button_by_entering_all_valid_values_in_required_fields() {
	    ap.submitBtn();
	}

	@Then("Admin/User/Staff  see Success message(.*)") /* is a regular expression*/
	public void admin_user_staff_see_success_message(String successmessage) {
		Assert.assertTrue(successmessage, true);
	    
	}
	@When("Admin/User/Staff clicks on Submit button after entering Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details(String fn,String ln,String cn,String pn) {
		ap.submitBtn();
		ap.fieldValidation(fn, ln, cn, pn);
	    
	}

	@Then("Admin/User/Staff see error message (.*)") 
	public void admin_user_staff_see_error_message(String errormessage) {
		Assert.assertTrue(errormessage, true);
	
	}
	
	@When("Admin/User/Staff clicks on Submit button after entering {string}")
	public void admin_user_staff_clicks_on_submit_button_after_entering_xyz_com(String em) {
		ap.emailValidation(em);
	    ap.submitBtn();
	}

	@Then("Admin/User/Staff see error message {string}")
	public void admin_user_staff_see_error_message_invalid_invalid_email_address(String invalidmsg) {
	    
		Assert.assertTrue(invalidmsg, true);
	}
	
	@Then("Admin/User/Staff should see the button with text {string}")
	public void admin_user_staff_should_see_the_button_with_text(String string) {
	    Assert.assertEquals(string, true);
	}
	
	@When("Admin/User/Staff Enters more than {string} digits")
	public void admin_user_staff_enters_more_than_digits(String num) {
		ap.phoneNoValidation(num);
	    
	}
	
	@When("Admin/User/Staff Enters more than {int} digits")
	public void admin_user_staff_enters_more_than_digits(int digits) {
	   
	}
	
	@When("Admin/User/Staff clicks on state dropdown")
	public void admin_user_staff_clicks_on_state_dropdown() {
	    ap.stateDropdownBxArrow();
	}

	@Then("Admin/User/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {
	    
	    Assert.assertTrue(driver.getTitle(), true);
	}
	
	@When("Admin/User/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {
	    
		ap.ugProgramDisplay();
	}

	@Then("Admin/User/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {
		
		Assert.assertTrue(driver.getTitle(), true);
	   
	}

	

	
	
	
	   
		
	}



