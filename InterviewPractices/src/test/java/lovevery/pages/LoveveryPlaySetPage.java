package lovevery.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lovevery.utilities.CommonMethods;
import lovevery.utilities.LoveveryDriver;

public class LoveveryPlaySetPage {

	
	
	
	public LoveveryPlaySetPage() {
		
		PageFactory.initElements(LoveveryDriver.getDriver(), this);
		
	}
	
	@FindBy(xpath="//*[@id=\"shopify-section-product\"]/div/section[1]/div/div[2]/div[2]/form/button/span")
@CacheLookup
private WebElement addToCart;

public void addToCartButton() {
	CommonMethods.waitForClickability(addToCart, 20);
	addToCart.click();
	

}
	
	
	
	

}
