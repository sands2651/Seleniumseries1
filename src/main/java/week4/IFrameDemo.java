package week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		By image = By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']");
		driver.findElement(image).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-8']")).sendKeys("kasis");
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-9']")).sendKeys("Sandep");

		
		List<WebElement> c_list = driver.findElements(By.xpath("//select[@id='RESULT_RadioButton-13']/option"));
		for(WebElement ele : c_list)
		{
			System.out.println(ele.getText());
			
		}
		
		
		
		
	}
	

}


			
			
		
		
		
		
//		Select sele = new Select(driver.findElement(By.id("RESULT_RadioButton-13")));
//		List<WebElement> list = sele.getOptions();
//		System.out.println(list.size());
//		
//		for(WebElement ele : list)
//		{
//			String text = ele.getText();
//			System.out.println(text);
//			if(text.equals("Indiana"))
//			{
//				ele.click();
//			
//			
//			}
			
