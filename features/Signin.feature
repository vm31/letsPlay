Feature: Amazon positive flow test cases
  Background:
    Given user Navigate to home page
  Scenario: Home page
    Then user verify amazon home display
  Scenario Outline:verify login page with valid credentials
    Then user clicks on signIn page
    Then user verify Login page title "Amazon Sign In"
    Given user enters email address as "<email>"
    Then user clicks on continue
    Given user enters password as "<password>"
    Then user clicks on login
    And user closes browser
  Examples:
    |email  |password|
  |arch.gajula@gmail.com|aran1128|
