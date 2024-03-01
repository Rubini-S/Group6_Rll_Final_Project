Feature: Login functionality test
@tag
  Scenario: User logs in with valid credentials
    Given User is on the login page
    When User enters username "admin" and password "Admin123"
    And User selects location as "Inpatient Ward"
    And User clicks on the login button
    Then User should be logged in successfully