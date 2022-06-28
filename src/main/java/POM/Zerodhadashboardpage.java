package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhadashboardpage {
	@FindBy(xpath="//input[@type='text']")private WebElement searchshare;
	@FindBy(xpath="(//span[text()='TATAMOTORS'])[1]")private WebElement tatamotors;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement Buy;
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement> elements;
	@FindBy(xpath="(//span[text()='Buy'])[2]")private WebElement buyshare;
	@FindBy(xpath="(//input[@type=\"number\"])[1]")private WebElement quantity;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[1]")private WebElement intraday;
	
	public Zerodhadashboardpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void  enteronsearchshare() {
		searchshare.sendKeys("TATA MOTORS");
	}
	public void clickontatamotors(WebDriver driver) throws InterruptedException {
		tatamotors.click();
		Actions action = new Actions(driver);
		action.moveToElement(Buy);
		Thread.sleep(1000);
		//Buy.click();
		System.out.println();
	}
	public void buyshare() {
		Buy.click();
	}
	public void clickonBuyshare() {
		buyshare.click();
	}
	public void enteronquantity() {
		quantity.sendKeys("200");
	}
	public void clickonintraday() {
		intraday.click();
	}
	public void clickonBuy(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(tatamotors);
		Thread.sleep(2000);
		action.click(Buy);
		action.perform();
		
	}
	public void clickonelements(WebDriver driver) {
		int s = elements.size();
		for(int i=0;i<s-1;i++)
		{
			WebElement welement = elements.get(i);
			System.out.println(welement.getText());
			if(welement.getText().equals("TATA MOTORS"))
			{
				Actions action = new Actions(driver);
				action.moveToElement(welement);
				action.perform();
				Buy.click();
				break;
			}
			else
			{
				System.out.println("element not found");
			}
			
		}
	}
}
