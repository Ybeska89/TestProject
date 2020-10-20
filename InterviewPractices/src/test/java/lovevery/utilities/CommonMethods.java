package lovevery.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CommonMethods {

	
	public void comfirmWithAssert(String actualUrl){
		String actualURL = actualUrl;
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 String expectedURL = LoveveryDriver.getDriver().getCurrentUrl();
		 Assert.assertEquals(actualURL, expectedURL);
		}
	
	
	public static WebElement waitForClickability(WebElement locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(LoveveryDriver.getDriver(), timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

