package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Feature/NinjaLoginFeature.feature"},
		glue = "stepDefination",
		dryRun =false,
		monochrome=true,
		plugin = {"pretty","html:target/Reports/LoginpageReports_html.html"}
		
		)

public class TestRunnerClass {

}
