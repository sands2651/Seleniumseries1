package seleniumRestart;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksArraylist 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		By linkele = By.tagName("a");
		//List<WebElement> linkedlist = driver.findElements(linkele);
		
		
		System.out.println(getElements(linkele));
		

	}
	
	public static List<String> getElements(By locator)
	{
		List<WebElement> li = driver.findElements(locator);
		List<String> alist = new ArrayList<String>();

		
		for(WebElement ele : li)
		{
			String linktext =  ele.getText();
			if(linktext.length()!=0)
			{
				alist.add(linktext);
			}
			
		}
		
		return alist;
		
		
	}

	

}



