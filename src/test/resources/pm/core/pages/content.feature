Feature: Open the tab on the main menu of Processmaker.
  It shows the contents of Home - Design - Dashboard - Admin

  Scenario: Verify that it is possible to login step by step
    Given The login page of ProcessMaker app is Loaded
    Then Fill the username with admin and password with admin
    And Choose the workspace on you work e.g. workflow
    And Select the English language to manage the app
    And Click on Login button
    And Click in Home
    Then Show cases list
    And Click in Designer
    Then Show process list
    And Click in Dashboard
    Then Show dashboards list
    And Click in Setup
    Then Show Setup list
