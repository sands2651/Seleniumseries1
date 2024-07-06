package week2;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest 
{
	
	public static void main(String[] args)
	{
		
		By username = By.id("input-email");
		By passwrod = By.id("input-password");
		
		LoadFile lfile = new  LoadFile();
		Properties prop = lfile.getConfig();
	
		
		Brwsrutil butil = new Brwsrutil();
		WebDriver driver = butil.lchBrowser(prop.getProperty("browser"));
		butil.launchurl();
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.sendKeys(username, "daddy");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	
	}
}
