Feature: All login tests
 # @login
  Scenario: to test the functionality of login button for valid inputs
    Given I am on login page
    When I enter correct username and correct password
    And I click on login button
    Then I should land on home page
