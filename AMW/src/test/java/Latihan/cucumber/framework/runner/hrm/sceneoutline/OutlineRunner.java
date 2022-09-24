package Latihan.cucumber.framework.runner.hrm.sceneoutline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/hrms/sceneoutline/004dashboard.feature",
			"src/test/resources/features/hrms/sceneoutline/001logininvalid.feature"},
//			"src/test/resources/features/hrms/sceneoutline/002loginempty.feature",
//			"src/test/resources/features/hrms/sceneoutline/003logininvalid.feature"},
//		
//		"src/test/resources/hrms/sceneoutlinefix/0004dashboard.feature",
//		"src/test/resources/hrms/sceneoutlinefix/0001logininvalid.feature",
//		"src/test/resources/hrms/sceneoutlinefix/0002loginempty.feature",
//		"src/test/resources/hrms/sceneoutlinefix/0003loginvalid.feature"},
glue = "Latihan.cucumber.framework.runner.hrm.sceneoutline",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
		"json:target/hrms/jsonreport/LoginRunnerOutline.json",
		"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})
public class OutlineRunner extends AbstractTestNGCucumberTests{}