Feature: Change Email Address

As a user
I should be able to change my Email Address
To keep my account updated


Scenario: Navigate to Change Email Address page
Given I navigate to the my account page as a logged in user
    | UserName              | Password  |
	|ashish.modi@uk.tesco.com|Password1|
Then the Change my email address link is present
When I click on the Change my email address link
Then I am taken to the Change my email address page



Scenario: Change my email address Page Elements are displayed
Given I am on the Change my email address Page
Then the following elements are present on the my email address Page
|Elements               |
|Breadcrumbs of the page|
|Change my email address header text|
|New Email address header text|
|Old Email address label|
|Old Email address textbox|
|Current Email address in Old Email address textbox|
|Password label |
|Password textbox|
|New email address label  |
|New email address textbox|
|Confirm new email address label  |
|Confirm new email address textbox|
|Cancel Button|
|Save Button|


Scenario: Email Addresses do not match
Given I am on the Change my email address Page
And I enter the current password in the password textbox
|CurrentPassword|
|Password1|
And I enter the following for New email address
|NewEmailAddress|
|tescodirecttestframework1@gmail.com|
And I enter the following for Confirm new email address
|ConfirmNewEmailAddress|
|tescodirecttestframework2@gmail.com|
When I click on the Save Button
Then the emails do not match error is displayed


@ChangeEmail_Cleanup
Scenario: Change Email address
Given I am on the Change my email address Page
And I enter the current password in the password textbox
|CurrentPassword|
|Password1|
And I enter the following for New email address
|NewEmailAddress|
|tescodirecttestframework1@gmail.com|
And I enter the following for Confirm new email address
|ConfirmNewEmailAddress|
|tescodirecttestframework1@gmail.com|
When I click on the Save Button
Then the email address is updated