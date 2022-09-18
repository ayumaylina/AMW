package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.LoginPage;
import selenium.pagefactoryobject.util.Constants;
import ujian.keempat.AdminLoginPage;


public class TestLoginPage {

	public static WebDriver driver;
	private AdminLoginPage adminLogin;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNOPC);
		adminLogin = new AdminLoginPage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidLogin() {
		adminLogin.AdminLogin("", "");
		assertEquals(adminLogin.getDashboard(), "Dashboard");
	}
	
//	@Test
//	public void testInvalidLogin() {
//		adminLogin.AdminLoginGagal("");
//		assertEquals(adminLogin.getTxtPassInvalid(), "Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect");
//	}
	
	@Test
	public void testInvalidNoEmail() {
		adminLogin.Admin("","admin");
		assertEquals(adminLogin.getTxtEmailInvalid(), "Please enter your email");
	}
	
	@Test
	public void testInvalidLoginEmail() {
		adminLogin.Admin("abc@gmail.com","admin");
		assertEquals(adminLogin.getTxtEmail(), "No customer account found");
	}
	
	@Test
	public void testProduct() {
		adminLogin.Product("admin@yourstore.com", "admin", "awesome");
		assertEquals(adminLogin.getTxtProduct(), "Product tags");
	}
	
	@Test
	public void testLogout() {
		adminLogin.Logout("admin@yourstore.com", "admin");
		assertEquals(adminLogin.getTxtLogout(), "Welcome, please sign in!");
	}
	
	
	

	
	
	
	
	
}
