@tag
Feature: OpenMrs1 login1
 i want to use this template for my login file
 
 Scenario: Login1 openMrs1
 Given Browser is open
 And admin is on the login page
 When i enter username and password
 When i click on inpatient ward to access location
 Then i navigate to the home page
