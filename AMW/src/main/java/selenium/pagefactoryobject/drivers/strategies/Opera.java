package selenium.pagefactoryobject.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opera implements DriverStrategy{

	@Override
	public WebDriver setStrategy() {
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		return driver;
	}

	
}