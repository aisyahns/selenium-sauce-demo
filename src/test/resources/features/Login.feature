Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  Scenario: Login with locked account
    Given I am on the login page
    When I input locked username
    And I input valid password
    And I click Login button
    Then I will get error message

  Scenario: Login with valid username and valid password
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click Login button
    Then I will go to dashboard