package lovevery.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lovevery.pages.LoveveryBarMenuPage;
import lovevery.pages.LoveveryBlockSetPage;
import lovevery.pages.LoveveryCart;
import lovevery.pages.LoveveryCheckOut;
import lovevery.pages.LoveveryLoginPage;
import lovevery.pages.LoveveryPlaySetPage;
import lovevery.utilities.CommonMethods;
import lovevery.utilities.LoververyPropertiesReader;
import lovevery.utilities.LoveveryDriver;

public class LoveverySteps {
	
	LoveveryBarMenuPage barPage;
	LoveveryCheckOut checkOut;
	LoveveryBlockSetPage block;
	LoveveryPlaySetPage playPage ;
	LoveveryCart cart;
	
	@Given("User navigate to the login page")
	public void user_navigate_to_the_login_page() {
	  LoveveryDriver.getDriver().get(LoververyPropertiesReader.getProperty("loginurl"));
	}

	@Given("User logs in with credentials as {string} and {string}")
	public void user_login_with_credentials_as_and(String string, String string2) {
	 LoveveryLoginPage login = new LoveveryLoginPage();
	 login.logInLovevery(string, string2);
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
	    CommonMethods comfirmAssert = new CommonMethods();
	    comfirmAssert.comfirmWithAssert("https://lovevery-test.com/account");  
	}

	@Given("User navigates to Block Set")
	public void navicates_to_Block_Set() {
		barPage = new LoveveryBarMenuPage();
		barPage.clickShopThenBlockSet();
	}

	
	@Then("Adds block set to Cart")
	public void adds_block_set_to_Cart() {	
	    block = new LoveveryBlockSetPage();
	    block.clickCart();
	   
	}

	@Then("Navigates to Play Gym")
	public void navigates_to_Play_Gym() {
		barPage = new LoveveryBarMenuPage();
		barPage.clickShopThenPlayGym();
	}

	@Then("Adds play gym to Cart")
	public void adds_play_gym_to_Cart() {
		 playPage = new LoveveryPlaySetPage();
		 playPage.addToCartButton();
	}

	@Then("Continue to checkout")
	public void continue_to_checkout() {
	    cart = new LoveveryCart();
	    cart.clickCheckOut();
	}

	@Then("Fills up credidentials and continues to shipping")
	public void fills_up_credidentials_and_continues_to_shipping() {
	    checkOut = new LoveveryCheckOut();
	    checkOut.fillForm();
	}

	@Then("Selects shipping option and continues to payment")
	public void selects_shipping_option_and_continues_to_payment() {
	    checkOut = new LoveveryCheckOut();
	    checkOut.shippingAndNext();
	}

	@Then("Fills up payment information and continues with Pay Now")
	public void fills_up_payment_information_and_continues_with_Pay_Now() {
		checkOut = new LoveveryCheckOut();
		checkOut.fillCardInfo();
	}
	@Then("Verify totals for Play Gym & Block Set as {string}")
	public void verify_totals_for_Play_Gym_Block_Set_as(String string) {
		checkOut = new LoveveryCheckOut();
		checkOut.confirmPrice(string);
		LoveveryDriver.closeBrowserSession();	
	}

	@Given("Increases Block Set to Two Block Set")
	public void increases_Block_Set_to_Two_Block_Set() {
	    block = new LoveveryBlockSetPage();
	    block.clickIncrease();
	    
	}

	@Then("Removes One Block Set from cart")
	public void removes_One_Block_Set_from_cart() {
		cart = new LoveveryCart();
		cart.clickDecrease();
	}

	@Then("Selects premium shipping option and continues to payment")
	public void selects_premium_shipping_option_and_continues_to_payment() {
	   checkOut = new LoveveryCheckOut();
	   checkOut.premiumAndNext();
		
	}

	
	
}
