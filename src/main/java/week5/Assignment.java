package week5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String>  windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			String windowid = it.next();
			System.out.println("window id " + windowid);
			driver.switchTo().window(windowid);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			if(!parentid.equals(windowid))
			driver.close();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

}

}
