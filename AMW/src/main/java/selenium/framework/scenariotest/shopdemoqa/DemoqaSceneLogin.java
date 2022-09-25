package selenium.framework.scenariotest.shopdemoqa;

public enum DemoqaSceneLogin {
	T1("User invalid login to web");
//	T2("User valid login"),
//	T3("Dashboard user function");
	
	private String testName;
	
	private DemoqaSceneLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
