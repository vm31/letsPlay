Feature: Amazon home page sanity scenarios

  Scenario: TC_01_Test Amazon home page positive work flows
    Given I verify title
  Scenario Outline:Tc_02_I verify signIn flow with valid credentials
    Given I click signin btn
    Given user enters email as "<email>"
    Then user clicks on continue button
    Then user enters password as "<password>"
    Then user clicks on signin button
    Examples:
      | email    |password|
      |arch.gajula@gmail.com|aran1128|


