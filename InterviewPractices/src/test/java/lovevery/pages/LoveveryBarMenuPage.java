package lovevery.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lovevery.utilities.CommonMethods;
import lovevery.utilities.LoveveryDriver;

public class LoveveryBarMenuPage {

	public LoveveryBarMenuPage() {
		PageFactory.initElements(LoveveryDriver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//div[@id=\"top\"]/div[2]/header/div/div[2]/div/ul/li[4]/a")
	@CacheLookup
	private WebElement shop;
	
	@FindBy(xpath = "//div[@id=\"top\"]/div[2]/header/div/div[2]/div/ul/li[4]/div/a[2]/p")
	@CacheLookup
	private WebElement blockSet;
	
	@FindBy(xpath = "//div[@id=\"top\"]/div[2]/header/div/div[2]/div/ul/li[4]/div/a[3]/p")
	@CacheLookup
	private WebElement playGym;
	
	
	
	
	public void clickShopThenBlockSet() {
		CommonMethods.waitForClickability(shop, 20);
 		shop.click();	
 		blockSet.click();
 		
 		
 		
 	}
	
 	public void clickShopThenPlayGym() {
 		
 		WebElement element = new WebDriverWait(LoveveryDriver.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(shop)) ;
 		
 		shop.click();	
 		playGym.click();
 		
 	
	
 	}
	
}
