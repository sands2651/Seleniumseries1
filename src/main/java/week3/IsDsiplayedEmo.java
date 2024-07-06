package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDsiplayedEmo 
{
static WebDriver driver;
	
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By locator = By.xpath("//input[@id='input-email']");
		
		Boolean b = driver.findElement(locator).isDisplayed();
		System.out.println(b);
	
		
		
		
		
	}
	

}
