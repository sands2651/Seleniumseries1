package week2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadFile 
{
	static Properties prop;
	public Properties getConfig() 
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/main/java/week2/config.properties");
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