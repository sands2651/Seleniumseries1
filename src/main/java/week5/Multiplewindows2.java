package week5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows2

{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentid = driver.getWindowHandle();
		System.out.println("Parent Id is " +parentid );
		
	
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> list = driver.getWindowHandles();
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			String windowid = it.next();
			System.out.println("windowid is " + windowid);
			driver.switchTo().window(windowid);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			String title =  driver.getTitle();
			System.out.println(title);
			if(!parentid.equals(windowid))
			driver.close();

		}
		
		driver.switchTo().window(parentid);
		driver.close();
		
		
		
	
		
		
	
		
		

	}
}
