package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil 
{
	WebDriver driver;
	public WebDriver launchbrowser(String browser)
	{
		switch (browser) {
		case "chrome":
		{
			driver = new ChromeDriver();
			break;
		}
		
		case "firefox":
		{
			driver = new FirefoxDriver();
			break;
		}
			
		default:
			System.out.println("No browser is found");
			break;
		}
		
		return driver;
	}
	
	public void launchurl(String url)
	{
		if(url.contains("google"))
		{
			System.out.println("url is correct");
		}
		
		if(url.isBlank() ||url.isEmpty())
		{
			System.out.println("URL is empty");
		}
		
		driver.get(url);
		
		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
		
	}
	
	public String getcurrenturl()
	{
		return driver.getCurrentUrl();
		
		
	}
	
	public void close()
	{
		driver.close();
	}


}
