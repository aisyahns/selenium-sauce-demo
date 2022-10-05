#mvn clean verify -Dtags='Logout'
@Logouts
Feature: Logout
  As a user
  I want to logout
  So I can go back to login page

#  mvn clean verify -Dtags='Logout'
  @Logout
  Scenario: Success logout
    Given I have logged in
    When I click side menu
    And I click logout button
    Then I will go back to login page