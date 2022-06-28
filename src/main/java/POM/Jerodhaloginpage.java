package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jerodhaloginpage {
	
	@FindBy(xpath="//input[@type='text']") private WebElement userid;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgotpass;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public Jerodhaloginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserid(String id) {
		userid.sendKeys(id);
		}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickonlogin() {
		login.click();
	}
	public void clickonforgot() {
		forgotpass.click();
	}
	public void clickonsignup() {
		signup.click();
	}
}
