$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/PracticeFeatures/LoveryFirstTest.feature");
formatter.feature({
  "name": "Purchasing and Verify multiple items",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is logged in to the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with credentials as \"yaso.kardes@gmail.com\" and \"Merlin8589\"",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.user_login_with_credentials_as_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Purchasing a product and verifying totals for Play Gym \u0026 Block Set",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigates to Block Set",
  "keyword": "Given "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.navicates_to_Block_Set()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adds block set to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.adds_block_set_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to Play Gym",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.navigates_to_Play_Gym()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adds play gym to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.adds_play_gym_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Continue to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.continue_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fills up credidentials and continues to shipping",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.fills_up_credidentials_and_continues_to_shipping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects shipping option and continues to payment",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.selects_shipping_option_and_continues_to_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fills up payment information and continues with Pay Now",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.fills_up_payment_information_and_continues_with_Pay_Now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify totals for Play Gym \u0026 Block Set as \"$244.38\"",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.verify_totals_for_Play_Gym_Block_Set_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/PracticeFeatures/LoveverySecond.feature");
formatter.feature({
  "name": "Purchasing and Verify multiple items with Next Day Shipping.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is logged in to the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with credentials as \"yaso.kardes@gmail.com\" and \"Merlin8589\"",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.user_login_with_credentials_as_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding an extra Play gym then remove to purchase one Play Gym and one Block Set with Next Day Shipping.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigates to Block Set",
  "keyword": "Given "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.navicates_to_Block_Set()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Increases Block Set to Two Block Set",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.increases_Block_Set_to_Two_Block_Set()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adds block set to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.adds_block_set_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to Play Gym",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.navigates_to_Play_Gym()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adds play gym to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.adds_play_gym_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Removes One Block Set from cart",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.removes_One_Block_Set_from_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Continue to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.continue_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fills up credidentials and continues to shipping",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.fills_up_credidentials_and_continues_to_shipping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects premium shipping option and continues to payment",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.selects_premium_shipping_option_and_continues_to_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fills up payment information and continues with Pay Now",
  "keyword": "And "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.fills_up_payment_information_and_continues_with_Pay_Now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify totals for Play Gym \u0026 Block Set as \"$261.32\"",
  "keyword": "Then "
});
formatter.match({
  "location": "lovevery.stepdefinitions.LoveverySteps.verify_totals_for_Play_Gym_Block_Set_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});