package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.BatchPage;

public class BatchSteps {
	
	public WebDriver driver;
	public BatchPage bp;
	
	
	@Given("Admin/User/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
		//WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver", "/Users/13095/eclipse-workspace/LMSUI-HACKATHON-BDDCUCUMBER/Drivers/chrome driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				ChromeOptions options=new ChromeOptions();
				options.setHeadless(true);
				driver=new ChromeDriver(options);
	    
	}

	@When("Admin/User/Staff Clicks on Batch button")
	public void admin_user_staff_clicks_on_batch_button() {
		bp.batchBtnClk();
	    
	}

	@Then("Admin/User/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String string) {
	 bp.toChkVisibilityOfHeader();
	 Assert.assertEquals(string, driver.getTitle());
	 
	}
	@When("Admin/User/Staff is on Manage Batch page")
	public void admin_user_staff_is_on_manage_batch_page() {
	    
		driver.get(null); /*will be null as no working URl for this UI*/
	}

	@Then("Admin/User/Staff see  Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String string) {
		
		bp.toChkVisibilityOfFooter();
		Assert.assertEquals(string, driver.getTitle());
	    
	}
	@Then("Admin/User/Staff see the text as {string}")
	public void admin_user_staff_see_the_text_as(String string) {
		
	    bp.toChkVisibilityOfPaginator();
	    Assert.assertEquals(string, driver.getTitle());
	}
	

	@When("Admin/User/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		
	    bp.nextBtnClk();
	}

	@Then("Admin/User/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String string) {
		
		bp.toChkVisibilityOfPaginator();
		Assert.assertEquals(string, driver.getTitle());
	    
	}
	
	@When("Admin/User/Staff Clicks on Enabled paginator -prev button")
	public void  admin_user_staff_clicks_on_enabled_paginator_prev_button() {
	    bp.previousBtnClk();
	}
	
	@When("Admin/User/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
	    bp.lastBtnClk();
	}
	
	@When("Admin/User/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
	   bp.firstBtnClk();
	}
	@Then("Admin/User/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {
	   bp.textBxMsgVisiblity();
	   Assert.assertEquals(string, driver.getTitle());
	}
	
	@When("Admin/User/Staff enters (.*) to be searched")      /*(.*) is Regular expression */
	public void admin_user_staff_enters_batch_name_to_be_searched(String batchname) {
	    
	}

	@Then("Entries for the searched BatchName are shown.")
	public void entries_for_the_searched_batch_name_are_shown() {
	   
	}
	@Then("Entries for the searched Batch Description are shown.")
	public void entries_for_the_searched_batch_description_are_shown() {
	    
	}
	@Then("Entries for the searched Batch status are shown.")
	public void entries_for_the_searched_batch_status_are_shown() {
	    
	}
	/*@When("Admin/User/Staff enters (.*) to be searched")
	public void admin_user_staff_enters_to_be_searched(Integer NoOfClasses) {
	}    
	*/

	@Then("Entries for the searched No Of Classes are shown.")
	public void entries_for_the_searched_no_of_classes_are_shown() {
	    
	}
	
	@Then("Entries for the searched Program Name are shown.")
	public void entries_for_the_searched_program_name_are_shown() {
	    
	}
	
	@When("Admin/User/Staff Clicks on Batch Name Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_name_ascending_arrow() {
	    bp.ascendingOrderClk();
	}

	@Then("Admin/User/Staff see the Batch Name displayed in Ascending order")
	public void admin_user_staff_see_the_batch_name_displayed_in_ascending_order() {
	    
		
	}
	
	@When("Admin/User/Staff Clicks on Batch Description Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_description_ascending_arrow() {
		bp.ascendingOrderClk();
	}

	@Then("Admin/User/Staff see the Batch Description displayed in Ascending order")
	public void admin_user_staff_see_the_batch_description_displayed_in_ascending_order() {
	    
	}
	
	@When("Admin/User/Staff Clicks on Batch Status Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_status_ascending_arrow() {
	    bp.ascendingOrderClk();

	}

	@Then("Admin/User/Staff see the Batch Status displayed in Ascending order")
	public void admin_user_staff_see_the_batch_status_displayed_in_ascending_order() {
	    
	   
	}

	@When("Admin/User/Staff Clicks on No Of Classess Ascending Arrow")
	public void admin_user_staff_clicks_on_no_of_classess_ascending_arrow() {
		bp.batchClasses();
	    
	}

	@Then("Admin/User/Staff see the No Of Classes displayed in Ascending order")
	public void admin_user_staff_see_the_no_of_classes_displayed_in_ascending_order() {
	    
	}

	@When("Admin/User/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
	    
	}

	@Then("Admin/User/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {}

	
	
	
	


}
