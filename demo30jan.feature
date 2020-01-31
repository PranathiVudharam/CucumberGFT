Feature: login functionality

  Scenario Outline: login in TestMeApp
    Given user must be in login page
    When user enters "<username>" and "<password>"
    And performs login
    Then user must be in home page

    Examples: 
      | username | password    |
      | lalitha  | password123 |
