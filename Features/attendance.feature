Feature:Header Delete Functionality
Scenario: Admin Verify the Delete Functionality
    Given Admin is on Manage Attendance page
    When Admin Clicks on Delete Button
    Then Admin see Error Message "Admin Has View Only Permission"

Scenario: Verifying the Checkbox functionality of a Program Name
   Given Admin/User/Staff is on Manage Attendance page
   When Admin/User/Staff Clicks on Checkbox
   Then Admin/User/Staff  see list of Users in that Program

Scenario: Verifying the Functionality of a Present button
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff  Clicks on Present
    Then Admin/User/Staff  see the list of  "User Name" who are Present

Scenario: Verifying the Functionality of a Absent button
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff  Clicks on Absent
    Then Admin/User/Staff  see the list of  "User Name" who are Absent

