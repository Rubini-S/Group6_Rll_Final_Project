package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Listener;

public class findrecords {
	
	WebDriver driver;
	
	private static final Logger logger = LogManager.getLogger(findrecords.class);
	
	@Given("I want to write open the web browser")
	public void i_want_to_write_open_the_web_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		//Listener.setDriver(driver);
		driver.manage().window().maximize();
	    
	}

	@Given("open the login page of open mrs")
	public void open_the_login_page_of_open_mrs() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://demo.openmrs.org/openmrs/login.htm");
	    logger.info("Browser is opened");
	}

	@When("I had to give the proper credentials")
	public void i_had_to_give_the_proper_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("Admin123");
	    logger.info("username and password");
	}

	@When("i click on inpatient ward")
	public void i_click_on_inpatient_ward() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
	    logger.info("Add location");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	    logger.info("click login");
	}

	@Then("I open the find patient records page")
	public void i_open_the_find_patient_records_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"patient-search\"]")).sendKeys("10010W");
		logger.info("search for patient");
		driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody/tr/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"edit-patient-demographics\"]/a")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"fr5808-field\"]")).sendKeys("walker");
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"fr5054-field\"]")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"fr5289-field\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"fr5007-field\"]/option[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"fr3997-field\"]/option[2]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birthdateEstimated-field\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"birthdateDay-field\"]")).sendKeys("01");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"birthdateMonth-field\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birthdateMonth-field\"]/option[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"birthdateYear-field\"]")).sendKeys("2000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		logger.info("Edit patient record");
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		driver.quit();
		
}

}
