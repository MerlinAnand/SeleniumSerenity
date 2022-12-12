package nab.homeloans.steps;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import nab.homeloans.library.GetConfigProperties;
import nab.homeloans.library.SetDrivers;
import nab.homeloans.pagefactory.OpenMRSPageFactory;
import nab.homeloans.pages.RegisterPatientPage;
import nab.homeloans.pages.OpenMRSHomePage;
import nab.homeloans.pages.OpenMRSLoginPage;
import net.thucydides.core.annotations.Steps;

/**
 * Step definitions for NAB home loans scenario
 * 
 * @author chandra
 *
 */
public class OpenMRSStepDefinition {
	public static Logger log = LogManager.getLogger(OpenMRSStepDefinition.class.getName());

	public OpenMRSStepDefinition() {
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;

	OpenMRSPageFactory pageFactory;
	@Steps
	OpenMRSHomePage homePage;

	@Steps
	OpenMRSLoginPage loginPage;
	@Steps
	RegisterPatientPage registerPatientPage;


	GetConfigProperties getProps = new GetConfigProperties();
	SetDrivers setDrivers = new SetDrivers();
	Properties prop = new Properties();

	// Initialize the driver and configuration properties file
	@Before
	public void init() {
		prop = getProps.getConfigProperty();
		String runEnv = System.getProperty("runEnv");
		driver = setDrivers.setDrivers(runEnv);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("MRS Init");
	}

	// Launch the home page url
	@Given("^I am in MRS page$")
	public void i_am_in_mrs_home_page() {
		String url = prop.getProperty("URL");
		driver.get(url);
		log.info("I am in mrs home page");
	}

	@When("^I login to openMRS page (.+) (.+)$")
	public void i_login_to_openMRS_page(String userName,String password) {
		loginPage = new OpenMRSLoginPage(driver);
		loginPage.login_to_openMRS_page(userName,password);
		log.info("I logged in to open MRS page");
	}


	// Navigate to register a patient page
	@When("^Navigate for register a patient$")
	public void i_navigare_to_register_a_patient_page() {
		homePage = new OpenMRSHomePage(driver);
		homePage.register_a_patient_page();
		log.info("I navigate to register a patient page");
	}

	@And("^I enter the registration details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void I_enter_the_registration_details(String givenName,String middleName, String familyName, String gender, String day,String month,String year,String address1,String address2,String city,String state,String country,String postCode,String phoneNumber,String relationType,String personName){
		registerPatientPage = new RegisterPatientPage(driver);
		System.out.println("gender in step definition"+ gender);
		registerPatientPage.enter_registration_details(givenName, middleName,  familyName,  gender,  day, month, year, address1, address2, city, state, country, postCode, phoneNumber, relationType, personName);
	}


	// Quit the browsers
	@After
	public void quitBrowsers() {
		driver.quit();
		log.info("Quit Browser");
	}
}
