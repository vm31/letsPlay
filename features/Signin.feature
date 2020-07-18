Feature: Amazon positive flow test cases
  Background:
    Given i open home page "https://www.amazon.in"
    Then  verify amazon home display
  Scenario Outline:verify login page with valid credentials
    Then i click on signIn page
    Then verify Login page title "Amazon Sign In"
    Given i enter email address as "<email>"
    Then i click on continue
    Given i enter password as "<password>"
    Then i click on login

  Examples:
    |email  |password|
  |arch.gajula@gmail.com|aran2016|

