$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TekSchoolScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Tek School Scenarios",
  "description": "",
  "id": "tek-school-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13546978000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Tekschool page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Click on Test Environment link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should see Test Environment page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinations.user_is_on_Tekschool_page()"
});
formatter.result({
  "duration": 5261000900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_Click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 1016191500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_should_see_Test_Environment_page()"
});
formatter.result({
  "duration": 8817100,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "SDET2019AUG_SDET_Register_Form_Test",
  "description": "",
  "id": "tek-school-scenarios;sdet2019aug-sdet-register-form-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@SDET_RF_DBV"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "User Click on myAccount menu on top of the page",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User click on register on myAccount menu",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User fill register form with below information",
  "rows": [
    {
      "cells": [
        "Shaiq",
        "Darwish",
        "beatrice.arnold@sakilacustomer.org",
        "2021234455",
        "Test123"
      ],
      "line": 54
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User click on \u0027no\u0027 radio button for Subscribe",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User should see \u0027Your Account Has Been Created!\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "User connects to Database",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "User sends query \u0027select * from public.customer where email\u003d\u0027beatrice.arnold@sakilacustomer.org\u0027\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User verify account is created with email \u0027beatrice.arnold@sakilacustomer.org\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_Click_on_myAccount_menu_on_top_of_the_page()"
});
formatter.result({
  "duration": 465693500,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_click_on_register_on_myAccount_menu()"
});
formatter.result({
  "duration": 717487600,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_fill_register_form_with_below_information(DataTable)"
});
formatter.result({
  "duration": 867243700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "no",
      "offset": 15
    }
  ],
  "location": "TekSchoolScenariosStepDefinitions.user_click_on_yes_radio_button_for_Subscribe(String)"
});
formatter.result({
  "duration": 562252600,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_click_on_continue_button()"
});
formatter.result({
  "duration": 541929700,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_should_see_Your_Account_Has_Been_Created()"
});
formatter.result({
  "duration": 492366300,
  "status": "passed"
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
formatter.after({
  "duration": 780207600,
  "status": "passed"
});
});