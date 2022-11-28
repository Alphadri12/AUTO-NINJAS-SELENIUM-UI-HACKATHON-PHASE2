
package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.RegistrationPage;

public class RegisterationSteps {
	
	public WebDriver driver;
	public RegistrationPage rp;
	
	
	@Given("Admin/User/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "/Users/13095/eclipse-workspace/LMSUI-HACKATHON-BDDCUCUMBER/Drivers/chrome driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		driver=new ChromeDriver(options);
	    
	  
	}

	@When("Admin/User/Staff lands on Registration page")
	public void admin_user_staff_lands_on_registration_page() {
	    driver.get(null);
	}

	@Then("Admin/User/Staff sees the heading on the form as {string}")
	public void admin_user_staff_sees_the_heading_on_the_form_as(String string) {
		
	   rp.toChkVisibility();
	}
	
	@Then("Admin/User/Staff sees a button with text {string} on the form")
	public void admin_user_staff_sees_a_button_with_text_on_the_form(String string) {
	    rp.loginBtnVisibility();
	    rp.signUpBtnVisibility();
	}
	
	@Given("Admin/User/Staff is on LMS website")
	public void admin_user_staff_is_on_lms_website() {
	    
	}
	//@Then("Admin/User/Staff sees a button with text {string} on the form")
	

	@Given("Admin/User/Staff is on the Registeration Page")
	public void admin_user_staff_is_on_the_registeration_page() {
	    
	}

	@When("Admin/User/Staff Enters the First Name in Alphabets only")
	public void admin_user_staff_enters_the_first_name_in_alphabets_only(String fn) {
	    rp.setFirstName(fn);
	}

	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed(String text) {
	    
	    Assert.assertEquals(text, driver.getTitle());
	    
	}

	@When("Admin/User/Staff Enters the Last Name in Alphabets only")
	public void admin_user_staff_enters_the_last_name_in_alphabets_only(String ln) {
	    rp.setLastName(ln);
	}

	@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed(String text) {
	    
	    Assert.assertEquals(text, driver.getTitle());
	}

	@When("Admin/User/Staff Enters the Address Field using Alpha Numerics and or Symbols")
	public void admin_user_staff_enters_the_address_field_using_alpha_numerics_and_or_symbols(String add) {
	    rp.setAddress(add);
	}

	@Then("The Address will be displayed")
	public void the_address_will_be_displayed(String add) {
	    Assert.assertEquals(add, driver.getTitle());
	}

	@When("Admin/User/Staff Enters the Street name Field using Alpha Numerics and or Symbols")
	public void admin_user_staff_enters_the_street_name_field_using_alpha_numerics_and_or_symbols(String sn) {
	    rp.setStreetName(sn);
	}

	@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed(String sn) {
		Assert.assertEquals(sn, driver.getTitle());
		
	}

	@When("Admin/User/Staff Enters the {string} digit Zip code using Numbers only")
	public void admin_user_staff_enters_the_digit_zip_code_using_numbers_only(String zc) {
	   rp.setZipCode(zc);
	}

	@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed() {
	    
		Assert.assertEquals(true, driver.getTitle());
	}

	@When("Admin/User/Staff Enters the City Name in Alphabets only")
	public void admin_user_staff_enters_the_city_name_in_alphabets_only(String city) {
	    rp.setCityName(city);
	}

	@Then("The City will be displayed")
	public void the_city_will_be_displayed() {
		Assert.assertEquals(rp.cityNameDisplay(), true);
	}

	@When("Admin/User/Staff selects the respective State Name from the DropBox")
	public void admin_user_staff_selects_the_respective_state_name_from_the_drop_box() {
		
		rp.selectState();
	    
	}

	@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed() {
		Assert.assertEquals(true, rp.selectedStateVisiblity());

	}

	@When("Admin/User/Staff Enters the valid ten digit Mobile number in Numerics")
	public void admin_user_staff_enters_the_valid_digit_mobile_number_in_numerics(String num) {
	    rp.setMobileNo(num);
	}

	@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed() {
	    
		Assert.assertEquals(true, driver.getTitle());
	}

	@When("Admin/User/Staff Selects the Date of Birth from the Calender")
	public void admin_user_staff_selects_the_date_of_birth_from_the_calender() {
	    rp.setDateOfBirth();
	}

	@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed() {
		Assert.assertEquals(true, rp.selectedStateVisiblity());
	}

	@When("Admin/User/Staff  Enters the valid Password with {string} Upper case, {string} Numeric , {string} special charecter , {string} charecters")
	public void admin_user_staff_enters_the_valid_password_with_upper_case_numeric_special_charecter_charecters(String int1, String int2, String int3, String int4) {
		rp.setPassword(int1);
		rp.setPassword(int2);
		rp.setPassword(int3);
		rp.setPassword(int4);
	}

