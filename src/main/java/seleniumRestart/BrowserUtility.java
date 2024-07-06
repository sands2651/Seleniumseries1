package seleniumRestart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility 
{
	WebDriver driver;
	public WebDriver launchBrowser(String browser)
	{
		switch (browser) {
		case ("chrome"):
		{
			driver = new ChromeDriver();
			break;
		}
		
		case ("firefox"):
		{
			driver = new FirefoxDriver();
			break;
		}

		default:
			System.out.println("unable to launch brower");
		}
		
		return driver;
		
		
	}
	
	public void launchURL(String url)
	{
		if(url==null)
		{
			System.out.println("NULL exception");
		}
		
		if(url.isBlank() || url.isEmpty())
		{
			System.out.println("Blankexception");
		}
		
		driver.get(url);

	}
	
	public String getTitlele()
	{
		return driver.getTitle();
	}
	
	public String geturl()
	{
		return driver.getCurrentUrl();
	}
	
	public void close()
	{
		driver.close();
	}

	//uidance Text for "General Operating Support Questions and project Support Questions are missing
	
}




