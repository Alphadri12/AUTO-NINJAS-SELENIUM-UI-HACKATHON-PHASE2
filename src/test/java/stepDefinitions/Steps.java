package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPage;

@SuppressWarnings("deprecation")
public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	@Given("Admin/User/Staff is on Browser")
	public void admin_user_staff_is_on_browser() {
	  System.setProperty("webdriver.msedge.driver","C:\\J2EE-Workspace\\LMSUI-HACKATHON_BDDCUCUMBER\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
	  lp = new LoginPage(driver); 
	}

	@When("Admin/User/Staff opens the LMS website")
	public void admin_user_staff_opens_the_lms_website() {
		
	   driver.get("www.lms.com"); 
	}

	@Then("Admin/user/Staff should be navigated to login page")
	public void admin_user_staff_should_be_navigated_to_login_page() {
	  lp.hitLogin();
	  	}
	
	@When("User clicks login button after entering name and Password")
	public void user_clicks_login_button_after_entering_name_and_password() {
	    lp.setUserName("User Name");
	    lp.setPassword("Password@22");
	    lp.clickLogin();
	}

	@Then("User see header text as {string}")
	public void user_see_header_text_as(String text) {
	    if(driver.getPageSource().contains("Manage Programs")) {
	    	Assert.assertEquals(text,driver.getTitle());
	    }
	    else {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	}

	@Given("Admin/staff is on Login Page")
	public void admin_staff_is_in_login_page(String text) {
	  Assert.assertEquals(text,driver.getTitle());
	}

	@When("Admin/Staff  clicks login Button after entering  Username,Password,code")
	public void admin_staff_clicks_login_button_after_entering_username_password_code() {
		 lp.setUserName("User Name");
		 lp.setPassword("Password@22");
		 lp.enterCode("12345");
		 lp.clickLogin();
	}

	@Then("Admin/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String header) {
		if(driver.getPageSource().contains("Manage Programs")) {
	    	Assert.assertEquals(header,driver.getTitle());
	    }
	    else {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	}

	@Given("User  is on Login Page")
	public void user_is_on_login_page(String text) {
		Assert.assertEquals(text,driver.getTitle()); 
	}

	@When("User clicks login button after entering valid Username and invalid Password")
	public void user_clicks_login_button_after_entering_valid_username_and_invalid_password() {
		lp.setUserName("User Name");
	    lp.setPassword("Password22");
	    lp.clickLogin();
	}

	@Then("User should see a error message {string}")
	public void user_should_see_a_error_message() {
		lp.errormsg();
	    }
	

	@When("User clicks login button after entering  Invalid username and valid Password")
	public void user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
		lp.setUserName("User");
	    lp.setPassword("Password@22");
	    lp.clickLogin();
	}

	@When("User clicks login button after entering Invalid username and invalid Password")
	public void user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {
		lp.setUserName("User");
	    lp.setPassword("Password22");
	    lp.clickLogin();
	}

	@When("User clicks login button after entering valid username and leaves Password field empty")
	public void user_clicks_login_button_after_entering_valid_username_and_leaves_password_field_empty() {
		lp.setUserName("User Name");
	    lp.setPassword("");
	    lp.clickLogin();
	}

	@Then("It should show error message {string}")
	public void it_should_show_error_message(String string) {
	    lp.errormsg();
	}

	@Given("Admin/Staff is on Login Page")
	public void admin_staff_is_on_login_page(String text) {
		Assert.assertEquals(text,driver.getTitle());
	}

	@When("Admin/Staff  clicks login button after entering  valid username invalid Password and code")
	public void admin_staff_clicks_login_button_after_entering_valid_username_invalid_password_and_code() {
		lp.setUserName("User Name");
		 lp.setPassword("Password22");
		 lp.enterCode("12345");
		 lp.clickLogin();
	}

	@Then("Admin/Staff should see a error message {string}")
	public void admin_staff_should_see_a_error_message(String string) {
	   lp.errormsg();
	}

	@When("Admin/Staff  clicks login button after entering invalid username,valid Password and code")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_code() {
		lp.setUserName("User");
		 lp.setPassword("Password@22");
		 lp.enterCode("12345");
		 lp.clickLogin();
	}

	@When("Admin/Staff  clicks login button after entering invalid username,valid Password  and without code")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_without_code() {
		lp.setUserName("User");
		 lp.setPassword("Password@22");
		 lp.enterCode("");
		 lp.clickLogin();
	}

	@Given("Admin/User/Staff is on Login Page")
	public void admin_user_staff_is_on_login_page(String text) {
		Assert.assertEquals(text,driver.getTitle()); 
	}

	@When("Admin/User/Staff clicks Forgot password link")
	public void admin_user_staff_clicks_forgot_password_link() {
	    lp.resetPassword();
	}

	@Then("It should redirected to forgot Password page")
	public void it_should_redirected_to_forgot_password_page(String text) {
	    Assert.assertEquals(text, driver.getTitle());
	}

	@Given("Admin/User/Staff is on Forgot Password Page")
	public void admin_user_staff_is_on_forgot_password_page() {
	    lp.enterEmail();
	}

	@When("Admin/User/Staff  clicks continue after entering valid email address")
	public void admin_user_staff_clicks_continue_after_entering_valid_email_address() {
	    lp.hitcontinue();
	}

	@Then("Admin/User/Staff should be redirected to enter verification code page and verification code will be sent to email")
	public void admin_user_staff_should_be_redirected_to_enter_verification_code_page_and_verification_code_will_be_sent_to_email() {
	    Assert.assertEquals("Enter the verification code", driver.getTitle());
	}

	@Given("Admin/User/Staff is on Enter verification code Page")
	public void admin_user_staff_is_in_enter_verification_code_page() {
	    lp.verificationCode();
	}

	@When("Admin/User/Staff  clicks continue after entering verification code")
	public void admin_user_staff_clicks_continue_after_entering_verification_code() {
	    lp.hitcontinue();
	}
	
	@Then("Admin/User/Staff should be redirected reset password page")
	public void admin_user_staff_should_be_redirected_reset_password_page() {
		Assert.assertEquals("Type in new password", driver.getTitle());

	}
	@When("Admin/User/Staff clicks Click here link to resend")
	public void admin_user_staff_clicks_click_here_link_to_resend() {
	    lp.resendCode();
	}
	@Then("The verification code should be resend to email")
	public void the_verification_code_should_be_resend_to_email() {
		lp.hitcontinue();
	}

	@Given("Admin/User/Staff is on Reset Password Page")
	public void admin_user_staff_is_on_reset_password_page() {
		lp.verificationCode();
	}

	@When("Admin/User/Staff clicks submit button after entering new password and retype password")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_type_password() {
		lp.hitcontinue();
	}

	@Then("Admin/User/Staff  should be redirected to login page")
	public void admin_user_staff_should_be_redirected_to_login_page() {
		Assert.assertEquals("Type in new password", driver.getTitle());
	}

	@Then("Admin/User/Staff  should see an error message {string}")
	public void admin_user_staff_should_see_an_error_message(String string) {
		lp.errormsg();
	}

	@When("Admin/User/Staff clicks submit button after entering password  with less than {int} characters")
	public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_characters(Integer int1) {
		 lp.setPassword("Pass");
		    lp.clickLogin();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
		lp.errormsg();
	}

	@When("Admin/User/Staff clicks submit button after entering password without Capital letter")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter() {
		 lp.setPassword("password@22");
		    lp.clickLogin();
	}

	@When("Admin/User/Staff clicks submit button after entering  password without Number")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_number() {
		 lp.setPassword("Password@");
		    lp.clickLogin();
	}

	@When("Admin/User/Staff clicks submit button after entering password without Special character")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character() {
		 lp.setPassword("Password22");
		    lp.clickLogin();
	}

	@When("Admin/User/Staff clicks cancel button after entering new password and retype password")
	public void admin_user_staff_clicks_cancel_button_after_entering_new_password_and_retype_password() {
		 lp.setPassword("Password@22");
		 lp.reType();
		 lp.Cancel();
	}

	@Then("Admin/User/Staff  should see a refreshed reset password page with empty fields")
	public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields() {
		Assert.assertEquals("Type in new password", driver.getTitle());
}
}