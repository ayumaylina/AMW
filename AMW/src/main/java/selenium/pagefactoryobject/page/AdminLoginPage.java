package selenium.pagefactoryobject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class AdminLoginPage {
	private WebDriver driver;
	
	public AdminLoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	//Page Factory
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement pass;
	
	//Page Factory
	@FindBy(xpath = "//input[@id='RememberMe']")
	private WebElement remember;
	
	//Page Factory
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	//Page Factory
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement dashboard;
		
	//Page Object
	public void AdminLogin(String email, String password) {
		this.email.sendKeys(email);
		this.pass.sendKeys(password);
		remember.click();
		submit.click();
	}
	
	public String getDashboard() {
		return dashboard.getText();
	}
	
	
		
}
