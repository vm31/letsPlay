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
formatter.step({
  "name": "user returs back on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user closes browser",
  "keyword": "And "
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
        "arch.gajulaffcgfg@gmail.com",
        "aran2016"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user Navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageStep.user_Navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStep.user_verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify login page with invalid user name",
  "description": "",
  "keyword": "Scenario Outline"
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
formatter.step({
  "name": "user returs back on login page",
  "keyword": "And "
});
formatter.match({
  "location": "signinStep.userRetursBackOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user closes browser",
  "keyword": "And "
});
formatter.match({
  "location": "signinStep.userClosesBrowser()"
});
formatter.result({
  "status": "passed"
});
});