package stepdefinitions;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelDataReader;
import utilities.Listener;
import pages.AppointmentManagingBlocks1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAppointmentBlocks {
	
	
public static WebDriver driver;




AppointmentManagingBlocks1 manage;



	
private static Logger logger=LogManager.getLogger(ManageAppointmentBlocks.class);

	@Given("iam on the application login page")
	public void iam_on_the_application_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   //Listener.setDriver(driver);
	   
	   manage=new AppointmentManagingBlocks1(driver);
	   
	   
	   
	  
	   
	}
	
	@Given("Browser2 is on the login page")
	public void browser2_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		manage=new AppointmentManagingBlocks1(driver);
		manage.navigateToUrl("https://demo.openmrs.org/openmrs/login.htm");
		logger.info("login page");
		
	
	    
	}
	
	@When("i enter user and password")
	public void i_enter_user_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		manage.enterUsername("admin");
		logger.info("username");
		Thread.sleep(1000);
		manage.enterPassword("Admin123");
		logger.info("password");
		
		
	   
	}
	
	@When("i click on the inpatient ward to access the loaction")
	public void i_click_on_the_inpatient_ward_to_access_the_loaction() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		manage.selectLocator();
		logger.info("selectLocator");
	    Thread.sleep(1000);
	    manage.loginbutton();
	    logger.info("loginbutton");
		
	  
	}
	
	@Then("i navigated to the Home page")
	public void i_navigated_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		manage.navigateToAppoinmentScheduling();
		logger.info("AppoinmentScheduling");
		manage.navigateToAppoinmentScheduleProvider();
		logger.info("AppoinmentScheduleProvider");
		Thread.sleep(2000);
		manage.navigateTocalender();
		logger.info("calender");
	    Thread.sleep(2000);
	    manage.navigateToselectprovider();
	    logger.info("selectprovider");
	    Thread.sleep(2000);
	    manage.navigateTostarttime1();
	    logger.info("starttime1");
	    manage.navigateTostarttime2();
	    logger.info("starttime2");
	    manage.navigateTostarttime3();
	    logger.info("starttime3");
	    manage.navigateToendtime1();
	    logger.info("endtime1");
	    manage.navigateToendtime2();
	    logger.info("endtime2");
	    manage.navigateToendtime3();
	    logger.info("endtime3");
	    manage.navigateToselectmultipleappointmenttypes();
	    logger.info("selectmultipleappointmenttypes");
	
	    
	    
	    
	    
	   driver.close();
    	 
	   
	}
	
	
	    
	    
	    @DataProvider(name = "loginData")
	    public Iterator<Object[]> getTestData() throws IOException {
	        String filePath = "C:\\Users\\rubin\\eclipse-workspace\\New folder (2)\\RLL_Group6\\src\\test\\resources\\TestData1.xlsx";
	        String sheetName = "Sheet1";
	        List testData = (List) ExcelDataReader.readTestData(filePath, sheetName);
	        java.util.List<Object[]> testData2 = (java.util.List<Object[]>) testData;
			java.util.List<Object[]> list = testData2;
			return list.iterator();
	    }

	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password) {
	        
	        System.out.println("Username: " + username + ", Password: " + password);;
	    
	
	   }

	    
	   	
		
	    

}