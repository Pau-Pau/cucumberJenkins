$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/pm/core/pages/content.feature");
formatter.feature({
  "id": "login-to-processmaker-app-with-valid-credentials",
  "tags": [
    {
      "name": "@Login",
      "line": 1
    },
    {
      "name": "@HomePage",
      "line": 1
    }
  ],
  "description": "In order to test the login page\r\nAs an admin user\r\nI want to successful login.",
  "name": "Login to ProcessMaker app with valid Credentials",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 14085590281,
  "status": "passed"
});
formatter.before({
  "duration": 10006749235,
  "status": "passed"
});
formatter.scenario({
  "id": "login-to-processmaker-app-with-valid-credentials;verify-that-it-is-possible-to-login-step-by-step",
  "description": "",
  "name": "Verify that it is possible to login step by step",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "The login page of ProcessMaker app is Loaded",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "Fill the username with admin and password with admin",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "Choose the workspace on you work e.g. workflow",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "Select the English language to manage the app",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "Click in Home",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "Show cases list",
  "keyword": "Then ",
  "line": 14
});
formatter.step({
  "name": "Click in Designer",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "Show process list",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "Click in Dashboard",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "Show dashboards list",
  "keyword": "Then ",
  "line": 18
});
formatter.step({
  "name": "Click in Setup",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "Show Setup list",
  "keyword": "Then ",
  "line": 20
});
formatter.match({
  "location": "LoginStepDefinitions1.the_login_page_of_ProcessMaker_app_is_Loaded()"
});
formatter.result({
  "duration": 135781550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 23
    },
    {
      "val": "admin",
      "offset": 47
    }
  ],
  "location": "LoginStepDefinitions1.fill_the_username_and_password(String,String)"
});
formatter.result({
  "duration": 1130843333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "workflow",
      "offset": 38
    }
  ],
  "location": "LoginStepDefinitions1.choose_the_workflow_on_you_work(String)"
});
formatter.result({
  "duration": 138326424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 11
    }
  ],
  "location": "LoginStepDefinitions1.select_the_language_to_manage_the_app(String)"
});
formatter.result({
  "duration": 138837708,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions1.click_on_Login_button()"
});
formatter.result({
  "duration": 5076844202,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ContentMenu.Show_en_cases()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ContentMenu.Show_en_Designer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ContentMenu.Show_en_dashboards()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ContentMenu.Show_en_Setup()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 56344879,
  "status": "passed"
});
formatter.after({
  "duration": 7199278,
  "status": "passed"
});
});