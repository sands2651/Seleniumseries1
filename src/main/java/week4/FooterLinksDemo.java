package week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksDemo 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//By Header = By.xpath("//div[@class='col-sm-3']//li/a");  -- > All footer links
		
		//By Header = By.xpath("//h5 | //div[@class='col-sm-3']//li/a |  //p/a");
		
		By Header = By.xpath("//footer//h5  |  //footer//a | //footer//p");
		
		List<WebElement> list = driver.findElements(Header);
		
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
		
		
		
				
		
	}

}
