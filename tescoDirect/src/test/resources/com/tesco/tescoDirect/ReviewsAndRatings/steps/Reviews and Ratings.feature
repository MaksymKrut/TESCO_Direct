@MVP 
Feature: Reviews and Ratings 

Scenario: Navigate to Reviews and Ratings overlay 
	Given I click on the Write a Review Link on the Buy a tesco sim page 
	Then My review overlay is displayed 
	
Scenario: Check elements on the My review Overlay 
	Given I am on the My review overlay 
	Then the following elements are displayed on the My review overlay 
		|Elements|
		|Product Image|
		|Product Name|
		|My Review Header|
		|Overall Rating Label|
		|Overall Ratings|
		|Click To Rate Text|
		|Review Title Label|
		|Review Title TextBox|
		|Customer Reviews Label|
		|Customer Reviews TextBox|
		|Review Media Box|
		|Recommend Product Question|
		|Recommend Product Yes Button|
		|Recommend Product No Button|
		|Rate Product Value Question|
		|Product Value Ratings|
		|Rate Product Quality Question|
		|Product Quality Ratings|
		|NickName Label|
		|NickName TextBox|
		|Location Label|
		|Location TextBox|
		|Email Label|
		|Email TextBox|
		|Age Group Question|
		|Age Group Dropdown|
		|Gender Question|
		|Gender Dropdown|
		|Recommend Tesco Site Question|
		|Recommend Tesco Site Scores|
		|Never Recommend Tesco Site Text|
		|Definitely Recommend Tesco Site Text|
		|Terms And Conditions CheckBox|
		|Terms And Conditions Label|
		|Future Communications Informational Text|
		|Post Review Button|
		
Scenario: Post a Review 
	Given I am on the My review overlay 
	When I fill the My Review form as following 
		|Element|Value|
		|Overall Rating|Excellent|
		|Review Title|Test|
		|Customer Review|I really love this product. This is the best product in the category that I have ever used|
		|Recommend Product Question|Yes|
		|Rate Product Value Question|Excellent|
		|Rate Product Quality Question|Excellent|
		|Nickname|Generate Random NickName|
		|Location|London|
		|Email|Generate Random NickName|
		|Age Group Question|25-34|
		|Gender|Male|
		|Recommend Tesco Site Question|10|
		|I agree to the terms and conditions checkbox|checked|
	And I click on the Post Review Button 
	Then my review is successfully posted 
	
	
	
	