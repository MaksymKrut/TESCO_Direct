@BasketPage
Feature: Basket Page 


Scenario: Basket Page - Header
Given I navigate to TESCO direct "basket_page"
When I click on Sign In button
Then I should see the My account menu and the following options
|Your Account				|
|Your Direct Orders			|
|Your Wishlists				|
|Your recently viewed items	|
|Manage contact details		|
|Manage address book		|
|Manage payment details		|
|Help Button				|
|Sign Out Button			|

Scenario: Basket Page - Your Basket
Given I navigate to TESCO direct "basket_page"
And I check for the following message in the Basket Page
|You have 2 items in your basket|
And I check for the following details in the Basket Page
|Continue Shopping - blue colour when its been hoovered	|
|Checkout button										|
And I check for the following header items in Your basket
|Items		|
|Quantity	|
|Price		|
|Subtotal	|
And I check for the following items under the each product in Your basket
|Product Description	|
|Supplier				|
|offers					|
|Delivery options		|
And I check for the following links exists under quanity box for a product
|Update   - Disabled       							|
|Remove        - Enabled  and Underlined      		|
|Save for later	- Enabled  and Underlined        	|	
When I verify details of the service product to basket are displayed correctly 
And I verify save for later link doesn't exists for service product
Then I check for the Empty basket button exists at the bottom of Your basket box


Scenario: Basket Page - Items saved for later
Given I navigate to TESCO direct "basket_page"
When I verify that products are displayed correctly under Items saved for later section
And I check for the following under each product for Items saved for later section
|Product title			|
|Supplied by 			|
|cost of the product	|
|Saving					|
And I verify that move to basket button exists for the each item in the list
And I verify that X icon exists for each product in the list to remove from the list
Then I check for the show all button exists at the bottom of the Items saved for later section


Scenario: Basket Page - Basket summary
Given I navigate to TESCO direct "basket_page"
And I check for the following in Basket Summary
|Subtotal					|
|Promotional savings		|
|Total savings				|
|Basket total				|
|Clubcard points			|
|Extra clubcard points		|
|Total Clubcard points		|
|Continue to checkout		|
And I check for the following message under the Continue to checkout button
|Got an eCoupon, clubcard voucher or giftcard?										|
|You can add these in checkout. You will also be able to select delivery options.	|
Then I check for the Continue to shopping button exists under the title Not ready to checkout


Scenario: Basket Page - TESCO Standard Footer
Given I navigate to TESCO direct "basket_page"
And I verify that standard TESCO footer is displayed at the bottom of the page
