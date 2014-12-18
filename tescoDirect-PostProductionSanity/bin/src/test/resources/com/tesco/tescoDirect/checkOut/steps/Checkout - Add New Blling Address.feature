@testC
Feature: Checkout - Add New Blling Address

Scenario: Add new billing address at checkout 
	Given I navigate to the checkout page after adding items to the basket 
	And I login at the checkout page 
		|UserName                   |Password |
		|ashish.modi@uk.tesco.com|Password1|
	When I click on the New address link for billing address on the checkout page
	And I add a new billing address on the checkout page
	Then the new billing address is added on the checkout page
	