package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceDemo 
{
	public static void main(String[] agrs)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		By country_Element = By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> country_List = driver.findElements(country_Element);
		System.out.println(country_List.size());
		
		for(WebElement iterator : country_List )
		{
			String text = iterator.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
		
		
		
		
	}
	

}
