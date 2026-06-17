package utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	// used to read key-value pairs
	private static Properties prop;

	static {
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
