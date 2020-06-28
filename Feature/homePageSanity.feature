Feature: Amazon home page sanity scenarios

  Scenario: TC_01_Test Amazon home page positive work flows
    Given I launch url
    Then I verify title

  Scenario: TC_02_I click signIn btn
    When I click signin btn
    Then I verify email box is displayed
