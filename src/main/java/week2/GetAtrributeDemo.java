package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtrributeDemo 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By path  = By.xpath("(//a[text()='My Account'])[1]");
		String str = driver.findElement(path).getAttribute("href");
		System.out.println(str);
		
		String s1 = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("id");
		System.out.println(s1);
		
		
		
	}

}
