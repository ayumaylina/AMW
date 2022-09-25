package ujian.ujiankelima.cucumber;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pagefactoryobject.util.Constants;
import ujian.ujiankelima.selenium.ShopRegisterPage;

public class LoginInvalid {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ShopRegisterPage loginPage = new ShopRegisterPage();
	
	public LoginInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@When("User go to Web ShopDemoQA")
	public void user_go_to_web_shop_demo_qa() {
		driver.get(Constants.URL_SHOP_REGIST);
		extentTest.log(LogStatus.PASS, "User go to Web ShopDemoQA");
	}

	@And("^User enter invalid (.*) (.*)")
	public void user_enter_invalid_username_password(String username , String password) {
		loginPage.loginValid(username,password);
		extentTest.log(LogStatus.PASS, "User enter invalid username password");
	}

	@Then("User get msg invalid")
	public void user_get_msg_invalid() {
	    assertTrue(loginPage.getTxtInvalidLogin().contains("ERROR"));
	    extentTest.log(LogStatus.PASS, "User get msg invalid");
	}
}
