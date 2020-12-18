Feature: Testing practise site

Scenario Outline: Testing the rahul Acadmey practise site
Given Practise page of User
When Enter <name> in the page
Then Successfully entered name

Examples:
|name|
|Ramesh|


Scenario Outline: Testing the rahul Acadmey practise site
Given Practise page of User
When Incorrect name entering <name> in the page
Then Successfully entered name

Examples:
|name|
|eeee123|