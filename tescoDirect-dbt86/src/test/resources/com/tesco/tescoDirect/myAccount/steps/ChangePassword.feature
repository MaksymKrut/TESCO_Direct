@testC @testF @testMVP @testSVP
Feature: Change Password

As a user
I should be able to change my account password
So that there is no breach on my account


Scenario: Navigate to Change Password page
Given I navigate to the my account page as a logged in user
    | UserName              | Password  |
	|ashish.modi@uk.tesco.com|Password1|
Then the Change password link is present
When I click on the Change password link
Then I am taken to the change password page



Scenario: Change Password Page Elements are displayed
Given I am on the change password page
Then the following elements are present on the change password page
|Elements               |
|Breadcrumbs of the page|
|Change password header text|
|Change password directions text|
|Old password label|
|Old password textbox|
|New password label  |
|New password textbox|
|Confirm password label  |
|Confirm password textbox|
|Password tip Informational Text|
|Password strength label|
|Password strength indicator in disabled state|
|Save Changes Button|


Scenario: Password do not match
Given I enter the current password in the Old password textbox
|CurrentPassword  |
|Password1        |
And I enter the following for New password
|NewPassword|
|Password2|
And I enter the following for Confirm password
|ConfirmPassword|
|Password3|
When I click on the Save Changes Button
Then the passwords do not match error is displayed

@ChangePassword_CleanUp
Scenario: Change current password
Given I enter the current password in the Old password textbox
|CurrentPassword  |
|Password1        |
And I enter the following for Confirm password
|ConfirmPassword|
|Password2|
And I enter the following for New password
|NewPassword|
|Password2|
Then the Password strength indicator is enabled
And the Password strength is displayed
When I click on the Save Changes Button
Then the password updated text is displayed


