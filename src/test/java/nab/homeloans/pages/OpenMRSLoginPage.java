package nab.homeloans.pages;

import nab.homeloans.library.ThinkTime;
import nab.homeloans.pagefactory.OpenMRSPageFactory;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Navigate to home loans page
 * 
 * @author chandra
 *
 */

public class OpenMRSLoginPage {
	WebDriver driver = null;
	private OpenMRSPageFactory pageFactory;
	private ThinkTime thinkTime;

	public OpenMRSLoginPage() {

	}

	public OpenMRSLoginPage(WebDriver driver) {
		this.driver = driver;
		pageFactory = PageFactory.initElements(driver, OpenMRSPageFactory.class);
		thinkTime = new ThinkTime();
	}

	@Step("I login to openMRS page")
	public void login_to_openMRS_page(String userName,String password) {
		thinkTime.waitUntillElementClickable(driver, pageFactory.username);
		pageFactory.username.sendKeys(userName);
		thinkTime.waitUntillElementClickable(driver, pageFactory.password);
		pageFactory.password.sendKeys(password);
		thinkTime.waitUntillElementClickable(driver, pageFactory.inpatientward);
		pageFactory.inpatientward.click();
		thinkTime.waitUntillElementClickable(driver, pageFactory.loginbtn);
		pageFactory.loginbtn.click();
	}

}