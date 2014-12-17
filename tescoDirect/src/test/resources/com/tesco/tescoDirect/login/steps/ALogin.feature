@RegisteredUser @testFirefox @testChrome @MVP @S4 @testC @testF
Feature: Website Login

Scenario: Accessing secured Login page 
	Given I navigate to TESCO direct "home_page"
	And I click on the Sign in or Register Link 
	Then the I'm an existing customer radio button is selected by default 
	When I login with the following valid credentials
	| UserName              | Password  |
	|testaccount@tescodirect.com|Password2|
	Then my login is successful and I am redirected to the home page