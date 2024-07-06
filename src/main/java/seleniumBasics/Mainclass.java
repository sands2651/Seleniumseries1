package seleniumBasics;

import java.util.Properties;

public class Mainclass 
{
	public static void main(String[] args)
	{
		
		GetDriver obj = new GetDriver();
		Inputfile ip = new Inputfile();
		Properties pp = ip.setProperties();
		
		
		
		
		
		obj.setdriver(pp.getProperty("browser"));
		obj.seturl(pp.getProperty("url"));
		obj.settitle("title");
		
		
		
		
		
	}
}

