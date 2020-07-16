Feature: Amazon login flow test cases
  Scenario Outline:verify login page with invalid user name
    Given user Navigate to home page
    Then user verify amazon home display
    Then user clicks on signIn page
    Then user verify Login page title "Amazon Sign In"
    Given user enters email address as "<email>"
    Then user clicks on continue
    Then user verify the error message displayed




    Examples:
      |email  |
      |arch.gajulaffcgfg@gmail.com|

  Scenario Outline:verify login page with invalid password
    Given user Navigate to home page
    Then user verify amazon home display
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

