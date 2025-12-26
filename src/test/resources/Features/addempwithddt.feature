Feature:Orange hrm add employee 
Scenario Outline: add Employee
Given Add Employee page should be displayed
When user enter firstname , middlename , lastname <row>
And click on save btn icon
Then Employee should be added 

Examples:
         |row|
         |0|
         |1|

