Feature: Login
  As user I want to be able to login with username and password

  # Test Method=Test Case= Scenario
  # Test + Data Provider=Scenario Outline +Example table
  Scenario:Login as  sales manager and verify that title is Dashboard
    Given user is on login page
    When user logs as a sales manager
    Then user should verify that title is Dashboard
    
    Scenario: Login as store  manager and verify that title is Dashboard
      Given user is on login page
      When user logs as a store manager
      Then user should verify that title is Dashboard