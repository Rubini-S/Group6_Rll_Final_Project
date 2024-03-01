package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;


import pages.ServiceTypes;
import utilities.Listener;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicetypesM  {
	public WebDriver driver;
	
	private static final Logger logger = LogManager.getLogger(ServicetypesM.class);
    
	ServiceTypes service;
	@Test(priority = 1)
	@Given("Browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		//Listener.setDriver(driver);
		driver.manage().window().maximize();
    service=new ServiceTypes(driver);
	}

	@Test(priority = 2)
	@Given("admin is on the login page")
	public void admin_is_on_the_login_page() {
		// Write code here that turns the phrase above into concrete actions
		service.navigateToUrl("https://demo.openmrs.org/openmrs/login.htm");
		logger.info("Open Browser");

	}

	@Test(priority = 3)
	@When("i enter username and password")
	public void i_enter_username_and_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
       service.enterUsername("admin");
		Thread.sleep(1000);
	    service.enterPassword("Admin123");
	    logger.info("Enter Username & password");
	}

	@Test(priority = 4)
	@When("i click on inpatient ward to access location")
	public void i_click_on_inpatient_ward_to_access_location() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		service.selectLocator();
	    Thread.sleep(1000);
	    service.loginbutton();
		Thread.sleep(1000);
		logger.info("click login");
	}

	@Test(priority = 5)
	@Then("i navigate to the home page")
	public void i_navigate_to_the_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		service.navigateToAppoinmentScheduling();
		service.navigateToManageServiceType();
		logger.info("select service types");
		Thread.sleep(1000);
		service.navigateToNewservicetypes();
		Thread.sleep(2000);
		service.navigateToName();
		Thread.sleep(3000);
		service.navigateToDuration();
		Thread.sleep(2000);
		service.navigateToSave();
		Thread.sleep(2000);
		logger.info("Click save");
		 driver.close();
	}

//	//@AfterMethod
//	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
//		if (testResult.getStatus() == ITestResult.FAILURE) {
//			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
//					+ Arrays.toString(testResult.getParameters()) + ".png"));
//		}
//
//		
	//}
}
