package seleniumRestart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDemo
{
	static WebDriver driver;
	
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By link_webelement = By.linkText("Forgotten Password");
		//driver.findElement(link_webelement).click();
		
		
	
		click(link_webelement);
		
	}
	
	public static void click(By locator)
	{
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	
	
}
