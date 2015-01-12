@testC @testF @testMVP @testSVP 
Feature: Placing an order using Bank card details

@RegisteredUser
Scenario: An exisiting tesco direct user logs into the website, searches for an item,adds item to basket ,places an order (Bank Card) and Order cancellation 
	Given I navigate to TESCO direct "home_page" as a registered user 
	When user types in "ipad" in the search and browse text 
	Then the PLP page should be displayed showing the no of products matching the keyword ipad 
	When user clicks on Add to Basket on any item 
	Then user should be displayed the Streamline Basket overlay 
	When I click on Continue to checkout button on the Stream line overlay 
	Then user should be taken to checkout page 
	When I enter my bank card details to pay for the product
	Then user should be displayed the following message 
		|Your order has been confirmed|
		
@NewUser 
Scenario: An new tesco direct user registers and logs into the website, searches for an item, adds item to basket ,places an order (Bank Card) and Order cancellation 
	Given I navigate to TESCO direct "home_page" as a new User 
	When user types in "ipad" in the search and browse text 
	Then the PLP page should be displayed showing the no of products matching the keyword ipad
	When user clicks on Add to Basket on any item  
	Then user should be displayed the Streamline Basket overlay 
	When I click on Continue to checkout button on the Stream line overlay 
	Then user should be taken to checkout page 
	When I enter my bank card details to pay for the product 
	Then user should be displayed the following message 
		|Your order has been confirmed|
		
@AnonymousUser  
Scenario: An anonymous user searches for an item, adds item to basket and logs into the website at the checkout page ,places an order (Bank Card) and Order cancellation 
	Given I navigate to TESCO direct "home_page"
	When user types in "ipad" in the search and browse text
	Then the PLP page should be displayed showing the no of products matching the keyword ipad
	When user clicks on Add to Basket on any item 
	Then user should be displayed the Streamline Basket overlay 
	When I click on Continue to checkout button on the Stream line overlay 
	Then user should be taken to checkout page 
	When I enter my user details 
	And I enter my bank card details to pay for the product 
	Then user should be displayed the following message 
		|Your order has been confirmed|