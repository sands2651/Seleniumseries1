package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDempo
{
	
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		By locator = By.xpath("//input[@name='agreeTerms']");
		driver.findElement(locator).click();
		//driver.findElement(locator).click();
		
		Boolean b = driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
		System.out.println(b);
		
		Boolean b2 = driver.findElement(locator).isEnabled();
		System.out.println(b2);
		
		
		
		
		
		
		

}
}

