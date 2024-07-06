package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelect
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By path = By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> ele = driver.findElements(path);
		
		for(WebElement cntry : ele)
		{
			System.out.println(cntry.getText());
			String t1 = cntry.getText();
			if(t1.equals("India"))
			{
				cntry.click();
				break;
			}
			
		}
		
		
		
		
	
	}
	

}
