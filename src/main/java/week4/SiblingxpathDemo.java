package week4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingxpathDemo
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By namelocator = By.name("username");
		driver.findElement(namelocator).sendKeys("apiautomation");
		
		By pwdlocator = By.name("password");
		driver.findElement(pwdlocator).sendKeys("Selenium@12345");
		
		By submit = By.xpath("//input[@type='submit']");
		driver.findElement(submit).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		driver.findElement(By.xpath("//a[text()='neha sharma']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='neha sharma']/parent::td/following-sibling::td/a[@context='company']"));
		List<String> adding = new ArrayList<String>();
		for(WebElement ele : list)
		{
			String text = ele.getText();
			adding.add(text);
			
		}
		
		System.out.println(adding);
		
		
	}
	
	

}
