package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class PatientSearchRecord1 {
	

	private WebDriver driver;
	
	public PatientSearchRecord1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//*[@id=\"username\"]")
    private WebElement username;
    @FindBy(xpath="//*[@id=\"password\"]")
    private WebElement password;
    @FindBy(xpath="//*[@id=\"Inpatient Ward\"]")
    private WebElement locator;
    @FindBy(xpath="//*[@id=\"loginButton\"]")
    private WebElement loginbutton;
    
    @FindBy(xpath="//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
    private WebElement searchPatientRecord;
    
    @FindBy(xpath="//*[@id=\"patient-search\"]")
    private WebElement searchPatientByNameOrId;
    
    @FindBy(xpath="//*[@id=\"patient-search-results-table\"]/tbody")
    private WebElement searchPatientResult;
    
    public void navigateToUrl(String Url) {
   	 driver.get(Url);
    }
    public void enterUsername(String Username) {
   	username.sendKeys(Username);
    }
    public void enterPassword(String Password) {
   	 password.sendKeys(Password);
    }
    public void selectLocator() {
   	locator.click();
    }
    public void loginbutton() {
   	 loginbutton.click();
   	 
    }
    public void navigateToSearchPatientRecord() {
    searchPatientRecord.click();
    }
    public void enterPatientNameOrId() {
    	searchPatientByNameOrId.sendKeys("John Green");
    
    }
    public void PatientResult() {
    	searchPatientResult.click();
    
    }
}
