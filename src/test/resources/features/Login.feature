Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  @Logout
  Scenario Outline: Login with locked account
    Given I am on the login page
    When I input "<username>" username and "<password>" password
    And I click Login button
    Then I will get the "<result>"
  Examples:
  | username | password | result |
  |          |          | i can't login |
  |          | secret_sauce | i can't login |
  | standard_user |          | i can't login |
  | standard_user | secret_sauce | i can login |


#  Scenario: Login with valid username and valid password
#    Given I am on the login page
#    When I input valid username
#    And I input valid password
#    And I click Login button
#    Then I will go to dashboard