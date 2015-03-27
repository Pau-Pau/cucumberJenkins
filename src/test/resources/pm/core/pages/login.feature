@Login @HomePage
Feature: Login to ProcessMaker app with valid Credentials
  In order to test the login page
  As an admin user
  I want to successful login.

  Scenario: Verify that it is possible to login step by step
    Given The login page of ProcessMaker app is Loaded
    Then Fill the username with admin and password with admin
    And Choose the workspace on you work e.g. workflow
    And Select the English language to manage the app
    And Click on Login button
    Then The Homepage is displayed

  Scenario: Verify that it is possible to login step by step
    Given The login page of ProcessMaker app is Loaded
    And Authenticate with admin credentials
    Then The Homepage is displayed