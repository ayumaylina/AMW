package Latihan.cucumber.framework.runner.hrm.scenefirst;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
//			features = {"src/test/resources/hrms/scenefirst/02dashboard.feature",
//					"src/test/resources/hrms/scenefirst/01login.feature"},
			features = {"src/test/resources/features/hrms/01Login.feature"},
					    //"src/test/resources/features/hrms/02Dashboard.feature"},
//			glue = "cucumber.framework.runner.hrms.scenefirst",
			glue = "Latihan.cucumber.framework.runner.hrm.scenefirst",
			monochrome=true,
			plugin = {"pretty","html:target/hrms/htmlreport/LoginRunner.html",
					"json:target/hrms/jsonreport/LoginRunner.json",
					"junit:target/hrms/junitreport/LoginRunner.xml"})
			public class LoginRunner extends AbstractTestNGCucumberTests{}

