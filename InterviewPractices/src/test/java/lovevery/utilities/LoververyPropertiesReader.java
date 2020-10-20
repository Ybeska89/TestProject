package lovevery.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class LoververyPropertiesReader {

	
	
	private static Properties pro;
	
	static {
	try {
			
	
	FileInputStream file = new FileInputStream("src\\test\\resources\\LoveveryProperties\\Lovevery.properties");
	
	pro = new Properties();
	
	pro.load(file);
	file.close();
	
	
		}catch(Exception e) {
		System.out.println("The Path is not correct:" + e.getMessage());
		}
	
	}
	
	public static String getProperty(String keyword) {
		
		return pro.getProperty(keyword);
	}
	
}
