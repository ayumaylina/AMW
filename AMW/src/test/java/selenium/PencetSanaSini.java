package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PencetSanaSini {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

 String baseUrl = "http://google.com";
 driver.get(baseUrl);
 WebElement formFirstName = driver.findElement(By.name("q")); //kuncinya di id --> first-name
 formFirstName.sendKeys("Sutarno");

 WebElement buttonSearch = driver.findElement(By.name("btnK")); 
 buttonSearch.click();
}
}

