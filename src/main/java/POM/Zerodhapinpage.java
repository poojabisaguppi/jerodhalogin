package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhapinpage {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement forgot;
	
	public Zerodhapinpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	public void enterpin(String pinnum) {
		pin.sendKeys(pinnum);
	}
	public void clickonlogin() {
		login.click();
	}
	public void clickonforgot() {
		forgot.click();
	}
}
