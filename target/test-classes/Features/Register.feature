@Register
Feature: Test registration function

  @regression
  Scenario Outline: Check registration function
    Given user is navigated to registeration page
    When user provides with <email>
    And user provide with <password>
    Then validate the welcome page
 Examples:
 |email|password|
 |sharon1234@163.com|Shanghai@0623|

    