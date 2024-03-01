@tag
Feature: OpenMRS Manage
  I want to use this template for my manage functionality

  @tag1
  Scenario: Manage OpenMRS
    Given OpenMRS url is open
    And user is on the login page
    When admin enter username and password
    When admin click on impatient ward to access location
    Then admin navigate to homepage

  Scenario: Manage OpenMRS website
    Given website is opened
    And naviagate to login page
    When user enter username and password
    When user click on impatient ward to access location
    Then user navigate to homepage
