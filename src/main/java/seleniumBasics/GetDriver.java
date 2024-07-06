package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver
{
	WebDriver driver;
	public WebDriver setdriver(String browser)
	{
		System.out.println(browser);
		switch(browser)
		{
		case("chrome"):
		{
			driver = new ChromeDriver();
			break;
		}
		
		case("firefox"):
		{
			driver = new ChromeDriver();
			break;
		}
		
		default:
			System.out.println("Plz pass the right browser");
		}
		
		return driver;
	}
	
	public String seturl(String url)
	{
		if(url==null)
		{
			System.out.println("NUll pinter");
		}
		else
		{
			driver.get(url);
		}
		return url;
	}
	
	public String settitle(String Title)
	{
		String title  = driver.getTitle();
		System.out.println(title);
		if(title.equals(title))
		{
			System.out.println("title is corect");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		return title;
		
		
	}
	
	public void closebrowser()
	{
		driver.close();
	}
	
	

}
