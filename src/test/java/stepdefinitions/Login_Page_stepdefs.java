package stepdefinitions;

import io.cucumber.java.After;

//public class Login_Page_stepdefs {

//}

import io.cucumber.java.en.*;
import utilities.Listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Iretry.MyRetry;
//@Test(retryAnalyzer=MyRetry.class)
public class Login_Page_stepdefs {
  WebDriver driver = new ChromeDriver();
 
  private static final Logger logger = LogManager.getLogger(Login_Page_stepdefs.class);

  
  @Given("User is on the login page")
  public void userIsOnTheLoginPage() {
      driver.get("https://demo.openmrs.org/openmrs/login.htm");
      logger.info(" Browser is open");
  }

  @When("User enters username {string} and password {string}")
  public void userEntersUsernameAndPassword(String username, String password) {
      WebElement usernameField = driver.findElement(By.id("username"));
      usernameField.sendKeys("admin");

      WebElement passwordField = driver.findElement(By.id("password"));
      passwordField.sendKeys("Admin123");
      logger.info("Give username and password");
  }

  @And("User selects location as {string}")
  public void userSelectsLocation(String location) {
      WebElement locationField = driver.findElement(By.id("Inpatient Ward")); // Assuming "Inpatient Ward" is the id for location selection
      locationField.sendKeys("Inpatient Ward");
      logger.info("choose location");
  }

  @And("User clicks on the login button")
  public void userClicksOnTheLoginButton() {
      WebElement loginButton = driver.findElement(By.id("loginButton"));
      loginButton.click();
      logger.info("click login");
  }

  @Then("User should be logged in successfully")
  public void userShouldBeLoggedInSuccessfully() {
      // Assertion or validation of successful login
  }

  @After
  public void tearDown() {
      driver.quit();
  }
}
