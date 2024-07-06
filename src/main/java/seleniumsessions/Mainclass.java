package seleniumsessions;

import java.util.Properties;

public class Mainclass
{
	public static void main(String[] args)
	{
		BrowserUtil butil = new BrowserUtil();
		ReadProperties readprop = new ReadProperties();
		Properties prop = readprop.getproperties();
		
		butil.launchbrowser(prop.getProperty("browser"));
		butil.launchurl(prop.getProperty("url"));
		
		String currentitle = butil.getTitle();
		if(currentitle.equals(prop.getProperty("title")))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		String currenturl = butil.getcurrenturl();
		if(currenturl.contains("google"))
		{
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is incorrect");
		}
		
		//butil.close();
	}

}
