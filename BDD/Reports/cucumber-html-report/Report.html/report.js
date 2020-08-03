$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature.feature");
formatter.feature({
  "line": 1,
  "name": "Test Facebook Smoke Scenario",
  "description": "",
  "id": "test-facebook-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Test Login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open the Chrome and start the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter valid username and vaid password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should be able to Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebook.Open_the_Chrome_and_start_the_application()"
});
formatter.result({
  "duration": 8637291600,
  "status": "passed"
});
formatter.match({
  "location": "Facebook.I_enter_valid_username_and_vaid_password()"
});
formatter.result({
  "duration": 20600,
  "status": "passed"
});
formatter.match({
  "location": "Facebook.user_should_be_able_to_Login_successfully()"
});
formatter.result({
  "duration": 80300,
  "status": "passed"
});
});