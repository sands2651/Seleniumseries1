package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By imagelocator = By.tagName("img");

		getlinks(imagelocator, "src");
		
		
		
	}
	
	public static List<WebElement> getElements(By locator)
	{
		List<WebElement> ele = driver.findElements(locator);
		return ele;
	
	}
	
	
	public static void getlinks(By locator, String s1)
	{
		
		
		List<WebElement> ilist = getElements(locator);
		System.out.println(ilist.size());
		
		for(WebElement ele : ilist)
		{
			System.out.println(ele.getAttribute(s1));
		}
	
		
	}
		
	

}
