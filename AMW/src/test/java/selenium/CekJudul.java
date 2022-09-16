package selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CekJudul {
	
	@Test
	public void cekGoogle() {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe"); -->masih manual harus download drivernya dulu
	WebDriverManager.chromedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.edgedriver().setup();
//	WebDriverManager.safaridriver().setup();
//	WebDriverManager.operadriver().setup();
	WebDriver driver = new ChromeDriver();

	 String baseUrl = "http://google.com";
	 String expectedTitle = "Google";
	 driver.get(baseUrl);
	 String actualTitle = driver.getTitle();
	 assertEquals(actualTitle, expectedTitle);

	 //driver.close();

}
}
