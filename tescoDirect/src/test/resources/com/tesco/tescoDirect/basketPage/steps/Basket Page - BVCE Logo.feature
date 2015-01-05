@MVP @S4 @test 
Feature: Basket Page - BVCE Logo 

Scenario: New BVCE logo is displayed in the basket page 
	Given I navigate to the basket page after adding a tesco sim
	Then the following in regards to the BVCE logo is displayed on the basket page
		|Clubcard Boost Image|
		|In Clubcard Boost - More Info Link|