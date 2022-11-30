package testRunner;

import org.junit.runner.RunWith;


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
		publish=true,
		plugin={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7jvm"}
		)


public class TestRun {

}
