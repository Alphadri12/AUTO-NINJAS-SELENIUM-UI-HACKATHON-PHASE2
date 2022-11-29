Feature: Header Add New User Functionality
Scenario:Validate the presence of Add new user button
			Given Admin/User/Staff is on any page after Login
   	 	When  Admin/User/Staff is on the Manage user page after clicking User Tab
     	Then  Admin/User/Staff should see the button with text "+ icon and Add New User"
     	
Scenario: Verify the functionality of Add new user button
			Given Admin/User/Staff is on Manage user page
			When Admin/User/Staff clicks Add New User
			Then Admin/User/Staff should see the "User details" dialog box

Scenario: Validating Table header
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User
    Then Admin/User/Staff should see the table header as Empty checkbox-icon,ID with sort icon, Name with Sort icon, Email Address with sort icon, Contact Batch with sort icon, Skill with Sort icon, Edit/Delete as column names
           
Scenario: Verify the functionality of sort icon present in table header
      Given  Verify the functionality of sort icon present in table header
      When   Admin/User/Staff table is displayed in manage user page
      Then   Admin/User/Staff clicks sort icon in table header
      
Scenario: Check box in table header
    Given  Admin/User/Staff table is displayed in manage user page
    When   Admin/User/Staff checks empty checkbox in header
    Then   Check box in all the rows of user table should be checked
    Given  Admin/User/Staff table is displayed in manage user page
    When   Admin/User/Staff unchecks checkbox in header
    Then   Check box in all the rows of user table should be unchecked
    
Scenario: Verify the presence of Delete icon in manage user page
      Given  Admin/User/Staff is on any page after Login
      When   Admin/User/Staff is on the Manage user page after clicking User Tab
      Then   Admin/User/Staff should see the delete icon at the top left corner of the user table 
      
Scenario: Behaviour of Delete icon when no rows unchecked
   Given  Admin/User/Staff table is displayed in manage user page
   When   No rows is checked
   Then   Delete icon at the top left corner of the user table disabled
   
Scenario: Behaviour of Delete icon when rows checked
     Given  Admin/User/Staff table is displayed in manage user page
     When   Admin/User/Staff checks the rows in user table
     Then   Delete icon at the top left corner of the user table enabled
     Given  Admin/User/Staff checks the rows in user table
     When   Admin/User/Staff clicks the delete icon at the top left corner of user table
     Then   Confirm dialog box should be displayed with Text "Are you sure you want to delete the selected Admin/User/Staffs?" , button with text "No" , the button with text "yes" and close(X) icon
            
Scenario: Validating Confirm dialog box by selecting No
     Given  Admin/User/Staff is in confirm dialog box after clicking delete icon
     When   Admin/User/Staff clicks button with text "No"
     Then   Selected rows should not be deleted and dialog box should be closed
     
Scenario: Validating Confirm dialog box by selecting Yes
      Given  Admin/User/Staff is in confirm dialog box after clicking delete icon
      When   Admin/User/Staff clicks button with text "Yes"
      Then   Selected rows should be deleted and popup should be shown with success message "User deleted"
 
 Scenario: Validating Confirm dialog box by clicking close(x) icon
      Given  Admin/User/Staff is in confirm dialog box after clicking delete icon
      When   Admin/User/Staff clicks the close(x) icon
      Then   Confirm dialog box should be closed