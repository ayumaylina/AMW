package selenium.pagefactoryobject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pagefactoryobject.drivers.DriverSingleton;


public class DashboardHrmPage {
	private WebDriver driver;
	
	public DashboardHrmPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement menuDashboard;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/h4")
	private WebElement txtDashboardPage;
	
	public void goToMenuDashboard() {
		menuDashboard.click();
	}
	
	public String getTxtDashboardPage() {
		return txtDashboardPage.getText();
	}
}
