@tag
Feature: Registration
  I want to use this template for my feature file

  @tag1
  Scenario: Open registration page
    Given I want to open the browser
    And open OpenMRS page
    When I enter valid credentials
    And click on inpatient ward
    Then I open the home page
