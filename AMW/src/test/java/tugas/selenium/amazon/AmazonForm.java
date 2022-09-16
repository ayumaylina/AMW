package tugas.selenium.amazon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.AWSFormPage;
import selenium.pagefactoryobject.page.FormPage;
import selenium.pagefactoryobject.util.Constants;

public class AmazonForm {
	public static WebDriver driver;
	private AWSFormPage awsformPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLAMAZON);
		awsformPage = new AWSFormPage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValid() {
		awsformPage.AWSForm("ayu", "maylina", "09/13/2022", "jln merpati", "ayu@gmail.com", "123", "nexsoft", "aaa");
		assertEquals(awsformPage.getTxtValid(), "Successfully submitted!");
	}
	
	
	
	
}
