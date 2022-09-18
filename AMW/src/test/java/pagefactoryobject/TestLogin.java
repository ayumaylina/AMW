package pagefactoryobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.LoginPage;
import selenium.pagefactoryobject.util.Constants;

public class TestLogin {

	public static WebDriver driver;
	private LoginPage loginPage;
	
//	@BeforeClass
//	public void setUp() {
//		DriverSingleton.getInstance(Constants.CHROME);
//		driver = DriverSingleton.getDriver();
//		driver.get(Constants.URL);
//	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
		System.out.println("=============TEST VALID LOGIN=============");
	}
	
	@Test
	public void testValidLoginUsernameKapital() {
		loginPage.login("ADMIN", "admin123");
		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	//Negative Case
	@Test
	public void testInValidLogin() {
		loginPage.login("AdminNexsoft", "admin1234");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testInValidLoginUsernameSalah() {
		loginPage.login("AdminNexsoft", "admin123");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testInValidLoginPasswordSalah() {
		loginPage.login("Admin", "admin1234");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testUsernamePasswordNull() {
		loginPage.login("Admin", ""); //jgn kasih spasi nnati kehitung karakter
		assertEquals(loginPage.getTxtInvalidLogin(), "Required");
	}
	
	@Test
	public void testPasswordUsernameNull() {
		loginPage.login("", "1234");
		assertEquals(loginPage.getTxtInvalidLogin(), "Required");
	}
	
	@Test
	public void testPasswordAndUsernameNull() {
		loginPage.login("", "");
		assertEquals(loginPage.getTxtInvalidLogin(), "Required");
	}
	
}