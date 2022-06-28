package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpasswordpage {
	@FindBy(xpath="//label[@for='radio-30']")private WebElement iremembermyid;
	@FindBy(xpath="//label[@for='radio-31']") private WebElement iforgotid;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement id;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath="//label[@for='radio-35']") private WebElement receiveonemail;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement email;
	@FindBy(xpath="//label[@for='radio-36']")private WebElement receiveonsms;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement mobnum;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement captcha;
	@FindBy(xpath="//button[@type='submit']")private WebElement reset;
	
	public Forgotpasswordpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickonIrememberid() {
		iremembermyid.click();	
	}
	public void clickoniforgotid() {
		iforgotid.click();
	}
	public void enterid(String idnum) {
		id.sendKeys(idnum);
	}
	public void enterpannumber(String pannum) {
		pan.sendKeys(pannum);
	}
	public void enteremail(String mail) {
		email.sendKeys(mail);
	}
	public void clickonreceiveonemail() {
		receiveonemail.click();
	}
	public void clickonreceiveonsms() {
		receiveonsms.click();
	}
	public void entermobilenum(String num) {
		mobnum.sendKeys(num);
	}
	public void entercaptcha(String character) {
		captcha.sendKeys(character);
	}
	public void clickonreset() {
		reset.click();
	}

}
