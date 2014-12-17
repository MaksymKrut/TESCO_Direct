@BasketAttachmentPage @regression
Feature: Basket Attachment Page
 
Scenario: Basket Attachment Page 
	Given I navigate to TESCO direct "basket_attachment_page"
	And I check for the following message in the Basket Attachment Page 
		|This item was successfully added to your basket|
	Then I check for the following details in the product module for BA page 
		|Product Image				|
		|Product Description		|
		|Product Cost				|
		|Other details of product	|
		|Add to Basket- Disabled	|
	And I check for the following details in the right hand side of product description 
		|Number of items			|
		|Cost of the product		|
		|Clubcard points       		|
		|Continue Shopping			|
		|View basket and checkout	|
	Then I verify the following is dispalyed above View basket and checkout button 
		|Delivery calculated at checkout. More about delivery options|
			
Scenario: Basket Attachment Page - Popular products 
	Given I navigate to TESCO direct "basket_attachment_page"
	And I verify carsoul naviagation arrows works correctly 
	Then I check for the carsoul items are displayed in the recommendation block 
	
Scenario: Basket Attachment Page - What our customers are buying 
	Given I navigate to TESCO direct "basket_attachment_page"
	And I verify carsoul naviagation arrows works correctly for similar customers have view block 
	Then I check for the carsoul items are displayed for similar customers have view block 

	
Scenario: Basket Attachment Page - Items you have recently viewed 
	Given I navigate to TESCO direct "basket_attachment_page"
	When I verify carsoul naviagation arrows works correctly for Items you have recently viewed block 
	And I check for the following items working for Items you have recently viewed block
		|Turn off				|
		|Clear all				|
		|Product remove button	|
	Then I check for the carsoul items are displayed for Items you have recently viewed block
