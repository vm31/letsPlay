$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/loginFlow.feature");
formatter.feature({
  "name": "Amazon login flow test cases",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate error message with login page by entering invalid user name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i click on signIn page",
  "keyword": "Then "
});
formatter.step({
  "name": "verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "name": "i enter email address as \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "i click on continue",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the error message displayed",
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i open home page \"https://www.amazon.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate error message with login page by entering invalid user name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i click on signIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.i_click_on_signIn_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_Login_page_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter email address as \"arch.gajulaffcgfg@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_enter_email_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.i_click_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_the_error_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "validate error message with login page by entering invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i click on signIn page",
  "keyword": "Then "
});
formatter.step({
  "name": "verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.step({
  "name": "i enter email address as \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "i click on continue",
  "keyword": "Then "
});
formatter.step({
  "name": "i enter password as \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "i click on login",
  "keyword": "Then "
});
formatter.step({
  "name": "verify error message displayed on password page",
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i open home page \"https://www.amazon.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate error message with login page by entering invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i click on signIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.i_click_on_signIn_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Login page title \"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_Login_page_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter email address as \"arch.gajula@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_enter_email_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.i_click_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter password as \"aran002016\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message displayed on password page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_error_message_displayed_on_password_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027auth-error-message-box\u0027]//div[@class\u003d\u0027a-alert-content\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-HHQAO2M\u0027, ip: \u0027192.168.43.181\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54909}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0638dd23855640ad3965c4c66c7ac37d\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027auth-error-message-box\u0027]//div[@class\u003d\u0027a-alert-content\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat pages.SignInPage.errorMessageInvalidPassword(SignInPage.java:82)\r\n\tat stepDefinition.loginStep.verify_error_message_displayed_on_password_page(loginStep.java:111)\r\n\tat ✽.verify error message displayed on password page(file:features/loginFlow.feature:24)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});