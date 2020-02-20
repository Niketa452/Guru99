
Feature: Sort mobile menu
  @mobilecategory
  Scenario: User should be able navigate to Mobile category and use 'Sort By Names' option from the dropdown list
    Given User is on homepage
    When User clicks on Mobile link
    And User is navigated to mobile category page
    And Selects 'Name' from 'Sort By' dropdown
    Then Mobile products should be displayed in alphabetical order

  @verifySonyXperiaprice
  Scenario: User verifies that the price of the product on the list page and the product page is equal
    Given User is on homepage
    When User clicks on Mobile link
    And User is navigated to mobile category page
    And User checks the price of Sony Xperia
    And User clicks on Sony Xperia product
    Then User is navigated to Sony Xperia product page
    And Price of the product is same as the product list page