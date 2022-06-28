package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Jerodhaloginpage;
import POM.Zerodhapinpage;
import Utility.Excelsheet;

public class Jerodhapinpagetest {
	WebDriver driver;
	@BeforeMethod
	public void browser() throws InterruptedException {
		driver= Browser.openBrowser();
		Thread.sleep(1000);
	}
	
	@Test
	public void jerohaloginwithvalidcredentials() throws EncryptedDocumentException, IOException, InterruptedException {
		Jerodhaloginpage jerodhaloginpage = new Jerodhaloginpage(driver);
		String userid = Excelsheet.getsheetdata("credentials", 0, 1);
		String password = Excelsheet.getsheetdata("credentials", 1, 1);
		jerodhaloginpage.enteruserid(userid);
		jerodhaloginpage.enterpassword(password);
		jerodhaloginpage.clickonlogin();
		Thread.sleep(3000);
		Zerodhapinpage zerodhapinpage = new Zerodhapinpage(driver);
		String pin = Excelsheet.getsheetdata("credentials", 2, 1);
		zerodhapinpage.enterpin(pin);
		zerodhapinpage.clickonlogin();
	}
	
}
