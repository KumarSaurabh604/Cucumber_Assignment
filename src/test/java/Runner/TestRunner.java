package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/Feature",
		glue = {"Defination"},
		plugin = {"pretty","html:test-out",
				  "junit:junit_xml/junit.xml"},
		monochrome = true,
		dryRun = false,
		strict = true

		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
