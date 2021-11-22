Feature: Application Login

Scenario: home page default login

Given user is on netbanking landing page
When user login with username and password 
Then home page is populated
And cards are displayed
