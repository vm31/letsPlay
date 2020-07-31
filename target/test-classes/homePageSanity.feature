Feature: Amazon home page sanity scenarios

  Background: user is on home page of amazon website
    Given user is on homepage

  Scenario Outline: I select item to shop
    When he search for "<PRODUCT>"
    Examples:
      | PRODUCT   |
      | kitchen   |
#      | kids toys |
#      | facepack  |

  Scenario Outline: login test
    When I click signIn btn
    And I login "<EMAIL>"
    Examples:
      | EMAIL              |
      | vmiddela@gmail.com |
