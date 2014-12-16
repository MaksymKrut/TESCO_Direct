@regression
Feature: Registration

Scenario: Registration
 Given I navigate to TESCO direct "home_page" 
 And I click on the Sign in or Register Link
 And I click on the I am a new customer radio button
 Then the following fields and values for registration should be displayed
|Field             |Value|
|Title*            |Title|
|First name        |     |
|Last name         |     |
|Email             |     |
|Postcode          |     |
|Clubcard Number   |     |
And I don't have a Clubcard checkbox should appear unchecked
And Edit button should appear disabled
And Next button should appear enabled

Scenario: Registration Page - user fills in values and clicks on Next button
Given I navigate to TESCO direct "home_page"
And I click on the Sign in or Register Link
And I click on the I am a new customer radio button
When user fills in the following values in the registration field 
|Field             |values                  |
|Title             | "Mr"                   |
|First name        |"Tesco"                 |
|Last name         |"user01"                |
|Email             |"tescouser01@yahoo.com" |
|Postcode          |"AL71TW"                |
Then a drop down matching all of the postcode address should be displayed
When user selects an address from the drop down
Then the fields should be updated with the values of the address
When user clicks on I don't have a Clubcard checkbox 
And Clicks on the Next button
Then the additional registration details should be displayed with the values as below
|Field                           |values                  |
|Contact Phone number            | "07438305914"          |
|Password                        |""                      |
|Confirm Password                |""                      |
|Email                           |"tescouser01@yahoo.com" |
|Password strength               |""                      |
And Agree terms and conditions checkbox should appear unchecked
And Back button displayed and enabled
And Next button displayed and enabled 
When user enters the following values in the additional information page
|Field                           |values                            |
|Contact Phone number            |"07438305914"                     |
|Password                        |"Tesco!2345"                      |
|Confirm Password                |"Tesco!2345"                      |
And Clicks on Agree terms and conditions checkbox
And Clicks the Next button in additional information page	
Then user should be successfully registered and Home page should be shown