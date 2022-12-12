package nab.homeloans.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Loads the corresponding driver based on browser type.
 * 
 * @author chandra
 *
 */
public class SetDrivers {

	/**
	 * Loads the corresponding driver based on browser type and returns the same.
	 * 
	 * @param browser
	 * @return driver
	 */
	public WebDriver setDrivers(String browser) {

		WebDriver driver = null;

		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/java/nab/homeloans/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "./src/test/java/nab/homeloans/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
}
