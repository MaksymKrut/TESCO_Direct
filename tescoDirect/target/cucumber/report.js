$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_LLVP.feature");
formatter.feature({
  "line": 2,
  "name": "epic_no LVP validations",
  "description": "",
  "id": "epic-no-lvp-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegisteredUser"
    },
    {
      "line": 1,
      "name": "@NewUser"
    },
    {
      "line": 1,
      "name": "@AnonymousUser"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Get the Web Driver - Chrome",
  "description": "",
  "id": "epic-no-lvp-validations;get-the-web-driver---chrome",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@testChrome"
    },
    {
      "line": 3,
      "name": "@testC"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user defines the required webdriver for the LLVP device",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "configure the required tests that he wishes to run on LLVP",
  "keyword": "And "
});
formatter.match({
  "location": "LLVP.the_user_defines_the_required_webdriver_for_the_LLVP_device()"
});
formatter.result({
  "duration": 3607369536,
  "status": "passed"
});
formatter.match({
  "location": "LLVP.configure_the_required_tests_that_he_wishes_to_run()"
});
formatter.result({
  "duration": 32006,
  "status": "passed"
});
formatter.uri("com\\tesco\\tescoDirect\\checkOut\\steps\\Checkout - Add New Blling Address.feature");
formatter.feature({
  "line": 2,
  "name": "Checkout - Add New Blling Address",
  "description": "",
  "id": "checkout---add-new-blling-address",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@testC"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Add new billing address at checkout",
  "description": "",
  "id": "checkout---add-new-blling-address;add-new-billing-address-at-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the checkout page after adding items to the basket",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login at the checkout page",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "ashish.modi@uk.tesco.com",
        "Password1"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the New address link for billing address on the checkout page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I add a new billing address on the checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the new billing address is added on the checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "Checkout.I_navigate_to_the_checkout_page_after_adding_items_to_the_basket()"
});
formatter.result({
  "duration": 36262713705,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.I_login_at_the_checkout_page(DataTable)"
});
formatter.result({
  "duration": 6947427360,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.I_click_on_the_New_address_link_for_billing_address_on_the_checkout_page()"
});
formatter.result({
  "duration": 375570143,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.I_add_a_new_billing_address_on_the_checkout_page()"
});
formatter.result({
  "duration": 19544135056,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.the_new_billing_address_is_added_on_the_checkout_page()"
});
formatter.result({
  "duration": 176277286,
  "status": "passed"
});
});