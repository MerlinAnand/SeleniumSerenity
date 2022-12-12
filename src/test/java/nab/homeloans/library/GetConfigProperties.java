package nab.homeloans.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * To load the configuration properties.
 * 
 * @author chandra
 *
 */
public class GetConfigProperties {

	public static Logger log = LogManager.getLogger(GetConfigProperties.class.getName());

	/**
	 * This method loads configuration.properties file and returns the same.
	 * 
	 * @return prop
	 */
	public Properties getConfigProperty() {

		Properties prop = null;

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./configuration.properties");

			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			log.error("Configuration file is not found/missing");
		} catch (IOException ie) {
			log.error("Unable to load Configuration file");
		} catch (NullPointerException np) {
			log.error("Invalid Properties Object");
		}

		return prop;

	}

}
