package seleniumRestart;

import java.util.Properties;

public class MainDriverclss 
{
	public static void main(String[] args)
	{
		BrowserUtility butil = new BrowserUtility();
		ReadProperty readpro = new ReadProperty();
		Properties prop = readpro.ReadFile();
		butil.launchBrowser(prop.getProperty("browser"));
		butil.launchURL(prop.getProperty("url"));
	
		//title validation 
		String title = butil.getTitlele();
		System.out.println(title);
		if(title.contains(prop.getProperty("title")))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		
		//URL validation
		String url = butil.geturl();
		System.out.println(url);
		if(url.contains("google"))
		{
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is incorrect");
		}		
		
		butil.close();
	}

}
