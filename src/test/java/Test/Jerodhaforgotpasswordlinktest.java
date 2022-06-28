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

public class Jerodhaforgotpasswordlinktest {
	WebDriver driver;
	@BeforeMethod
	public void forgotpasswordlink() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void forgotpassword() throws EncryptedDocumentException, IOException {
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		jerodhaloginpage.clickonforgot();
		Forgotpasswordpage forgotpassword = new Forgotpasswordpage(driver);
		forgotpassword.clickonIrememberid();
		String num = Excelsheet.getsheetdata("credentials", 0, 1);
		forgotpassword.enterid(num);
		forgotpassword.enterpannumber("12345");
		forgotpassword.clickonreceiveonemail();
	}

}
