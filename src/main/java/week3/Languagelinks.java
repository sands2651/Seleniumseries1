package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Languagelinks 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		By lpath = By.xpath("//div[@id='SIvCob']/a");
		List<WebElement> llinks = driver.findElements(lpath);
		System.out.println(llinks.size());
		
		for(WebElement ele : llinks)
		{
			System.out.println(ele.getText());
			
		}
		
		
		
		
	}
	

}
