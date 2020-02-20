@login
Feature: Login successfully
  Scenario: User should be able to login successfully
    Given User is on the homepage
    When User enters valid username
    And User enters valid password
    And Clicks login button
    Then Welcome message should be displayed