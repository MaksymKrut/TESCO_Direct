@testC
Feature: Placing an order in the website by traversing end-to-end and Order cancellation 

@RegisteredUser 
Scenario: An exisiting tesco direct user logs into the website, searches for an item, applies filters(price), adds item to basket ,places an order (gift card) and Order cancellation 
	Given I navigate to TESCO direct "home_page" as a registered user 
	When user types in "hudl" in the search and browse text 
	Then the PLP page should be displayed showing the no of products matching the keyword Hudl 
	When user applies the Price filter 
	Then products should be displayed within the price as applied 
	When user clicks on Add to Basket on any item 
	Then user should be displayed the Streamline Basket overlay 
	When user clicks on continue shopping link in the stream line overlay page 
	Then user should be redirected to the PLP page 
	When user types in "384-5743" in the search and browse text 
	Then the PDP page should be displayed showing the product matching the keyword 
	When I click on PDP page Add to Basket button 
	Then user should be displayed the Streamline Basket overlay 
	When user clicks on View Basket on the Stream line Overlay 
	Then user should be redircted to the basket details page 
	When I update the Quantity in basket page 
	And I click on Continue to checkout button 
	Then user should be taken to checkout page 
	And I click on View Basket button to empty the basket items 
	When user types in "574-7120" in the search and browse text 
	Then the PDP page should be displayed showing the product matching the keyword 
	When I click on PDP page Add to Basket button 
	Then user should be displayed the Streamline Basket overlay 
	When I click on Continue to checkout button on the Stream line overlay 
	Then user should be taken to checkout page 
	When I enter my gift card details to pay for the product 
	Then user should be displayed the following message 
		|Your order has been confirmed|
		
@NewUser 
Scenario: An new tesco direct user registers and logs into the website, searches for an item, applies filters(Sorting), adds item to basket ,places an order (gift card) and Order cancellation 
	Given I navigate to TESCO direct "home_page" as a new User 
	When user types in "hudl" in the search and browse text 
	Then the PLP page should be displayed showing the no of products matching the keyword Hudl 
	When user clicks on sort by Best Sellers 
	Then products should be displayed based on the selection 
	When user clicks on Add to Basket on any item 
	Then user should be displayed the Streamline Basket overlay 
	When user clicks on continue shopping link in the stream line overlay page 
	Then user should be redirected to the PLP page
	When user types in "384-5743" in the search and browse text 
	Then the PDP page should be displayed showing the product matching the keyword 
	When I click on PDP page Add to Basket button 
	Then user should be displayed the Streamline Basket overlay 
	When user clicks on View Basket on the Stream line Overlay 
	Then user should be redircted to the basket details page 
	When I update the Quantity in basket page 
	And I click on Continue to checkout button 
	Then user should be taken to checkout page 
	And I click on View Basket button to empty the basket items 
	When user types in "574-7120" in the search and browse text 
	Then the PDP page should be displayed showing the product matching the keyword 
	When I click on PDP page Add to Basket button 
	Then user should be displayed the Streamline Basket overlay 
	When I click on Continue to checkout button on the Stream line overlay 
	Then user should be taken to checkout page 
	When I enter my gift card details to pay for the product 
	Then user should be displayed the following message 
		|Your order has been confirmed|
		
@AnonymousUser  
Scenario: An anonymous user searches for an item,traverses back through the breadcrumbs , adds item to basket and logs into the website at the checkout page ,places an order (gift card) and Order cancellation 
	Given I navigate to TESCO direct "home_page"
	When user types in "hudl" in the search and browse text 
	Then the PLP page should be displayed showing the no of products matching the keyword Hudl 
	When user clicks on any preceeding bread crumb 
	Then the user should be navigated to the respective page 
	When user types in "574-7120" in the search and browse text 
	Then the PDP page should be displayed showing the product matching the keyword 
	When I click on PDP page Add to Basket button 
	Then user should be displayed the Streamline Basket overlay 
	When I click on Continue to checkout button on the Stream line overlay 
	Then user should be taken to checkout page 
	When I enter my user details 
	And I enter my gift card details to pay for the product 
	Then user should be displayed the following message 
		|Your order has been confirmed|