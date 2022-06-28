package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jerodhasignuppage {
	
	@FindBy(xpath="//input[@type='text']") private WebElement mobilenum;
	@FindBy(xpath="//button[@id='open_account_proceed_form']") private WebElement login;
	
	public Jerodhasignuppage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void entermobilenumber(String mobnum) {
		mobilenum.sendKeys(mobnum);
	}
	public void clickonlogin() {
		login.click();
	}
}
