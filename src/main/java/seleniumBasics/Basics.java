package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
	
		
		driver.navigate().to("https://www.gmail.com");
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.navigate().forward();
		String title4 = driver.getTitle();
		System.out.println(title4);
		
		
		if(title1.equals(title3))
		{
			System.out.println("PASS");
		}
		
		else if(title3.equals(title4))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		
	}

}
