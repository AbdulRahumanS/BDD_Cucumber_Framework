package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\Features\\Login.feature", //the path of the feature files
		glue={"src\\main\\java\\StepDefinitions"}, //the path of the step definition files
		tags= "@Login1",
		plugin= {"pretty","html:test-outout"},
		monochrome= true,
		dryRun=false
		)
public class TestRunner {
	
	

	

}
