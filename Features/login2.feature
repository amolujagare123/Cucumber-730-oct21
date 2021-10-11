Feature: login examples with parameterization

  Background: before every scenario execution
    Given Browser is opened
    And it is maximized


  @login
  Scenario: to test the functionality of login button for valid inputs
    Given I am on login page of billing
    When I enter "admin" and "admin"
    And I click on login button of billing page
    Then I should land on dashboard

  @login
  Scenario: to test the functionality of login button for invalid inputs
    Given I am on login page of billing
    When I enter "abcd" and "xyz"
    And I click on login button of billing page
    Then I should get an error

  @login
  Scenario: to test the functionality of login button for blank inputs
    Given I am on login page of billing
    When I enter "" and ""
    And I click on login button of billing page
    Then I should get another error


    @reg
    Scenario: to test the functionality of submit button for user registration
     Given I am on user registration page
      When I enter below Data
        | nikhil | nikhil@gmail.com | 11111 | malegaon |
      And I click on submit button
      Then user should be submitted successfully


      @reg2
      Scenario Outline: short user registration
        Given I am am on entry from
        When I enter <name> , <email> , <number>
        And sumbit the form
        Then user should be added

        Examples:
          | name        | email       | number |
          | Amol        | a@gmail.com | 434343 |
          | Keerthana   | b@gmail.com | 43434  |
          | Raghavendra | c@gmail.com | 776767 |
          | Nikhil      | d@gmail.com | 23232  |
          | Anuja       | e@gmail.com | 99898  |
          | Sri vidya   | f@gmail.com | 21233  |
          | Atul        | g@gmail.com | 454666 |
          | Ayushee     | h@gmail.com | 88787  |












