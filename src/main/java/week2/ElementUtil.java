package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementUtil
{
	static WebDriver driver;
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static void sendKeys(By locator, String text)
	{
		getElement(locator).sendKeys(text);
	}

}
