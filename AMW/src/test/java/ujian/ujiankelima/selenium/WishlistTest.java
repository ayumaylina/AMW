package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.pagefactoryobject.drivers.DriverSingleton;
import selenium.pagefactoryobject.page.ShopHomePage;
import selenium.pagefactoryobject.page.ShopRegisterPage;
import selenium.pagefactoryobject.util.Constants;

public class WishlistTest {
	public static WebDriver driver;
	private ShopHomePage wishlistPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP);
		wishlistPage = new ShopHomePage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testAddWishlist() {
		wishlistPage.addWishlist();
		assertEquals(wishlistPage.getTxtWishlist(), "PRODUCT NAME");
	}
}
