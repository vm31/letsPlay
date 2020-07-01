Feature: Amazon home page sanity scenarios

  Background:
#    Given I launch url
    Then I verify title


  Scenario: TC_01_I click signIn btn
    When I click signin btn
    Then I verify email box is displayed
