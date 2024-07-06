package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtil 

{
	WebDriver driver;
	public WebElementUtil(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void doSendkeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	

	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	

}
