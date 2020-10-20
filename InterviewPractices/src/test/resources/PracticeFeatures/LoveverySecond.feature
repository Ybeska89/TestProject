
Feature: Purchasing and Verify multiple items with Next Day Shipping.


Background: User is logged in to the application
 Given User navigate to the login page
 And User logs in with credentials as "yaso.kardes@gmail.com" and "Merlin8589"
 Then User should be logged in


Scenario:  Adding an extra Play gym then remove to purchase one Play Gym and one Block Set with Next Day Shipping.

 Given User navigates to Block Set
 And Increases Block Set to Two Block Set
 Then Adds block set to Cart
 And Navigates to Play Gym
 Then Adds play gym to Cart
 And Removes One Block Set from cart
 Then Continue to checkout
 And Fills up credidentials and continues to shipping
 And Selects premium shipping option and continues to payment
 And Fills up payment information and continues with Pay Now
 Then Verify totals for Play Gym & Block Set as "$261.32"
