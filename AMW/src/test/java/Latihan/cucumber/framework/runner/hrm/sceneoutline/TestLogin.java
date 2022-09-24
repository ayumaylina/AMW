package Latihan.cucumber.framework.runner.hrm.sceneoutline;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Latihan.cucumber.framework.runner.hrm.scenefirst.SceneFirstHooks;
import selenium.pagefactoryobject.page.LoginPage;
import selenium.pagefactoryobject.util.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLogin() {
		driver = SceneFirstHooks.driver;
		extentTest = SceneFirstHooks.extentTest;
	}

	@When("Browser open Web HRM Outlinee")
	public void browser_open_web_hrm_outlinee() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web HRM");
	}

	@When("Enter invalid password and username Outlinee")
	public void enter_invalid_password_and_username_outlinee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("button login clicked Outlinee")
	public void button_login_clicked_outlinee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("System check credentials invalid Outlinee")
	public void system_check_credentials_invalid_outlinee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
