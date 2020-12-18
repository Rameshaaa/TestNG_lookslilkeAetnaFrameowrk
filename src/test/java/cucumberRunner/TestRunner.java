package cucumberRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/CucumberFeature",
		glue="stepDefinitions",
		
		/*plugin={"pretty","html:target/cucumber", 
				
				}*/
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests	 {
	
	
	 
	 }

