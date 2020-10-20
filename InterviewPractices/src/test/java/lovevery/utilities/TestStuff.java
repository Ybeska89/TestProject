package lovevery.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestStuff {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://lovevery-test.com/products/the-play-gym");
		
		
		WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"shopify-section-product\"]/div/section[1]/div/div[2]/div[2]/form/button"));
		
		cartButton.click();
		
		
		//*[@id="shopify-section-product"]/div/section[1]/div/div[2]/div[2]/form/button
		
		
		
	}

}
