package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Listener;

public class Register {
	public WebDriver driver;

	private static final Logger logger = LogManager.getLogger(Register.class);
    
	@Given("I want to open the browser")
	public void i_want_to_open_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		//Listener.setDriver(driver);
		driver.manage().window().maximize();
	}

	@Given("open OpenMRS page")
	public void open_open_mrs_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		logger.info("Browser opened");

	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("admin");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.name("password")).sendKeys("Admin123");
		logger.info("username and password");
	}

	@When("click on inpatient ward")
	public void click_on_inpatient_ward() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
		logger.info("location");

	}

	@Then("I open the home page")
	public void i_open_the_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		logger.info("login");
		driver.findElement(By.xpath(
				"//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]"))
				.click();
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input"))
				.sendKeys("Ajay");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[2]/input"))
				.sendKeys("Kumar");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input"))
				.sendKeys("Patel");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"gender-field\"]/option[1]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[3]/p[2]/input")).sendKeys("17");
		TimeUnit.SECONDS.sleep(1);
		WebElement dropdownElement = driver
				.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[3]/p[3]/select"));

		// Use the Select class to interact with the dropdown
		Select select = new Select(dropdownElement);
		select.selectByVisibleText("April");

		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[3]/p[4]/input"))
				.sendKeys("1997");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[2]/input"))
				.sendKeys("Mumbai");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[2]/p/input"))
				.sendKeys("9876543201");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		dropdownElement = driver
				.findElement(By.xpath("/html/body/div/div[3]/form/section[3]/div/fieldset/div/div/p[1]/select"));
		select = new Select(dropdownElement);
		select.selectByVisibleText("Child");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[3]/div/fieldset/div/div/p[2]/input[1]"))
				.sendKeys("Rakesh Patel");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		TimeUnit.SECONDS.sleep(1);
		logger.info("Register patient details");
		driver.close();
	}
}
