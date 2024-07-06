package seleniumRestart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOptions 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales/");
		driver.manage().window().maximize();
		
		
		
		
	
	}
	
	
	

}
