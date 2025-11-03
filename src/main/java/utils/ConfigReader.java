package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
	public static Properties intiProperties() {
		
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config/config.qa.properties");
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
			
		
	}
	
	
	public static String getProperty(String key) {
		
		if(prop == null) {
			intiProperties();
		}
		return prop.getProperty(key);
		
	}

}
