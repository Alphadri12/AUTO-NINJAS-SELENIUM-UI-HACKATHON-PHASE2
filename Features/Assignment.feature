Feature:Header Validation
Scenario:Validating Assignment Heading
       Given Admin/User/Staff Logged on to LMS website
       When  Admin/User/Staff clicks on Assignment Page
       Then  Admin/User/Staff Should see a Header "Manage Assignment
       
Scenario:Footer Validation
         :Validating Assignment Paginator
         :Verify  paginator -next button  on the Assignment page
       Given Admin/User/Staff Logged on to LMS website
       When  Admin/User/Staff clicks on Assignment Page
       Then  Admin/User/Staff Should see a Footer text "In Total there are 3 assignments
       
Scenario:Verify paginator -previous button on the Assignment page
      Given  Admin/User/Staff is on Assignment Page
      When   Admin/User/Staff Clicks on Enabled paginator-next button
      Then   Admin/User/Staff Should be navigated to previous page
          
Scenario:Verify paginator -last button on the Assignment page
       Given  Admin/User/Staff is on Assignment Page
       When   Admin/User/Staff Clicks on Enabled paginator-next button
       Then   Admin/User/Staff Should be navigated to Last page

#Scenario:Verify paginator -first button on the Program page
	   #Given  Admin/User/Staff is on Assignment Page
	   #When		Admin/User/Staff Clicks on Enabled paginator-next button
	   #Then		Admin/User/Staff Should be navigated to First  page
	   
Scenario:Validate Search Feature
		Given	Admin/User/Staff Logged on to LMS website
		When	Admin/User/Staff clicks Search bar after entering Assignment name
		Then	The requested assignment details should be displayed
		
Scenario: Verify Assignment Name are displayed in Ascending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Name Ascending Arrow
		Then	 Admin/User/Staff should see the Assignment Name displayed in Ascending order
		
Scenario: Verify Assignment Description are displayed in Ascending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Description Ascending Arrow
		Then	 Admin/User/Staff should see the Assignment Description displayed in Ascending order
		
Scenario: Verify Assignment DueDate are displayed in Ascending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Duedate Ascending Arrow
		Then	 Admin/User/Staff should see the Assignment Duedate displayed in Ascending order
		
Scenario: Verify Assignment Grade are displayed in Ascending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
		Then	 Admin/User/Staff should see the Assignment Grade displayed in Ascending order
		
Scenario: Verify Assignment Name are displayed in Descending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Name Descending Arrow
		Then	 Admin/User/Staff should see the Assignment Name displayed in Descending order
		
Scenario: Verify Assignment Description are displayed in Descending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Description Descending Arrow
		Then	 Admin/User/Staff should see the Assignment Description displayed in Descending order 
		
Scenario: Verify Assignment DueDate are displayed in Descending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Duedate Descending Arrow
		Then	 Admin/User/Staff should see the Assignment Duedate displayed in Descending order
		
Scenario: Verify Assignment Grade are displayed in Descending order
		Given	Admin/User/Staff is on Assignment Page
		When	 Admin/User/Staff Clicks on Assignment Grade Descending Arrow
		Then	 Admin/User/Staff should see the Assignment Grade displayed in Descending order
		
Scenario:  Validate Add New Assignment Button
		Given	Admin/User is on Manage Assignment page
		When	Admin/User clicks a Add New Assignment button
		Then	Admin/User should see a message "Staff only have access to add New Assignment"
		
Scenario: No details Entered in  Assignment Details window 
		Given	Staff is on  Assignment Details page
		When	Staff  clicks on Save after leaving all the fields empty
		Then	Staff should see an error message "Name is required"
		
Scenario: Staff Validate Assignment Details window with entering all fields
		Given	Staff is on Assignment Details page
		When	Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate4
		Then	Staff should see a message "New Assignment successfully added"
		
Scenario: Staff Click Cancel in Assignment Details window
		Given	Staff is on Assignment Details page
		When	Staff clicks cancel button with entering all fields
		Then	Staff should see a Assignment details window is closed
		
Scenario: validate New assignment
		Given	Admin/User/Staff is on Assignments page
		When	Admin/User/Staff clicks on Assignment
		Then	Admin/User/Staff should see a newly added Assignment
		
Scenario: Validate  Manage button in Assignment Grade
		Given	Staff is on Assignment  page
		When	Staff clicks manage button under Assignment Grade
		Then	Staff should be navigated to Grade Window
		
Scenario: Staff Validates Edit button
		Given	Staff is on Manage Assignment page
		When	Staff clicks an edit Assignment button
		Then	Staff should see a Assignment details window
		
Scenario: Staff Edit Assignment Name in Assignment Details window
		Given	Staff is on Assignment Details page
		When	Staff clicks Save button  after edits Assignment Name 
		Then	Staff should see a message "Assignment Name Updated"
		
Scenario: Staff Edit Assignment Description in Assignment Details window
		Given	Staff is on Assignment Details page
		When	Staff clicks Save button  after edits Assignment Description
		Then	Staff should see a message "Assignment Description Updated"
		
