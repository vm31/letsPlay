Feature: Amazon login flow test cases
  Background:
    Given user Navigate to home page
    Then user verify amazon home display

  Scenario Outline:verify login page with invalid user name
    Then user clicks on signIn page
    Then user verify Login page title "Amazon Sign In"
    Given user enters email address as "<email>"
    Then user clicks on continue
    Then user verify the error message displayed
    And user returns back on login page
    And user closes browser


    Examples:
      |email  |password|
      |arch.gajulaffcgfg@gmail.com|aran2016|
