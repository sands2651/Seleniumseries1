package seleniumRestart;

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
		driver  = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		driver.manage().window().maximize();
		ElementUtil ele = new ElementUtil(driver);
		
		By Country = By.id("Form_getForm_Country");
		//Select sele = new Select(driver.findElement(Country));
		//sele.selectByVisibleText("India");
		
		//getselectclass(Country,"India");
		ele.getselectclass(Country, "Australia");

	}
	
	

}
