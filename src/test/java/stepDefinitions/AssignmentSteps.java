package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AssignmentSteps {
	
	WebDriver driver;
	
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		driver.get("https://www.learningmanagementsystem.com/manage");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_assignment_page() {
		driver.findElement(By.xpath("//a[@href='assignment']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff Should see a Header \"Manage Assignment")
	public void admin_user_staff_should_see_a_header_manage_assignment() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Manage Assignment",driver.getTitle());
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff Should see a Footer text \"In Total there are {int} assignments")
	public void admin_user_staff_should_see_a_footer_text_in_total_there_are_assignments(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement footer= driver.findElement(By.xpath("//div[@id='footer']")); 
		WebElement footerText = driver.findElement(By.linkText("footer"));
		
		Assert.assertEquals("In total there are 3 assignments", footerText.getText());
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on Assignment Page")
	public void admin_user_staff_is_on_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.learningmanagementsystem.com/assignment");
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Next")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to previous page")
	public void admin_user_staff_should_be_navigated_to_previous_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Prev")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to Last page")
	public void admin_user_staff_should_be_navigated_to_last_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new io.cucumber.java.PendingException();
	}

}
