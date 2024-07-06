package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement ele = driver.findElement(By.xpath("//textarea[@name='q']"));
		ele.sendKeys("naveen automationlabs");
		Thread.sleep(5000);
		
		List<WebElement> search_options = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
		System.out.println(search_options.size());
		
		for(WebElement e : search_options)
		{
			String value = e.getText();
			if(value.contains("jmeter"))
			{
				e.click();
				break;
			}
			
		}
		
		
		
		
		
		
		
	
		
		
		
		

		
		
	}

}
