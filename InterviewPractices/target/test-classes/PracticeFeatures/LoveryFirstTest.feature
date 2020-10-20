
Feature: Purchasing and Verify multiple items


Background: User is logged in to the application
 Given User navigate to the login page
 And User logs in with credentials as "yaso.kardes@gmail.com" and "Merlin8589"
 Then User should be logged in


Scenario: Purchasing a product and verifying totals for Play Gym & Block Set 

 Given User navigates to Block Set
 Then Adds block set to Cart
 And Navigates to Play Gym
 Then Adds play gym to Cart
 Then Continue to checkout
 And Fills up credidentials and continues to shipping
 And Selects shipping option and continues to payment
 And Fills up payment information and continues with Pay Now
 Then Verify totals for Play Gym & Block Set as "$244.38"