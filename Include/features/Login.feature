Feature: This is to verify login
Scenario: Valid Login 
Given the user is on the Login Page
When the user enters the username 
And the user enters the password 
And click the Login button
Then the user should be logged in

