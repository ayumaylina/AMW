package ujian.ujiankelima.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.pagefactoryobject.drivers.DriverSingleton;

public class ShopHomePage {
private WebDriver driver;
	
	public ShopHomePage() {
		this.driver = DriverSingleton.getDriver(); //getDriver sudah di set di Test Login
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	//WISHLIST
	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	private WebElement addWishlist;
	@FindBy(xpath = "//a[normalize-space()='My Wishlist']")
	private WebElement wishlist;
	@FindBy(xpath = "//span[normalize-space()='Product name']")//a[normalize-space()='Black Cross Back Maxi Dress']
	private WebElement msgWishlist;
	
	//ShareProduct
	@FindBy(xpath = "//a[normalize-space()='Tokyo Talkies']")
	private WebElement productName;
	@FindBy(xpath = "//i[@class='fa fa-facebook']")
	private WebElement btnShare;
	@FindBy(xpath = "//a[@class='_97w4']")
	//html[1]/body[1]/div[1]/div[2]
	//h2[@id='homelink']
	private WebElement msgFacebook;
	
	//SEARCHPRODUCT
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement tabSearch;
	@FindBy(xpath = "//input[@name='s']")
	private WebElement inputSearch;
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement msgSearch;
	
	//ADD TO CART
	@FindBy(xpath = "//a[normalize-space()='Tokyo Talkies']")
	private WebElement product;
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnCart;
	@FindBy(xpath = "//a[@class='button wc-forward']")
	private WebElement btnViewCart;
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement msgCart;
	
	//pageObject
	public void addWishlist() {
		addWishlist.click();
		wishlist.click();
	}
	
	public String getTxtWishlist() {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(msgWishlist)).getText();
	}
	
	
	//SHAREPRODUCT
	public void shareProduct() {
		try {
			Robot rbt = new Robot();
			productName.click();
			for (int i=0; i<4; i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_CONTROL);
			}
			btnShare.click();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getTxtFacebook() {
		return msgFacebook.getText();
	}
	
	//SEARCHPRODUCT
	public void search(String search) throws AWTException {
		tabSearch.click();
		this.inputSearch.sendKeys(search);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public String getMsgSearch() {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(msgSearch)).getText();
	}
	
	//ADDTOCART
	public void addToCart() {
		try {
			Robot rbt = new Robot();
			product.click();
			for (int i=0; i<4; i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_CONTROL);
			}
			btnCart.click();
			btnViewCart.click();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getMsgCart() {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(msgCart)).getText();
	}
	
	
//	public void zoomIn() throws AWTException {
//		Robot robot = new Robot();
//		for (int i=0; i<3; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_ADD);
//			robot.keyPress(KeyEvent.VK_ADD);
//			robot.keyPress(KeyEvent.VK_CONTROL);
//		}
//	}
	
//	public void zoomOut() throws AWTException {
//		Robot robot = new Robot();
//		for (int i=0; i<3; i++) {
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//			robot.keyPress(KeyEvent.VK_CONTROL);
//		}
//	}
	
}
