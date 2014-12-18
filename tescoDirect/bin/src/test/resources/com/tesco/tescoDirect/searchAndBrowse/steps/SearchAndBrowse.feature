@testFirefox @MVP @S4
Feature: Search and Browse 


Scenario Outline: Verify Search as you type is working as expected
	Given I navigate to TESCO direct "home_page" 
	When I click on the Search by product name, catalogue no. or Keyword text box
	And I type "<characters>" in the Search by product name, catalogue no. or Keyword text box
    Then the search suggestion as you type overlay is "<displayed or not>" based on the user input
    
    Examples:
    |characters|displayed or not|
    |a         |true            |
	|advert    |false           |
	|apple     |true            |
	|Hudl 2    |true            |


Scenario Outline: Verifying if selecting an item from overlay takes user to the respective page
    Given I navigate to TESCO direct "home_page" 
	When I click on the Search by product name, catalogue no. or Keyword text box
	And I type "<items>" in the Search by product name, catalogue no. or Keyword text box
	And I click on the Search Button
	Then I am taken to the corresponding "<page>"
    
     Examples:
    |items                           |page											  |
    |dvd                             |dvd category page            				      |
	|Hudl 2 pink     			     |Hudl 2 PLP page with pink keyword on item name  |
	|hudl2 Soft Protective Shell Pink|Hudl 2 soft protective Shell Pink PDP page      |
	|683-7798    					 |Hudl2 Soft Touch Case Pink PDP page             |