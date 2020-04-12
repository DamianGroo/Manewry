package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
			
			features = ".//featurki/oooo.feature",
			glue = "stepDefinitions",
			dryRun = true,
			plugin = {"pretty", "html:test-output"}
		
		)

/*

@RunWith(Cucumber.class)
@CucumberOptions(
   //format={"pretty"},
   features= "src/features/",
   glue = "cucumber.steps")



*/		
		





public class RunTest {}








