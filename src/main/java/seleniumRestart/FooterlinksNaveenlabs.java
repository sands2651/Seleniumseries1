package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterlinksNaveenlabs 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerpath = By.xpath("//div[@class='col-sm-3']/ul//a");
		List<WebElement> footerlist = driver.findElements(footerpath);
		
		System.out.println(footerlist.size());
		for(WebElement ele : footerlist)
		{
			System.out.println(ele.getText());
		}
		
		
	
	}
}