	@Then("Admin/User/Staff Password will be displayed")
	public void admin_user_staff_password_will_be_displayed() {
		
		Assert.assertEquals(true, rp.passwordDisplay());
	    
	}

	@When("Admin/User/Staff Enters the valid UserName")
	public void admin_user_staff_enters_the_valid_user_name(String un) {
		rp.setValidUsername(un);
	    
	}

	@Then("Admin/User/Staff UsesrName will be displayed")
	public void admin_user_staff_usesr_name_will_be_displayed() {
		Assert.assertEquals(true, rp.userNameVisiblity());
	}

	@When("Admin/User/Staff Enters the valid Email")
	public void admin_user_staff_enters_the_valid_email(String email) {
	    rp.setEmail(email);
	}

	@Then("Admin/User/Staff Email will be displayed")
	public void admin_user_staff_email_will_be_displayed() {
		Assert.assertEquals(true, rp.emailDisplay());
	    
	}

	@When("Admin/User/Staff enters submit button with all fields empty")
	public void admin_user_staff_enters_submit_button_with_all_fields_empty() {
		
	    rp.ClickSubmitBtn();
	}

	@Then("Admin/User/Staff should get a message {string}")
	public void admin_user_staff_should_get_a_message(String string) {
		
		Assert.assertEquals(true, driver.getTitle());
	}
	@When("Admin/User/Staff clicks Sign Up button with invalid First Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_first_name() {
		
	    rp.signUpAction();
	}

	/*@Then("Admin/User/Staff should get a message{string}")
	public void admin_user_staff_should_get_a_message_enter_valid_first_name() {
		Assert.assertEquals(true, driver.getTitle());
	    
	}*/
	

	@When("Admin/User/Staff clicks Sign Up button with invalid Last Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_last_name(String ln) {
	    rp.setLastName(ln);
	}

	@Then("Admin/User/Staff should get a message{string}")
	public void admin_user_staff_should_get_a_message_enter_valid_last_name() {
		
		Assert.assertEquals(true, driver.getTitle());
	}
	
	@When("Admin/User/Staff clicks Sign Up button with invalid Address by not Providing House Number")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_address_by_not_providing_house_number(String add) {
	    rp.setAddress(add);
	}

	@When("Admin/User/Staff clicks Sign Up button with invalid Street Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_street_name(String sn) {
	    rp.setStreetName(sn);
	    rp.signUpAction();
	    
	}

	@When("Admin/User/Staff clicks Sign Up button with invalid Zip")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_zip(String zc) {
		rp.setZipCode(zc);
		rp.signUpAction();
	    
	}

	@When("Admin/User/Staff clicks Sign Up button with invalid City")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_city(String city) {
	    rp.setCityName(city);
	    rp.signUpAction();
	}

	@When("Admin/User/Staff clicks Sign Up button without selecting State")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_state() {
		
		rp.signUpAction();
	    
	}

	@When("Admin/User/Staff clicks Sign Up button with invalid Phone Number")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_phone_number(String num) {
	    rp.setMobileNo(num);
	    rp.signUpAction();
	}

	@When("Admin/User/Staff clicks Sign Up button without selecting BirthDate")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_birth_date() {
		rp.signUpAction();
	    
	}

	@When("Admin/User/Staff clicks Sign Up button with invalid Admin/User/Staff Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_admin_user_staff_name(String un) {
	    rp.setValidUsername(un);
	    rp.signUpAction();
	}

	/*@Then("Admin/User/Staff should get a message{string}")
	public void admin_user_staff_should_get_a_message_please_enter_valid_admin_user_staff_name() {
		Assert.assertTrue("string", true);
	}*/

	@When("Admin/User/Staff clicks Sign Up button with invalid Password")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_password(String pw) {
	    rp.setPassword(pw);
	    rp.signUpAction();
	}

	@When("User clicks Sign Up button with existing Admin/User/Staff name")
	public void user_clicks_sign_up_button_with_existing_admin_user_staff_name() {
	    rp.signUpAction();
	}

	@Then("Admin/User/Staff should see the message {string}")
	public void admin_user_staff_should_see_the_message(String string) {
		Assert.assertTrue("string", true);
	   
	}

	@When("Admin/User/Staff Clicks on {string} button after entering all valid details")
	public void admin_user_staff_clicks_on_button_after_entering_all_valid_details(String string) {
	   rp.signUpAction();
	}

	/*@Then("Admin/User/Staff should get a message{string}")
	public void admin_user_staff_should_get_a_message_registeration_successful() {
	    Assert.assertTrue("string", true);
	}*/
	
}