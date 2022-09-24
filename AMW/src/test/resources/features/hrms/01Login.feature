Feature: Login User HRMS

  Scenario: User invalid login
    When User go to Web HRM
    And User enter username password invalid
    Then User invalid credentials

  #And User click button login
  Scenario: User valid login
    When User enter username password valid
    Then User valid credentials
