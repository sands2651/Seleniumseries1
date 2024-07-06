package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicesession1 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		
		List<String> ar = new ArrayList<String>();
		
		for(WebElement e :totallinks )
		{
			String s1 = e.getText();
			if(s1.length()!=0)
			{
				ar.add(s1);
			}
			
			
			
			
		
		
		
		}
		
	}
}

