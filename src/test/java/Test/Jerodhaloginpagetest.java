package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Jerodhaloginpage;
import POM.Zerodhapinpage;
import Utility.Excelsheet;
import Utility.Screenshot;

@Listeners(TestListeners.class)
public class Jerodhaloginpagetest {
	WebDriver driver;
	@BeforeMethod
	public void browser() throws InterruptedException {
		driver= Browser.openBrowser();
		Thread.sleep(3000);
	}
	
	@Test
	public void loginwithVaidcredentials() throws EncryptedDocumentException, IOException {
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		String username = Excelsheet.getsheetdata("credentials", 0, 1);
		String password = Excelsheet.getsheetdata("credentials", 1, 1);
		jerodhaloginpage.enteruserid(username);
		jerodhaloginpage.enterpassword(password);
		jerodhaloginpage.clickonlogin();
		}
	@Test
	public void forgotpasswordlinktest()
	{
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		jerodhaloginpage.clickonforgot();
	}
	@Test
	public void signuplinktest() {
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		jerodhaloginpage.clickonlogin();
	}
	@AfterMethod
	public void screenshot1() throws IOException {
		Screenshot.takescreenshot("jerodhaloginpage", driver);
	}
}
