package seleniumRestart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("google"))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		
		String url = driver.getCurrentUrl();
		if(url.contains("google"))
		{
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is incorrect");
		}
		
		
		driver.close();
{
	
}
		
		
		
		
	}

}
