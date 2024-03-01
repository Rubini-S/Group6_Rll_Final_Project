package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Listener implements ITestListener{
	
	static WebDriver driver;
	static ExtentTest eTest;
	public static void setDriver(WebDriver driver) {
    	Listener.driver = driver;
    }
	public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());

        // Check if WebDriver instance is initialized
        if (driver == null) {
            System.out.println("WebDriver instance is null. Cannot capture screenshot.");
            return;
        }

        shot(result.getMethod().getMethodName() + ".png");
	}
	private static void shot(String filename) {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		try {
		FileHandler.copy(src, new File("Screenshot\\"+filename));
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		eTest.fail(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\rubin\\eclipse-workspace\\New folder (2)\\RLL_Group6\\Screenshot").build());
	}
	
}
