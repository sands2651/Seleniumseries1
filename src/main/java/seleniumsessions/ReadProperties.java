package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties
{
	Properties prop = new Properties();
	public Properties getproperties()
	{
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/config/config.properties");
			
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
	
	
}
