#Batch module : First 18 scenarios. 2-19 row as per excel sheet.
Feature: Batch module validation

  Background: common steps
    Given Admin/User/Staff Logged on to LMS Website
    Given Admin/User/Staff is on Manage Batch page

  Scenario: Validating the Manage Batch Header
    When Admin/User/Staff Clicks on Batch button
    Then Admin/User/Staff see header text as "Manage Batch "

  Scenario: Validating the Manage Batch Footer
    When Admin/User/Staff is on Manage Batch page
    Then Admin/User/Staff see  Footer text as "In total there are 21 batches."

  Scenario: Validating the Manage Batch Paginator
    When Admin/User/Staff is on Manage Batch page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 21 batches."

  Scenario: Verify paginator -next button  on the Program page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff see Paginator text as "Showing 6 to 10 of 21 batches."

  Scenario: Verify paginator -prevoius button on the Program page
    When Admin/User/Staff Clicks on Enabled paginator -prev button
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 21 batches."

  Scenario: Verify  paginator -last button  on the Program page
    When Admin/User/Staff Clicks on Enabled paginator-last button
    Then Admin/User/Staff see Page number navigated to '5'

  Scenario: Verify  paginator -first button  on the Program page
    When Admin/User/Staff Clicks on Enabled paginator -first button
    Then Admin/User/Staff see Page number navigated to '1'

  Scenario: Validate Search Feature
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Batch page
    Then Admin/User/Staff see the Search Text box has text as "Search".

  Scenario Outline: Search  by Batch Name
    When Admin/User/Staff enters <batchname> to be searched
    Then Entries for the searched BatchName are shown.

    Examples: 
      | batchname   |
      | DataScience |
      | SDET        |

  Scenario Outline: Search  by Batch Description
    When Admin/User/Staff enters <batchdescription> to be searched
    Then Entries for the searched Batch Description are shown.

    Examples: 
      | batchdescription |
      | machine learning |
      | Selenium         |

  Scenario Outline: Search  by Batch Status
    When Admin/User/Staff enters <BatchStatus> to be searched
    Then Entries for the searched Batch status are shown.

    Examples: 
      | BatchStatus |
      | Active      |
      | Inactive    |

  Scenario Outline: Search by No Of Classes
    When Admin/User/Staff enters <NoOfClasses> to be searched
    Then Entries for the searched No Of Classes are shown.

    Examples: 
      | NoOfClasses |
      |          15 |
      |          20 |

  Scenario Outline: Search  by Program Name
    When Admin/User/Staff enters <ProgramName> to be searched
    Then Entries for the searched Program Name are shown.

    Examples: 
      | ProgramName  |
      | Api testing  |
      | WebScrapping |

  Scenario: Verify Batch Name are displayed in Ascending order
    When Admin/User/Staff Clicks on Batch Name Ascending Arrow
    Then Admin/User/Staff see the Batch Name displayed in Ascending order

  Scenario: Verify Batch Description are displayed in Ascending order
    When Admin/User/Staff Clicks on Batch Description Ascending Arrow
    Then Admin/User/Staff see the Batch Description displayed in Ascending order

  Scenario: Verify Batch Status are displayed in Ascending order
    When Admin/User/Staff Clicks on Batch Status Ascending Arrow
    Then Admin/User/Staff see the Batch Status displayed in Ascending order

  Scenario: Verify No Of Classess are displayed in Ascending order
    When Admin/User/Staff Clicks on No Of Classess Ascending Arrow
    Then Admin/User/Staff see the No Of Classes displayed in Ascending order

  Scenario: Verify Program Name are displayed in Ascending order
    When Admin/User/Staff Clicks on Program Name Ascending Arrow
    Then Admin/User/Staff see the Program Name displayed in Ascending order
