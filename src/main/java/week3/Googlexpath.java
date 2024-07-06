package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlexpath
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		By gsearch = By.xpath("//textarea[@title='Search']");
		WebElement ele1 = getelement(gsearch);
		ele1.sendKeys("naveen automation labs");
		Thread.sleep(3000);
		
		By npath = By.xpath("(//ul[@class='G43f7e']//div[@class='wM6W7d']/span)");
		List<WebElement> ar = driver.findElements(npath);
		System.out.println(ar.size());
		
		for(WebElement ele : ar)
		{
			System.out.println(ele.getText());
			String txt = ele.getText();
			if(txt.contains("udemy"))
			{
				ele.click();
				System.out.println("********");
				String title = driver.getTitle();
				if(title.contains("yahoo"))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
		
				break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
				
	}
	
	public static WebElement getelement(By locator)
	{
		WebElement ele = driver.findElement(locator);
		return ele;

	}
	
	public static List<WebElement> getelements(By locator)
	{
		List<WebElement> ele = driver.findElements(locator);
		return ele;

	}
	

	
}
