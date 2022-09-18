package ujian.keempat;

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
	
	@FindBy(xpath = "//li[normalize-space()='The credentials provided are incorrect']")
	private WebElement txtPassInvalid;
	
	//Page Factory
	@FindBy(xpath = "//span[@id='Email-error']")
	private WebElement txtEmailInvalid;
	
	
	//Page Factory
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement txtEmail;
	
	//Page Factory
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement Catalog;
	
	//Page Factory
	@FindBy(xpath = "//p[normalize-space()='Product tags']")
	private WebElement ProductTags;
		
	//Page Factory
	@FindBy(xpath = "//input[@id='SearchTagName']")
	private WebElement tagName;
	
	@FindBy(xpath = "//button[@id='search-product-tags']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//td[normalize-space()='awesome']")
	private WebElement tag;
	
	@FindBy(xpath = "//h1[@class='float-left']")
	private WebElement txtProduct;
	
	@FindBy(xpath = "//p[normalize-space()='Sales']")
	private WebElement sales;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath = "//strong[normalize-space()='Welcome, please sign in!']")
	private WebElement txtLogout;
	
	
	//Page Object
	public void AdminLogin(String email, String password) {
		this.email.sendKeys(email);
		this.pass.sendKeys(password);
		remember.click();
		submit.click();
	}
	
	public void Admin(String e, String password) {
		email.clear();
		pass.clear();
		this.email.sendKeys(e);
		this.pass.sendKeys(password);
		remember.click();
		submit.click();
	}
	
	public void Product(String e, String password, String tagName) {
		email.clear();
		pass.clear();
		this.email.sendKeys(e);
		this.pass.sendKeys(password);
		remember.click();
		submit.click();
		Catalog.click();
		ProductTags.click();
		this.tagName.sendKeys(tagName);
		btnSearch.click();
		
	}
	
	public void Logout(String e, String password) {
		email.clear();
		pass.clear();
		this.email.sendKeys(e);
		this.pass.sendKeys(password);
		remember.click();
		submit.click();
		Catalog.click();
		sales.click();
		logout.click();
	}
	
//	public void AdminLoginGagal(String email) {
//		this.email.sendKeys(email);
//		pass.clear();
//		remember.click();
//		submit.click();
//	}
	

	
	public String getDashboard() {
		return dashboard.getText();
	}
	
	public String getTxtPassInvalid() {
		return txtPassInvalid.getText();
	}
	
	public String getTxtEmailInvalid() {
		return txtEmailInvalid.getText();
	}
	
	public String getTxtEmail() {
		return txtEmail.getText();
	}
	
	
	public String getTxtProduct() {
		return txtProduct.getText();
	}
	
	public String getTxtLogout() {
		return txtLogout.getText();
	}
	
	
		
}
