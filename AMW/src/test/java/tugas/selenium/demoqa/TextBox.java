package tugas.selenium.demoqa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.framework.TextBoxPage;
import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.LoginPage;
import selenium.pagefactoryobject.util.Constants;

public class TextBox {
	public static WebDriver driver;
	private TextBoxPage textboxPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		textboxPage = new TextBoxPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidTextBox() {
		textboxPage.("Ayu Maylina", "ayumaylina123@gmail.com", "Gading Serpong 123", "Gading Serpong 123");
		assertEquals(textboxPage.get(), "Employee Information");
		//System.out.println("=============TEST VALID LOGIN=============");
	}

}
