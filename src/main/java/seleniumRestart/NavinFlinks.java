package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavinFlinks
{
	public static void main(String[] agrs)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> path = driver.findElements(By.xpath("//div[@class='col-sm-3']/ul//a"));
		System.out.println(path.size());
		
		for(WebElement ele : path)
		{
			String text = ele.getText();
			if(text.equals("Terms & Conditions"))
			{
				ele.click();
				break;
				
			}
		}
		

}
}

