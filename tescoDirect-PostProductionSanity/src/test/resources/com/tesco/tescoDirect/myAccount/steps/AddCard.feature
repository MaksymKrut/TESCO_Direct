@testChrome
Feature: Add Card

As a customer
I should be able to add a payment card
To pay for items purchased online


Scenario: Navigate to Add a payment card page
Given I navigate to the my account page as a logged in user
    | UserName              | Password  |
	|ashish.modi@uk.tesco.com|Password1|
Then the Add a payment card link is present
When I click on the Add a payment card link
Then I am taken to the Add a payment card page



Scenario:   Add a payment card page Elements are displayed
Given I am on the Add a payment card page
Then the following elements are present on the Add a payment card page
|Elements               |
|Breadcrumbs of the page|
|Add a payment card header text|
|Payment Card Informational text|
|Card details Header|
|Card number label|
|Card number textbox|
|Cardholders name label|
|Cardholders name textbox|
|Issue number label|
|Issue number textbox|
|Expiry date label|
|Expiry date Month dropdown with MM as default value|
|Expiry date Year dropdown with YYYY as default value|
|Billing Address header|
|Billing Address Informational Text|
|My billing address radio button label|
|My billing address radio button not selected by default|
|Address Name|
|Address|
|Add Button|

@AddCard_CleanUp
Scenario:  Add Payment Card
Given I am on the Add a payment card page
When I enter the following the following information in the card details form
|Element|Value|
|Card number textbox|4659111122223333|
|Cardholders name textbox|Test Account|
|Expiry date Month dropdown|03|
|Expiry date Year dropdown|2018|
And I select the My billing address radio button
And I click on the Add button
Then the new payment card details are added