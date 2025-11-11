package testing.TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	//Here all the tasks like file reading/writing, parsing etc will be handled.
	
	public static Properties propFileLoad(String path) throws IOException {
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		
		prop.load(fis);
		
		return prop;
	}

}
