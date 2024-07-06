package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksCount

{
	public static void main(String[] args)
	{
		int linktext_count=0;
		int linknotext_count=0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		By links = By.tagName("a");
		List<WebElement> count = driver.findElements(links);
		System.out.println(count.size());
		
		for(WebElement ele : count)
		{
			String linktext = ele.getText();
			if(linktext.length()!=0)
			{
				linktext_count++;
			}
			
			if(linktext.length()==0)
			{
				linknotext_count++;
			}
	
		}
		System.out.println("links having text count: " + " " + (int)linktext_count);
		System.out.println("links without text count: " + " " +  (int)linknotext_count);
		
	}

}
