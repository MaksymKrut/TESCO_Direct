Feature: Delete Card

As a customer
I should be able to delete card details
To keep my account updated


Scenario: Navigate to Manage my payment details page
Given I navigate to the my account page as a logged in user
    | UserName              | Password  |
	|ashish.modi@uk.tesco.com|Password1|
Then the Manage my payment details link is present
When I click on the Manage my payment details link
Then I am taken to the Manage my payment details page



Scenario:  Manage my payment details page Elements are displayed
Given I am on the manage my payment details page
Then the following elements are present
|Elements               |
|Breadcrumbs of the page|
|Manage my payment card header text|
|Card Informational text|
|Card type label|
|Card type text|
|Card number label|
|Card number text displaying only last 4 digits of the card|
|Issue number label|
|Expiry date label  |
|Expiry date text|
|Billing address label|
|Address Name|
|Address  |
|Delete Button |



Scenario:  Delete Card
Given I am on the manage my payment details page
And I click on the delete card button
And click confirm on the following dialogue box
Then the respective card is deleted