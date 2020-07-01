Feature: Amazon home page sanity scenarios

  Background:
#    Given I launch url
    Then I verify title


  Scenario: TC_01_I click signIn btn
    #homepage
    When I click signin btn
    #verify signin page loaded
    Then this element is displayed
