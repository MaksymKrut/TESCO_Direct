Feature: Checkout - BVCE Logo 

Scenario: New BVCE logo is displayed in the checkout page 
	Given I navigate to the checkout page after adding a tesco sim
	Then the following in regards to the BVCE logo is displayed on the checkout page
		|Clubcard Boost Image|
		|In Clubcard Boost - More Info Link|