package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footerlinks
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		List <WebElement> path =  driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(path.size());
		
		for(WebElement ele : path)
		{
			String text = ele.getText();
			System.out.println(text);
			
		}

		
	}

}
