Feature: Amazon home page sanity scenarios

  Scenario: Test Amazon home page positive work flows
    Given I launch url
    Then I verify title

  Scenario: I click signIn btn
    When I click signin btn
    Then I verify email box is displayed
