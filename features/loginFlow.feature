Feature: Amazon login flow test cases
  Background:
    Given i open home page "https://www.amazon.in"
    Then  verify amazon home display

  Scenario Outline:validate error message with login page by entering invalid user name
    Then i click on signIn page
    Then verify Login page title "Amazon Sign In"
    Given i enter email address as "<email>"
    Then i click on continue
    Then verify the error message displayed
    Examples:
      |email  |
      |arch.gajulaffcgfg@gmail.com|
      #|9876554447                 |

  Scenario Outline:validate error message with login page by entering invalid password
    Then i click on signIn page
    Then verify Login page title "Amazon Sign In"
    Given i enter email address as "<email>"
    Then i click on continue
    Given i enter password as "<password>"
    Then i click on login
    Then verify error message displayed on password page


    Examples:
      |email  |password|
      |arch.gajula@gmail.com|aran002016|
      #|8431260224|aran002016|

