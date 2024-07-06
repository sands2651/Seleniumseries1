package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotallinksDemo
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
		
		for(WebElement ele : linkslist)
		{
			String text = ele.getText();
			if(text.length()!=0)
			{
				System.out.println(ele.getText());
				if(text.equals("Tablets"))
				{
					ele.click();
					break;
					
				}
			}
			
			
			
		}
		
		
		
		
		
		
	}
	

}
