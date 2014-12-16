@CancelMyOrder
Feature: Cancel My Order Page

Scenario: Cancel My Order Page - Header
Given I navigate to TESCO direct "cancel_myorder"
Then I check for the following header elements in cancel my order page
|TESCO direct logo				|
|Offers link					|
|Clearance link					|
|Store Locator link				|

Scenario: Cancel My Order Page - Main module
Given I navigate to TESCO direct "cancel_myorder"
And I check for the following elements in cancel my order page
|Cancel my order									|
|Order Number										|
|How much money will be refunded to user's account	|
|Primary reason dropdown							|
|Secondary reason dropdown							|
|Your comments text box								|
|Back to order details button						|
|Submit request button								|
|Print this page link								|

Scenario: Cancel My Order Page - Refund details
Given I navigate to TESCO direct "cancel_myorder"
And I check for the following elements in Refund details panel
|Refund details - Title										|
|Card type													|
|Card Number												|
|Expiry date												|
|Name on card												|
|Billing Address											|
|Amount refunded											|
|Clubcard ending in											|
|Clubcard points deducted									|
|This page is secure. All of your personal details are safe	|

Scenario: Cancel My Order Page - Footer
Given I navigate to TESCO direct "cancel_myorder"
And I verify that standard TESCO footer is displayed at the bottom of the page