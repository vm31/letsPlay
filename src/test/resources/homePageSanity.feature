Feature: Amazon home page sanity scenarios

  Background:
    Given user launch url

  Scenario Outline:
    When he search for "<PRODUCT>"
    And I quit
    Examples:
      | PRODUCT   |
      | kitchen   |
      | kids toys |
      | facepack  |

  Scenario Outline: login test
    When I click signIn btn
    And I login "<EMAIL>"
    Examples:
      | EMAIL              |
      | vmiddela@gmail.com |