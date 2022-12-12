package nab.homeloans.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Waits for maximum 30 seconds if element is not visible or not clicked.
 * 
 * @author merlin
 *
 */
public class ThinkTime {
	/**
	 * Waits for maximum 30 seconds if element is not visible.
	 * 
	 * @param driver
	 * @param webElement
	 */
	public void wait(WebDriver driver, WebElement webElement) {

		(new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(webElement));
	}

	/**
	 * Waits for maximum 30 seconds if element is not clicked.
	 * 
	 * @param driver
	 * @param webElement
	 */
	public void waitUntillElementClickable(WebDriver driver, WebElement webElement) {

		(new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(webElement));

	}

}
