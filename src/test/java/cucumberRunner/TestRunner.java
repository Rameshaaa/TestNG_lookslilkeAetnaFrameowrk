package cucumberRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/CucumberFeature",
		glue="stepDefinitions",
		
		plugin={"pretty","html:target/cucumber", 
				})
public class TestRunner extends AbstractTestNGCucumberTests	 {
	
	
	 
	 }

