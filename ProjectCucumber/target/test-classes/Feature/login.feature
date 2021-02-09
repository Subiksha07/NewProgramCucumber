Feature: To validate the facebook login function

  @smoke
  Scenario: To validate the login functionality with invalid credentials
    Given The user has to be in facebook login page
    When The user has to fill the username and password
    |subi|741852|
    
    And The user has to click the login button
    Then The user in invalid login page

   