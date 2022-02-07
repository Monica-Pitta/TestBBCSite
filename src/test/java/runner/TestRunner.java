package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features" }, plugin = { "html:target/cucumber-pretty.html",
		"json:target/cucumber.json" }, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}
