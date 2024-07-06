package week4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParendxpathDemo
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(5000);
	
	}

}
