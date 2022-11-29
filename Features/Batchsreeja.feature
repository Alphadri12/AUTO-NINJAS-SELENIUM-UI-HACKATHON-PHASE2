
Feature:  Batch
Scenario : Click on Cancel button in Batch Details window
                 Given Admin Clicks on  " + A New Batch" button
                  When Admin Clicks on Cancel button
                  Then  Admin see a Batch Details window getting closed

Scenario: Admin/User/Staff Verify Added New Batch Name
              Given Admin/User/Staff is on Manage Program page 
               When Admin/User/Staff Enters newly added  Batch Name in Search
                Then Entry for the newly added Batch Name is shown

Scenario: User/Staff Validate Add A New Batch button
                 Given User/Staff is on Manage Batch page
                 When User/Staff/Staff Clicks on  " + A New Program" button
                 Then User/Staff see a Error message "Only Admin have Access"
Scenario: Validates Edit button
	        Given Admin is on Manage Batch page
	        When Admin Clicks on Edit buttton  
	        Then Admin see header text as "Batch Details"
Scenario Outline: Edit details
           Given Admin clicks on "Edit" botton
           When Admin Clicks on Save Button after <updating>
            Then Admin see Success <message>
        Examples:
            |updating|message|
            |Name|Updated Name|
            |Description|Updated Description|
            |Selecting another Program Name|Updated Program Name|
            |Status|Updated Status|
            |No of Classes|Updated No of Classes|
Scenario: Click on Cancel button in Batch Details window
                 Given Admin  Clicks on "Edit" button
                 When Admin Clicks on Cancel button 
                 Then Admin see a Batch Details window getting closed
Scenario: Verifys Edited Batch Name/BatchDescription 
                 Given Admin/User/Staff is on Manage Batch page 
                 When Admin/User/Staff  Enters edited Batch Name/Batch Description in Search
                 Then Entry for the edited  Batch Name/Batch Description is shown

Scenario: User/Staff  Validate Edit button
                 Given User/Staff is on Manage Batch page
                 When User/Staff Clicks on Edit buttton  
                 Then User/Staff see a Error message  "Only Admin have Access"                            