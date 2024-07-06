package seleniumRestart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextDemo
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eutil = new ElementUtil(driver);
		
		By tagelement = By.tagName("h2");
		
		//String text = driver.findElement(tagelement).getText();
		//System.out.println(text);
		
		String str = eutil.gettext(tagelement);
		System.out.println(str);
		
		
		
	}
	

}
