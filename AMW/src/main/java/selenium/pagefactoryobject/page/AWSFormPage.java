package selenium.pagefactoryobject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class AWSFormPage {
	private WebDriver driver;
	
	public AWSFormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastname;
	
	//@FindBy(xpath = "//input[@name='gender']")
	@FindBy(xpath = "//label[normalize-space()='Female']//input[@name='gender']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id='dob']")
	private WebElement dob;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	
	@FindBy(xpath = "//select[@id='role']")
	private WebElement role;

	@FindBy(xpath = "//option[@value='High salary']")
	private WebElement salary;

	@FindBy(xpath = "//label[normalize-space()='Read books']//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement comment;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//span[@id='submit-msg']")
	private WebElement submitMsg;
	
	//Page Object
	public void AWSForm(String firstname, String lastname, String dob, String address, 
			String email, String password, String company, String comment){
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		gender.click();
		this.dob.sendKeys(dob);
		this.address.sendKeys(address);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.company.sendKeys(company);
		role.click();
		salary.click();
		checkbox.click();
		this.comment.sendKeys(comment);
		submit.click();
		}
	
	public String getTxtValid() {
		return submitMsg.getText();
	}
	
}
