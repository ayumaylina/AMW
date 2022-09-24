package selenium.pagefactoryobject.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver(); //getDriver sudah di set di Test Login
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmployee;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement txtInvalidLogin;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgError;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmpInfo;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement txtEmptyUsername;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement txtEmptyPassword;
	
	//Page Object
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtEmp() {
		return txtEmployee.getText();
	}
	
	public String getTxtInvalidLogin() {
		return txtInvalidLogin.getText();
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	//Actual
	public String msgInvalid(int delays) {
//		return msgError.getText();
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(msgError)).getText();
	}
	
	public String getTxtEmpInfo(int delays) {

		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtEmpInfo)).getText();
	}
	
	public String getEmptyUserNameInfo(int delays) {

		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtEmptyUsername)).getText();
	}
	
	public String getEmptyPasswordInfo(int delays) {

		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtEmptyPassword)).getText();
	}
	
}