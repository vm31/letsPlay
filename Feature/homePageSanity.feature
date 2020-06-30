Feature: Amazon home page sanity scenarios

  Scenario: TC_01_I click signIn btn
     Given user is on home page
     When I click signin btn
     Then I verify email box is displayed
