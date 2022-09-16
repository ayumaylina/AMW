package selenium.pagefactoryobject.drivers.strategies;

import selenium.pagefactoryobject.util.Constants;
public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		
		case Constants.FIREFOX:
			return new Firefox();

		case Constants.OPERA:
			return new Opera();
			
		default:
			return null;
		}
	}
	
}