package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Jerodhaloginpage;
import POM.Jerodhasignuppage;
import Utility.Childbrowserpopup;

public class Zerodhasignuppagetest {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openBrowser();
	}
	@Test
	public void signup() throws InterruptedException {
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		jerodhaloginpage.clickonsignup();
		String title = Childbrowserpopup.childbrowser(driver);
		if(title.equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account"))
		{
			Jerodhasignuppage jerodhasignuppage = new Jerodhasignuppage(driver);
			jerodhasignuppage.clickonlogin();
		}
	
	}
	
	
	

}
