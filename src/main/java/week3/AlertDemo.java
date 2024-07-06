package week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		By locator = By.xpath("//button[text()='Click for JS Alert']");
		Thread.sleep(3000);
		driver.findElement(locator).click();
		//alert
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		
		
	}

}
