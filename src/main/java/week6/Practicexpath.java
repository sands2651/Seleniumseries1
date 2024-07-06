package week6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicexpath 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='form-group']/input"));
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
		
	}

}
