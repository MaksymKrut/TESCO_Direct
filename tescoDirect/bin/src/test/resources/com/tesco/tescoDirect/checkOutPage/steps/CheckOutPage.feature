 @CheckOutPage
Feature: Checkout Page 


Scenario: Checkout Page - Header 
	Given I navigate to TESCO direct "checkout_page"
	And I check for the following elements in the checkout page Global Header 
		|Tesco Direct Logo   	|
		|Website Feedback 	    | 
		|My Wishlists           |
		|Recently Viewed     	|
		|My Account           	|
		|Help		            |
	Then I check for the progress bar items as follows 
		|Basket	                  |   Order	     |Thank You	|
		|Enabled and Underlined   |   Active     |Disabled  |
	
	
Scenario: Checkout Page - Secure Checkout and Collection Delivery Type 
		Given I navigate to TESCO direct "checkout_page"
		When I check for the following under Secure checkout 
		    |							Secure checkout message									|
			|Select your delivery options, complete everything that's yellow and press "Pay now"|
		And I check for the following in Delivery Type module radio buttons 
			|Collection          |Delivery        | 
			|Selected by Default |Not Selected    |
		And I check for the following in Stores collection module 
			|closest to postcode			                    |
			|Three nearest stores and the Coresponding Details	|	
			|View more stores			                        |
		When I click on Store Details 
		Then I should see the dialog box with the following nearest stores details 
			|Details							|
			|Map View							|
			|Store Address Details				|
			|Click and Collect opening times:	|
		When I click on View more collection points 
		Then I should see the following items in View more collection points 
			|View less stores									|
			|Three nearest stores and the Coresponding Details	|
			|Please enter your town or postcode search bar		|
			|Find button										|
			
	
Scenario: Checkout Page - Home Delivery 
			Given I navigate to TESCO direct "checkout_page"
			When I click on Delivery radio button 
			Then I should see the following in the Delivery options 
				|Standard Delivery   |Express Delivery    |
				|Selected by Default|Not Selected          |
			And I check for the following message in the Delivery options
			    |                                     Delivery saver message                                              |
				|Delivery is free with Delivery Saver, if you spend over £10 on Tesco products. (Excludes Tesco Partners).|
			When I click on Delivery options help 
			Then I should see the following message in the Delivery options help
			    |                                     Delivery saver help message                                                                                                                                                                                                                                                                                                                                       |
				|Delivery Saver is a subscription-based service designed to help you cut the cost of your home deliveries.It means you wont pay delivery charges on any orders on Tesco products from Tesco direct(over £10).|
			When I click on Express Delivery 
			Then I Should see the Select a delivery date dialog box with the following elements 
				|Date Picker        		|
				|Confirm Date    			|
				|Cancel                		|
				|Delivery Charge			|
			And I check for the edit link in front of the contact person 
			And I check for the New Address link in front of billing address 
			And I check for the edit link in front of the No courier instructions
			
			
Scenario: Checkout Page - Payment Card 
				Given I navigate to TESCO direct "checkout_page"
				Then I check for the following fields in the payment card module 
					|Name on card			|
					|Card Number			|
					|Expiry date-Month		|
					|Expiry date-Year    	|
					|Security code			|
					|Billing Address drop down|
				And I check for the New Address link in front of payment card billing address 
				And I check for the Save this card under payment card billing address 
				
		
Scenario: Checkout Page - Voucher block 
					Given I navigate to TESCO direct "checkout_page"
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
		
						
					
Scenario: Checkout Page - Total to pay Block
						Given I navigate to TESCO direct "checkout_page"
						Then I check for the following in Total to pay Block 
							|Promotion          	|
							|Total to pay        	|
							|Pay now              	|
							|ClubCard points		|
							
					
Scenario: Checkout Page - Differernt  Payment method 
							Given I navigate to TESCO direct "checkout_page"
							Then I check for the following in Differernt Payment method images at bottom of the page
								|VISA         				|
								|Master Card				|
								|American Express			|
								|TESCO Bank					|
								|VeriSign Secured			|
								|Verified by VISA			|
								|MasterCard SecureCode		|
								|American Express Safekey	|