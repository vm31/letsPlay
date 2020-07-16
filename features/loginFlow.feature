Feature: Amazon login flow test cases
  Background:
    Given user Navigate to home page
    Then user verify amazon home display

  Scenario Outline:validate error message with login page by entering invalid user name
    Then user clicks on signIn page
    Then user verify Login page title "Amazon Sign In"
    Given user enters email address as "<email>"
    Then user clicks on continue
    Then user verify the error message displayed
    Examples:
      |email  |
      |arch.gajulaffcgfg@gmail.com|
      |9876554447                 |

  Scenario Outline:validate error message with login page by entering invalid password
    Then user clicks on signIn page
    Then user verify Login page title "Amazon Sign In"
    Given user enters email address as "<email>"
    Then user clicks on continue
    Given user enters password as "<password>"
    Then user clicks on login
    Then verify error message displayed


    Examples:
      |email  |password|
      |arch.gajula@gmail.com|aran002016|
      |8431260224|aran002016|

