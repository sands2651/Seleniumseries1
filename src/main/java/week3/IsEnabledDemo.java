package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo
{
	
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By locator = By.xpath("//div[@class='myButton']");
		Boolean b1 = driver.findElement(locator).isDisplayed();
		Boolean b2 = driver.findElement(locator).isEnabled();
		Boolean b3 = driver.findElement(locator).isSelected();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		
		
	}
	

}
