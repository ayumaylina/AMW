package selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class AutocompletePage {
	
	private WebDriver driver;
	
	public AutocompletePage (){
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="autocomplete")
	private WebElement autocomplete;
	
	@FindBy(id="street_number")
	private WebElement streetNumber;
	
	@FindBy(id="route")
	private WebElement route;
	
	@FindBy(id="locality")
	private WebElement locality;
	
	@FindBy(id="administrative_area_level_1")
	private WebElement administrativeAreaLevel1;
	
	@FindBy(id="postal_code")
	private WebElement postalCode;
	
	@FindBy(id="country")
	private WebElement country;
	
	public void manipulateAutocomplete(String x) {
		autocomplete.click();
		autocomplete.clear();
		autocomplete.sendKeys(x);
	}
	
	public void manipulateStreetNumber(String street) {
		streetNumber.click();
		streetNumber.clear();
		streetNumber.sendKeys(street);
	}
	
	public void manipulateRoute(String r) {
		route.click();
		route.clear();
		route.sendKeys(r);
	}
	
	public void manipulateLocality(String l) {
		locality.click();
		locality.clear();
		locality.sendKeys(l);
	}
	
	public void manipulateAAL(String a) {
		administrativeAreaLevel1.click();
		administrativeAreaLevel1.clear();
		administrativeAreaLevel1.sendKeys(a);
	}
	
	public void manipulatePostalCode(String p) {
		postalCode.click();
		postalCode.clear();
		postalCode.sendKeys(p);
	}
	
	public void manipulateCountry(String c) {
		country.click();
		country.clear();
		country.sendKeys(c);
	}
	
	public String getPostalCode()
	{
		return postalCode.getText();
	}
	
	public String getRoute()
	{
		return route.getText();
	}
	
	public String getCountry()
	{
		return country.getText();
	}
	
	public String getAAL()
	{
		return administrativeAreaLevel1.getText();
	}
	
	public String getLocality()
	{
		return locality.getText();
	}
	
	public String getStreetNumber()
	{
		return streetNumber.getText();
	}
	
}
