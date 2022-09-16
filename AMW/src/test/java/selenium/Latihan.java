package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Latihan {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

 String baseUrl = "https://formy-project.herokuapp.com/autocomplete";
 driver.get(baseUrl);
 WebElement address = driver.findElement(By.id("autocomplete")); //kuncinya di id --> first-name
 address.sendKeys("Perumahan Apa");
 WebElement streetAddress = driver.findElement(By.id("street_number")); 
 streetAddress.sendKeys("Jl. Kumbang");
 WebElement streetAddressDua = driver.findElement(By.id("route")); 
 streetAddressDua.sendKeys("Jl. Kumbang 2");
 WebElement city = driver.findElement(By.id("locality")); 
 city.sendKeys("Tangerang");
 
 

// WebElement buttonSearch = driver.findElement(By.name("btnK")); 
// buttonSearch.click();
}
}


