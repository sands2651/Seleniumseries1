package testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngsession1
{
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Goossgle");
		
		
	}
	
	@Test
	public void getCurrentUrl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.googlsse.com/");
		
		
	}
	
	

}
