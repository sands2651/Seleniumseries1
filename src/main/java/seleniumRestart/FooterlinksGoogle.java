package seleniumRestart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterlinksGoogle
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		By leftfooter = By.xpath("//div[@class='KxwPGc AghGtd']/a");
		
		By rightfoter = By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']");
		
		
		List<WebElement> lflist = driver.findElements(leftfooter);
		for(WebElement ele : lflist)
		{
			System.out.println(ele.getText());
		}
		
		System.out.println("************");
		
		List<WebElement> rflist = driver.findElements(rightfoter);
		for(WebElement cle : rflist)
		{
			System.out.println(cle.getText());
		}
		
	}
	

}
