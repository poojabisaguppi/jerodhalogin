package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Forgotpasswordpage;
import POM.Jerodhaloginpage;
import Utility.Excelsheet;

public class Jerodhaforgotpasswordpagetest {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
		}
	
	@Test
	public void loginwithValidusername() throws InterruptedException, EncryptedDocumentException, IOException {
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		jerodhaloginpage.clickonforgot();
		Thread.sleep(2000);
		Forgotpasswordpage forgotpasswordpage = new Forgotpasswordpage(driver);
		forgotpasswordpage.clickonIrememberid();
		String userid = Excelsheet.getsheetdata("credentials", 0, 1);
	}

}
