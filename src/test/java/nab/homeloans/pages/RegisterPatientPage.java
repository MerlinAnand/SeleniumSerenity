package nab.homeloans.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import nab.homeloans.library.ThinkTime;
import nab.homeloans.pagefactory.OpenMRSPageFactory;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;

/**
 * Navigate to home loans topics page
 * 
 * @author chandra
 *
 */
public class RegisterPatientPage {
	WebDriver driver = null;
	private OpenMRSPageFactory pageFactory;
	private ThinkTime thinkTime;

	public RegisterPatientPage() {

	}

	public RegisterPatientPage(WebDriver driver) {
		this.driver = driver;
		pageFactory = PageFactory.initElements(driver, OpenMRSPageFactory.class);
		thinkTime = new ThinkTime();
	}

	// Navigate to register a patient page
	@Step("Step for register a patient")
	public void navigate_register_a_patient_page() {
		thinkTime.waitUntillElementClickable(driver, pageFactory.registerpatient);
		pageFactory.registerpatient.click();
	}

	@Step("I enter the registration details")
	public void enter_registration_details(String givenName,String middleName, String familyName, String gender, String day,String month,String year,String address1,String address2,String city,String state,String country,String postCode,String phoneNumber,String relationType,String personName){

		thinkTime.waitUntillElementClickable(driver, pageFactory.givenNameRegisterPatient);
		pageFactory.givenNameRegisterPatient.sendKeys(givenName);

		thinkTime.waitUntillElementClickable(driver, pageFactory.middleNameRegisterPatient);
		pageFactory.middleNameRegisterPatient.sendKeys(middleName);

		thinkTime.waitUntillElementClickable(driver, pageFactory.familyNameRegisterPatient);
		pageFactory.familyNameRegisterPatient.sendKeys(familyName);

		thinkTime.waitUntillElementClickable(driver, pageFactory.nextButton);
		pageFactory.nextButton.click();

		thinkTime.waitUntillElementClickable(driver, pageFactory.genderFieldRegisterPatient);
		pageFactory.genderFieldRegisterPatient.click();
		Select genderField = new Select(pageFactory.genderFieldRegisterPatient);
		System.out.println("gender" + gender);
		genderField.selectByVisibleText(gender);

		thinkTime.waitUntillElementClickable(driver, pageFactory.nextButton);
		pageFactory.nextButton.click();

		thinkTime.waitUntillElementClickable(driver, pageFactory.birthdateDayRegisterPatient);
		pageFactory.birthdateDayRegisterPatient.sendKeys(day);

		thinkTime.waitUntillElementClickable(driver, pageFactory.birthdateMonthRegisterPatient);
		pageFactory.birthdateMonthRegisterPatient.click();
		Select birthMonth = new Select(pageFactory.birthdateMonthRegisterPatient);
		birthMonth.selectByVisibleText(month);

		thinkTime.waitUntillElementClickable(driver, pageFactory.birthdateYearRegisterPatient);
		pageFactory.birthdateYearRegisterPatient.sendKeys(year);

		thinkTime.waitUntillElementClickable(driver, pageFactory.nextButton);
		pageFactory.nextButton.click();

		thinkTime.waitUntillElementClickable(driver, pageFactory.address1RegisterPatient);
		pageFactory.address1RegisterPatient.sendKeys(address1);

		thinkTime.waitUntillElementClickable(driver, pageFactory.address2RegisterPatient);
		pageFactory.address2RegisterPatient.sendKeys(address2);

		thinkTime.waitUntillElementClickable(driver, pageFactory.cityVillageRegisterPatient);
		pageFactory.cityVillageRegisterPatient.sendKeys(city);

		thinkTime.waitUntillElementClickable(driver, pageFactory.stateProvinceRegisterPatient);
		pageFactory.stateProvinceRegisterPatient.sendKeys(state);

		thinkTime.waitUntillElementClickable(driver, pageFactory.countryRegisterPatient);
		pageFactory.countryRegisterPatient.sendKeys(country);

		thinkTime.waitUntillElementClickable(driver, pageFactory.postalCodeRegisterPatient);
		pageFactory.postalCodeRegisterPatient.sendKeys(postCode);

		thinkTime.waitUntillElementClickable(driver, pageFactory.nextButton);
		pageFactory.nextButton.click();

		thinkTime.waitUntillElementClickable(driver, pageFactory.phoneNumberRegisterPatient);
		pageFactory.phoneNumberRegisterPatient.sendKeys(phoneNumber);

		thinkTime.waitUntillElementClickable(driver, pageFactory.nextButton);
		pageFactory.nextButton.click();

		thinkTime.waitUntillElementClickable(driver, pageFactory.relationship_typeRegisterPatient);
		Select relationTypedrp = new Select(pageFactory.relationship_typeRegisterPatient);
		relationTypedrp.selectByVisibleText(relationType);

		thinkTime.waitUntillElementClickable(driver, pageFactory.personNameRegisterPatient);
		pageFactory.personNameRegisterPatient.sendKeys(personName);

		thinkTime.waitUntillElementClickable(driver, pageFactory.nextButton);
		pageFactory.nextButton.click();

		thinkTime.waitUntillElementClickable(driver, pageFactory.confirmRegisterPatientbtn);
		pageFactory.confirmRegisterPatientbtn.click();
	}

}