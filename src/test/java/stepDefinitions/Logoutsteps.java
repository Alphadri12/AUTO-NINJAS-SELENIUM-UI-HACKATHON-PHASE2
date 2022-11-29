package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.Logoutpage;



public class Logoutsteps {
	
	public Logoutpage lop;
	
	@Given("Admin/User/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		lop.verifyTitle();
	}

	@When("Admin/User/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() {
	   lop.LogOut();
	}

	@Then("Admin/User/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen(String text) {
	   lop.headerLogin(text);
	}

}
