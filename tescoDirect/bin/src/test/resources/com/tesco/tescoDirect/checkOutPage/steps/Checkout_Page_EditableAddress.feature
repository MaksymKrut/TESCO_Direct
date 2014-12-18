@CheckOutPageEditableAddress
Feature: Checkout Page Editable address 

 
Scenario: Checkout Page Editable address - Header 
	Given I navigate to TESCO direct "checkout_page_editableaddress"
	And I check for the following elements in the checkout page Global Header 
		|Tesco Direct Logo   	|
		|Website Feedback 	    | 
		|My Wishlists           |
		|Recently Viewed     	|
		|My Account           	|
		|Help		            |
	Then I check for the  progress bar items as follows 
		|Basket	                  |   Order	     |Thank You	|
		|Enabled and Underlined   |   Active     |Disabled  |
		
	
Scenario: Checkout Page Editable address - Secure Checkout and Collection Delivery Type 
		Given I navigate to TESCO direct "checkout_page_editableaddress"
		When I check for the following under Secure checkout 
		    |							Secure checkout message									|
			|Select your delivery options, complete everything that's yellow and press "Pay now"|
		And I check for the following in Delivery Type module radio buttons for Editable Address
			|Collection          |Delivery        			| 
			|Not Selected		 | Selected by Default   	|
		Then I should see the These items can only be delivered message
	
		
Scenario: Checkout Page Editable address - Home Delivery 
			Given I navigate to TESCO direct "checkout_page_editableaddress"
			Then I should see the following in the Delivery options for Editable address page
				|Standard Delivery   |
				|Selected by Default |
			And I check for the address dropdown under Delivery details
			And I check for the edit link in front of the contact person 
			And I check for the New Address link in front of billing address 
			And I check for the edit link in front of the No courier instructions
			Then I check for the send to different addresses link exists and work as expected
			
	
			
Scenario: Checkout Page Editable address - Payment Card 
				Given I navigate to TESCO direct "checkout_page_editableaddress"
				Then I check for the following fields in the payment card module 
					|Name on card			|
					|Card Number			|
					|Expiry date-Month		|
					|Expiry date-Year    	|
					|Security code			|
					|Billing Address drop down|
				And I check for the New Address link in front of payment card billing address 
				And I check for the Save this card under payment card billing address 
				
	
Scenario: Checkout Page Editable address - Voucher block 
					Given I navigate to TESCO direct "checkout_page_editableaddress"
					And I check for the following Voucher sections 
						|Add Clubcard Vouchers 		|
						|Add eCoupons               |
						|Pay with a Gift Card       |
					When I click on Add Clubcard Vouchers 
					Then I should see the following elements in Add Clubcard Vouchers module
					|Module Messages|
					When I click on Add eCoupons 
					Then I should see the following elements in Add eCoupons module
					|Enter the eCoupon code exactly as it appears - including hyphens.	|
					|Coupon code text box												|
					|Cancel voucher button												|
					|Add voucher buttton												|
					When I click on Pay with a Gift Card 
					Then I should see the following elements in Pay with a Gift Card module
					|Enter your Gift Card code and PIN	|
					|Code text box						|
					|PIN text box						|
					|Cancel voucher button				|
					|Add voucher buttton				|
					#And I enter ecoupons code as "<eCoupons_code>" 
					#Then I should see the "<eCoupons_Expected_Result>" for eCoupons 
					#And I enter gift card code as "<Gift_Card_Code>" 
					#And I enter gift card PIN as "<Gift_Card_PIN>" 
					#Then I should see the "<Gift_Card_Expected_Result>" for Pay with a Gift Card 
	
	
		#|	Browser	 	 		|	URL		   	|eCoupons_code  |eCoupons_Expected_Result	|Gift_Card_Code	|Gift_Card_PIN	|Gift_Card_Expected_Result	|
		#|   Safari          	| checkout_page	| 				|							|				|				|							|
		#|   Safari          	| checkout_page	| 				|							|				|				|							|
		#|   Safari          	| checkout_page	| 				|							|				|				|							|
		#|   Safari          	| checkout_page	| 				|							|				|				|							|
		#|   Firefox			| checkout_page	| 				|							|				|				|							|
		#|   Chrome	 			| checkout_page	| 				|							|				|				|							|
		
						
						
Scenario: Checkout Page Editable address - Total to pay Block
						Given I navigate to TESCO direct "checkout_page_editableaddress"
						Then I check for the following in Total to pay Block 
							|Promotion          	|
							|Total to pay        	|
							|Pay now              	|
							|ClubCard points		|
					
Scenario: Checkout Page Editable address - Differernt  Payment method 
							Given I navigate to TESCO direct "checkout_page_editableaddress"
							Then I check for the following in Differernt Payment method images at bottom of the page
								|VISA         				|
								|Master Card				|
								|American Express			|
								|TESCO Bank					|
								|VeriSign Secured			|
								|Verified by VISA			|
								|MasterCard SecureCode		|
								|American Express Safekey	|
								