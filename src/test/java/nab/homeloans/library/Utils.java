package nab.homeloans.library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * To define all the common methods
 * 
 * @author Chandra
 *
 */
public class Utils {
	/**
	 * Executes the java script and returns the shadow root element
	 * 
	 * @param driver
	 * @param shadowRootEle
	 * @return WebElement
	 */
	public WebElement getShadowRootElement(WebDriver driver, WebElement shadowRootEle) {
		return (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",
				shadowRootEle);
	}

}
