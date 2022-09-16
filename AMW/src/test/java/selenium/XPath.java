package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public void absoluteXPath() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://formy-project.herokuapp.com/form";
	driver.get(baseUrl);

//	WebElement form = driver.findElement(By.xpath("/html/body/div/form/div/div/input"));
//	form.sendKeys("Marsinah");
	
	driver.findElement(By.xpath("/html/body/div/form/div/div/input")).sendKeys("Marsinah");
	
	
	}
}
