package selenium.pagefactoryobject.drivers.strategies;

import org.openqa.selenium.WebDriver;

public interface DriverStrategy {

	WebDriver setStrategy();
	//kalo manggil firefox->langsung open dan jalanin di firefox
}

