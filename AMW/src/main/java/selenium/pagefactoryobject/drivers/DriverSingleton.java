package selenium.pagefactoryobject.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import selenium.pagefactoryobject.drivers.strategies.DriverStrategy;
import selenium.pagefactoryobject.drivers.strategies.DriverStrategyImplementer;
import selenium.pagefactoryobject.util.Constants;

public class DriverSingleton {

	private static DriverSingleton instance = null;
	//driver ini di reuse, design patternya singleton
	//untuk generate web driver
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		instantiate(driver);
	}
	
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingleton getInstance(String driver) { //pertama kali load
		if(instance == null) { //ketika null diset new, new driver isinya yg baru.. jd kalo mau firefox di create memori baru
			instance = new DriverSingleton(driver);
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }
	
}