Feature: Delete address

As a customer
I should be able to delete address
To keep my account updated




Scenario: Navigate to Manage my address book page
Given I navigate to the my account page as a logged in user
    | UserName              | Password  |
	|ashish.modi@uk.tesco.com|Password1|
Then the Manage my address book link is present
When I click on the Manage my address book link
Then I am taken to the Manage my address book page



Scenario:  Manage my address book page Elements are displayed
Given I am on the Manage my address book page
Then the following elements are present on the Manage my address book page
|Elements               |
|Breadcrumbs of the page|
|Manage my address book header text|
|Address Informational text|
|Radio Button for the first address selected|
|Radio Button for the second address not selected|
|Address Name|
|Address  |
|Day phone Label|
|Day Phone Number|
|Evening phone Label|
|Evening phone Number|
|Mobile phone Label|
|Mobile phone Number|
|Edit Button in First Address|
|Edit Button in Second Address|
|Delete Button in Second Address|
|Add a new address button|
|Save Changes button|


Scenario: Delete address linked to card
Given I am on the Manage my address book page
And I try to delete an address linked to my payment card
Then the payment card linked to address error is displayed

@DeleteAddress_CleanUp
Scenario:  Delete address/addresses
Given I am on the Manage my address book page
And I try to delete an address not linked to my payment card
Then the respective address is deleted