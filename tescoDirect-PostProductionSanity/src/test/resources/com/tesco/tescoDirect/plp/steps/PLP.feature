@testC
Feature: PLP


Scenario: PLP initail Page load 
Given I navigate to TESCO direct "home_page"
When user types in "hudl" in the search and browse text
Then the PLP page should be displayed showing the no of products matching the keyword Hudl
And View by category filter should be displayed with different categories and number of products available per category
And Refine By - Clear all button should be disabled
And Price filter should be displayed with different price ranges and number of products available within each range
And Add to basket button should be displayed under every product
When user scrolls down to the very bottom of the loaded page
Then there should be an option to view more products under the same category/search criteria
When user clicks on View more products button
Then more products should be loaded on the same page


Scenario: Product BLock
Given I navigate to TESCO direct "home_page"
When user types in "jeans" in the search and browse text
Then every product should display the product image
And display the product title
And display the rating star with number of ratings
And display seller information
And should either display Add to Basket or Request Stock Alert or Pre-order or Select options
And on LLVP and LVP should display Add to Compare check box

Scenario: Applying filters
Given I navigate to TESCO direct "home_page"
When user types in "ipad" in the search and browse text
When user applies the Price filter
Then products should be displayed within the price as applied
When user clicks on sort by Best Sellers
Then products should be displayed based on the selection
When user selects view by category and clicks on a particular category
Then the number of items displayed should match the number displayed under that category when the page was first loaded
When user clicks on any preceeding bread crumb
Then the user should be navigated to the respective page
When new products have been added to the same category
Then I'm new ping image should be displayed along with the product image
When boost items are selected in the search criteria (e.g. HUDL)
Then Clubcard Boost image should be displayed along with the product image

Scenario: Add item to Basket from PLP
Given I navigate to TESCO direct "home_page" 
When user types in "ipad" in the search and browse text
When user clicks on Add to Basket on any item
Then user should be displayed the Streamline Basket overlay
And the item added should be displayed with message 1 item added to Basket
And should display number of items in the basket
And should display subtotal, clubcard points earned and Basket total
And should display items related to your basket block
And should display Customers with similar interests also viewed block
When user clicks on View Basket on the Stream line Overlay
Then user should be redircted to the basket details page
When user clicks Checkout on the Stream line overlay
Then user should be taken to checkout page
When user clicks on continue shopping link in the stream line overlay
Then user should be redirected to the PLP page from where the overlay was launched