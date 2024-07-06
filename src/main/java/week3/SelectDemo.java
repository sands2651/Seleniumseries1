package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By country_Sele  = By.name("Country");
		WebElement coutry_ele = driver.findElement(country_Sele);
		
		
		Select sele = new Select(coutry_ele);
		List<WebElement> clist = sele.getOptions();
		System.out.println(clist.size());
		for(WebElement ele1 : clist)
		{
			String cnames = ele1.getText();
			System.out.println(cnames);
			if(cnames.equals("India"))
			{
				ele1.click();
				break;
			}
		}
		
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	
	}
}