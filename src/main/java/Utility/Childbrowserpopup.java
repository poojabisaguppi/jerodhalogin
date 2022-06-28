package Utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import POJO.Browser;

public class Childbrowserpopup {
	

	public static String childbrowser(WebDriver driver) throws InterruptedException {
		String title="";
		ArrayList<String> addresses = new ArrayList<String>(driver.getWindowHandles());
		int count = addresses.size();
		for(int i=0;i<count;i++)
		{
			
			String address = addresses.get(i);
			driver.switchTo().window(address);
			title = driver.getTitle();
			Thread.sleep(2000);
			
			}
		return title;
		
		
	}

}
