Feature: Add address

As a customer
I should be able to Add address
To keep my account updated


Scenario: Navigate to Add a new address book page
Given I navigate to the my account page as a logged in user
    | UserName              | Password  |
	|ashish.modi@uk.tesco.com|Password1|
Then the Add a new address link is present
When I click on the Add a new address link
Then I am taken to the Add a new address page



Scenario:  Add a new address Elements are displayed
Given I am on the Add a new address page
Then the following elements are present on the add a new address page
|Elements               |
|Breadcrumbs of the page|
|Add a new address header text|
|Address Informational text|
|Address nickname label|
|Address nickname example text|
|Address nickname textbox  |
|Postcode label|
|Postcode textbox|
|Disabled Edit Button|
|Daytime phone label|
|Daytime phone textbox|
|Evening phone label|
|Evening phone textbox|
|Mobile phone label|
|Mobile phone textbox|
|Enabled Cancel Button|
|Disabled Save address Button|

@AddAddress_CleanUp
Scenario:  Add Address
Given I am on the Add a new address page
And I enter the following details for the Add a new address form
|Element|Value|
|Address nickname textbox|Work|
|Daytime phone textbox|07438305914|
|Evening phone textbox|07438305914|
|Mobile phone textbox|07438305914|
|Postcode textbox|AL7 1TW|
Then the Edit Button is enabled
When I select the first address from the address dropdown
Then the Save address Button is enabled
When I click on the Save address Button
Then the new address is added