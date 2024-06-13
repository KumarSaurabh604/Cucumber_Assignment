$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "valid login to Application",
  "description": "",
  "id": "login-to-application;valid-login-to-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter \"\u003cuserid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-to-application;valid-login-to-application;",
  "rows": [
    {
      "cells": [
        "userid",
        "password"
      ],
      "line": 13,
      "id": "login-to-application;valid-login-to-application;;1"
    },
    {
      "cells": [
        "saurabhsoni868@gmail.com",
        "123456"
      ],
      "line": 14,
      "id": "login-to-application;valid-login-to-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "valid login to Application",
  "description": "",
  "id": "login-to-application;valid-login-to-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter \"saurabhsoni868@gmail.com\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});