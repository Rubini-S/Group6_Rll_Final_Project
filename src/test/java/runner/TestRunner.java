package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(   //This annotation is used to provide additional configuration options for Cucumber when running tests.
    features = "src/test/resources/Features/",
    glue = { "stepdefinitions" },
    dryRun=false,  // it means you want Cucumber to execute the actual test code associated with the Gherkin's steps during the test run and if you give true it will only provide the steps that are not glued.
    plugin = {
        "html:target/cucumber_Report.html",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output-thread/"
    }
   
)
public class TestRunner extends AbstractTestNGCucumberTests {
    
}
