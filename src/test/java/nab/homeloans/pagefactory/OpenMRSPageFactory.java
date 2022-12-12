package nab.homeloans.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Global file for locating the elements for Open MRS scenario
 * 
 * @author merlin
 *
 */
public class OpenMRSPageFactory {

	@FindBy(css = "input#username")
	public WebElement username;

	@FindBy(css = "input#password")
	public WebElement password;

	@FindBy(css = "li[id='Inpatient Ward']")
	public WebElement inpatientward;

	@FindBy(css = "input.btn.confirm")
	public WebElement loginbtn;

	@FindBy(css = "a#referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	public WebElement registerpatient;

	@FindBy(css = "input[name='givenName']")
	public WebElement givenNameRegisterPatient;

	@FindBy(css = "input[name='middleName']")
	public WebElement middleNameRegisterPatient;

	@FindBy(css = "input[name='familyName']")
	public WebElement familyNameRegisterPatient;

	@FindBy(css = "button#next-button")
	public WebElement nextButton;

	@FindBy(css = "select#gender-field")
	public WebElement genderFieldRegisterPatient;

	@FindBy(css = "input#birthdateDay-field")
	public WebElement birthdateDayRegisterPatient;

	@FindBy(css = "select#birthdateMonth-field")
	public WebElement birthdateMonthRegisterPatient;

	@FindBy(css = "input#birthdateYear-field")
	public WebElement birthdateYearRegisterPatient;

	@FindBy(css = "input#address1")
	public WebElement address1RegisterPatient;

	@FindBy(css = "input#address2")
	public WebElement address2RegisterPatient;

	@FindBy(css = "input#cityVillage")
	public WebElement cityVillageRegisterPatient;

	@FindBy(css = "input#stateProvince")
	public WebElement stateProvinceRegisterPatient;

	@FindBy(css = "input#country")
	public WebElement countryRegisterPatient;

	@FindBy(css = "input#postalCode")
	public WebElement postalCodeRegisterPatient;

	@FindBy(css = "input[name='phoneNumber']")
	public WebElement phoneNumberRegisterPatient;

	@FindBy(css = "select#relationship_type")
	public WebElement relationship_typeRegisterPatient;

	@FindBy(css = "input[placeholder='Person Name']")
	public WebElement personNameRegisterPatient;

	@FindBy(css = "input[value='Confirm']")
	public WebElement confirmRegisterPatientbtn;

	@FindBy(css = "input#cancelSubmission")
	public WebElement cancelSubmissionRegisterPatient;

}
