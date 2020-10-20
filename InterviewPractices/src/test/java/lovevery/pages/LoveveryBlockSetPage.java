package lovevery.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lovevery.utilities.CommonMethods;
import lovevery.utilities.LoveveryDriver;

public class LoveveryBlockSetPage {

	public LoveveryBlockSetPage() {
		PageFactory.initElements(LoveveryDriver.getDriver(), this);

	}

	@FindBy(xpath = "//*[@id=\"shopify-section-product\"]/div/section[1]/div[2]/div[2]/div[2]/form/button/span")
	@CacheLookup
	private WebElement addToCart;

	
	public void clickCart() {
		CommonMethods.waitForClickability(addToCart, 20); 	 	 	;
		addToCart.click();

	}
	
	@FindBy(xpath = "//*[@id=\"shopify-section-product\"]/div/section[1]/div[2]/div[2]/div[2]/form/div/button[2]")
	@CacheLookup
	private WebElement increase;
	
	public void clickIncrease() {
		increase.click();
	}
	
}
