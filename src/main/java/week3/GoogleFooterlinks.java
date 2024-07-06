package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterlinks 

{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		By links = By.xpath("//div[@class='KxwPGc SSwjIe']");
		
		List<WebElement> flist = driver.findElements(links);
		System.out.println(flist.size());
		
		for(WebElement ele : flist)
		{
			String text = ele.getText();
			if(text.contains("Search"))
			{
				ele.click();
				System.out.println(driver.getTitle());
				break;
				
			}
					
		}
		
		
	}
	
		
		
	
	

}
