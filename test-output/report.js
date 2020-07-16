$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/loginFlow.feature");
formatter.feature({
  "name": "Amazon login flow test cases",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify login page with invalid user name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user verify amazon home display",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on signIn page",
  "keyword": "Then "
});
formatter.step({
  "name": "user verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters email address as \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "name": "user verify the error message displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "arch.gajulaffcgfg@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify login page with invalid user name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user Navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "signinStep.user_Navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_clicks_on_signIn_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_verify_Login_page_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email address as \"arch.gajulaffcgfg@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "signinStep.user_enters_email_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_clicks_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.userVerifyTheErrorMessageDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify login page with invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user verify amazon home display",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on signIn page",
  "keyword": "Then "
});
formatter.step({
  "name": "user verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters email address as \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "Then "
});
formatter.step({
  "name": "verify error message displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "arch.gajula@gmail.com",
        "aran002016"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify login page with invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user Navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "signinStep.user_Navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_clicks_on_signIn_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_verify_Login_page_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email address as \"arch.gajula@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "signinStep.user_enters_email_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_clicks_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"aran002016\"",
  "keyword": "Given "
});
formatter.match({
  "location": "signinStep.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "signinStep.verifyErrorMessageDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});