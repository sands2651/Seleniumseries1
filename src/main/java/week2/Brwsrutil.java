package week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brwsrutil
{
	WebDriver driver;
	public WebDriver lchBrowser(String browser)
	{
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		default:
			System.out.println("NO browser found");
			break;
		}
		return driver;
		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void launchurl()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

}
