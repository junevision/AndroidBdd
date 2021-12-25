Feature: Enter Login Details

  @smoke
  Scenario Outline: Successful Login
    Given user starts the application
    When user enters valid email <email>
    And user enters valid password <password>
    And user closes the keyboard of device
    And user clicks on login button
    Then user could see successful login message

    Examples:
      | email             | password  |
      | test1@gmail.com   | 123456    |
      | test2@hotmail.com | 987654321 |