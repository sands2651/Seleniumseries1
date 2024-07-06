package seleniumsessions;

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
		
		//BY class
		By username = By.id("input-email");
		By password = By.id("input-password");
		
//		doSendkeys(username,"kasis");
//		doSendkeys(password,"weclome");
		
		WebElementUtil webutil = new WebElementUtil(driver);
		webutil.doSendkeys(username, "welcome");
		webutil.doSendkeys(password, "abc@123");
		
		
		
	
	}
	

	
	
}
