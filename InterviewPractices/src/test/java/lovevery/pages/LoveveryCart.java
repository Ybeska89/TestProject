package lovevery.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lovevery.utilities.CommonMethods;
import lovevery.utilities.LoveveryDriver;

public class LoveveryCart {

	
	
	public LoveveryCart() {
		PageFactory.initElements(LoveveryDriver.getDriver(), this);
	
	}
	
	
	@FindBy(xpath = "//*[@id=\"MainContent\"]/div/form/div[4]/div/input[2]")
	@CacheLookup
	private WebElement checkOut;
	
	
	
	@FindBy(xpath = "//*[@id=\"MainContent\"]/div/form/div[1]/div[3]/div/div[1]/div[2]/button[1]")
	@CacheLookup
	private WebElement decrease;
	
	public void clickDecrease() {
		CommonMethods.waitForClickability(decrease, 20); 	 	 	;
		decrease.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void clickCheckOut() {
		CommonMethods.waitForClickability(checkOut, 20); 	 	 	;
		checkOut.click();

	}
	
	
	
	
	
	
	
	
	
	
	
}
