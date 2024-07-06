package week5;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).contextClick().perform();
		
		//WebElement c1 = driver.findElement(By.xpath("//span[text()='Edit']"));
		//act.moveToElement(c1).click().perform();
	
		
		List<WebElement> clist = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li[contains(@class,'context-menu-icon')]/span"));
		
		for(WebElement ele1 : clist)
		{
			String text = ele1.getText();
			System.out.println(text);
			
			if(text.equals("Delete"))
			{
				ele1.click();
				break;
			}
			
		}
	
		
		
		
				
		
		
	}
	

}
