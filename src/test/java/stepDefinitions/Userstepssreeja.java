package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.Userpagesreeja;


public class Userstepssreeja {
	
	public Userpagesreeja up;
	
	@Given("Admin/User/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
	    up.verifyTitle();
	}

	@When("Admin/User/Staff clicks the Tab {string}")
	public void admin_user_staff_clicks_the_tab(String User) {
	    up.User();
	}
	@Then("Admin/User/Staff should see the Manage user page")
	public void admin_user_staff_should_see_the_manage_user_page() {
	   up.verifyHeader();
	}
	
	@Then("Admin/User/Staff should see the pagination controls below data table")
	public void admin_user_staff_should_see_the_pagination_controls_below_data_table() {
	    up.verifyPaginator();
	}

	@Given("Admin/User/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
	    up.verifyHeader();
	}

	@When("Manage user table has less than or equal to {int} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(Integer int1) {
	   up.numberOfRows();
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	    up.isPaginatorEnabled();
	}
	
	@Given("Admin/User/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {
	    up.isTableDisplayed();
	}

	@When("Admin/User/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {
	    up.Arrow();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
	    up.verifyPaginator();
	}
	
	@Given("last page of Admin/User/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {
	   up.verifyPaginator();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
	    up.isPaginatorEnabled();
	}
	
	@When("Admin\\/User\\/Staff clicks previous link of pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {
		up.pArrow();
	}
	   

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
	    up.verifyPaginator();
	}

	@When("Admin/User/Staff clicks << icon in pagination")
	public void admin_user_staff_clicks_firsticon_in_pagination() {
	    up.takeToFirstPageArrow();
	}

	@Then("Admin/User/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {
	    up.verifyPaginator();
	}

	@When("Admin/User/Staff clicks >> icon in pagination")
	public void admin_user_staff_clicks_lasticon_in_pagination() {
	    up.takeToLastPageArrow();
	}

	@Then("Admin/User/Staff clicks should see the last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {
	    up.verifyPaginator();
	}
	
	@When("Admin/User/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {
	    up.verifyHeader();
	}

	@Then("Admin/User/Staff should see the text {string} beow the user table.")
	public void admin_user_staff_should_see_the_text_beow_the_user_table(String string) {
	    up.entriesMsg();
	}

	@Then("Admin/User/Staffshould see the table footer as {string}.")
	public void admin_user_staffshould_see_the_table_footer_as(String string) {
	   up.totalUserMsg();
	}
}
