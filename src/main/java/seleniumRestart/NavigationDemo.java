package seleniumRestart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.get("https://www.gmail.com");
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.navigate().forward();
		String title4 = driver.getTitle();
		System.out.println(title4);
		
		
		driver.navigate().to("https://www.google.com");
		String title5 = driver.getTitle();
		System.out.println(title5);
		
		
		
	}
}
