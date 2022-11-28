package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output",
				"json:target/MyReports/reports.json",
				"junit:target/MyReports/reports.xml",
				},
		publish=true
		//plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		
		
		)



public class TestRun {

}
