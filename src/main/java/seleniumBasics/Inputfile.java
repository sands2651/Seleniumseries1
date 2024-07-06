package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Inputfile
{
	Properties prop;
	public Properties setProperties()
	{
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/seleniumBasics/abc.properties");
			prop = new Properties();
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
	
