 
 Feature: Test the login page

 
  Scenario: Login with valid credentials
    Given Specify the application url
    When Enter user id
    And Enter password
    And Click on signon field
    Then login is successfull,close 