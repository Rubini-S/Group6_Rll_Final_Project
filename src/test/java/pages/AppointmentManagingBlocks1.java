package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;




public class AppointmentManagingBlocks1 {
	
	
	private WebDriver driver;
	public AppointmentManagingBlocks1(WebDriver driver) {
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
    @FindBy(xpath="//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]")
    private WebElement appoinmentscheduling;
    @FindBy(xpath="//*[@id=\"appointmentschedulingui-scheduleProviders-app\"]")
    private WebElement scheduleProvider;
    @FindBy(xpath="//*[@id=\"calendar\"]/div/div/table/tbody/tr[1]/td[4]")
    private WebElement calendar;
    @FindBy(xpath="//*[@id=\"select-provider\"]/input")
    private WebElement selectprovider;
    @FindBy(xpath="//*[@id=\"start-time\"]/table/tbody/tr[2]/td[1]/input")
    private WebElement starttime1;
    @FindBy(xpath="//*[@id=\"start-time\"]/table/tbody/tr[2]/td[3]/input")
    private WebElement starttime2;
    @FindBy(xpath="//*[@id=\"start-time\"]/table/tbody/tr[2]/td[4]/button")
    private WebElement starttime3;
    @FindBy(xpath="//*[@id=\"end-time\"]/table/tbody/tr[2]/td[1]/input")
    private WebElement endtime1;
    @FindBy(xpath="//*[@id=\"end-time\"]/table/tbody/tr[2]/td[3]/input")
    private WebElement endtime2;
    @FindBy(xpath="//*[@id=\"end-time\"]/table/tbody/tr[2]/td[4]/button")
    private WebElement endtime3;
    
    @FindBy(xpath="//*[@id=\"appointment-block-form\"]/selectmultipleappointmenttypes/div/div[1]/div[2]/a")
    private WebElement selectmultipleappointmenttypes;
    @FindBy(xpath="//*[@id=\"appointment-block-form-buttons\"]/button[2]")
    private WebElement appointmentblockformbuttons;
  
    
    
    
    
    
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
    public void navigateToAppoinmentScheduling() {
   	 appoinmentscheduling.click();
    }
   	 
   	 
     public void navigateToAppoinmentScheduleProvider() {
       	 scheduleProvider.click();
       	 
       	
    }
    
     public void navigateTocalender() {
    	 calendar.click();
    	 
       	 
       	
    }
     public void navigateToselectprovider() {
    	 selectprovider.sendKeys("siri");
    	 
       	 
       	
    }
     public void navigateTostarttime1() {
    	 starttime1.sendKeys("08");
    	 
    	 
    	 
       	 
       	
    }
     public void navigateTostarttime2() {
    	 starttime1.sendKeys("00");
    	 
    	 
      	
    }
     
     public void navigateTostarttime3() {
    	 starttime1.sendKeys("AM");
    	 
    	 
    	  	
    }
     
     public void navigateToendtime1() {
    	 endtime1.sendKeys("11");
    	 
    	 
    	 
       	 
       	
    }
     public void navigateToendtime2() {
    	 endtime2.sendKeys("00");
    	 
    	 
    	 
       	 
       	
    }
     public void navigateToendtime3() {
    	 endtime3.sendKeys("AM");
    	 
    	 
    	 
       	 
       	
    }
     public void navigateToselectmultipleappointmenttypes() {
    	 //selectmultipleappointmenttypes.click();
    	 
    	 Actions act = new Actions(driver);

    	 		act.moveToElement(driver.findElement(By.id("createAppointmentBlock")))

    	 		.click()

    	 		.sendKeys("obs")

    	 		.sendKeys(Keys.ENTER)

    	 		.build()

    	 		.perform();	
    	 		
    	 		
    	 		 // public void navigateToappointmentblockformbuttons() {
    	 			  
    	 			 appointmentblockformbuttons.click();
    	 			 Actions act1 = new Actions(driver);

    	    	 		act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"appointment-block-form-buttons\"]/button[2]"))).click();

    	    	 		
    	 	    	 
    	 	    	 
    	 	       	 
    	 	       	
    	 	    }
    	 		
    	 		
    	 		
      
    	 		
    	 	 	 
    	 
       	 
       	
    }
     

   