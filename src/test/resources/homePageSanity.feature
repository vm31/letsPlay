Feature: Amazon home page sanity scenarios

  Scenario Outline:
    Given user launch url
    When he search for "<PRODUCT>"
    And I quit
    Examples:
    |PRODUCT|
    | kitchen|
    | kids toys|
    | facepack |
