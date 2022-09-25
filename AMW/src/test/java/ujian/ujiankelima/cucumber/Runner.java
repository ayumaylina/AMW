package ujian.ujiankelima.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {
	@CucumberOptions(
			features = {"src/test/resources/features/shopdemoqa/0001LoginInvalid.feature"},
			glue = "ujian.ujiankelima.cucumber",
			monochrome=true,
			plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
					"json:target/hrms/jsonreport/LoginRunnerOutline.json",
					"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})
			public class OutlineRunner extends AbstractTestNGCucumberTests{}
}
