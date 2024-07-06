package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavinFooterlinks
{
static WebDriver driver;
	
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By npath = By.xpath("//div[@class='container']//div[@class='col-sm-3']//li/a");
		List<WebElement> list = driver.findElements(npath);
		
		System.out.println(list.size());
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
		
		
	}
	

}
