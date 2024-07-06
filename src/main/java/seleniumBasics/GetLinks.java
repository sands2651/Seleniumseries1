package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks
{
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//1. Get all links
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		System.out.println(l1.size());
		
		for(WebElement it:l1)
		{
			String lnktext = it.getText();
			if(lnktext.length()!=0)
			{
				System.out.println(lnktext);
			}
			
		}
		
		
		//1. Get all images
				//List<WebElement> l1 = driver.findElements(By.tagName(""));
				System.out.println(l1.size());
				
				for(WebElement it:l1)
				{
					String lnktext = it.getText();
					if(lnktext.length()!=0)
					{
						System.out.println(lnktext);
					}
					
				}
		
		
	}

}
