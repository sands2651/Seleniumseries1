package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlinks
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		By linkloc = By.tagName("a");
		List<WebElement> linkele = driver.findElements(linkloc);
		
		for(WebElement ele : linkele)
		{
			String text = ele.getText();
			if(text.length()!=0)
			{
				System.out.println(text);
			}
			
		}
		
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

}
