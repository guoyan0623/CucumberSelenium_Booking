@Login
Feature: Test Login functionality

 @smoke
 
  Scenario Outline: Check login is successful with valid credentials
    
    Given user is on login page
    When user clicks on signin
    And user enters <username>
    And user enter <password>
    And user clicks on login
    Then user is navigated to the home page

 Examples:
 |username|password|
 |guoyan880623@163.com|Shanghai@0623|
 |guoyan0623@gmail.com|Shanghai@0623|


 