package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement parent = driver.findElement(By.className("menulink"));
		Actions act =  new Actions(driver);
		act.moveToElement(parent).perform();
		
		WebElement child1 = driver.findElement(By.xpath("//a[text()='Single Videos']"));
		Thread.sleep(3000);
		act.moveToElement(child1).click().perform();
		
		
		
		
	}

}
