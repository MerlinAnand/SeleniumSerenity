package nab.homeloans.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import nab.homeloans.library.ThinkTime;
import nab.homeloans.pagefactory.OpenMRSPageFactory;
import net.thucydides.core.annotations.Step;

/**
 * Navigate to home loans page
 * 
 * @author chandra
 *
 */

public class OpenMRSHomePage {
	WebDriver driver = null;
	private OpenMRSPageFactory pageFactory;
	private ThinkTime thinkTime;

	public OpenMRSHomePage() {

	}

	public OpenMRSHomePage(WebDriver driver) {
		this.driver = driver;
		pageFactory = PageFactory.initElements(driver, OpenMRSPageFactory.class);
		thinkTime = new ThinkTime();
	}


	// Navigate to register a patient page
	@Step("Navigate for register a patient")
	public void register_a_patient_page() {
		thinkTime.waitUntillElementClickable(driver, pageFactory.registerpatient);
		pageFactory.registerpatient.click();
	}

}