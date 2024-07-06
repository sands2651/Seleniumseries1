package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("main");
		WebElement ele = driver.findElement(By.xpath("//h2"));
		System.out.println(ele.getText());
		
		
	}

}
