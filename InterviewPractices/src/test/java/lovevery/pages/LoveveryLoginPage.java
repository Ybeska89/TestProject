mpackage lovevery.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lovevery.utilities.LoveveryDriver;

public class LoveveryLoginPage {
	
	
	
	public LoveveryLoginPage() {
		PageFactory.initElements(LoveveryDriver.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	@CacheLookup
	private WebElement loginEmail;
	
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	@CacheLookup
	private WebElement loginPassword;
	
	@FindBy(xpath = "//*[@id=\"sign in\"]/div[3]/div[1]/div[1]/button")
	@CacheLookup
	private WebElement signInButton;
	
 	public void logInLovevery(String uName, String uPass) {
 		
 		loginEmail.sendKeys(uName);
 		loginPassword.sendKeys(uPass);
 		signInButton.click();
 	
 		}
 	}
	
 	
	
	
	
	
	
	
	

