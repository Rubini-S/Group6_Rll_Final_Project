package stepdefinitions;



import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PatientSearchRecord1;
import utilities.ExcelRead;


public class SearchPatientRecord {
	
	        public static WebDriver driver;
	        
	        PatientSearchRecord1 Patient;
	        private static final Logger logger = LogManager.getLogger(SearchPatientRecord.class);
	        
	        
			@Given("login to the openMRS project file Browser is open")
			public void login_to_the_open_mrs_project_file_browser_is_open() {
				// Write code here that turns the phrase above into concrete actions			
				
				driver = new ChromeDriver();
				//Listener.setDriver(driver);
				driver.manage().window().maximize();
				
				Patient = new PatientSearchRecord1(driver);	
				logger.info("OpenMRs Browser is opened");				
			}
			
			@Given("Browser is on the login page")
			public void browser_is_on_the_login_page() {
			    // Write code here that turns the phrase above into concrete actions
				Patient.navigateToUrl("https://demo.openmrs.org/openmrs/login.htm");
				logger.info("Chromedriver is initiated");
				
			}
			
			@When("I enter username and password")
			public void i_enter_username_and_password() throws InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				Patient.enterUsername("admin");
				Thread.sleep(1000);				
				Patient.enterPassword("Admin123");
				logger.info("user is entering username and password");
			}
			
			
			@When("I click on the impatient ward to access location")
			public void i_click_on_the_impatient_ward_to_access_location() throws InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				Patient.selectLocator();
			    Thread.sleep(1000);
			    Patient.loginbutton();
			    logger.info("user is clicking login button");
			}
			
			
			@Then("I navigated to the Home page")
			public void i_navigated_to_the_home_page() throws InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				Patient.navigateToSearchPatientRecord();
				logger.info("user is clicking the search patient record button");
				Patient.enterPatientNameOrId();
			    Thread.sleep(3000);
			    logger.info("user is entering Patient Name or Id");
			   // takeScreenShot("PatientNameOrIdNotExist.png");
			    
			    Patient.PatientResult();
			    Thread.sleep(2000);			    			    
			    		    
			    logger.info("user is clicking the patient search result");
			    
			
			}

			@DataProvider(name = "loginData")
		    public Iterator<Object[]> getTestData() throws IOException {
		        String filePath = "C:\\Users\\rubin\\eclipse-workspace\\New folder (2)\\RLL_Group6\\src\\test\\resources\\test-data.xlsx";
		        String sheetName = "Sheet1";
		        List testData = (List) ExcelRead.readTestData(filePath, sheetName);
		        java.util.List<Object[]> testData2 = (java.util.List<Object[]>) testData;
				java.util.List<Object[]> list = testData2;
				return list.iterator();
		    }

		    @Test(dataProvider = "loginData")
		    public void loginTest(String username, String password) {
		        
		        System.out.println("Username: " + username + ", Password: " + password);
		        
		        
		    }		    			    
			
		    
}

