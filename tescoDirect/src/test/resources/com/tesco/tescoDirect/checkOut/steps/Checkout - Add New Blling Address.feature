@testC @testF @testMVP @testSVP
Feature: Checkout - Add New Blling Address

@AddNewBillingAddress_CleanUp
Scenario: Add new billing address at checkout 
	Given I navigate to the checkout page after adding a tesco sim 
	And I login at the checkout page 
		|UserName                   |Password |
		|ashish.modi@uk.tesco.com|Password1|
	When I click on the New address link for billing address on the checkout page
	And I add a new billing address on the checkout page
	Then the new billing address is added on the checkout page
	