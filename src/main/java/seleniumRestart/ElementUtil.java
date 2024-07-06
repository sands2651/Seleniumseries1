package seleniumRestart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil 
{
	WebDriver driver;
	public ElementUtil(WebDriver driver)
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
	
	public void click(By locator)
	{
		getElement(locator).click();
	}
	
	public String gettext(By locator)
	{
		return getElement(locator).getText();
		
	}
	
	public String getattribute(By locator, String value)
	{
		return getElement(locator).getAttribute(value);
		
	}
	
	//*********Select class ************
	
	public void getselectclass(By locator, String text)
	{
		Select sele = new Select(getElement(locator));
		sele.selectByVisibleText(text);
	}

}
