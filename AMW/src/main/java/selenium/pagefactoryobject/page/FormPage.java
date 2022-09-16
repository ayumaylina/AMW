package selenium.pagefactoryobject.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class FormPage {
	private WebDriver driver;
	
	public FormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
		//Page Factory
		@FindBy(xpath = "//input[@id='firstName']")
		private WebElement firstname;
		
		//Page Factory
		@FindBy(xpath = "//input[@id='lastName']")
		private WebElement lastname;
		
		//Page Factory
		@FindBy(xpath = "//input[@id='userEmail']")
		private WebElement email;
		
		@FindBy(xpath = "//label[@for='gender-radio-2']")
		private WebElement gender;
		
		@FindBy(xpath = "//input[@id='userNumber']")
		private WebElement userNumber;

		@FindBy(xpath = "//input[@id='dateOfBirthInput']")
		private WebElement dateOfBirth;
		
		@FindBy(id = "subjectsInput")
		private WebElement subjects;

		@FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
		private WebElement hobbies;

		@FindBy(xpath = "//input[@id='uploadPicture']")
		private WebElement btnUpload;
		
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\nexsoft\\Pictures\\ayu.png");
		
		
		@FindBy(xpath = "//textarea[@id='currentAddress']")
		private WebElement currentAddress;
		
		@FindBy(id = "state")
		private WebElement state;
		
		@FindBy(id = "city")
		private WebElement city;
		
		@FindBy(xpath = "//button[@id='submit']")
		private WebElement submit;
		
		@FindBy(xpath = "//td[normalize-space()='Ayu Maylina']")
		private WebElement modal;
		
		@FindBy(xpath = "//div[@class='modal-footer']")
		private WebElement txtValid;
		
		@FindBy(xpath = "//button[@id='userForm']")
		private WebElement txtInvalid;
		
		//Page Object
		public void form(String firstname, String lastname, String email, String userNumber, String tgl, String sub, String btnUpload, String currentAddress) throws InterruptedException, AWTException {
//				         String dateOfBirth, String subjects,
//				         String uploadPict, String currentAddress, String state) {
			Robot rbt = new Robot();
			for (int i = 0; i < 5; i++) {
				rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_CONTROL);
			}
			
			this.firstname.sendKeys(firstname);
			this.lastname.sendKeys(lastname);
			this.email.sendKeys(email);
			gender.click();
			this.userNumber.sendKeys(userNumber);
			//this.dateOfBirth.sendKeys(tgl);
			isiTanggal(tgl);
			isiSubject(sub);
//			this.subjects.sendKeys(subjects);
			hobbies.click();
			this.btnUpload.sendKeys(btnUpload);
			
			state.click();
			Thread.sleep(500);
			List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-2"));
			selectedItemState.get(0).click();
			city.click();
			Thread.sleep(500);
			List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
			selectedItemCity.get(0).click();
			submit.click();
			Thread.sleep(2000);
			
//			this.uploadPict.sendKeys(C:\\Users\\nexsoft\\Pictures\\a.png);
//			this.uploadPict.sendKeys(uploadPict);
//			this.currentAddress.sendKeys(currentAddress);
//			this.state.sendKeys(state);
//			submit.click();
		}
		
		public void isiTanggal(String tgl) {
			try {
				Robot rbt = new Robot();
				this.dateOfBirth.click();
				rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_A);
				rbt.keyRelease(KeyEvent.VK_CONTROL);
				rbt.keyRelease(KeyEvent.VK_A);

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.dateOfBirth.sendKeys(tgl);
				rbt.keyPress(KeyEvent.VK_ENTER);
				rbt.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void isiSubject(String sub) {
			try {
				Robot rbt = new Robot();
				this.subjects.click();
				this.subjects.sendKeys(sub);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				rbt.keyPress(KeyEvent.VK_ENTER);
				rbt.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
		
//		public void subject(String math) throws Exception {
//			Robot robot = new Robot();
//			this.subjects.click();
//			this.subjects.sendKeys(math);
//			robot.keyPress(KeyEvent.VK_ENTER);
//		}
		
		public void zoomIn() throws AWTException {
			Robot robot = new Robot();
			for (int i=0; i<3; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ADD);
				robot.keyPress(KeyEvent.VK_ADD);
				robot.keyPress(KeyEvent.VK_CONTROL);
			}
		}
		
		public void zoomOut() throws AWTException {
			Robot robot = new Robot();
			for (int i=0; i<3; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyPress(KeyEvent.VK_CONTROL);
			}
		}
		
		public String getTxtValid() {
			return txtValid.getText();
		}
		
		public String getTxtInvalidLogin() {
			return txtInvalid.getText();
		}
		
		
}
