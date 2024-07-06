package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavinFooterLinks 
{
	public static void main(String[] agrs)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By path = By.xpath("//div[@class='list-group']/a");
		
		List<WebElement> ele = driver.findElements(path);
		
		System.out.println(ele.size());
		for(WebElement e : ele)
		{
			String value = e.getText();
			if(value.equals("Newsletter"))
			{
				e.click();
				break;
			}
			
		}
		
		
		
		
		
		
	}

}
