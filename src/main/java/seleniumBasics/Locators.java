package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		Thread.sleep(5);
		
		//2.
//		WebElement userid = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		
//		userid.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("test@123");
		
		
		//3.
//		By user1 = By.id("input-email");
//		By pwd1 = By.id("input-password");
//
//		
//		driver.findElement(user1).sendKeys("naveenkasi@gmail.com");
//		driver.findElement(pwd1).sendKeys("test@123");
		
		
		By user1 = By.id("input-email");
		By pwd1 = By.id("input-password");
		
//		getElement(user1).sendKeys("naveen@gmail.com");
//		getElement(pwd1).sendKeys("test@123456");
		
		doSendkeys(user1,"naveen@gmailcom");
		doSendkeys(pwd1,"test@124");
		
		
		
	}
	
		public static void doSendkeys(By Locator, String value)
		{
			getElement(Locator).sendKeys(value);
		}
	
		
		public static WebElement getElement(By Locator)
		{
			return driver.findElement(Locator);
			
		}
						
	}

