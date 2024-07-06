package salesforceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactsDropdownDemo 

{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://fordfoundation--training.sandbox.my.salesforce.com");
		driver.manage().window().maximize();
		By username_locator = By.id("username");
		By password_locator = By.id("password");
		By submit_locator = By.id("Login");
		
		driver.findElement(username_locator).sendKeys("a.sahu.srvcprvdr@fordfoundation.org.training");
		driver.findElement(password_locator).sendKeys("Welcome@1440320");
		driver.findElement(submit_locator).click();
		Thread.sleep(5000);
		
		By account_locator = By.xpath("(//a[@title='Aloena Pinas | Account'])[1]");
		driver.findElement(account_locator).click();
		
		Thread.sleep(5000);
		
		By accountinfo_locator =  By.xpath("//a[text()='Contact Info']");
		driver.findElement(accountinfo_locator).click();
		
		By mailingadress = By.xpath("//span[@class='inline-edit-trigger-icon slds-button__icon slds-button__icon_hint']");
		driver.findElement(mailingadress).click();
		
		System.out.println("started");
		
		Thread.sleep(5000);
		
		//By address = By.xpath("//input[@aria-label='Mailing Country']/parent::div/parent::div/parent::div/following-sibling::div/lightning-base-combobox-item//following-sibling::span/child::span");
		By address = By.xpath("//div[@aria-label='Mailing Country']//span[@class='slds-media__body']");
		List<WebElement> list = driver.findElements(address);
		System.out.println(list.size());
		
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
