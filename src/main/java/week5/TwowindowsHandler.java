package week5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwowindowsHandler 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String Parentid = it.next();
		System.out.println("Parent id " + Parentid);
		
		driver.switchTo().window(Parentid);
		String parenttitle = driver.getTitle();
		System.out.println(parenttitle);
		
		
		String childid = it.next();
		System.out.println("Child id " + childid);
		driver.switchTo().window(childid);	
		//String childurl = driver.getCurrentUrl();
		//System.out.println(childurl);
		Thread.sleep(2000);
		String c_title = driver.getTitle();
		System.out.println(c_title);
		
		driver.quit();

		
	}

	
}
