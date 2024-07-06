package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSession 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By search = By.name("q");
		
		By getlist = By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");
		
		getlist(search, getlist, "karate", "naveen automation labs");
		
		
	}
	
	public static void getlist(By search, By getlist, String value, String name) throws InterruptedException
	{
		
		driver.findElement(search).sendKeys(name);
		Thread.sleep(3000);
		
		
		List<WebElement> options = driver.findElements(getlist);
		System.out.println(options.size());
		
		for(WebElement ele : options)
		{
			String text = ele.getText();
			if(text.contains(value))
			{
				ele.click();
				break;
			}
			
			
		}
		
		
		
	}
}
