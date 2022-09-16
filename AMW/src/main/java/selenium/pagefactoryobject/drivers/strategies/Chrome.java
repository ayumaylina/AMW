package selenium.pagefactoryobject.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); //WebDriversManagers.chrome.setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.addArguments("--no-sandbox");
		
		return driver;
	}
	
}