Scenario: Staff Edit Assignment Grade in Assignment Details window
		Given	Staff is on Assignment Details page
		When	Staff clicks Save button After edits Assignment Grade
		Then	Staff should see a message "Assignment Grade Updated"
		
Scenario: Staff Edit Assignment DueDate in Assignment Details window
		Given	Staff is on Assignment Details page
		When	Staff clicks Save button After edits Assignment DueDate
		Then	Staff should see a message "Assignment Due Date Updated"
		
Scenario: Staff Click Cancel in  Assignment Details window
		Given	Staff is on Assignment Details page
		When	Staff clicks cancel button 
		Then	Staff Should see a Assignment Details Page is closed
		
Scenario: Admin/User/Staff Validate Edit Button
		Given	Admin/User/Staff is on Manage Assignment page
		When	Admin/User/Staff clicks Edit button
		Then	Admin/User/Staff should see a message "Staff only have access to Edit Assignment"
		
Scenario: Admin/User/Staff clicks Assignment Name
		Given	Admin/User/Staff is on Assignment page
		When	Admin/User/Staff clicks on Assignment Name
		Then	Admin/User/Staff should be navigated to Assignment Google form page
		
Scenario: Admin clicks Assignment Name
		Given	Admin is on Assignment page
		When	Admin clicks on Assignment Name
		Then	Admin should see a warning message "you dont have access"
		
Scenario: Admin/User/Staff validate assignment Google form with entering all fields
		Given	Admin/User/Staff is on Assignment  Google form page
		When	Admin/User/Staff clicks on submit button after entering all questions and mail id 
		Then	Admin/User/Staff entered google forms successfully
		
Scenario: Admin/User/Staff validate assignment Google form leaving empty
		Given	Admin/User/Staff is on Assignment  Google form page
		When	Admin/User/Staff clicks on submit button after leaving all questions and mail id 
		Then	Admin/User/Staff should get a warning message "Must enter the mandatory fields"
		
Scenario: Admin/User/Staff Validate Assignment google form after clicking clear button
		Given	Admin/User/Staff is on Assignment  Google form page
		When	Admin/User/Staff clicks clear form button after entering all questions and mail id 
		Then	The Assignment Google form cleared successfully
		
Scenario: Admin/User/Staff clicks Switch account
		Given	Admin/User/Staff is on Assignment  Google form page
		When	Admin/User/Staff clicks Switch account link 
		Then	Admin/User/Staff should be switched over the account Successfully
		
Scenario: Staff clicks delete button
		Given	Staff is on Manage Assignment page
		When	Staff clicks on delete button on the righr side
		Then	Staff should see a Delete Confirmation window
		
Scenario: Staff click Yes in Delete confirmation window
		Given	Staff is on Delete Confirmation window
		When	Staff clicks Yes
		Then	Staff Should see "Assignment Deleted Successfully
		
Scenario: Staff clicks No button in Delete confirmation window
		Given	Staff is on Delete Confirmation window
		When	Staff clicks No
		Then	Confirmation delete window should be closed successfully
		
Scenario: Admin clicks delete button
		Given	Admin is on Manage Assignment page
		When	Admin clicks on delete button
		Then	Admin should see a message "Staff only have access"
		
Scenario: Admin/User/Staff clicks delete button
		Given	Admin/User/Staff is on Manage Assignment page
		When	Admin/User/Staff clicks on delete button
		Then	Admin/User/Staff should see a message"Staff only have access"
		
Scenario: Admin/User/Staff Validate Disabled delete button
		Given	Admin/User/Staff is on Assignments page
		When	Admin/User/Staff clicks on delete button on the top left
		Then	Admin/User/Staff/ should see a disabled delete button
		
Scenario: Staff  validate delete button on the top left
		Given	Staff is on Manage Assignment page
		When	Staff clicks delete button on the top aftr selecting multiple checkbox
		Then	Staff should see a  Delete confirm window
		
Scenario: Staff click Yes in Delete confirmation window
		Given	Staff is on Delete Confirmation window
		When	Staff clicks Yes
		Then	All Assignments are deleted Successfully
		
Scenario: Staff click No in Delete confirmation window
		Given	Staff is on Delete Confirmation window
		When	Staff clicks No
		Then	Confirmation delete window should be closed successfully
		
Scenario: Admin/User/Staff validate check box on the left side to the Assignment Name
		Given	Admin/User/Staff is on Manage Assignment page
		When	Admin/User/Staff clicks check box on the left side to the Assignment Name
		Then	Admin/User/Staff should see a enabled delete button on the top left 
		
Scenario: Admin validate check box on the left side to the Assignment Name
		Given	Admin is on Manage Assignment page
		When	Admin clicks check box on the left side to the Assignment Name
		Then	Admin should see a warning message "Admin dont have access  "
		
Scenario: User/Staff validate individual checkbox
		Given	Admin/User/Staff is on Assignments page
		When	Admin/User/Staff clicks individual checkbox button 
		Then	Admin/User/Staff should see a delete button on the top left
		
Scenario: Admin validate individual checkbox
		Given	Admin is on Manage Assignment page
		When	Admin clicks individual checkbox button 
		Then	Admin should see a warning message "Admin dont have access "
