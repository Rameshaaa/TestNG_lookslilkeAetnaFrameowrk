Feature: Testing practise site

Scenario Outline: Testing the rahul Acadmey practise site
Given User in Practise page
When User enter <name> in the page
Then User name entered successfully

Examples:
|name|
|Ramesh|


Scenario Outline: Testing the rahul Acadmey practise site
Given User in Practise page
When User entering incorrect <name> in the page
Then User name entered successfully

Examples:
|name|
|eeee123|