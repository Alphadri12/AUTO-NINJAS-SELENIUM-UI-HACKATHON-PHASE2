# Attendance module scenarios covered from excel sheet row no 6-10.
Feature: Attendance module functionality
  Background: common steps
    Given User/Staff Clicks on Edit Button

  Scenario: Verify the Edit Button
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Edit Button
    Then Admin see header text as "Attendance Details"

  Scenario: Edit ProgramName in Attendance Details window

    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see the success message "Updated Successfully"


  Scenario: Edit User Name Attendance Details window

    When User/Staff clicks on Save button after changing User name
    Then User/Staff see the success message "Updated Successfully"

  Scenario: Edit Present in Attendance Details window

    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see the success message "Updated Successfully"

   Scenario: Edit Absent in Attendance Details window

     When User/Staff clicks on Save button after enabling Absent details
     Then User/Staff see the success message "Updated Successfully"


