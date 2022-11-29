Feature: Attendence

Scenario: Click on Cancel button in Attendance Details window
             Given User/Staff Clicks on Edit Button
              When User/Staff clicks on Cancel button after entering details
              Then User/Staff see a Attendance Details window getting closed

Scenario: Admin Verify the Edit Button
             Given Admin is on Manage Attendance page
              When Admin Clicks on Edit Button
              Then Admin see Error Message "Admin Has View Only Permission"

Scenario: Verify the Delete Functionality
             Given User/Staff is on Manage Attendance page
              When User/Staff Clicks on Delete Button
              Then Admin see header text as "Delete Confirm"

Scenario: Click on "Yes" button in Delete Confirm window
             Given User/Staff Clicks on Delete Button
              When User/Staff  Clicks on " Yes"  button
              Then "User/Staff  see Success message "Program Deleted Succesfully"


Scenario: Click on "No" button in Delete Confirm window
             Given User/Staff Clicks on Delete Button
              When User/Staff  Clicks on "No" button
              Then User/Staff can see Program Name not delete

