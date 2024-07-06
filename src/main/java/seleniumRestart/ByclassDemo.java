package seleniumRestart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByclassDemo 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. By class
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement user = driver.findElement(username);
//		user.sendKeys("sands1900@gmail.com");
//		WebElement password =  driver.findElement(pwd);
//		password.sendKeys("kasis@123");
		
		//2.By class + Methods
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		

		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendkeys(username, "sands2651");
		eutil.doSendkeys(pwd, "Welcome@123");
	
		
		
		
		

		
	}
	
}
