# User module: Last 14 scenarios as per excel sheet row no 42-55.
Feature: Label Text

  Background: common steps
    Given Admin/User/Staff is on "User Details" window

  Scenario: Verify the presence of Label Texts
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the placeholders with Text As "First name","Middle name", "Last name","Email adress","Phone no", "Address","City", "State","Postal Code","Program","UG Program","PG Program","Skill","Experience","Admin/User/Staff Role","Visa status","Batch","Comments"

  Scenario: Verify drop down menu for state
    When Admin/User/Staff clicks the drop down icon for state
    Then Admin/User/Staff should select from the drop down menu for state

  Scenario: Verify drop down menu for user role
    When Admin/User/Staff clicks the drop down icon for User Role
    Then Admin/User/Staff should select from the drop down menu for user role

  Scenario Outline: Validating the User Details window with all fields empty
    When Admin/User/Staff clicks submit button with all details empty
    Then Admin/User/Staff should see a Error message <message>

    Examples: 
      | message                          |
      | Mandatory Fields cannot be empty |

  Scenario Outline: Adding new User
    When Admin/User/Staff clicks Submit button by entering all valid values in required fields
    Then Admin/User/Staff  see Success message  <successmessage>

    Examples: 
      | successmessage                        |
      | New User Created is  Should be Saved. |

  Scenario Outline: Validating the User Details window with few fields empty
    When Admin/User/Staff clicks on Submit button after entering  Few Field details
    Then Admin/User/Staff see error message <errormessage>

    Examples: 
      | errormessage              |
      | Name is required          |
      | Email address is required |
      | State is required         |

  Scenario Outline: Validating the Email address
    When Admin/User/Staff clicks on Submit button after entering <em>
    Then Admin/User/Staff see error message invalid <invalidmsg>

    Examples: 
      | invalidmsg            | em       |
      | invalid email address | xyz@.com |

  Scenario: Validating the presence of Address2 button
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the button with text "+ Add C/O, Apt, Suite, Unit"

  Scenario Outline: Validating the Phone number
    When Admin/User/Staff Enters more than ten <num> digits
    Then Admin/User/Staff see error message "Invalid Input"

    Examples: 
      | num          |
      |  96000864381 |
      | 129786549111 |

  Scenario Outline: Validating Zip Code
    When Admin/User/Staff Enters more than 5<digits> digits
    Then Admin/User/Staff see error message "Invalid Input"

    Examples: 
      | digits  |
      | 9563012 |
      |  956301 |

  Scenario: Validating State dropdown
    When Admin/User/Staff clicks on state dropdown
    Then Admin/User/Staff see list of states in Alphabetical Order

  Scenario: Validating UG Program Dropdown
    When Admin/User/Staff clicks on UG Program dropdown
    Then Admin/User/Staff see list of UG Program
