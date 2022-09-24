package selenium.pagefactoryobject.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class ShopRegisterPage {

	private WebDriver driver;
	
	public ShopRegisterPage() {
		this.driver = DriverSingleton.getDriver(); //getDriver sudah di set di Test Login
		PageFactory.initElements(driver, this);
	}
	
		//Page Factory
		@FindBy(xpath = "//input[@id='reg_username']")
		private WebElement username;
		@FindBy(xpath = "//input[@id='reg_email']")
		private WebElement email;
		@FindBy(xpath = "//input[@id='reg_password']")
		private WebElement password;
		@FindBy(xpath = "//button[@name='register']")
		private WebElement btnRegister;
		@FindBy(xpath = "//div[@id='primary']//li[1]")
		private WebElement msgError;
		
		//LOGIN
		@FindBy(xpath = "//input[@id='username']")
		private WebElement loginUname;
		@FindBy(xpath = "//input[@id='password']")
		private WebElement loginPass;
		@FindBy(xpath = "//button[@name='login']")
		private WebElement btnLogin;
		@FindBy(xpath = "//p[contains(text(),'Hello')]")
		private WebElement msgLogin;
		
		
		//pageobject
		public void registerInvalid(String username, String email, String password) {
			this.username.sendKeys(username);
			this.email.sendKeys(email);
			this.password.sendKeys(password);
			btnRegister.click();
		}
		
		public String getTxtInvalid() {
			return new WebDriverWait(driver, Duration.ofSeconds(5))
					.until(ExpectedConditions.visibilityOf(msgError)).getText();
		}
		
		public void loginValid(String username, String password) {
			this.loginUname.sendKeys(username);
			this.loginPass.sendKeys(password);
			btnLogin.click();
		}
		
		public String getTxtValidLogin() {
			return new WebDriverWait(driver, Duration.ofSeconds(5))
					.until(ExpectedConditions.visibilityOf(msgLogin)).getText();
		}
			
}
