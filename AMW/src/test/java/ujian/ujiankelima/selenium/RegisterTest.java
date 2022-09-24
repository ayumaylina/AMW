package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.AWSFormPage;
import selenium.pagefactoryobject.page.ShopRegisterPage;
import selenium.pagefactoryobject.util.Constants;

public class RegisterTest {
	public static WebDriver driver;
	private ShopRegisterPage registerPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_REGIST);
		registerPage = new ShopRegisterPage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testInvalidRegister() {
		registerPage.registerInvalid("ayu", "ayu@gmail.com", "Ayu_123*456");
		assertEquals(registerPage.getTxtInvalid(), "Error: An account is already registered with your email address. Please log in.");
	}
	
	@Test
	public void testValidLogin() {
		registerPage.loginValid("ayu","Ayu_123*456");
		assertEquals(registerPage.getTxtValidLogin(),"Hello ayu (not ayu? Log out)");
	}
}
