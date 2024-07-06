package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Incorrect Ttile");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("google"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		driver.close();
	}

}













//Note:1. Ctrl +swift + o