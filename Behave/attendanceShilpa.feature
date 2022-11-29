Feature:Attendance
  Scenario: Validating the Attendance Header
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text as "Manage Attendance"
  Scenario: Validating the Attendance Footer
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."
  Scenario: Validating the Attendance Paginator
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."
  Scenario: Verify All paginator button on the Attendance page
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled