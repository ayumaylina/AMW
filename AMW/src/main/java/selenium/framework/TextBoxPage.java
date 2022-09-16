package selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class TextBoxPage {
	
	private WebDriver driver;
	
	public TextBoxPage (){
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(id="currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id="permanentAddress")
	private WebElement permanentAddress;

	@FindBy(id="submit")
	private WebElement submit;
	
	public void manipulateUsername(String u) {
		username.click();
		username.clear();
		username.sendKeys(u);
	}
	
	public void manipulateEmail(String e) {
		email.click();
		email.clear();
		email.sendKeys(e);
	}
	
	public void manipulateCurrentAddress(String ca) {
		currentAddress.click();
		currentAddress.clear();
		currentAddress.sendKeys(ca);
	}
	
	public void manipulatePermanentAddress(String pa) {
		permanentAddress.click();
		permanentAddress.clear();
		permanentAddress.sendKeys(pa);
	}
	
	public void manipulateSubmit() {
		submit.click();
	}
	
	public String getUsername()
	{
		return username.getText();
	}
	
	public String getEmail()
	{
		return email.getText();
	}
	
	public String getCurrentAddress()
	{
		return currentAddress.getText();
	}
	
	public String getPermanentAddress()
	{
		return permanentAddress.getText();
	}
	
//	public String getSubmit()
//	{
//		return submit;
//	}
	
	
}
