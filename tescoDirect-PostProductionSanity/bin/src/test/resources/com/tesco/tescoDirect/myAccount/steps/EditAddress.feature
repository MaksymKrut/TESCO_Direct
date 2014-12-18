@EditAddress
Feature: Edit Address page
Scenario: Edit Address page - Header
Given I navigate to TESCO direct "edit_address"
#And I check for the following header elements in Edit Address page
#|TESCO direct logo				|
#|Shop by Department menu button	|
#|I'm looking for search bar 	|
#|Register or Sign In button		|
#|Your basket button				|
#|Offers link					|
#|Clearance link					|
#|Store Locator link				|
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


Scenario: Edit Address page - Edit your address
Given I navigate to TESCO direct "edit_address"
Then I check for the following elements in the Edit your address module
|Edit your address - Title		|
|Address nickname text field	|
|Postcode text field			|
|Edit button - Disabled			|
|Company Name text field		|
|Flat/unit number text field	|
|Building number/name text field|
|Street text field				|
|Property type dropdown			|
|Daytime phone text field		|
|Evening phone text field		|
|Mobile phone text field		|
|Save changes button 			|
|Cancel button					|

Scenario: Edit Address page - Footer
Given I navigate to TESCO direct "edit_address"
And I verify that standard TESCO footer is displayed at the bottom of the page