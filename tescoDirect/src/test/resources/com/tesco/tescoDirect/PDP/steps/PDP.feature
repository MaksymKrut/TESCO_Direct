@regression
Feature: PDP


  Scenario: Check PDP elements
    Given I navigate to TESCO direct "home_page"
    And I goto the iPad PDP page
    Then the following elements are displayed
      | Elements                     |
      | Breadcrumbs of the product   |
      | Product Title                |
      | Product image                |
      | Product Catalogue Number     |
      | Product Star Rating          |
      | Write a review link          |
      | Social Media icons           |
      | Product Buy box              |
      | Product details block        |
      | Product specifications block |
      | Customers who viewed block   |
      | Customer Reviews block       |
      | Add to wishlist Button       |
      | Special Offers block         |
    When I goto the AquaMarine Ring PDP page
    Then the following elements are displayed
      | Elements                    |
      | Variant items dropwdown     |
      | Recently viewed items block |

  Scenario: Product Buy Box
    When I look at the Product Buy Box
    Then the default quantity of the Product Buy Box is 1
    And the following elements are displayed
      | Elements                  |
      | Add to Basket button      |
      | feasible delivery options |

  Scenario: Adding a customer review
    When I click on the Write a review link
    Then My review overlay is displayed

  Scenario: Variant items
    When I select a variant item
    Then the variant item is selected
    And I am taken to the variant item page
