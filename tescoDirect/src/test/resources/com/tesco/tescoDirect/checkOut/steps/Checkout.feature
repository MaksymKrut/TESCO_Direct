@MVP 
Feature: Checkout 


Scenario: Any Customer 
	Given I navigate to the checkout page after adding items to the basket 
	Then the top navigation Order tab is highlighted 
	And the Basket tab is enabled and greyed out 
	And the Thank you tab is disabled and greyed out 
	And the following items are displayed 
		|Elements                 |
		|Item Image               |
		|Item quantity X Item Name|
		|Catalogue Number         |
		|Sold by                  |
		|Item price               |
	And the following items in regards to the BVCE logo is displayed
	And the delivery method - Collection is selected by default 
	And the delivery cost is displayed as Free 
	And the Pay now box should display the following 
		|Elements       |
		|subtotal       |
		|total to pay   |
		|Clubcard points|
	Then I clear all the items in the basket 


Scenario: Logged in Customer 
	Given I navigate to the checkout page after adding items to the basket as a logged in user 
		|UserName                   |Password |
		|ashish.modi@uk.tesco.com|Password1|
	Then the top navigation Order tab is highlighted 
	And the Basket tab is enabled and greyed out 
	And the Thank you tab is disabled and greyed out 
	And the following items are displayed 
		|Elements                 |
		|Item Image               |
		|Item quantity X Item Name|
		|Catalogue Number         |
		|Sold by                  |
		|Item price               |
	And the delivery method - Collection is selected by default 
	And the delivery cost is displayed as Free 
	And the Pay now box should display the following 
		|Elements       |
		|subtotal       |
		|total to pay   |
		|Clubcard points|
	And the following is displayed under delivery method - Collection
	    |Elements                               |
		|Stores                                 |
		|three stores closest to the post code  |
		|view more collection points with + sign|
	And the radio button of only the first store is selected
	And Collection details with following information is displayed
	    |Elements                                                                                                     |
		|Name                                                                                                         |
		|phone number                                                                                                 |
		|Selected store name                                                                                          |
		|message to show when the item can be collected                                                               |
		|message to inform the customer that email would be sent and proof ID is required to be shown while collection|
		|price for collection as Free                                                                                 |
	And the payment card details with the following is displayed
	    |Elements       |
	    |name on card   |
        |card number    |
        |expiry date    |
        |security code  |
        |Billing address|
    And e-wallet section displays the following
        |Elements             |
        |add clubcard vouchers|
        |add e-coupons|
        |pay with a gift card|
	Then I clear all the items in the basket
	And I SignOut
		

Scenario: Existing customer logged in at checkout 
	Given I navigate to the checkout page after adding items to the basket 
	And I login at the checkout page 
		|UserName                   |Password |
		|testaccount@tescodirect.com|Password1|
	Then the top navigation Order tab is highlighted 
	And the Basket tab is enabled and greyed out 
	And the Thank you tab is disabled and greyed out 
	And the following items are displayed 
		|Elements                 |
		|Item Image               |
		|Item quantity X Item Name|
		|Catalogue Number         |
		|Sold by                  |
		|Item price               |
	And the delivery method - Collection is selected by default 
	And the delivery cost is displayed as Free 
	And the Pay now box should display the following 
		|Elements       |
		|subtotal       |
		|total to pay   |
		|Clubcard points|
	And the following is displayed under delivery method - Collection
	    |Elements                               |
		|Stores                                 |
		|three stores closest to the post code  |
		|view more collection points with + sign|
	And the radio button of only the first store is selected
	And Collection details with following information is displayed
	    |Elements                                                                                                     |
		|Name                                                                                                         |
		|phone number                                                                                                 |
		|Selected store name                                                                                          |
		|message to show when the item can be collected                                                               |
		|message to inform the customer that email would be sent and proof ID is required to be shown while collection|
		|price for collection as Free                                                                                 |
	And the payment card details with the following is displayed
	    |Elements       |
	    |name on card   |
        |card number    |
        |expiry date    |
        |security code  |
        |Billing address|
    And e-wallet section displays the following
        |Elements             |
        |add clubcard vouchers|
        |add e-coupons|
        |pay with a gift card|
	Then I clear all the items in the basket
	And I SignOut
	

Scenario: New Customer
     Given I navigate to the checkout page after adding items to the basket as a newly registered user
     Then the top navigation Order tab is highlighted 
	And the Basket tab is enabled and greyed out 
	And the Thank you tab is disabled and greyed out 
	And the following items are displayed 
		|Elements                 |
		|Item Image               |
		|Item quantity X Item Name|
		|Catalogue Number         |
		|Sold by                  |
		|Item price               |
	And the delivery method - Collection is selected by default 
	And the delivery cost is displayed as Free 
	And the Pay now box should display the following 
		|Elements       |
		|subtotal       |
		|total to pay   |
		|Clubcard points|
	And the following is displayed under delivery method - Collection
	    |Elements                               |
		|Stores                                 |
		|three stores closest to the post code  |
		|view more collection points with + sign|
	And the radio button of only the first store is selected
	And Collection details with following information is displayed
	    |Elements                                                                                                     |
		|Name                                                                                                         |
		|phone number                                                                                                 |
		|Selected store name                                                                                          |
		|message to show when the item can be collected                                                               |
		|message to inform the customer that email would be sent and proof ID is required to be shown while collection|
		|price for collection as Free                                                                                 |
	And the payment card details with the following is displayed
	    |Elements       |
	    |name on card   |
        |card number    |
        |expiry date    |
        |security code  |
        |Billing address|
    And e-wallet section displays the following
        |Elements             |
        |add clubcard vouchers|
        |add e-coupons|
        |pay with a gift card|
	Then I clear all the items in the basket
	And I SignOut
	

Scenario: Customer registered at checkout
    Given I navigate to the checkout page after adding items to the basket
    And I register at the checkout page
    Then the top navigation Order tab is highlighted 
	And the Basket tab is enabled and greyed out 
	And the Thank you tab is disabled and greyed out 
	And the following items are displayed 
		|Elements                 |
		|Item Image               |
		|Item quantity X Item Name|
		|Catalogue Number         |
		|Sold by                  |
		|Item price               |
		
	And the delivery method - Collection is selected by default 
	And the delivery cost is displayed as Free 
	And the Pay now box should display the following 
		|Elements       |
		|subtotal       |
		|total to pay   |
		|Clubcard points|
	And the following is displayed under delivery method - Collection
	    |Elements                               |
		|Stores                                 |
		|three stores closest to the post code  |
		|view more collection points with + sign|
	And the radio button of only the first store is selected
	And Collection details with following information is displayed
	    |Elements                                                                                                     |
		|Name                                                                                                         |
		|phone number                                                                                                 |
		|Selected store name                                                                                          |
		|message to show when the item can be collected                                                               |
		|message to inform the customer that email would be sent and proof ID is required to be shown while collection|
		|price for collection as Free                                                                                 |
	And the payment card details with the following is displayed
	    |Elements       |
	    |name on card   |
        |card number    |
        |expiry date    |
        |security code  |
        |Billing address|
    And e-wallet section displays the following
        |Elements             |
        |add clubcard vouchers|
        |add e-coupons|
        |pay with a gift card|
	Then I clear all the items in the basket
	And I SignOut
	