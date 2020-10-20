package lovevery.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import lovevery.utilities.CommonMethods;
import lovevery.utilities.LoveveryDriver;

public class LoveveryCheckOut {

	public LoveveryCheckOut() {

		PageFactory.initElements(LoveveryDriver.getDriver(), this);

	}

	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_first_name\"]")
	@CacheLookup
	private WebElement firstName;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_last_name\"]")
	@CacheLookup
	private WebElement lastName;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_address1\"]")
	@CacheLookup
	private WebElement adress;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_address2\"]")
	@CacheLookup
	private WebElement aptNum;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_city\"]")
	@CacheLookup
	private WebElement city;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_country\"]")
	@CacheLookup
	private WebElement country;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_province\"]")
	@CacheLookup
	private WebElement state;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_zip\"]")
	@CacheLookup
	private WebElement zipCode;
	@FindBy(xpath = "//*[@id=\"checkout_shipping_address_phone\"]")
	@CacheLookup
	private WebElement phoneNum;
	@FindBy(xpath = "//*[@id=\"continue_button\"]")
	@CacheLookup
	private WebElement goNextToShipping;

	public void fillForm() {
		firstName.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Yasin");
		lastName.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Beskardes");
		adress.sendKeys("1838 N Saint Louis");
		aptNum.sendKeys("2");
		city.sendKeys("Chicago");
		Select dropCountry = new Select(country);
		dropCountry.getOptions().get(0).click();
		Select dropDown = new Select(state);
		dropDown.getOptions().get(15).click();
		zipCode.sendKeys("60647");
		phoneNum.sendKeys("2241231234");
		goNextToShipping.click();
	}

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div[2]/div[2]/fieldset/div[1]/div/label/span[1]")
	@CacheLookup
	private WebElement freeShipping;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div[2]/div[2]/fieldset/div[4]/div/label/span[1]")
	@CacheLookup
	private WebElement premiumShipping;
	
	@FindBy(xpath = "//*[@id=\"continue_button\"]")
	@CacheLookup
	private WebElement finishShipping;

	public void shippingAndNext() {

		freeShipping.click();
		CommonMethods.waitForClickability(finishShipping, 20);
		finishShipping.click();
	}
	public void premiumAndNext() {
		
		premiumShipping.click();
		CommonMethods.waitForClickability(finishShipping, 20);
		finishShipping.click();
	}

	@FindBy(xpath = "//*[@title=\"Field container for: Card number\"]")
	@CacheLookup
	private WebElement cardNumber;

	@FindBy(xpath = "//*[@title=\"Field container for: Name on card\"]")
	@CacheLookup
	private WebElement cardName;

	@FindBy(xpath = "//*[@title=\"Field container for: Expiration date (MM / YY)\"]")
	@CacheLookup
	private WebElement cardExp;

	@FindBy(xpath = "//*[@title=\"Field container for: Security code\"]")
	@CacheLookup
	private WebElement cardCode;
	
	@FindBy(xpath = "//*[@id=\"continue_button\"]")
	@CacheLookup
	private WebElement payNow;

	public void fillCardInfo() {
		LoveveryDriver.getDriver().switchTo().frame(cardNumber);
		WebElement cardBoxInside = LoveveryDriver.getDriver().findElement(By.xpath("/html/body/form/input[1]"));
	
		String cardNum = "4111111111111111"	;
	
	   	for(int i=0;i<cardNum.length();i++){
	   		char c = cardNum.charAt(i);
   		String s = new StringBuilder().append(c).toString();
           cardBoxInside.sendKeys(s);	
	   	}
		
		LoveveryDriver.getDriver().switchTo().defaultContent();

		LoveveryDriver.getDriver().switchTo().frame(cardName);
		WebElement nameInsideFrame =LoveveryDriver.getDriver().findElement(By.xpath("/html/body/form/input[2]"));
		nameInsideFrame.sendKeys("Yasin Beskardes");
		
		LoveveryDriver.getDriver().switchTo().defaultContent();
		
		LoveveryDriver.getDriver().switchTo().frame(cardExp);
		WebElement expInsideFrame =LoveveryDriver.getDriver().findElement(By.xpath("/html/body/form/input[5]"));
	
		String cardExpDate = "0421"	;
		for (int i = 0; i < cardExpDate.length(); i++) {
			char c = cardExpDate.charAt(i);
			String s = new StringBuilder().append(c).toString();
			expInsideFrame.sendKeys(s);
		}
		
		LoveveryDriver.getDriver().switchTo().defaultContent();
		
		LoveveryDriver.getDriver().switchTo().frame(cardCode);
		WebElement codeInsideFrame =LoveveryDriver.getDriver().findElement(By.xpath("/html/body/form/input[6]"));
		codeInsideFrame.sendKeys("828");
		
		LoveveryDriver.getDriver().switchTo().defaultContent();
		payNow.click();
		
	}
	
	public void confirmPrice(String total) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String expectedshippingprice = total; 
		String actualshipingprice = LoveveryDriver.getDriver().findElement(By.xpath("//*[@id=\"order-summary\"]/div/div[2]/table/tfoot/tr/td/span[2]")).getText(); 
		System.out.println("The total of your items is:" + actualshipingprice);
		Assert.assertEquals("Verify Shipping Price", expectedshippingprice, actualshipingprice);
	}
	
}
