package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "json:target/Report.json" }, // reporting purpose
		monochrome = false, // console output
		tags = "", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinition", "appHooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	

}