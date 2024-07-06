package seleniumRestart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartTest
{
	
	public static void main(String[] args)
	{
	
		BrowserUtility butil = new BrowserUtility();
		WebDriver driver = butil.launchBrowser("chrome");
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = butil.getTitlele();
		System.out.println(title);
		String url = butil.geturl();
		System.out.println(url);
		
		
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil etil = new ElementUtil(driver);
		etil.doSendkeys(username, "sands1989");
		etil.doSendkeys(pwd, "welcome");
		
		
	}

}

