$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/homePageSanity.feature");
formatter.feature({
  "name": "Amazon home page sanity scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_01_Test Amazon home page positive work flows",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I verify title",
  "keyword": "Given "
});
formatter.match({
  "location": "com.amazon.in.stepdefs.HomePageStepDef.iVerifyTitle()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Tc_02_I verify signIn flow with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click signin btn",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters email as \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on continue button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on signin button",
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
        "aran1128"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Tc_02_I verify signIn flow with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click signin btn",
  "keyword": "Given "
});
formatter.match({
  "location": "com.amazon.in.stepdefs.HomePageStepDef.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"arch.gajula@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.amazon.in.stepdefs.SignInPageStepDef.user_enters_email_as(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#ap_email\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-HHQAO2M\u0027, ip: \u0027192.168.43.181\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62153}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b09939bd8802b9900c4a476b8298f95c\n*** Element info: {Using\u003did, value\u003dap_email}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\r\n\tat com.amazon.in.pages.SignInPage.enetrEmail(SignInPage.java:28)\r\n\tat com.amazon.in.stepdefs.SignInPageStepDef.user_enters_email_as(SignInPageStepDef.java:55)\r\n\tat ✽.user enters email as \"arch.gajula@gmail.com\"(file:///E:/sampleMavenproject/letsPlay-master/Feature/homePageSanity.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.amazon.in.stepdefs.SignInPageStepDef.userClicksOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters password as \"aran1128\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.amazon.in.stepdefs.SignInPageStepDef.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.amazon.in.stepdefs.SignInPageStepDef.userClicksOnSigninButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});