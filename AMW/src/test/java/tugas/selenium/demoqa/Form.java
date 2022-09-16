package tugas.selenium.demoqa;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.FormPage;
import selenium.pagefactoryobject.page.LoginPage;
import selenium.pagefactoryobject.util.Constants;

public class Form {

	public static WebDriver driver;
	private FormPage formPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLDEMO);
		formPage = new FormPage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidForm() throws InterruptedException, AWTException {
		String file = "C:\\Users\\nexsoft\\Documents\\Bootcamp\\a.PNG";
		formPage.form("Ayu", "Maylina", "ayu@gmail.com", "0987689089","08/05/2000", "Math",file ,"jln. Gading");
				// "0987689089", "08 Mei 2000","Math","Sports", "C:\\fakepath\\contoh fungsi utk testing.PNG", "jln. apa ya", "Indonesia");
		//assertEquals(formPage.getTxtValid(), );
	}
	
//	@Test
//	public void testInvalidForm() {
//		formPage.form("", "Maylina", "ayu@gmail.com","Male", "0987689089", "08 Mei 2000","Math","Sports", "C:\\fakepath\\contoh fungsi utk testing.PNG", "jln. apa ya", "Indonesia");
//		assertEquals(formPage.getTxtInvalidLogin(), "required");
//	}
}
