Feature: add emp detailes
Scenario Outline:employe details adding

Given add employe should be added
When user enter "<firstname>","<middlename>"
And enter "<lastname>"
And click on save button 
Then success message should be displayed

Examples:

        |firstname|middlename|lastname|
        |admin  |admins|admined|
        |asdf   |qwert |zxcv   |
        |vishnu |cosmic|creater|
        |arun   |kumar |reshab |



