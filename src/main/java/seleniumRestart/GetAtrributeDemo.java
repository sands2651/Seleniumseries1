package seleniumRestart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtrributeDemo 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eutil = new ElementUtil(driver);
		
		By link1 = By.linkText("Forgotten Password");
		//String linkurl = driver.findElement(link1).getAttribute("href");
		//System.out.println(linkurl);
		
		
//		By userid = By.id("input-email");
//		String idname = driver.findElement(userid).getAttribute("placeholder");
//		System.out.println(idname);
		
		//String text = eutil.getattribute(link1,"href");
		//System.out.println(text);
		
	
	}
}