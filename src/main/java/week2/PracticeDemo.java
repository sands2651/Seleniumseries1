package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	
		ElementUtil eclass = new ElementUtil(driver);
		
		//eclass.sendKeys(username, "kasis@123");
		//eclass.sendKeys(passwrod, "password");
		
		
	
		
	}
	
	
	
	}


