package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement parent = driver.findElement(By.xpath("(//div[text()='SpiceClub'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(parent).perform();
		
		WebElement child =  driver.findElement(By.xpath("//div[text()='Credit Cards']"));
		
		act.moveToElement(child).click().perform();
		
}
}
